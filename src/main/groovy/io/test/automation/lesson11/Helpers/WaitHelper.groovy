package io.test.automation.lesson11.Helpers

import io.test.automation.lesson11.Elements.ResultStatsListElements
import com.codeborne.selenide.Condition

class WaitHelper {

    static void waitStatsResult() {
        ResultStatsListElements.resultsStat.shouldBe(Condition.enabled)
    }
}
