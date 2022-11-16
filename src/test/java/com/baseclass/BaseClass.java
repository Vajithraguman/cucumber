package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static WebDriver driver; 
    public static Actions main;
    public static Robot ro;
    public static Alert al;
    public static TakesScreenshot ts;
    public static JavascriptExecutor js;
    public static Select drop;
//confiquration       
	public static void inStall() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
//webdriver methods	
	public static void launch(String url) {
		driver.get(url);
	}
	public static void bigWindow() {
		driver.manage().window().maximize();
	}
	public static void getTitlepage() {
     String title = driver.getTitle();
     System.out.println(title);
	}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		return currentUrl;
	}
	public static void pageQuit() {
   driver.quit();
	}
//webelement method
	public static void sendText(WebElement element,String text) {
          element.sendKeys(text);
	}
	public static void toClick(WebElement element) {
		element.click();
	}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
      /*System.out.println(element.getText());*/
	}
	public static String getValue(WebElement element) {
	  String value=element.getAttribute("value");
	  return value;
	}
	public static void toClear(WebElement element) {
		element.clear();
	}
	
//Actions
	public static void moveTo(WebElement element) {
      main=new Actions(driver);
      main.moveToElement(element).perform();
	}
	public static void DrogAnd(WebElement src,WebElement des) {
		 main.dragAndDrop(src, des).perform();
	}
	public static void doubleC(WebElement element) {
		main.doubleClick(element).perform();
	}
	public static void rightClick(WebElement element) {
		main.contextClick(element).perform();
	}
	public static void keyup(WebElement element) {
    main.keyDown(element, Keys.SHIFT).sendKeys(element, "greens").keyUp(element, Keys.SHIFT).build().perform();
	}
//Robots
	public static void keyPressro() throws AWTException {
		 ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void keyEnter() {
    ro.keyPress(KeyEvent.VK_ENTER);
    ro.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void KeyControl() {
	       ro.keyPress(KeyEvent.VK_CONTROL);
	       ro.keyRelease(KeyEvent.VK_CONTROL);
		}
	public static void KeyC() {
	       ro.keyPress(KeyEvent.VK_C);
	       ro.keyRelease(KeyEvent.VK_C);
		}
	public static void KeyV() {
	       ro.keyPress(KeyEvent.VK_V);
	       ro.keyRelease(KeyEvent.VK_V);
		}
//Alert
	public static void accept() {
		 al=driver.switchTo().alert();
		 al.accept();
	}
	public static void dismiss() {
     al=driver.switchTo().alert();
     al.dismiss();
	}
	public static void getTextal() {
     al=driver.switchTo().alert();
     System.out.println(al.getText());
	}
	public static void sendAlert(String alsend) {
    al.sendKeys(alsend);
	}
//Screenshot
	public static void screen() throws IOException {
      ts=(TakesScreenshot)driver;
      File src=ts.getScreenshotAs(OutputType.FILE);
      File des=new File("C:\\Users\\HP\\eclipse-workspace\\FirstMavan\\screenshot\\first.png");
      FileHandler.copy(src, des);
	}
//JavaScript
	public static void scrolldown(WebElement element) {
       js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void scrollup(WebElement element) {
     js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public static void jssend(WebElement element,String send) {
     js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].setAttribute('value','send')", element);
	}
	
	public static void jsclick(WebElement element) {
     js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].click()", element);
	}
	public static void jsattribute(WebElement element) {
     js=(JavascriptExecutor)driver;
     Object ob=js.executeScript("return arguments[0].setAttribute('value')", element);
     System.out.println(ob);
	}
	
//iframe
	 public static void iframe(WebElement element) {
		 driver.switchTo().frame(element);
	 }
	 
//windowhandling
	 public static void singleWindow() {
		String par=driver.getWindowHandle();
		Set<String> chi=driver.getWindowHandles();
		for(String fin:chi) {
			if(!fin.equals(par)) {
				driver.switchTo().window(fin);
			}
		}
	 }
	 public static void multipleWindow() {
		 String par = driver.getWindowHandle();
		 Set<String> chi = driver.getWindowHandles();
		 List<String>conv=new ArrayList();
		 chi.addAll(conv);
		 driver.switchTo().window(conv.get(1));
		 
	 }
	
//dropdown
	 public static void dropdown(WebElement element) {
		  drop=new Select(element);
		  drop.selectByIndex(0);
		  drop.selectByIndex(1);
		  drop.selectByIndex(2);
	 }
	 public static void isMultiple() {
			if(drop.isMultiple()) {
				System.out.println("yes mutilple");
			}
			else {
				System.out.println("no is not mutiple");
			}
		}
	 public static void getfirst(WebElement element) {
		 WebElement gf=drop.getFirstSelectedOption();
		 System.out.println(gf.getAttribute("value"));
		 System.out.println(gf.getText());
	 }
	 public static void getallselected(WebElement element) {
		 List<WebElement> gas=drop.getAllSelectedOptions();
		 for(int i=0;i<=gas.size();i++) {
			 System.out.println(gas.get(i).getText());
	 }
		 for(int i=0;i<=gas.size();i++) {
			 System.out.println(gas.get(i).getAttribute("value"));
	 }
	 }
	 public static void getoption(WebElement element) {
		 List<WebElement> go=drop.getOptions();
		 for(int i=0;i<=go.size();i++) {
			 System.out.println(go.get(i).getText());
	 }
		 for(int i=0;i<=go.size();i++) {
			 System.out.println(go.get(i).getAttribute("value"));
	 }
	 }
	 
	 public static void deSelect() {
        drop.deselectAll();
	}

//DataDriven framework testcase
	/*public static String datadriven(String sheno,int rNo,int cNo) throws IOException {
		String value;
		File fil=new File("C:\\Users\\HP\\eclipse-workspace\\OwnMaven\\Execl\\Book1.xlsx");
		FileInputStream ins=new FileInputStream(fil);
		Workbook book=new XSSFWorkbook(ins);
		Sheet sh=book.getSheet(sheno);
		Row r=sh.getRow(rNo);
		Cell cel=r.getCell(cNo);
		int type=cel.getCellType();
		if(type==1) {
			value=cel.getStringCellValue();
			//System.out.println(value);
		}
		else if(DateUtil.isCellDateFormatted(cel)) {
			Date da=cel.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy");
			value=sim.format(da);
			//System.out.println(value);
		}
		else {
			double dou=cel.getNumericCellValue();
			long l=(long)dou;
			value=String.valueOf(l);
			//System.out.println(value);
		}
		return value;
	}
	
//data take4
	public static String hotel(String sheet,int rno,int cno) throws IOException {
		File fi=new File("C:\\Users\\HP\\eclipse-workspace\\OwnMaven\\Execl\\hotel.xlsx");
		   FileOutputStream fos=new FileOutputStream(fi);
		   Workbook book =new XSSFWorkbook();
		   Sheet sh=book.createSheet("hotelsheet");
		   Row ro = sh.createRow(0);
		   Cell cel = ro.createCell(0);
		   cel.setCellValue("vajithraguman@gmail.com");
		   Cell ne=ro.createCell(1);
		   ne.setCellValue("Vajith@99");
		   book.write(fos);
		   
		   String value;
		   FileInputStream fin=new FileInputStream(fi);
		   Sheet se=book.getSheet(sheet);
		   Row a=se.getRow(rno);
		   Cell c=a.getCell(cno);
		   int type=cel.getCellType();
			if(type==1) {
				value=c.getStringCellValue();
				//System.out.println(value);
			}
			else if(DateUtil.isCellDateFormatted(c)) {
				Date da=c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy");
				value=sim.format(da);
				//System.out.println(value);
			}
			else {
				double dou=c.getNumericCellValue();
				long l=(long)dou;
				value=String.valueOf(l);
				//System.out.println(value);
			}
			return value;
	}
*/	

}





















