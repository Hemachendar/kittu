package org.hw;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


// Read more: https://javarevisited.blogspot.com/2011/12/parse-xml-file-in-java-example-tutorial.html#ixzz5rJk5ll4J



public class Readanddata {

	public static void main(String[] args) throws org.xml.sax.SAXParseException, Exception 
	{
		
		File books = new File("book.xml");
		
		DocumentBuilderFactory DocBuilderfactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder docbuilder= DocBuilderfactory.newDocumentBuilder();
		Document 
		Doc = docbuilder.parse(books);
		
		Doc.getDocumentElement().normalize ();
		System.out.println ("Root element of the doc is " + Doc.getDocumentElement().getNodeName());
		
		NodeList listOfpersons=Doc.getElementsByTagName("person");
		int Totalpersons = listOfpersons.getLength();

		System.out.println("Total no of people " + Totalpersons);
		
		for (int i = 0; i <listOfpersons.getLength(); i++) 
		{
			Node node = listOfpersons.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("First Name: " + getValue("first", element));
				System.out.println("Last Name: " + getValue("last", element));
				System.out.println("Age of the Person: " + getValue("age", element));
				}				}//end of for loop with s var

				}//end of main
	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
		}
				
		}
		


