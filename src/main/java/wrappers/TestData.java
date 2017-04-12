package wrappers;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "DataSource")
	public static Object[][] dataStation(){
		Object[][] data = new Object[1][2];
		data[0][0] = "Sethu";	data[0][1]= "Mathavan";
		/*data[1][0] = "Sunil"; data[1][1] = "Ketha ";*/
		return data;
		
		
		
		
		
		
		}

}
