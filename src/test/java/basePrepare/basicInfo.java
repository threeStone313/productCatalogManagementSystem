package basePrepare;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class basicInfo extends autoMan{
	public static Logger logger = Logger.getLogger(basicInfo.class.getName());
	public static final By header1=By.xpath("//section[@id='subView']/div/div/header");
	public static final By isDropShip=By.id("BasicInfo_basic_MainInfo_IsDropShipProduct");
	public static final By TreatAsComponentIcon=By.id("BasicInfo_basic_MainInfo_IsComponent");
	public static final By ComponentTypeSection=By.xpath("//div[@class='form-group field-ComponentTypeId component-type']");
	public static final By materialOfComponentType=By.id("BasicInfo_basic_MainInfo_ComponentTypeId-1");
	public static final By productName=By.id("BasicInfo_basic_MainInfo_Name");
	public static final By PersField=By.xpath("//input[@class='form-control dropdown-text is-personalize']");
	public static final By selectPers=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[1]/a");
	public static final By vendorId=By.id("BasicInfo_basic_MainInfo_VendorId");
	public static final By selectVendor=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[1]/a");
	public static final By vendorProductId=By.id("BasicInfo_basic_MainInfo_VendorItemNumber");
	public static final By vendorProductDesc=By.id("BasicInfo_basic_MainInfo_VendorItemDescription");
	public static final By InventorySkuSection=By.xpath("//div[@class='form-group field-InventorySku base-prod-sku']");
	public static final By personalizeSkuSection=By.xpath("//div[@class='form-group field-PersonalizeSku base-prod-sku']");
	public static final By ProductDesc=By.id("BasicInfo_basic_MainInfo_Description");
	public static final By originalInventorySku=By.id("BasicInfo_basic_MainInfo_ManualInventorySku");
	public static final By Scene7ImageReference=By.id("BasicInfo_basic_Images_Scene7ImageName");
	public static final By EBay_Category=By.id("item01_PrimaryCategory");
	public static final By selectAntiques=By.xpath("//ul[@class='dropdown-menu pull-right search-list']/li[2]/a");				
	public static final By selectPrimitives=By.xpath("//li[@class='dropdown-submenu open-left']//li[15]//span");
	public static final By addVariant=By.xpath("//input[@class='btn btn-primary upper j_addVariant']");
	public static final By variantType=By.id("VariantTypeApply_variantType");
	public static final By addNewInVariantType=By.xpath("//a[text()='ADD NEW']");
	public static final By NewVariantTypeField=By.id("VariantType_Description");
	public static final By ConfirmOnAddNewVariantType=By.xpath("//div[@class='modal-footer']/button[@class='btn btn-primary upper j_done']");
	public static final By CancelOnAddNewVariantType=By.xpath("//div[@class='modal-footer']/button[@class='btn btn-default upper j_cancel']");
	public static final By selectVariantType=By.xpath("//span[text()='Design']");
	public static final By GoInVariantSection=By.xpath("//button[@class='btn btn-primary j_variantType upper col-sm-1']");
	public static final By DesignDropDown=By.id("item01_Design");
	public static final By addNewInDesignDropDown=By.xpath("//input[@id='item01_Design']/..//a[text()='ADD NEW']");
	public static final By NewVariantTypeValueField=By.id("VariantTypeValue_Description");
	public static final By variantName=By.id("item01_Name");
	public static final By variantNsku=By.id("item01_ManualInventorySku");
	public static final By variantYsku=By.id("item01_ManualPersonalizeSku");
	public static final By VendorVariantID=By.id("item01_VendorItemNumber");
	public static final By addImage=By.xpath("//button[@class='btn btn-primary upper j_addImg']");
	public static final By imageURL=By.id("Image_imageURL");
	public static final By ConfirmOnAddImage=By.xpath("//button[text()='confirm']");
	public static final By firstPreviewImage=By.xpath("//div[@class='clearfix image-list']/div[1]");
	public static final By secondPreviewImage=By.xpath("//div[@class='clearfix image-list']/div[2]");
	public static final By editImageURL=By.xpath("//a[text()='Edit Image URL']");
	public static final By makePrimary=By.xpath("//a[text()='Make Primary']");
	public static final By removeImage=By.xpath("//a[text()='Remove Image']");
	public static final By saveButton=By.xpath("//input[@class='btn btn-primary upper j_done']");
	public static final By valueInComponents=By.xpath("//div[@data-key='ComponentName']");//filter of value
	public static final By skuInComponents=By.xpath("//div[@data-key='ComponentProductSku']");//filter of sku
	public static final By optionCategoryInComponents=By.xpath("//div[@data-key='OptionCategoryName']");//filter of optioncategory
	public static final By warehouseTab=By.xpath("//a[text()='Warehouse']");
	public static final By sellingdetailsTab=By.xpath("//a[text()='Selling Details']");
	public static final By searchComponentsField=By.id("searchComByNameOrId");
	public static final By searchComponentsButton=By.xpath("//button[@class='btn btn-primary upper j_searchComponents']");
	public static final By filterByComponentType=By.id("ComponentFilter_componentType");
	public static final By selectMaterialComponentType=By.xpath("//span[text()='Material']");
	public static final By searchFilterButton=By.xpath("//button[@class='btn btn-primary upper text-right j_searchComponents']");
	public static final By QTYInSearchResults=By.xpath("//input[@class='form-control seq-input input-sm j_qty']");
	public static final By selectServiceComponentType=By.xpath("//span[text()='Service']");
	public static final By selectNoneComponentType=By.xpath("//input[@id='ComponentFilter_componentType']/..//li[1]/a");
	public static final By FilterByOptionCategoryField=By.id("ComponentFilter_category");
	public static final By OptionCategoryExpandIcon=By.xpath("//i[@class='collapse j_expand']");
	public static final By OptionCategoryExcludeIcon=By.xpath("//a[@class='j_doCC cap included']");
	public static final By OptionCategoryIncludeIcon=By.xpath("//a[@class='j_doCC cap']");
	public static final By OptionCategoryRemoveIcon=By.xpath("//a[@class='j_doOC cap included']");
	public static final By AddInOptionCategorySearchResults=By.xpath("//a[text()='Add']");

	public static void addNewItem(boolean isDropship,String ComponentType,boolean isPers){
		autoMan.deletePreconditionData();
		getElement(HomePage.addNew).click();
		if(isDropship==true){
			getElement(isDropShip).click();
		}
		if(ComponentType=="s"){
			getElement(TreatAsComponentIcon).click();
		}else if(ComponentType=="m"){
			getElement(TreatAsComponentIcon).click();
			getElement(materialOfComponentType).click();
		}
		if(isPers==true){
			getElement(PersField).click();
			getElement(selectPers).click();
		}
		getElement(productName).sendKeys("Auto072832428");
		getElement(vendorId).click();
		getElement(selectVendor).click();
		getElement(vendorProductId).sendKeys("PTC_Share step for other case");
		getElement(vendorProductDesc).sendKeys("step for other tabs");
		getElement(ProductDesc).sendKeys("Pfor other tabs"); 
		getElement(originalInventorySku).sendKeys("Auto072815568");
		getElement(Scene7ImageReference).sendKeys("Auto0728152549");
		getElement(EBay_Category).click();
		autoMan.moveToElement(selectAntiques);
		getElement(selectPrimitives).click();
		getElement(addImage).click();
		getElement(imageURL).sendKeys("http://www.baidu.com/img/bdlogo.gif");
		getElement(ConfirmOnAddImage).click();
		getElement(saveButton).click();
		autoMan.sleep(5000);
	}
	public static void addVariant(){
		getElement(addVariant).click();
//		getElement(variantType).click();
//		getElement(selectVariantType).click();
		getElement(variantName).sendKeys("sdf");
		getElement(variantNsku).sendKeys("41DFG");
		getElement(variantYsku).sendKeys("FDF");
		getElement(VendorVariantID).sendKeys("automan313");;
		getElement(saveButton).click();
		autoMan.sleep(2000);
	}
}
