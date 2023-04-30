package co.istad.springminiproject.repository;

import co.istad.springminiproject.model.Author;
import co.istad.springminiproject.model.Category;
import co.istad.springminiproject.service.CategoryService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    List<Author> allAuthors=new ArrayList<>(){{
        add(new Author(1,"Vichhai","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.businessinsider.com%2Fguides%2Fstreaming%2Fwhere-to-watch-john-wick-movies&psig=AOvVaw1z-lOh7oahgXvBvVr0Q04J&ust=1682934018784000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLiItPSn0f4CFQAAAAAdAAAAABAE","You can lie to me but you can't yourself","ikdksdfkljdjf.jpg" ));
        add(new Author(2,"Vichhai","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.businessinsider.com%2Fguides%2Fstreaming%2Fwhere-to-watch-john-wick-movies&psig=AOvVaw1z-lOh7oahgXvBvVr0Q04J&ust=1682934018784000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLiItPSn0f4CFQAAAAAdAAAAABAE","You can lie to me but you can't yourself","ikdksdfkljdjf.jpg" ));
        add(new Author(3,"Vichhai","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.businessinsider.com%2Fguides%2Fstreaming%2Fwhere-to-watch-john-wick-movies&psig=AOvVaw1z-lOh7oahgXvBvVr0Q04J&ust=1682934018784000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLiItPSn0f4CFQAAAAAdAAAAABAE","You can lie to me but you can't yourself","ikdksdfkljdjf.jpg" ));
        add(new Author(4,"Vichhai","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.businessinsider.com%2Fguides%2Fstreaming%2Fwhere-to-watch-john-wick-movies&psig=AOvVaw1z-lOh7oahgXvBvVr0Q04J&ust=1682934018784000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLiItPSn0f4CFQAAAAAdAAAAABAE","You can lie to me but you can't yourself","ikdksdfkljdjf.jpg" ));

    }};
    public List<Author> getAllAuthor(){
        return allAuthors;
    }
}
