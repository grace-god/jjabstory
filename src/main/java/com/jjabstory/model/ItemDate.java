package com.jjabstory.model;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
@Getter
public class ItemDate {

    private LocalDate createDate;
    private LocalDate modifyDate;
    private String writer;

}
