@file:JvmName("Open")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Selenide
import java.net.URL

/**
 * Syntactic sugar around some variations of overloaded
 * com.codeborne.selenide.Selenide.open methods
 */

fun String.open(init: Unit.() -> Unit = {}) {
  Selenide.open(this)
}

fun URL.open(init: Unit.() -> Unit = {}) {
  Selenide.open(this)
}

fun Pair<Any, String?>.open(init: Unit.() -> Unit = {}) {
  Selenide.open(this.second?: "")
}


fun Map<String, String?>.open(init: Unit.() -> Unit = {}) {
  Selenide.open(
      this.toMutableMap()["relativeOrAbsoluteUrl"] ?: "",
      this.toMutableMap()["domain"] ?: "",
      this.toMutableMap()["login"] ?: "",
      this.toMutableMap()["password"] ?: ""
  )
}
