package com.codepresso.controllerexercise.service;

import com.codepresso.controllerexercise.dto.PostDto;

public class PostService {
    public PostDto getPost(Integer id){
        System.out.println("find post data from DB" + id);
        System.out.println("블라블라");
        System.out.println("블라블라" );

        return new PostDto(id, "title", "this is content", "SEONHO");
    }
}
