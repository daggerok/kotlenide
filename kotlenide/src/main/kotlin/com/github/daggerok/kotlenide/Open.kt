@file:JvmName("Open")
@file:Suppress("UNUSED_EXPRESSION")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Selenide
import java.net.URL

/**
 * Syntactic sugar around some variations of overloaded
 * com.codeborne.selenide.Selenide.open methods
 */

val browserKeys: Array<String> by lazy {
  arrayOf(
      "selenide.browser",
      "browser"
  )
}

fun setBrowser(browser: String) = browserKeys.forEach { System.setProperty(it, browser) }

fun String.open(block: Finder.() -> Unit) {
  Selenide.open(this)
  block.invoke(Finder())
}

fun String.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open { block }
}

fun String.openIn(browser: String, block: Finder.() -> Unit) = open(browser, block)

fun URL.open(block: Finder.() -> Unit) {
  Selenide.open(this)
  block.invoke(Finder())
}

fun URL.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open { block }
}

fun URL.openIn(browser: String, block: Finder.() -> Unit) = open(browser, block)

fun Pair<Any, String?>.open(block: Finder.() -> Unit) {
  Selenide.open(this.second ?: "")
  block.invoke(Finder())
}

fun Pair<Any, String?>.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open { block }
}

fun Pair<Any, String?>.openIn(browser: String, block: Finder.() -> Unit) = this.open(browser, block)

fun Map<String, String?>.open(block: Finder.() -> Unit) {
  Selenide.open(
      this.toMutableMap()["relativeOrAbsoluteUrl"] ?: "",
      this.toMutableMap()["domain"] ?: "",
      this.toMutableMap()["login"] ?: "",
      this.toMutableMap()["password"] ?: ""
  )
  block.invoke(Finder())
}

fun Map<String, String?>.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open { block }
}

fun Map<String, String?>.openIn(browser: String, block: Finder.() -> Unit) = this.open(browser, block)
