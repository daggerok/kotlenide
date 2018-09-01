@file:JvmName("SelenideElement")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

infix fun SelenideElement.contains(text: String) {
  this.shouldHave(Condition.text(text))
}

infix fun SelenideElement.has(text: String) = contains(text)
