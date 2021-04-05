package com.clone_coding.danggeon.models;

import com.clone_coding.danggeon.dto.BoardsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Boards {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

//    @ManyToOne
//    @JoinColumn(name = "USER_ID")
//    private User user;

    public Boards(BoardsRequestDto boardsRequestDto){
        this.title = boardsRequestDto.getTitle();
        this.contents = boardsRequestDto.getContents();
    }

//    public Boards(BoardsRequestDto boardsRequestDto, User user){
//        this.title = boardsRequestDto.getTitle();
//        this.contents = boardsRequestDto.getContents();
//        this.user = user;
//    }

}
