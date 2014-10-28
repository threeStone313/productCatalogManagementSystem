package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;

public class taxonomy_31_VerifyDisplayTheSearchResultMatchedToTheSearchCriteria extends prepare{
  @Test
  public void SearchResultMatched() {
	  autoMan.sleep(3000);
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.getElement(taxonomy.searchField).sendKeys("CTC185");
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.trueEquals(By.xpath("//p[text()='CTC18501']"));
	  
  }
}
