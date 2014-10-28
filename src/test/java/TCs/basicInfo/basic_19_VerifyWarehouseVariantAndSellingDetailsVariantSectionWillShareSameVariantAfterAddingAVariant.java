package TCs.basicInfo;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_19_VerifyWarehouseVariantAndSellingDetailsVariantSectionWillShareSameVariantAfterAddingAVariant extends prepare{
  @Test
  public void ShareSameVariant() {
	  basicInfo.addNewItem(false, null, false);
	  basicInfo.addVariant();
	  autoMan.getElement(basicInfo.warehouseTab).click();
	  autoMan.sleep(2000);
	  String name=autoMan.executeJS(false,"WareVariant_variant_Name");
	  autoMan.textEquals("sdf", name);
	  autoMan.getElement(basicInfo.sellingdetailsTab).click();
	  autoMan.sleep(2000);
	  String name2=autoMan.executeJS(false,"VariantSellingDetail_VariantName");
	  autoMan.textEquals("sdf", name2);
  }
}
