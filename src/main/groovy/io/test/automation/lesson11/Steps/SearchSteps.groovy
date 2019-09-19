package io.test.automation.lesson11.Steps

import com.codeborne.selenide.SelenideElement
import groovy.util.logging.Slf4j
import io.test.automation.lesson11.Elements.FindButtonElements
import io.test.automation.lesson11.Elements.InputDataElements
import io.test.automation.lesson11.Helpers.WaitHelper
import io.test.automation.lesson11.Pages.ResultPage
import org.openqa.selenium.support.FindBy

@Slf4j
class SearchSteps {

    @FindBy(xpath = "//span[@class='input__box']")
    private InputDataElements searchRequest

    void setSearchRequest(String inputField) {
        searchRequest.setInputField(inputField)
    }

    static void clickSubmitSearching() {
        FindButtonElements.submitButton.click()
        WaitHelper.waitStatsResult()
    }

    static void getUrlsResultsList() {
        List<SelenideElement> searchResultList = ResultPage.results
        for (SelenideElement webElement : searchResultList) {
            log.info(webElement.getAttribute('href'))
        }
    }
}


