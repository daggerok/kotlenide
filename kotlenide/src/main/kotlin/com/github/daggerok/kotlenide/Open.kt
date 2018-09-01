@file:JvmName("Open")

package com.github.daggerok.kotlenide

import com.codeborne.selenide.Selenide
import java.net.URL

/**
 * Syntactic sugar around some variations of overloaded
 * com.codeborne.selenide.Selenide.open methods
 */

fun String.open(init: Finder.() -> Unit) {
  Selenide.open(this)
  init.invoke(Finder())
}

fun URL.open(init: Finder.() -> Unit) {
  Selenide.open(this)
  init.invoke(Finder())
}

fun Pair<Any, String?>.open(init: Finder.() -> Unit) {
  Selenide.open(this.second ?: "")
  init.invoke(Finder())
}

fun Map<String, String?>.open(init: Finder.() -> Unit) {
  Selenide.open(
      this.toMutableMap()["relativeOrAbsoluteUrl"] ?: "",
      this.toMutableMap()["domain"] ?: "",
      this.toMutableMap()["login"] ?: "",
      this.toMutableMap()["password"] ?: ""
  )
  init.invoke(Finder())
}
