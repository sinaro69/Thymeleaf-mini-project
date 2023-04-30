package co.istad.springminiproject.service.serviceImpl;

import co.istad.springminiproject.model.Author;
import co.istad.springminiproject.repository.AuthorRepository;
import co.istad.springminiproject.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;
    AuthorServiceImpl(){

    }
    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.getAllAuthor();
    }
}
