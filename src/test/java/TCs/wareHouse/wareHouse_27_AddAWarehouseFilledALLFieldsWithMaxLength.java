package TCs.wareHouse;

import org.testng.annotations.Test;

import basePrepare.autoMan;
import basePrepare.basicInfo;
import basePrepare.prepare;
import basePrepare.wareHouse;

public class wareHouse_27_AddAWarehouseFilledALLFieldsWithMaxLength extends prepare{
  @Test
  public void AddAWarehouseFilledALLFields() {
	  basicInfo.addNewItem(false, null, true);
	  basicInfo.addVariant();
	  wareHouse.addWarehouseInfo("all");
	  autoMan.getElement(wareHouse.save).click();
	  autoMan.sleep(3000);
	  autoMan.textEquals("20",autoMan.executeJS(false,"item02_RoutingSequenceValue"));
	  autoMan.textEquals("10007",autoMan.executeJS(false,"ProductWarehouse_Zipcode"));
	  autoMan.textEquals("1234567890",autoMan.executeJS(false,"WareVariant_variant_variantInfo_Inventory"));
	  autoMan.textEquals("false",autoMan.executeJS(true, "return (document.getElementById('BOM_BOMInfo_IsPrimaryRouting').checked).toString()"));
	  autoMan.textEquals("false",autoMan.executeJS(true, "return (document.getElementById('BOM_BOMInfo_IsBackflushItem').checked).toString()"));
  
  
  }
}
