@file:JvmName("Open")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Selenide
import java.net.URL

/*

  This file contains some syntactic sugar around variations of
  overloaded com.codeborne.selenide.Selenide.open java methods

 */

/**
 * Selenium / Selenide browser system property (key) name
 */
val browserKeys: Array<String> by lazy {
  arrayOf(
      "selenide.browser",
      "browser"
  )
}

/**
 * setting up browser to be open for open function execution in test
 */
fun setBrowser(browser: String) = browserKeys.forEach { System.setProperty(it, browser) }

/**
 * String URL could be opened with Selenide by using this extension function
 *
 * Usage:
 *
 * <pre>
 *
 *  "https://ololo-trololo.example.com".open {
 *    // do some assertions...
 *  }
 *
 * </pre>
 */
fun String.open(block: Finder.() -> Unit) {
  Selenide.open(this)
  block.invoke(Finder())
}

/**
 * String URL could be opened with Selenide in specific browser by using this extension function
 *
 * Usage:
 *
 * <pre>
 *
 *  "https://ololo-trololo.example.com".open("firefox") {
 *    // do some assertions...
 *  }
 *
 * </pre>
 */
fun String.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open {
    block.invoke(Finder())
  }
}

/**
 * String URL could be opened with Selenide in specific browser by using this extension function
 *
 * Usage:
 *
 * <pre>
 *
 *  "https://ololo-trololo.example.com".openIn("chrome") {
 *    // do some assertions...
 *  }
 *
 * </pre>
 */
fun String.openIn(browser: String, block: Finder.() -> Unit) = open(browser, block)

fun URL.open(block: Finder.() -> Unit) {
  Selenide.open(this)
  block.invoke(Finder())
}

fun URL.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open {
    block.invoke(Finder())
  }
}

fun URL.openIn(browser: String, block: Finder.() -> Unit) = open(browser, block)

fun Pair<Any, String?>.open(block: Finder.() -> Unit) {
  Selenide.open(this.second ?: "")
  block.invoke(Finder())
}

fun Pair<Any, String?>.open(browser: String, block: Finder.() -> Unit) {
  setBrowser(browser)
  return this.open {
    block.invoke(Finder())
  }
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
  return this.open {
    block.invoke(Finder())
  }
}

fun Map<String, String?>.openIn(browser: String, block: Finder.() -> Unit) = this.open(browser, block)
