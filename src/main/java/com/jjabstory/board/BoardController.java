package com.jjabstory.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;

@RestController
@RequestMapping("/board")
public class BoardController {

    private BoardService service;

    @Autowired
    public BoardController(BoardService service){
        this.service = service;
    }

    @PostMapping("written")
    void insBoard(){
        service.insBoard();
    }

    @GetMapping("written/{userPk}")
    void selBoard(){
        service.selBoard();
    }

    @GetMapping("written/{search}/search")
    void selBoardSearch(){
        service.selBoardSearch();
    }

    @GetMapping("written")
    void selBoardList(){
        service.selBoardList();
    }

    @PutMapping("written")
    void updBoard(){
        service.updBoard();
    }

    @DeleteMapping("written/{userPk}")
    void delBoard(){
        service.delBoard();
    }

}
