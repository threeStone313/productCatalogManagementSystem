package TCs.basicInfo;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_15_VerifyTheFormatOfMaterialComponentIDAndTheSKU extends prepare{
  @Test
  public void TheFormatOfMaterialComponentIDAndTheSKU() {
	  basicInfo.addNewItem(true,"m",true);
	  String D=autoMan.executeJS(false,"BasicInfo_basic_MainInfo_InventorySku");
	  autoMan.textEquals("DCM", D.substring(0, 3));
	  autoMan.textEquals("000N", D.substring(8, 12));
	  
  }
}
