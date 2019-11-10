package array;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Asset> assetList = new ArrayList<Asset>();
		Asset asset = new Asset();
		asset.setAssetNumber("11");
		asset.setAssetDescription("aa");
		asset.setAssetFrom("1111");
		asset.setAssetTo("1111111");
		asset.setRemark("+ test");
		assetList.add(asset);
		
		Asset asset2 = new Asset();
		asset2.setAssetNumber("22");
		asset2.setAssetDescription("bb");
		asset2.setAssetFrom("2222");
		asset2.setAssetTo("2222222");
		asset2.setRemark("- test");
		assetList.add(asset2);
		
		Asset asset3 = new Asset();
		asset3.setAssetNumber("33");
		asset3.setAssetDescription("cc");
		asset3.setAssetFrom("3333");
		asset3.setAssetTo("3333333");
		asset3.setRemark("- test");
		assetList.add(asset3);
		
		Asset asset4 = new Asset();
		asset4.setAssetNumber("44");
		asset4.setAssetDescription("dd");
		asset4.setAssetFrom("4444");
		asset4.setAssetTo("4444444");
		asset4.setRemark("- test");
		assetList.add(asset4);
		
		Asset asset5 = new Asset();
		asset5.setAssetNumber("55");
		asset5.setAssetDescription("ee");
		asset5.setAssetFrom("5555");
		asset5.setAssetTo("5555555");
		asset5.setRemark("- test");
		assetList.add(asset5);
		
		
		int len = assetList.size();
		for(Asset value : assetList) {
			System.out.println(value.toString());
//			value.getAssetTo();
//			value.getAssetFrom();
			
			
		}
		
	}
	
}
