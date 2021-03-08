package com.jjabstory.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class category {

    @Id
    private long categoryPk;

    @Column(unique = true,length = 20)//유니크 20자
    private String category;//목차 이름

    @Embedded
    private ItemDate date;// //생성일 수정일 글쓴이

    @ManyToOne(fetch = FetchType.LAZY)
    private Language language;


}
