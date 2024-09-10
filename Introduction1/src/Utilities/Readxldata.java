package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import com.google.common.collect.Table.Cell;
/*
public class Readxldata {

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//public void getdata(String excelSheetName) throws FileNotFoundException , IOException
	
	@DataProvider(name = "data-set")
		public void getdata(String Login) throws FileNotFoundException , IOException
		{
		File f=new File(System.getProperty("user.dir")+"src\\testdata\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetname=wb.getSheet(excelSheetName);
		
		//Path of the excel file
		FileInputStream fs = new FileInputStream(f);
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		XSSFRow row3 = sheet.getRow(1);
		XSSFCell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		}
		} */

public class Readxldata {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "getData")
    public void testLogin(String username, String password) {
        // Your test logic here, e.g., perform login using username and password
        System.out.println("Logging in with: " + username + ", " + password);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        String excelPath = "C:\\Users\\AdminS\\eclipse-workspace\\Introduction1\\src\\testdata\\testdata.xlsx";
        FileInputStream inputStream = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(inputStream);

        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue(); // Assuming all data are strings
            }
        }

        workbook.close();
        return data;
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}