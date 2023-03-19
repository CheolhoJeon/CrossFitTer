package com.charlie.crossfitter.domain.wod

import com.charlie.crossfitter.domain.BaseEntity
import javax.persistence.Entity

@Entity
class Exercise(
  val name: String,
) : BaseEntity<Exercise>() {
}