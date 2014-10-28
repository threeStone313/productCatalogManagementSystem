package TCs.basicInfo;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;

public class  Basic_13_IfTheBaseProductHasVariantsThatNoSKUWillBeCreatedForTheBaseProduct extends prepare {
  @Test
  public void NoSKUWillBeCreated() {
	  basicInfo.addNewItem(false,null,false);
	  basicInfo.addVariant();
	  String shotPath="D:\\javaproject\\productCatalogManagement\\sikuli_shot\\13VerifyNoInvenSKUField.png";
	  Assert.assertEquals(autoMan.shot_match(shotPath), true);
	  String shotPath2="D:\\javaproject\\productCatalogManagement\\sikuli_shot\\13VerifyNoPersSKUField.png";
	  Assert.assertEquals(autoMan.shot_match(shotPath2), true);
  }
}
