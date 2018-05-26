package Services;

import java.util.List;

import Clases.Post;

public interface PostService {
	
	public void save(Post p);
	
	public List<Post> SelectAllPosts();

}