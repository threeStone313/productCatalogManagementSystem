package TCs.wareHouse;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;
import basePrepare.wareHouse;

public class wareHouse_26_AddAWarehouseFilledRequiredFieldsWithMinLength extends prepare{
  @Test
  public void AddAWarehouse() {
	  basicInfo.addNewItem(false, null, true);
	  wareHouse.addWarehouseInfo(null);
	  autoMan.getElement(wareHouse.save).click();
	  autoMan.sleep(3000);
	  autoMan.textEquals("1",autoMan.executeJS(false,"ProductWarehouse_Weight"));
	  autoMan.textEquals("false",autoMan.executeJS(true, "return (document.getElementById('BOM_BOMInfo_IsPrimaryRouting').checked).toString()"));
  }
}
