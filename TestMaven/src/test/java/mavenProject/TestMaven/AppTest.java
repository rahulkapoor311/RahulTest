package mavenProject.TestMaven;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
	
WebDriver driver;

@BeforeMethod
public void before(){
	System.setProperty("webdriver.chrome.driver", "Library\\chromedriver.exe");   
	
	driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void testgooglrsearch1(){

//it will open the goggle page

driver.get("http://google.in");

//we expect the title “Google “ should be present

String Expectedtitle = "Google";

//it will fetch the actual title

String Actualtitle = driver.getTitle();

System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

//it will compare actual title and expected title

AssertJUnit.assertEquals(Actualtitle, Expectedtitle);

//print out the result

System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
   //driver.findElement(By.id("lst-ib").sendkeys("xyz"));
System.out.println("Test1");
 }
@Test
public void testgooglrsearch2(){

//it will open the goggle page

driver.get("http://google.in");

//we expect the title “Google “ should be present

String Expectedtitle = "Yahooo";

//it will fetch the actual title

String Actualtitle = driver.getTitle();

System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

//it will compare actual title and expected title

AssertJUnit.assertEquals(Actualtitle, Expectedtitle);

//print out the result

System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
   //driver.findElement(By.id("lst-ib").sendkeys("xyz"));
System.out.println("Test1");
 }
}
