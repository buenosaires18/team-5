package com.ensat.services;

import java.util.ArrayList;
import java.util.List;

import com.ensat.entities.Post;
import com.ensat.repositories.PostRepository;

public class PostServiceImpl implements PostService {
	
	private PostRepository pr;

	@Override
	public void save(Post p) {
		this.pr.save(p);
	}

	@Override
	public List<Post> SelectAllPosts() {
		return (ArrayList) this.pr.findAll();
	}

}