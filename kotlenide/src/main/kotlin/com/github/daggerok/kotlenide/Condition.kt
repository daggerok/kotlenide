@file:JvmName("Condition")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

infix fun Condition.not(condition: Condition): Condition = Condition.not(condition)
