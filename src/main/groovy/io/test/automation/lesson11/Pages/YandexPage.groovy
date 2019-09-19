package io.test.automation.lesson11.Pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.WebDriverRunner

class YandexPage {

    static open() {
        Selenide.open("https://ya.ru/")
    }

    static exit() {
        WebDriverRunner.closeWebDriver()
    }
}
