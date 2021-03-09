package com.jjabstory.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

    @Id
    private long commentPk;

    @ManyToOne(fetch = FetchType.LAZY)
    private BoardEntity boardEntity;

    private String comment;

}
