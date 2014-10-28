package TCs.basicInfo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_16_VerifyOperateImageFunctionIsWorkFine extends prepare{
  @Test
  public void fImageFunction() {
	  basicInfo.addNewItem(false, null, false);
	  autoMan.getElement(basicInfo.firstPreviewImage).click();
	  autoMan.getElement(basicInfo.editImageURL).click();
	  autoMan.getElement(basicInfo.imageURL).clear();
	  autoMan.getElement(basicInfo.imageURL).sendKeys("http://www.baidu.com/img/baidu_jgylogo3.gif");
	  autoMan.getElement(basicInfo.ConfirmOnAddImage).click();
	  autoMan.getElement(basicInfo.saveButton).click();
	  autoMan.sleep(2000);
	  autoMan.trueEquals(By.xpath("//div[@class='primary-image']//img[@src='http://www.baidu.com/img/baidu_jgylogo3.gif']"));
	  autoMan.getElement(basicInfo.addImage).click();
	  autoMan.getElement(basicInfo.imageURL).sendKeys("http://www.baidu.com/img/sug_bd.png");
	  autoMan.getElement(basicInfo.ConfirmOnAddImage).click();
	  autoMan.sleep(2000);
	  autoMan.getElement(basicInfo.secondPreviewImage).click();
	  autoMan.getElement(basicInfo.makePrimary).click();
	  autoMan.trueEquals(By.xpath("//div[@class='primary-image']//img[@src='http://www.baidu.com/img/sug_bd.png']"));
	  autoMan.getElement(basicInfo.secondPreviewImage).click();
	  autoMan.getElement(basicInfo.removeImage).click();
	  autoMan.getElement(basicInfo.saveButton).click();
	  autoMan.trueEquals(By.xpath("//div[@class='primary-image']//img[@src='http://www.baidu.com/img/baidu_jgylogo3.gif']"));
  }
}
