package com.report.html;

public class TestDemo {
	
	public static String func1(){
		return "OK";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlFile hf=new HtmlFile();
		hf.createLog("d:\\test11.html");
		hf.write("��������1У�鷽��func1", "ok",func1());
		hf.write("��������2","ok","not ok");
		hf.write("��������3","ok","not ok");
		hf.closeLog();
		
		
		GlobleHtmlFile.createLog("d:\\test21.html");
		GlobleHtmlFile.write("��������1У�鷽��func1", "ok",func1());
		GlobleHtmlFile.write("��������2","ok","not ok");
		GlobleHtmlFile.write("��������3","ok","not ok");
		GlobleHtmlFile.closeLog();
		
		

	}

}
