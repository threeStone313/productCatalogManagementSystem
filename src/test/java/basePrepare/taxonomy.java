package basePrepare;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class taxonomy {
	public static Logger logger = Logger.getLogger(basicInfo.class.getName());
	public static final By taxonomyTab=By.xpath("//a[text()='TAXONOMY']");
	public static final By searchField=By.id("searchByCategoryName");
	public static final By goSearchButton=By.xpath("//button[text()='go']");
	public static final By taxonomyName1=By.id("s-2");
	public static final By addAfterRightClick=By.className("j_add");
	public static final By catagoryNameField=By.id("Taxonomy_Description");
	public static final By catagoryCodeField=By.id("Taxonomy_CategoryCode");
	public static final By confirmOnModal=By.xpath("//button[@class='btn btn-primary upper j_done']");
	public static final By editAfterRightClick=By.className("j_edit");
	public static final By delAfterRightClick=By.className("j_del");
	public static final By confirmToDelete=By.xpath("//button[@class='btn btn-primary upper j_ok']");
	public static final By cancel=By.xpath("//button[@class='btn btn-default upper j_cancel']");
}
