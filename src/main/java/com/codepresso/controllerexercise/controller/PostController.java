package com.codepresso.controllerexercise.controller;

import com.codepresso.controllerexercise.dto.PostDto;
import com.codepresso.controllerexercise.service.PostService;
import org.springframework.web.bind.annotation.*;

public class PostController {
    PostService postService = new PostService();  // controoler 에서 service를 활용한다.

    @GetMapping
    public PostDto getPost(@RequestParam Integer id){
        PostDto result = postService.getPost(id);   // 컨트롤러는 요청을 받고 요청을 서비스에 위임한다.
        return result;  // 클라이언트에게 반환
    }

    @PostMapping
    public String savePost(@RequestBody PostDto postDto){    // 포스트나 풋 처럼 json 데이터를 받아오려면 @RequstBody 사용
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle();
        System.out.println(postDto.getContent();
        System.out.println(postDto.getUsername();


//         입력값 JSON
//        {
//            "id" : hello,
//
//        }

        return "POST /post";
    }

    @PutMapping
    public String updatePost() {         return "PUT /post";}



    }

