package com.atguigu.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.service.SpuServiceInf;
import com.atguigu.util.MyFileUpload;

@Controller
public class SpuController {
	@Autowired
	SpuServiceInf spuServiceInf;
	
	@RequestMapping("get_spu_list")
	@ResponseBody
	public List<T_MALL_PRODUCT> get_spu_list(int pp_id, int flbh2) {
		List<T_MALL_PRODUCT> list_spu = spuServiceInf.get_spu_list(pp_id, flbh2);
		return list_spu;
	}

	@RequestMapping("goto_spu_add")
	public String goto_spu_add(ModelMap map, T_MALL_PRODUCT spu) {
		map.put("spu", spu);
		return "spuAdd";
	}

	@RequestMapping("spu_add")
//	public String spu_add(@RequestParam("files") MultipartFile[] files, T_MALL_PRODUCT spu) {
	public ModelAndView spu_add(@RequestParam("files") MultipartFile[] files, T_MALL_PRODUCT spu) {
		// 上传图片
		List<String> list_image = MyFileUpload.upload_image(files);
		// 保存商品信息
		spuServiceInf.save_spu(list_image, spu);
//		return "redirect:/goto_spu_add.do";
		
		ModelAndView modelAndView = new ModelAndView("redirect:/goto_spu_add.do");
		modelAndView.addObject("flbh1", spu.getFlbh1());
		modelAndView.addObject("flbh2", spu.getFlbh2());
		modelAndView.addObject("pp_id", spu.getPp_id());
		return modelAndView;
	}
}
