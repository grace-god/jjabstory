package com.jjabstory.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class BoardEntity {

    @Id
    private long boardPk;

    @Column(name = "category_pk")
    @ManyToOne(fetch = FetchType.LAZY)
    private category category;//목차

    private String boardName;//글제몪
    private String boardContents;//글내용

    @Embedded
    private ItemDate date;//생성일 수정일 글쓴이

    private String sumStarPoint;//별점

    private long views;//조회수

}
