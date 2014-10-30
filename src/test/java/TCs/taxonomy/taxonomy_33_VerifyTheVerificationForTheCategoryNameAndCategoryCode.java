package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;

public class taxonomy_33_VerifyTheVerificationForTheCategoryNameAndCategoryCode extends prepare{
  @Test
  public void Verification() {
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.rightClick(taxonomy.taxonomyName1);
	  autoMan.getElement(taxonomy.addAfterRightClick).click();
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("CCTC18501");
	  autoMan.getElement(taxonomy.confirmOnModal).click();
	  autoMan.trueEquals(By.xpath("//p[text()='Required']"));
	  autoMan.getElement(taxonomy.catagoryNameField).sendKeys("CTC19002");
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("Exceed the length_abcdabcdabcdabcdabcdabcdabcdabcdabcdabcd");
	  autoMan.getElement(taxonomy.confirmOnModal).click();
	 autoMan.trueEquals(By.xpath("//div[contains(text(),'An error occurred while updating the entries. See the inner exception for details')]"));
  }
}
