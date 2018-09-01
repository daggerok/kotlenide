//@file:JvmName("Finder")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class Finder {

  fun find(cssSelector: String)       = `$`(cssSelector)
  fun find(seleniumSelector: By)      = `$`(seleniumSelector)
  fun find(webElement: WebElement)    = `$`(webElement)
  fun findX(xpathExpression: String)  = `$x`(xpathExpression)

  fun findAll(elements: Collection<WebElement>) = `$$`(elements)
  fun findAll(seleniumSelector: By)             = `$$`(seleniumSelector)
  fun findAll(cssSelector: String)              = `$$`(cssSelector)
  fun findAllX(xpathExpression: String)         = `$$x`(xpathExpression)

  fun find(cssSelector: String, assertions: SelenideElement.() -> Unit): SelenideElement {
    val el = find(cssSelector)
    assertions.invoke(el)
    return el
  }
}
