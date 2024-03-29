package io.test.autotestng

import io.test.automation.lesson11.Pages.YandexPage
import groovy.util.logging.Slf4j
import io.test.automation.lesson11.Steps.SearchSteps
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import static com.codeborne.selenide.Selenide.page

@Slf4j
class TestSearchLesson11 {

    @BeforeMethod(alwaysRun = true)
    void setUp() {
        YandexPage.open()
        log.info("Begin of test")
    }

    @AfterMethod(alwaysRun = true)
    void closeDown() {
        YandexPage.exit()
        log.info("End of test")
    }

    @Test(groups = ["SMOKE"])
    void searchingTest() {
        SearchSteps searchSteps = page(SearchSteps.class)
        searchSteps.setSearchRequest("Gradle")
        SearchSteps.clickSubmitSearching()
        SearchSteps.getUrlsResultsList()
    }

    @Test(groups = ["SMOKE"])
    void searchingTest2() {
        SearchSteps searchSteps = page(SearchSteps.class)
        searchSteps.setSearchRequest("Groovy")
        SearchSteps.clickSubmitSearching()
        SearchSteps.getUrlsResultsList()
    }


    @Test(groups = ["SMOKE"])
    void searchingTest3() {
        SearchSteps searchSteps = page(SearchSteps.class)
        searchSteps.setSearchRequest("TestNG")
        SearchSteps.clickSubmitSearching()
        SearchSteps.getUrlsResultsList()
    }
}
