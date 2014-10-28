package TCs.wareHouse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;
import basePrepare.wareHouse;

public class wareHouse_28_TheEnterVerificationAndCancelTheAddOperationForTheNewWarehouseAndAddAnNewWarehouse extends prepare{
  @Test
  public void f() {
	  basicInfo.addNewItem(false, null, true);
	  autoMan.getElement(wareHouse.wareHouseTab).click();
	  autoMan.sleep(2000);
	  autoMan.getElement(wareHouse.addWarehouse).click();
	  autoMan.getElement(wareHouse.zipCodeInModal).sendKeys("12345");
	  autoMan.getElement(wareHouse.confirmInModal).click();
	  autoMan.trueEquals(By.xpath("//p[text()='Required']"));
	  autoMan.getElement(wareHouse.wareHouseNameInModal).sendKeys("Omaha");
	  autoMan.getElement(wareHouse.zipCodeInModal).clear();
	  autoMan.getElement(wareHouse.confirmInModal).click();
	  autoMan.trueEquals(By.xpath("//p[text()='Required']"));
	  autoMan.getElement(wareHouse.zipCodeInModal).clear();
	  autoMan.getElement(wareHouse.zipCodeInModal).sendKeys("1234");
	  autoMan.getElement(wareHouse.confirmInModal).click();
	  autoMan.trueEquals(By.xpath("//p[text()='Zipcode must be 5 digital.']"));
	  autoMan.getElement(wareHouse.zipCodeInModal).clear();
	  autoMan.getElement(wareHouse.zipCodeInModal).sendKeys("aaaaa");
	  autoMan.getElement(wareHouse.confirmInModal).click();
	  autoMan.trueEquals(By.xpath("//p[text()='Zipcode must be 5 digital.']"));
	  autoMan.getElement(wareHouse.zipCodeInModal).clear();
	  autoMan.getElement(wareHouse.zipCodeInModal).sendKeys("68154");
	  autoMan.getElement(wareHouse.confirmInModal).click();
	  autoMan.sleep(5000);
	  autoMan.getElement(wareHouse.nameField).click();
	  autoMan.trueEquals(By.xpath("//ul[@class='dropdown-menu pull-right search-list']//*[text()='omaha']"));
	 }
}
