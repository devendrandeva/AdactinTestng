package org.testng.test;

import org.testng.annotations.DataProvider;

public class Datas {

	@DataProvider(name="adactinlogin")
 private  Object[][] getData() {
	
	Object[][] obj=new Object[][] {{"devendrandeva","1234567890","New York","Hotel Sunshine","Super Deluxe","1","20/03/2021","21/03/2021","2","0","devendran","veeraraj","chennai","1234567890123456","VISA","4","2013","890"},
									{"srinivasan26","123456789","Paris","Hotel Cornice","Super Deluxe","1","21/03/2021","22/03/2021","2","0","nivas","m","chrompet","1234567890123456","VISA","4","2013","890"},
									{"jkishore92","1234567890","Los Angeles","Hotel Hervey","Super Deluxe","1","22/03/2021","23/03/2021","2","0","kishore","j","porur","1234567890123456","VISA","4","2013","890"}} ;
	return obj;

	
}
}
