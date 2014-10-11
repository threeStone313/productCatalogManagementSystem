package basePrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basePrepare.prepare;

public class autoMan {
	public static Logger logger = Logger.getLogger(autoMan.class.getName());
	static int waitTime = 30;

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
	public static List<WebElement> getElements(final By by){
		List<WebElement> element = null;
		try {
			element = prepare.driver.findElements(by);
			logger.info("founded ["+prepare.driver.findElements(by).size()+"] [" + by + "] elements and operate");
		} catch (Exception e) {
			element = null;
			logger.error("did not find element [" + by + "]");
		}
		return element;
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
	public static void SQLconnect(String sql) {//连接数据库 并对数据做更改
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
		   rs = st.executeQuery(sql);//执行SQL
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
		logger.info("Expected [false] and founded ["+getElementNoWait(by).isDisplayed()+"]");
		Assert.assertEquals(true,getElementNoWait(by).isDisplayed());
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
