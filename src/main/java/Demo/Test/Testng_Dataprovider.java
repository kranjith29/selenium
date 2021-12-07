package Demo.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_Dataprovider {
		
		@Test(dataProvider="test_data")
		public void gg(String usr, String pwd) {
			System.out.println("Username: " + usr);
			System.out.println("Password: "+ pwd);
		}
		
		@DataProvider
		public Object[][] test_data() {
			
			
			return new Object[][] {
				       {"ranjith","123"},
				       {"rajesh","432"},
				       {"jegadeesh","567"}
				 };
		   }
	
		@Test(dataProvider="data")
		public void test2(String usr, String pwd) {
			System.out.println("Altmethod_Username: " + usr);
			System.out.println("Altmethod_Password: "+ pwd);
		}

		@DataProvider
		public Object[][] data() {
			Object[][] a =new Object[2][2];
			a[0][0]="Ranjith";
			a[0][1]="1234";
			a[1][0]="Rajesh";
			a[1][1]="2345";
			return a;
		}
		
	}
	












/*

//public Object[][] test_data() {
//	Object[][] a = new Object[][] {};
//	a[][]= [{"ranjith",123},{"rajesh",432},{"jegadeesh",567}];
//	return a;
//}
*/