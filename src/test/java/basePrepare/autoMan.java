package basePrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.Assert;

import basePrepare.prepare;

public class autoMan {
	public static Logger logger = Logger.getLogger(autoMan.class.getName());
	public static int waitTime = 30;
	public static Actions action=new Actions(prepare.driver);
	public static void getUrl(String url) {
		try{
		prepare.driver.get(url);
		sleep(5000);
		logger.info("Get ["+url+"] successfully");
		}catch(TimeoutException e){
			logger.error("Can't load the ["+url+"] page");
		}
	}

	public static String getCurrentUrl() {
		logger.info("Get current page' url");
		return prepare.driver.getCurrentUrl();	
	}

	public static WebElement getElement(final By by) {
		WebElement element = null;
		try {
			boolean status = new WebDriverWait(prepare.driver, waitTime)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver d) {
							return d.findElement(by).isDisplayed();
						}
					});
			if (status) {
				element = prepare.driver.findElement(by);
				logger.info("founded the element [" + by + "] and operate it");
			}
		} catch (TimeoutException e) {
			logger.error("TIME OUT!! " + waitTime
					+ " second(s) has passed,but did not find element [" + by
					+ "]");
		}
		return element;
	}

	public static WebElement getElementNoWait(final By by) {
		WebElement element = null;
		try {
			element = prepare.driver.findElement(by);
			logger.info("founded the element [" + by + "] and operate");
		} catch (Exception e) {
			element = null;
			logger.error("did not find element [" + by + "]");
		}
		return element;
	}
	public static WebElement getElements(final By by,final int index){
		WebElement element = null;
		try {
			boolean status = new WebDriverWait(prepare.driver, waitTime)
					.until(new ExpectedCondition<Boolean>() {

						@Override
						public Boolean apply(WebDriver d) {
							return d.findElements(by).get(index).isDisplayed();
						}
					});
			if (status) {
			element = prepare.driver.findElements(by).get(index);
			logger.info("founded ["+prepare.driver.findElements(by).size()+"] ["+by+"] and operate");
		}} catch (TimeoutException e) {
			element = null;
			logger.error("TIME OUT!! " + waitTime
					+ " second(s) has passed,but did not find element [" + by
					+ "]");
		}
		return element;
	}
	public static boolean ElementExist (final By by){
		try{
			prepare.driver.findElement(by);
			return true;
		}catch(org.openqa.selenium.NoSuchElementException ex){
			return false;
		}
	 }
	public static void sleep(int sleepTime) {
		try {
			Thread.sleep(sleepTime);
			logger.info("Wait ["+sleepTime+"] ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public  static void selectByVisibleText(final By by, String text) {
		try {
			Select select = new Select(getElement(by));
			select.selectByVisibleText(text);
			logger.info("The element [" + text + "] is selected");
		} catch (Exception e) {
			logger.error("did not find element [" + by + text + "]");
		}
	}
	public  static void moveToElement(final By by){//鼠标悬停操作
		action.moveToElement(getElement(by)).perform();
		logger.info("Found element [" + by + "] and hold on it");
	}
	public  static void rightClick(final By by){//模拟右键点击
		action.moveToElement(getElement(by)).contextClick().perform();
		logger.info("Found element [" + by + "] and rightClick it");
	}
	public static void switchWindow(String a) {
		try {
			String[] handles = new String[prepare.driver.getWindowHandles()
					.size()];
			prepare.driver.getWindowHandles().toArray(handles);
			if (a == "next") {
				prepare.driver.switchTo().window(handles[1]);
				logger.info("Focused on new window");
			} else {
				prepare.driver.switchTo().window(handles[0]);
				logger.info("Returned to main window ");
			}
		} catch (Exception e) {
			logger.error("Can not jump to request window]");
		}
	}
	public static void waitUntilConfirm(final By by){//等待页面的某个元素显示
		new WebDriverWait(prepare.driver, 120).until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver d) {
				return d.findElement(by).isDisplayed();
			}	
		});
		
	}
	public static boolean isTextPresent(String tagName ,String what) {
		try{
			boolean a=prepare.driver.findElement(By.tagName("tagName")).getText().contains(what);// 遍历xx节点, 取其文本值 并判断是否包含 文本 what
			logger.info("this tagName contains ["+what+"]");
			return a;
		}
		catch (Exception e){
			logger.info("this tagName didn't contains ["+what+"]");
			return false;// 没有该文本 则 返回 false
		}
		}
	public static void SQLconnect(String ...sql) {//连接数据库 并对数据做更改
		 String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String URL = "jdbc:sqlserver://172.26.0.82;integratedSecurity=true;Database=PCM_TEST";
		  Connection con = null;
		  ResultSet rs = null;
		  Statement st = null;
		  try
		  {
		   Class.forName(driver);
		  }
		  catch(java.lang.ClassNotFoundException e)
		  {
		   e.printStackTrace();
		  }
		  
		   try {
		   con = DriverManager.getConnection(URL);//连接数据库对象
		   st = con.createStatement();//创建SQL命令对象
		   for(int i=0;i<sql.length;i++){
			   rs = st.executeQuery(sql[i]);//执行SQL 
		   }
		   logger.info("执行sql语句成功");
//		   while(rs.next()){//循环输出记录
//			   System.out.println(rs.getString("productid")+"\t"+rs.getString("InventorySku"));
//		   }
		   con.close();
		   st.close();
		   rs.close();	   
		   } catch (SQLException e) {
			   e.getSQLState();
			}
	
	}
	public static void deletePreconditionData(){//删除将要创建的单身已存在的产品信息
		 String sql1="delete from [PCM_TEST].[dbo].[ProductCategory] where ProductId in (select productid from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%')";
		 String sql11="delete from [PCM_TEST].[dbo].[productimage] where ProductId in (select productid from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%')";
		 String sql111="delete from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%'";		
		//删除已存在的product
		 String sql5="delete from ProductOptionCategory where productid in (select productid from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%')";
		 String sql6="delete from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%automan313%'";
		//删除已存在的variant
		 String sql7="delete from RoutingSequence where ProductWarehouseId in (select ProductWarehouseId from ProductWarehouse where productid in (select productid from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%'))"; 
		 String sql8="delete from ProductWarehouse where productid in (select productid from [PCM_TEST].[dbo].[product] where VendorItemNumber like '%PTC_Share step for other%')";
		//删除已存在的wareHouseInfo
		 String sql9="delete from warehouse where Zipcode='68154'";
		 //删除已存在的warehouse
		 autoMan.SQLconnect(sql1,sql11,sql111,sql5,sql6,sql7,sql8,sql9);
	}
	public static boolean shot_match(String path){//验证所截的图在UI上是不是存在
		Screen s=new Screen();
		boolean a = false;
		if(s.exists(path)!=null){
			a=true;
			logger.info("成功匹配截图");
		}else{
			a=false;
			logger.error("截图无法匹配");
		}
		return a;
	}
	public static String executeJS(boolean js,String idorjs){//调用JS来获取只读field里的值
		String D=null;
		if(js==false){
			String jss="document.getElementById('"+idorjs+"').removeAttribute('readonly')";
		    String js1="return document.getElementById('"+idorjs+"').value";
		    ((JavascriptExecutor)prepare.driver).executeScript(jss);
		     D=(String)((JavascriptExecutor)prepare.driver).executeScript(js1);
		}else if(js==true){
		    D=(String)((JavascriptExecutor)prepare.driver).executeScript(idorjs);
		}
		    return D;
	}
	public static void UrlEquals(String a){
		sleep(4000);
		logger.info("Expected ["+a+"] and founded ["+getCurrentUrl()+"]");
		 Assert.assertEquals(a,getCurrentUrl());
	}
	public static void textEquals(String a,String b){
		logger.info("Expected ["+a+"] and founded ["+b+"]");
		Assert.assertEquals(a,b);
	}
	public static void trueEquals(final By by ){
		logger.info("Expected [true] and founded ["+getElement(by).isDisplayed()+"]");
		Assert.assertEquals(true,getElement(by).isDisplayed());
	}
	public static void falseEquals(final By by ){
		logger.info("Expected [false] and founded ["+ElementExist(by)+"]");
		Assert.assertEquals(false,ElementExist(by));
	}
	public static void attributeEquals(String a,String b){
		logger.info("Expected ["+a+"] and founded ["+b+"]");
		Assert.assertEquals(a,b);
	}
	public static void numberEquals(int a,int b){
		logger.info("Expected ["+a+"] and founded ["+b+"]");
		Assert.assertEquals(a,b);
	}
}
