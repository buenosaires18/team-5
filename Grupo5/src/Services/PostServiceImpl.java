package Services;

import java.util.List;

import Clases.Post;
import Repositories.PostRepository;

public class PostServiceImpl implements PostService {
	
	private PostRepository pr;

	@Override
	public void save(Post p) {
		this.pr.save(p);
	}

	@Override
	public List<Post> getAll() {
		this.pr.findAll(p);
	}

}