package dom;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public static void main(String[] args) {
		//创建DocumentBuilderFactory的对象
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			//创建DocumentBuilder对象
			DocumentBuilder dbf = documentBuilderFactory.newDocumentBuilder();
			//通过DocumentBuilder的parse方法加载books.xml文件
			Document document = dbf.parse("books.xml");
			//获取所有book节点的集合
			NodeList bookList = document.getElementsByTagName("book");
			//通过nodelist的getLength()方法获取booklist的长度
			System.out.println("一共有" + bookList.getLength() + "本书。");
			//遍历每一个book节点
			for(int i=0; i < bookList.getLength(); i++) {
				System.out.println("下面开始遍历第" + (i+1) + "本书的内容");
				//方法一	不知道book节点尤其只有一个属性
				//通过item(i)方法获取一个book节点，索引值从零开始
				Node book = bookList.item(i);
				//获取book节点的所有属性集合
				NamedNodeMap attrs = book.getAttributes();
				System.out.println("第" + (i+1) + "本书共有" + attrs.getLength() + "个属性。");
				//遍历bookde属性
				for(int j=0;j<attrs.getLength();j++) {
					//通过item(index)方法获取book节点的某一个属性
					System.out.println("属性名" + attrs.item(j).getNodeName());
					System.out.println("属性值" + attrs.item(j).getNodeValue());
				}
//				//方法二	前提是已经知道book节点尤其只有一个属性
//				//将book节点强制类型转换成element类型
//				Element book = (Element) bookList.item(i);
//				String attrValue = book.getAttribute("id");
//				System.out.println("id的属性的属性值为" + attrValue);
				
				//解析book节点的子节点
				NodeList childNodes = book.getChildNodes();
				//遍历childNodes获取每个节点的节点名和节点值
				System.out.println("第" + (i+1) + "本书共有" + childNodes.getLength() + "个子节点");
				for(int k=0;k<childNodes.getLength();k++) {
					//区分出text类型的node以及element类型的node
					if(childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
						//获取了element类型节点的节点名
						System.out.println("第" +  (k+1) + "个节点的节点名：" +childNodes.item(k).getNodeName());
//						System.out.println("节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
						System.out.println("节点值是：" + childNodes.item(k).getTextContent());
					}
				}
				System.out.println("======结束遍历第" + (i+1) + "本书。======");
			}
				
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
