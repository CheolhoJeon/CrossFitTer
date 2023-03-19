package com.charlie.crossfitter.domain.wod

import com.charlie.crossfitter.domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne

/**
 * 와드를 구성하는 운동들을 의미한다
 *
 * @property scales RxD, A, B, C의 난이도로 구성될 수 있으며, 난이도에 따라 다른 무게를 가진다
 */
@Entity
class WodPiece(
  @ManyToOne
  val wod: Wod,
  @ManyToMany
  val exercise: Exercise,
  val times: Int,
  // @Embedded? Serialize?
  val scales: List<Pound>,
) : BaseEntity<WodPiece>() {

}