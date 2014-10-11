package basePrepare;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import basePrepare.autoMan;

public class HomePage extends autoMan{
	public static Logger logger = Logger.getLogger(HomePage.class.getName());
	public static final By searchBox=By.id("searchByNameOrId");
	public static final String searchPrompt="placeholder";
	public static final By searchButton1=By.xpath("//button[@class='btn btn-primary upper j_searchProd']");
	public static final By searchButton2=By.xpath("//button[@class='btn btn-primary upper text-right j_searchProd']");
	public static final By resultTips=By.className("table-info");
	public static final By resultProdId=By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr[1]/td[3]");
	public static final By resultName=By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr[1]/td[4]");
	public static final By resultVendor=By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr[1]/td[5]");
	public static final By filterList=By.id("item01_entry");
	public static final By filterList2=By.id("item02_entry");
	public static final By filterList3=By.id("item03_entry");
	public static final By filterList4=By.id("item04_entry");
	public static final By listOfstatus=By.xpath("//input[@id='item01_entry']/../div/ul/li[2]/a");
	public static final By listOfstatus2=By.xpath("//input[@id='item02_entry']/../div/ul/li[2]/a");
	public static final By listOfprimary=By.xpath("//input[@id='item03_entry']/../div/ul/li[3]/a");
	public static final By listOfsecondary=By.xpath("//input[@id='item04_entry']/../div/ul/li[4]/a");
	public static final By valueBox=By.id("item01_value");
	public static final By valueBox2=By.id("item02_value");
	public static final By valueBox3=By.id("item03_value");
	public static final By valueBox4=By.id("item04_value");
	public static final By textInValueBox=By.xpath("//ul[@class='dropdown-menu pull-right']//span[text()='Edit']");
	public static final By selectValueOfVendor=By.xpath("//ul[@class='dropdown-menu pull-right']//li[13]/a");
	public static final By selectValueOfstatus=By.xpath("//input[@id='item02_value']/../div/ul/li[1]/a");
	public static final By selectValueOfprimary=By.xpath("//input[@id='item03_value']/../div/ul/li[1]/a");
	public static final By selectValueOfsecondary=By.xpath("//input[@id='item04_value']/../div/ul/li[2]/a");
	public static final By firstPlus=By.xpath("//div[@class='filter-group prod-search-filter']//button[@class='btn bbf-add btn-info']");
	public static final By secondPlus=By.xpath("//div[@id='Filter_filters']/ul/li[2]//button[@class='btn bbf-add btn-info']");
	public static final By firstDel=By.xpath("//div[@id='Filter_filters']/ul/li[2]//button[@class='btn bbf-del btn-info']");
	public static final By sortById=By.xpath("//span[text()='Product ID']");
	public static final By sortByName=By.xpath("//span[text()='Product Name']");
	public static final By sortByVendor=By.xpath("//table[@class='table table-bordered table-striped']/thead/tr/th[5]/div");
	public static final By pageOfTwo=By.xpath("//a[text()=2]");
	public static final By pageOfLast=By.xpath("//ul[@class='pagination pagination-sm']/li[7]/a");
	public static final By editIcon=By.xpath("//span[@class='glyphicon glyphicon-edit j_prodEdit']");
	public static final By updateStatus=By.xpath("//button[@class='btn btn-primary upper j_updateStatus']");
	public static final By tipsOnPopUp=By.className("modal-body");
	public static final By confirmOnPopUp=By.xpath("//button[text()='confirm']");
	public static final By selectAll=By.className("j_selectAll");
	public static final By statusBox=By.id("ProductStatus_newStatus");//update status modal上面
	public static final By selectStatus=By.xpath("//input[@id='ProductStatus_newStatus']/../div/ul/li[2]/a");
	public static final By productStatus=By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr[1]/td[7]");
  public static String searchPrompt() {//输入框内的提示
	  String a=autoMan.getElement(searchBox).getAttribute(searchPrompt);
	  return a;
  }
  public static String resultNumber(){//空搜索后默认显示的产品数量
	  autoMan.getElement(searchButton1).click();
	  String reNum=autoMan.getElement(resultTips).getText();
	  return reNum;
  }
  public static void searchByInput(String idOrName){
	  autoMan.getElement(searchBox).sendKeys(idOrName);
	  autoMan.getElement(searchButton1).click();
  }
 
}
