package TCs.taxonomy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.prepare;
import basePrepare.taxonomy;
public class taxonomy_29_TheEbayTaxonomysNotDisplayedInTaxonomyTab extends prepare{
  @Test
  public void EbayTaxonomys() {
	  autoMan.getElement(taxonomy.taxonomyTab).click();
	  autoMan.getElement(taxonomy.searchField).sendKeys("Audiobooks");
	  autoMan.getElement(taxonomy.goSearchButton).click();
	  autoMan.trueEquals(By.xpath("//div[text()='Find no result.']"));
  }
}
