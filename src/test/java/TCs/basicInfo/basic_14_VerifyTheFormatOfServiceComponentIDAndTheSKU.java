package TCs.basicInfo;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_14_VerifyTheFormatOfServiceComponentIDAndTheSKU extends prepare {
  @Test
  public void TheFormatOfServiceComponentIDAndTheSKU() {
	  basicInfo.addNewItem(false,"s",false);
	  String D=autoMan.executeJS(false,"BasicInfo_basic_MainInfo_InventorySku");
	  autoMan.textEquals("ACS", D.substring(0, 3));
	  autoMan.textEquals("000N", D.substring(8, 12));

  }
}
