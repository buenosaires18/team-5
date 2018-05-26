package Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Clases.Post;
import Clases.Respuesta;
import Repositories.PostRepository;

public class RespuestaServiceImpl implements PostService {
	
	private PostRepository pr;

	@Override
	public void save(Post p) {
		this.pr.save(p);
	}

	@Override
	public List<Respuesta> findAllByPost(Post p) {
	
	}

}