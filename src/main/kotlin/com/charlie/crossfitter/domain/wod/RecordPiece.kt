package com.charlie.crossfitter.domain.wod

import com.charlie.crossfitter.domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity
class RecordPiece(
  @ManyToOne
  val record: Record,
  @OneToOne
  val wodPiece: WodPiece,

) : BaseEntity<RecordPiece>() {
}