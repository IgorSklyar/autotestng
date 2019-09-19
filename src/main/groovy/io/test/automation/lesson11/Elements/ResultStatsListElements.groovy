package io.test.automation.lesson11.Elements

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class ResultStatsListElements {

    static getResultsStat() {
        $(By.xpath('//div[@class=\'serp-list\']'))
    }
}
