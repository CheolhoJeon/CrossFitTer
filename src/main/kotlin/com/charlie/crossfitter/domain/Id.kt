package com.charlie.crossfitter.domain

import java.io.Serializable

@JvmInline
value class Id<T>(val id: Long) : Serializable {

  companion object {
    fun <T> of(id: Long?): Id<T>? {
      return id?.let { Id(id) }
    }
  }

  val isNotZero: Boolean
    get() = id != 0L

  val isZero: Boolean
    get() = id == 0L

}