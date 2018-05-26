package com.ensat.services;

import java.util.List;

import com.ensat.entities.Post;


public interface PostService {
	
	void save(Post p);

	Iterable<Post> listAllPosts();

	Post getPostById(Integer id);

	Post savePost(Post product);

	void deletePost(Integer id);


}