package co.istad.springminiproject.service;

import co.istad.springminiproject.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<Author> getAllAuthor();
}
