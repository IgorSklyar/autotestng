package io.test.automation.lesson11.Steps

import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.Condition
import groovy.util.logging.Slf4j
import io.test.automation.lesson11.Elements.FindButtonElements
import io.test.automation.lesson11.Elements.InputDataElements
import io.test.automation.lesson11.Helpers.WaitHelper
import io.test.automation.lesson11.Pages.ResultPage
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Wait


@Slf4j
class SearchSteps {

//    @FindBy(xpath = "//input[@id='text']]")
//    private SearchData searchRequest

    @FindBy(xpath = "//span[@class='input__box']")
    private InputDataElements searchRequest

    void setSearchRequest(String inputField) {
        searchRequest.setInputField(inputField)

    }
    static void clickSubmitSearching() {
        FindButtonElements.submitButton.click()
        //sleep(60000)
        WaitHelper.waitStataResult()
        WaitHelper.waitJQueryReady()
    }

    static void getUrlsResultsList(){

        List<SelenideElement> searchResultList = ResultPage.results
       log.info("Display href: " + searchResultList)



        for (SelenideElement webElement : searchResultList)

        {
            System.out.println(webElement.getAttribute("href"))
           // log.info(webElement.getAttribute('href') )
        }
    }



}



//static void main(String[] args) {
//
//    WebDriver driver = new FirefoxDriver()
//    driver.get("http://www.google.com")
//    WebElement element = driver.findElement(By.name("q"))
//    element.sendKeys("Cheese!\n"); // send also a "\n"
//    element.submit()
//
//    // wait until the google page shows the result
//    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//            .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")))
//
//    List<SelenideElement> findElements = driver.findElements(By.xpath("//ul[@class='serp-list serp-list_left_yes']"));
//
//
//
//    // this are all the links you like to visit
//    for (SelenideElement webElement : findElements)
//
//    {
//        System.out.println(webElement.getAttribute("href"))
//    }
//}
