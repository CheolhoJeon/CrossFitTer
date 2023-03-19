package com.charlie.crossfitter.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity<T>(
  id: Long = 0L
) {

  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Id<T> = Id(id)

  @CreatedDate
  @Column(columnDefinition = "datetime(6) default '1999-01-01'")
  var createdAt: LocalDateTime = LocalDateTime.now()

  @LastModifiedDate
  @Column(columnDefinition = "datetime(6) default '1999-01-01'")
  var updatedAt: LocalDateTime = LocalDateTime.now()

  val primitiveId
    get() = id.id
}