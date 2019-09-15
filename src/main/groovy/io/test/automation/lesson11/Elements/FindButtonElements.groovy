package io.test.automation.lesson11.Elements

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class FindButtonElements {

    static getSubmitButton(){
        $(By.xpath("//div[@class='search2__button']"))
    }
}
