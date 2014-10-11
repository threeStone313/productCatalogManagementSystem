package TCs.Home;



import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.HomePage;
import basePrepare.prepare;
public class Search_01_TheDefaultPromptShouldDisplayedInSearchFieldAndSupportEmptyToSearch extends prepare{
  @Test
  public void emptySearch() {
	  autoMan.attributeEquals("Product ID or Name or SKU", HomePage.searchPrompt());
	  autoMan.textEquals("Showing 1 - 40 of 18702", HomePage.resultNumber());
	  
  }
}
