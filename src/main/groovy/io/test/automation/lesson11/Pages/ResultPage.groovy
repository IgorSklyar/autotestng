package io.test.automation.lesson11.Pages

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$$

class ResultPage {

    static getResults() {
        $$(By.cssSelector('[data-cid] .organic__title-wrapper [href]'))
    }
}


