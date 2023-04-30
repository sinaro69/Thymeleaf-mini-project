package com.istad.thymeleafhomework.service.serviceIMP;

import com.istad.thymeleafhomework.Model.Authors;
import com.istad.thymeleafhomework.repository.ArticleRepository;
import com.istad.thymeleafhomework.repository.AuthorRespository;
import com.istad.thymeleafhomework.service.AuthorsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorIMP implements AuthorsInterface {
    private AuthorRespository authorRespository;
    AuthorIMP() {
        authorRespository = new AuthorRespository();
    }

    @Override
    public List<Authors> getAllAuthor() {
        return authorRespository.getAllAuthor();
    }
}
