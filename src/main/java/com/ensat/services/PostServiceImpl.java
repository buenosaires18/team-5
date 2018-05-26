package com.ensat.services;

import java.util.ArrayList;
import java.util.List;

import com.ensat.entities.Post;
import com.ensat.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
	
	private PostRepository postRepository;
	@Override
	public void save(Post post) {

		this.postRepository.save(post);
	}

	@Override
	public List<Post> SelectAllPosts() {

		return (ArrayList) this.postRepository.findAll();
	}

	@Override
	public Iterable<Post> listAllPosts() {

		return postRepository.findAll();
	}

	@Override
	public Post getPostById(Integer id) {
		return
				postRepository.findOne(id);
	}

	@Override
	public Post savePost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public void deletePost(Integer id) {
		postRepository.delete(id);
	}

}