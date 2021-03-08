package com.jjabstory.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Language {

    @Id
    private long languagePk;

    @Column(unique = true,length = 15)//유니크 15자
    private String Language;//언어 이름

    @Embedded
    private ItemDate date;


}
