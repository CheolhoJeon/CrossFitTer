package com.charlie.crossfitter.domain.wod

import com.charlie.crossfitter.domain.BaseEntity
import com.charlie.crossfitter.domain.user.User
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne

// 레코드의 성격이 AMRAP이냐 FOR_TIME이냐에 따라 많이 달라질 듯
@Entity
class Record(
  @ManyToOne
  val wod: Wod,
  @OneToOne
  val user: User,
) : BaseEntity<Record>() {

}