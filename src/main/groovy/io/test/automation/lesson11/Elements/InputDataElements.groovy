package io.test.automation.lesson11.Elements

import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.support.FindBy

class InputDataElements extends ElementsContainer {

    @FindBy(xpath = "//input[@id='text']")
    private SelenideElement inputField

    void setInputField(String inputField) {
        this.inputField.setValue(inputField)
    }
}
