package org.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport
{
	public static void generateJvmReport(String jsonpath)
	{
		
		System.out.println("Jsonpath"+jsonpath);
		File f = new File(System.getProperty("user.dir")+"\\AllReports\\jvmReport");
		Configuration c = new Configuration(f,"FACEBOOK APPLICATION");
		c.addClassifications("plateform","windows");
		c.addClassifications("jdk","1.8");
		
		System.out.println("After add classification");
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		System.out.println("Before report builder"+li);
		ReportBuilder r = new ReportBuilder(li,c);
		r.generateReports();
				
	}


}
