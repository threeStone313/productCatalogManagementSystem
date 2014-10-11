package basePrepare;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class basicInfo extends autoMan{
	public static Logger logger = Logger.getLogger(basicInfo.class.getName());
	public static final By header1=By.xpath("//section[@id='subView']/div/div/header");
}
