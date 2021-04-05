package org.testng.test;

import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAdactinHotel extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
	browserLanch();
	}

	@BeforeMethod
	public void before() {
	Date d=new Date();
	System.out.println("test starts " +d);
	}

	@Test(dataProvider="adactinlogin",dataProviderClass=Datas.class)
	public  void test1(String user,String pass,String loc,String hot,String type,String rn,String ci,String co,String an,String cn,String fn,String ln,String ad,String cno,String ct,String em,String ey,String cvv) throws Exception {
		
		launchUrl("http://adactinhotelapp.com/index.php");
		login l = new login();
		sendkey(l.getUserName(), user);
		sendkey(l.getPassword(), pass);
		clickButton(l.getClick());

		SearchHotel hotel = new SearchHotel();
		selectValue(hotel.getLocation(), loc);
		selectValue(hotel.getHotels(), hot);
		selectValue(hotel.getType(), type);
		selectValue(hotel.getRoomno(), rn);
		hotel.getCheckindate().sendKeys(ci);
		hotel.getCheckoutdate().sendKeys(co);
		selectValue(hotel.getAdultno(), an);
		selectValue(hotel.getChildno(), cn);
		hotel.getSearch().click();
		
		SelectHotel hotel1 = new SelectHotel();
		clickButton(hotel1.getRadiobutton());
		clickButton(hotel1.getContinueclick());
		
		 BookaHotel bookaHotel = new BookaHotel();
		 sendkey(bookaHotel.getFirstname(), fn);
		 sendkey(bookaHotel.getLastname(), ln);
		 sendkey(bookaHotel.getAddress(), ad);
		 sendkey(bookaHotel.getCardnum(), cno);
		 selectValue(bookaHotel.getCardtype(), ct);
		 selectValue(bookaHotel.getCdmon(), em);
		 selectValue(bookaHotel.getCdyr(), ey);
		 sendkey(bookaHotel.getCvv(), cvv);
		 clickButton(bookaHotel.getBooknow());
		 
		 BookingConfirmation bc = new BookingConfirmation();
			Thread.sleep(9000);
			scrollDown(bc.getOrderid());
			moveCursor(bc.getOrderid());
			doubleClick();
			screenshot("./src./ss/hotel.png");
			System.out.print("the booking orderID of " +fn);
			
			System.out.println(getText(bc.getOrderid()));		 
		 
		
	}

	
	

	@AfterMethod
	public  void after() {
		Date d=new Date();
		System.out.println("test ends " +d);
	}


	@AfterClass
	public static void afterClass() {
		// quit();
	}



	}

	

