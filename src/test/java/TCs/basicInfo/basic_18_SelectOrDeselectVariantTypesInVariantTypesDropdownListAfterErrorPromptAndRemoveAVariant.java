package TCs.basicInfo;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePrepare.HomePage;
import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_18_SelectOrDeselectVariantTypesInVariantTypesDropdownListAfterErrorPromptAndRemoveAVariant extends prepare {
  @Test
  public void SelectOrDeselectVariantTypes() {
	  autoMan.getElement(HomePage.addNew).click();
	  autoMan.getElement(basicInfo.addVariant).click();
	  autoMan.getElement(basicInfo.variantType).click();
	  autoMan.getElement(basicInfo.selectVariantType).click();
	  autoMan.getElement(basicInfo.GoInVariantSection).click();
	  autoMan.trueEquals(basicInfo.DesignDropDown);
	  autoMan.getElement(basicInfo.variantType).click();
	  autoMan.getElement(basicInfo.selectVariantType).click();
	  autoMan.getElement(basicInfo.GoInVariantSection).click();
	  autoMan.falseEquals(basicInfo.DesignDropDown);
  }
}
