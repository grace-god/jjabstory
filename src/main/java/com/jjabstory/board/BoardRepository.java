package com.jjabstory.board;

import com.jjabstory.model.BoardDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {

    int insBoard(BoardDomain boardDomain);
    BoardDomain selBoard(BoardDomain boardDomain);
    List<BoardDomain> selBoardList();
    List<BoardDomain> selBoardSearch();

}
