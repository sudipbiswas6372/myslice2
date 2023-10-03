package com.slice.service;

import com.slice.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPosts(PostDto postDto);

    List<PostDto> listAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);

    void deleteById(long id);
}
