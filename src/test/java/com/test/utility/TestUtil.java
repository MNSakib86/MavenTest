package com.test.utility;

import java.util.ArrayList;

import org.apache.commons.collections4.iterators.ObjectArrayIterator;

import com.excel.utility.DataReader;

public class TestUtil {
	
	static DataReader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
	
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
reader = new DataReader(
		"D:\\Selenium Training\\Java\\Workbench\\MavenTest\\src\\main\\java\\Resources\\TestData.xlsx");

	for(int row =2; row <= reader.getRowCount("Sheet1");row++) {
		String userName = reader.getCellData("Sheet1", "username", row);
		String password = reader.getCellData("Sheet1", "password", row);
	
	Object ob[] = {userName,password};
		mydata.add(ob);
	
	}
	return mydata;
	}
}
