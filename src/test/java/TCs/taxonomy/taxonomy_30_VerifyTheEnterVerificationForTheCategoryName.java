package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;

public class taxonomy_30_VerifyTheEnterVerificationForTheCategoryName extends prepare{
  @Test
  public void TheEnterVerification() {
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.textEquals("Category Name",autoMan.executeJS(true, "return document.getElementById('searchByCategoryName').placeholder"));
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.trueEquals(By.xpath("//div[text()='Please input searching criteria.']"));
  
  }
}
