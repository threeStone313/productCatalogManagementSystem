package TCs.basicInfo;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_12_VerifyTheFormatOfProductIDAndSKU_isDropship extends prepare{
  @Test
  public void isdropship() {
	  basicInfo.addNewItem(true,null,true);
	  String D=autoMan.executeJS(false,"BasicInfo_basic_MainInfo_InventorySku");
	  String Y=autoMan.executeJS(false,"BasicInfo_basic_MainInfo_PersonalizeSku");
	  autoMan.textEquals("DP", D.substring(0, 2));
	  autoMan.textEquals("0000N", D.substring(7, 12));
	  autoMan.textEquals("0000Y", Y.substring(7, 12));
  }
}
