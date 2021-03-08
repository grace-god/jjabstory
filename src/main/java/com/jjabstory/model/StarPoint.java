package com.jjabstory.model;

import javax.persistence.*;

@Entity
@Table(
        uniqueConstraints={
                @UniqueConstraint(
                        columnNames={"board_pk","writer"}
                )
        }
)
public class StarPoint {

    @Id
    private String StarPointPk;

    @Column(name = "board_pk")
    @ManyToOne(fetch = FetchType.LAZY)
    private BoardEntity boardEntity;

    @Column(name = "writer")
    private String writer;



}
