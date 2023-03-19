package com.charlie.crossfitter.domain.wod

import com.charlie.crossfitter.domain.BaseEntity
import java.time.LocalDate
import javax.persistence.Entity

/**
 * @property member 참여할 수 있는 멤버의 수. 2명 이상인 경우 팀와드로 분류될 수 있다.
 */
@Entity
class Wod(
  val round: Int = 1,
  val kind: WodKind,
  val member: Int = 1,
  val date: LocalDate,
) : BaseEntity<Wod>(){
}