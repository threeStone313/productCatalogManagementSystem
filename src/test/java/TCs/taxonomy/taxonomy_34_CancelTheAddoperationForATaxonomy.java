package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;

public class taxonomy_34_CancelTheAddoperationForATaxonomy extends prepare{
  @Test
  public void CancelTheAddoperation() {
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.rightClick(taxonomy.taxonomyName1);
	  autoMan.getElement(taxonomy.addAfterRightClick).click();
	  autoMan.getElement(taxonomy.catagoryNameField).sendKeys("CTC197");
	  autoMan.getElement(taxonomy.catagoryCodeField).sendKeys("CCTC197");
	  autoMan.getElement(taxonomy.cancel).click();
	  autoMan.sleep(1000);
	  autoMan.getElement(taxonomy.searchField).sendKeys("CTC197");
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.trueEquals(By.xpath("//div[text()='Find no result.']"));
  }
}
