package com.ensat.services;

import java.util.List;

import com.ensat.entities.Post;

public interface PostService {
	
	public void save(Post p);
	
	public List<Post> SelectAllPosts();

}