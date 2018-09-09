@file:JvmName("SelenideElement")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

infix fun SelenideElement.shouldMatchText(regex: String): SelenideElement = this.shouldHave(Condition.matchText(regex))

/* aliases start */
infix fun SelenideElement.match(regex: String): SelenideElement = this.shouldMatchText(regex)

infix fun SelenideElement.shouldMatch(regex: String): SelenideElement = this.shouldMatchText(regex)

infix fun SelenideElement.shouldMatchesText(regex: String): SelenideElement = this.shouldMatchText(regex)

infix fun SelenideElement.matchesText(regex: String): SelenideElement = this.shouldMatchText(regex)

infix fun SelenideElement.matches(regex: String): SelenideElement = this.shouldMatchText(regex)
/* end aliases */

infix fun SelenideElement.shouldHaveExactTextCaseSensitive(text: String): SelenideElement =
    this.shouldHave(Condition.exactTextCaseSensitive(text))

/* aliases start */
infix fun SelenideElement.shouldHaveExactCaseSensitive(text: String): SelenideElement =
    this.shouldHaveExactTextCaseSensitive(text)
/* end aliases */

infix fun SelenideElement.shouldHaveExactText(text: String): SelenideElement =
    this.shouldHave(Condition.exactText(text))

/* aliases start */
infix fun SelenideElement.shouldHaveExact(text: String): SelenideElement = this.shouldHaveExactText(text)
/* end aliases */

infix fun SelenideElement.shouldHaveTextCaseSensitive(text: String): SelenideElement =
    this.shouldHave(Condition.textCaseSensitive(text))

/* aliases start */
infix fun SelenideElement.shouldHaveCaseSensitive(text: String): SelenideElement =
    this.shouldHaveTextCaseSensitive(text)
/* end aliases */

infix fun SelenideElement.shouldHaveText(text: String): SelenideElement = this.shouldHave(Condition.text(text))

/* aliases start */
infix fun SelenideElement.shouldContains(text: String): SelenideElement = this.shouldHaveText(text)

infix fun SelenideElement.contains(text: String): SelenideElement = this.shouldHaveText(text)

infix fun SelenideElement.has(text: String): SelenideElement = shouldHaveText(text)
/* end aliases */

// find("body") should visible
infix fun SelenideElement.should(condition: Condition) = this.should(condition)
infix fun SelenideElement.shouldBe(condition: Condition) = this.shouldBe(condition)
infix fun SelenideElement.shouldNot(condition: Condition) = this.shouldNot(condition)
infix fun SelenideElement.shouldHave(condition: Condition) = this.shouldHave(condition)
infix fun SelenideElement.shouldNotBe(condition: Condition) = this.shouldNotBe(condition)
infix fun SelenideElement.shouldBeNot(condition: Condition) = this.shouldNotBe(condition)
infix fun SelenideElement.shouldNotHave(condition: Condition) = this.shouldNotHave(condition)

infix fun SelenideElement.should(conditions: Array<out Condition>) = this.should(*conditions)
infix fun SelenideElement.shouldBe(conditions: Array<out Condition>) = this.shouldBe(*conditions)
infix fun SelenideElement.shouldNot(conditions: Array<out Condition>) = this.shouldNot(*conditions)
infix fun SelenideElement.shouldHave(conditions: Array<out Condition>) = this.shouldHave(*conditions)
infix fun SelenideElement.shouldNotBe(conditions: Array<out Condition>) = this.shouldNotBe(*conditions)
infix fun SelenideElement.shouldNotHave(conditions: Array<out Condition>) = this.shouldNotHave(*conditions)
