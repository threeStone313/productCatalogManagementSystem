package TCs.basicInfo;



import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class basic_11_VerifyTheFormatOfProductIDAndSKU extends prepare{
  @Test
  public void format() {
	  basicInfo.addNewItem(false,null,false);
	  String D=autoMan.executeJS(false,"BasicInfo_basic_MainInfo_InventorySku");
	  autoMan.textEquals("AP", D.substring(0, 2));
	  autoMan.textEquals("0000N", D.substring(7, 12));

	 
  }
}
