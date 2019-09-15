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

    @BeforeMethod
    void setUp(){
        YandexPage.open()
//        ThreadPool.wait(50)
        log.info("Begin of test")
    }


    @AfterMethod
     void closeDown() {
        YandexPage.exit()
        log.info("End of test")

        //delay(3000)
        //driver.quit()
    }


    @Test
void searchingTest (){
        SearchSteps searchSteps = page(SearchSteps.class)
        searchSteps.setSearchRequest("testng")
        SearchSteps.clickSubmitSearching()
        SearchSteps.getUrlsResultsList()

//System.out.println("Test")

//    }
//    @Test
//    void searchingTest2 (){
//        SearchSteps searchSteps = page(SearchSteps.class)
//        searchSteps.setSearchRequest("Groovy")

////System.out.println("Test")
//
//    }


//    @Test
//    void searchingTest3 (){
//        SearchSteps searchSteps = page(SearchSteps.class)
//        searchSteps.setSearchRequest("TestNG")

//System.out.println("Test")

    }


}
