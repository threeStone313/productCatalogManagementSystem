package basePrepare;

import org.openqa.selenium.By;

public class wareHouse {
	public static final By wareHouseTab=By.xpath("//a[text()='Warehouse']");
	public static final By addWarehouse=By.xpath("//a[text()='Add Warehouse']");
	public static final By zipCodeInModal=By.id("Warehouse_Zipcode");
	public static final By wareHouseNameInModal=By.id("Warehouse_Description");
	public static final By confirmInModal=By.xpath("//button[text()='confirm']");
	public static final By nameField=By.id("ProductWarehouse_WarehouseId");
	public static final By selectAName=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[1]/a"); 
	public static final By InventoryField=By.id("ProductWarehouse_ProductInventory");
	public static final By productInventoryLastUpdate=By.id("ProductWarehouse_ProductInventoryLastUpdateDate");
	public static final By ProductExpectedOrderArrival=By.id("ProductWarehouse_ProductExpectedArrivalDate");
	public static final By cost=By.id("ProductWarehouse_Cost");
	public static final By currentCost=By.id("ProductWarehouse_CurrentCost");
	public static final By weight=By.id("ProductWarehouse_Weight");
	public static final By BackflushItemFlag=By.id("BOM_BOMInfo_IsBackflushItem");
	public static final By PrimaryRoutingFlag=By.id("BOM_BOMInfo_IsPrimaryRouting");
	public static final By save=By.xpath("//input[@class='btn btn-primary upper j_done']");
	public static final By RestrictedShippingTypes=By.id("ProductWarehouse_RestrictedShippingTypeId");
	public static final By selectRestrictedShippingTypes=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[2]/a");
	public static final By RestrictedShippingStartMonth=By.id("ProductWarehouse_RestrictedShippingStartMonth");
	public static final By selectRestrictedShippingStartMonth=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[2]/a");
	public static final By RestrictedShippingEndMonth=By.id("ProductWarehouse_RestrictedShippingEndMonth");
	public static final By selectRestrictedShippingEndMonth=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[4]/a");
	public static final By MultiRack=By.id("ProductWarehouse_IsMultiRack");
	public static final By ShipSeparately=By.id("ProductWarehouse_IsShipSeparately");
	public static final By DropshipOnly=By.id("ProductWarehouse_IsDropShipOnly");
	public static final By PrintPickList=By.id("ProductWarehouse_IsPrintPickList");
	public static final By Base=By.id("ProductWarehouse_IsBase");
	public static final By StopShopDate=By.id("ProductWarehouse_StopShopDate");
	public static final By IntroductionDate=By.id("ProductWarehouse_IntroductionDate");
	public static final By SetBINsToRECEIPT=By.id("ProductWarehouse_BinsButton");
	public static final By VariantInventory=By.id("WareVariant_variant_variantInfo_Inventory");
	public static final By VariantInventoryLastUpdated=By.id("WareVariant_variant_variantInfo_InventoryLastUpdateDate");
	public static final By VariantExpectedArrivalDate=By.id("WareVariant_variant_variantInfo_OrderExpectedArrivalDate");
	public static final By RoutingSequence01=By.id("item01_RoutingSequenceValue");
	public static final By WorkcenterID01=By.id("item01_WorkCenterId");
	public static final By selectWorkcenterID=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[4]/a");
	public static final By plusIcon=By.xpath("//div[@id='BOM_RoutingSequences']//li[1]/div/button[1]");
	public static final By WorkcenterID02=By.id("item02_WorkCenterId");
	
	
	public static void addWarehouseInfo(String allOrRequired){
		  autoMan.getElement(wareHouse.wareHouseTab).click();
		  autoMan.getElement(wareHouse.nameField).click();
		  autoMan.getElement(wareHouse.selectAName).click();
		  autoMan.getElement(wareHouse.InventoryField).sendKeys("1");
		  autoMan.getElement(wareHouse.productInventoryLastUpdate).sendKeys("01/20/2014");
		  autoMan.getElement(wareHouse.ProductExpectedOrderArrival).sendKeys("10/31/2014");
		  autoMan.getElement(wareHouse.cost).sendKeys("1");
		  autoMan.getElement(wareHouse.currentCost).sendKeys("1");
		  autoMan.getElement(wareHouse.weight).sendKeys("1");
		  autoMan.getElement(wareHouse.BackflushItemFlag).click();
		  autoMan.getElement(wareHouse.PrimaryRoutingFlag).click();
		  if(allOrRequired=="all"){
			  autoMan.getElement(wareHouse.RestrictedShippingTypes).click();
			  autoMan.getElement(wareHouse.selectRestrictedShippingTypes).click();
			  autoMan.getElement(wareHouse.MultiRack).click();
			  autoMan.getElement(wareHouse.RestrictedShippingStartMonth).click();
			  autoMan.getElement(wareHouse.selectRestrictedShippingStartMonth).click();
			  autoMan.getElement(wareHouse.StopShopDate).sendKeys("10/31/2015");
			  autoMan.getElement(wareHouse.ShipSeparately).click();
			  autoMan.getElement(wareHouse.RestrictedShippingEndMonth).click();
			  autoMan.getElement(wareHouse.selectRestrictedShippingEndMonth).click();
			  autoMan.getElement(wareHouse.DropshipOnly).click();
			  autoMan.getElement(wareHouse.IntroductionDate).sendKeys("02/31/2015");
			  autoMan.getElement(wareHouse.PrintPickList).click();		 
			  autoMan.getElement(wareHouse.SetBINsToRECEIPT).click();
			  autoMan.getElement(wareHouse.VariantInventory).sendKeys("1234567890");
			  autoMan.getElement(wareHouse.Base).click();
			  autoMan.getElement(wareHouse.VariantInventoryLastUpdated).sendKeys("02/31/2015");
			  autoMan.getElement(wareHouse.VariantExpectedArrivalDate).sendKeys("04/31/2015");
			  autoMan.getElement(wareHouse.RoutingSequence01).sendKeys("10");
			  autoMan.getElement(wareHouse.WorkcenterID01).click();
			  autoMan.getElement(wareHouse.selectWorkcenterID).click();
			  autoMan.getElement(wareHouse.plusIcon).click();
			  autoMan.getElement(wareHouse.WorkcenterID02).click();
			  autoMan.getElement(wareHouse.selectWorkcenterID).click();
		  }
	}
}
