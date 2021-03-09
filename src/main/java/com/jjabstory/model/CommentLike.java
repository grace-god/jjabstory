package com.jjabstory.model;

import javax.persistence.*;

@Table(
        uniqueConstraints={
                @UniqueConstraint(
                        columnNames={"comment_pk","writer"}
                )
        }
)
@Entity
public class CommentLike {

    @Id
    private long comentLikePk;

    @Column(name = "comment_pk")
    @ManyToOne
    private Comment comment;

    @Column(name = "writer")
    private String writer;

    private long like;
}
