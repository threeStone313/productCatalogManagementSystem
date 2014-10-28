package TCs.Home;

import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class New_10_DefaultToHideCompoentTypes extends prepare{
  @Test
  public void openAndHide() {
	  autoMan.getElement(HomePage.addNew).click();
	  autoMan.getElement(basicInfo.TreatAsComponentIcon).click();
	  autoMan.trueEquals(basicInfo.ComponentTypeSection);
	  
  }
}
