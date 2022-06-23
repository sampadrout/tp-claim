package io.testproject.generated.tests.serviceprouitest;

import io.testproject.sdk.drivers.ReportType;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: ServicePro_UI_Test
 * Test: C57505_Admin/Operator - Claims Dashboard Page
 * Generated by: Sampad Rout (srout@cchs.com)
 * Generated on Mon Jun 20 12:05:25 GMT 2022.
 */
@DisplayName("C57505_Admin/Operator - Claims Dashboard Page")
public class C57505adminoperatorClaimsDashboardPage implements ExceptionsReporter {
  public static WebDriver driver;
  @BeforeAll
  static void setup() throws Exception {
    URL remoteAddress = new URL("http://0.0.0.0:8686");
//    driver = new RemoteWebDriver(remoteAddress, "71tH-tyQRbWL-gZCfrhZWBEPha_v-AGyu1aJGwBnQEY1", new ChromeOptions(), "Sampad Rout", ReportType.LOCAL);
    driver = new ChromeDriver(new ChromeOptions(), ReportType.LOCAL);
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C57505_Admin/Operator - Claims Dashboard Page")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String Application_URL, String Username, String Password)
  throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    Splogin splogin;

    // 1. This test was auto generated from steps of the 'Claims Archive Dashboard Page' test
    //    This step was auto generated from several steps
//    ((ReportingDriver)driver).report().test("My First Test").submit();

    GeneratedUtils.sleep(500);
    splogin = new Splogin();
    splogin.ApplicationURL = "https://servicepartner100-preprod.mendixcloud.com/p/login";
    splogin.Application_URL = "https://servicepartner100-preprod.mendixcloud.com/p/login";
    splogin.Username = "sp_auto_preprod2@test.com";
    splogin.Password = "New@123_";
    splogin.execute(driver);

    // 2. Is 'Claim Archive' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Claim Archive']");
    driver.findElement(by).isDisplayed();

    // 3. Click 'Claim Archive'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Claim Archive']");
    driver.findElement(by).click();

    // 4. Does 'Claims Archive Dashboard' contain 'Claims Archive Dashboard'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'Claims Archive Dashboard']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Claims Archive Dashboard"));

    // 5. Does 'In Review' contain 'In Review'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' In Review(1)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("In Review"));

    // 6. Does 'Escalated' contain 'Escalated'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Escalated(0)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Escalated"));

    // 7. Does 'Rejected' contain 'Rejected'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Rejected(28)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Rejected"));

    // 8. Does 'Approved' contain 'Approved'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Approved(1)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Approved"));

    // 9. Does 'Transferred' contain 'Transferred'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Transferred(0)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Transferred"));

    // 10. Does 'Paid' contain 'Paid'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Paid(0)']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Paid"));

    // 11. Does 'Paid from' contain 'Paid from'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[id = '95.ServiceRequest.Snippet_ClaimArchive_Dashboard_Header.label2_nqk_10701']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Paid from"));

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://servicepartner100-accp.mendixcloud.com/index.html","","",""));
  }
}
