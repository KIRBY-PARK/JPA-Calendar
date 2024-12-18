package com.calendar.JPA_Calendar.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@MappedSuperClass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreateDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
