package com.istad.thymeleafhomework.repository;

import com.istad.thymeleafhomework.Model.Articles;
import com.istad.thymeleafhomework.Model.Authors;
import com.istad.thymeleafhomework.Model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class ArticleRepository {
    List<Articles> article = new ArrayList<>() {{
        add(new Articles(101, "Tony Stark is the wealthy son of industrialist and weapons manufacturer Howard Stark and his wife, Maria.", new AuthorRespository().getAllAuthor().get(0), new Category[]{new CategoryRepository().getAllCategory().get(1), new CategoryRepository().getAllCategory().get(2)}, "https://wallpapercave.com/wp/wp6340343.jpg"));
        add(new Articles(102, "Bitten by a radioactive spider, Peter Parker's arachnid abilities give him amazing powers he uses to help others, while his personal life continues to offer plenty of obstacles", new AuthorRespository().getAllAuthor().get(1), new Category[]{new CategoryRepository().getAllCategory().get(2)}, "https://www.denofgeek.com/wp-content/uploads/2021/02/spider-man-shattered-dimensions-no-way-home.jpg?fit=2560%2C1440"));
        add(new Articles(103, "Monkey D. Luffy (/ˈluːfi/ LOO-fee) (Japanese: モンキー・D・ルフィ, Hepburn: Monkī Dī Rufi, [ɾɯɸiː]), also known as \"Straw Hat\" Luffy, is a fictional character and the protagonist of the One Piece manga series, created by Eiichiro Oda.\n", new AuthorRespository().getAllAuthor().get(2), new Category[]{new CategoryRepository().getAllCategory().get(2)}, "https://i.pinimg.com/originals/93/15/3a/93153ad8e24e3c504bb3576ff5856e79.jpg"));
        add(new Articles(104, "Monkey D. Luffy, also known as \"Straw Hat Luffy\" and commonly as \"Straw Hat\", is the founder and captain of the increasingly infamous and powerful Straw Hat Pirates, as well as the most powerful of its top fighters.", new AuthorRespository().getAllAuthor().get(2), new Category[]{new CategoryRepository().getAllCategory().get(3)}, "https://simkl.net/episodes/45/4557474ecd57b300f_w.jpg"));
    }};

    public List<Articles> getAllArticle() {
        return article;
    }

    public Articles getArticleByid(int id) {
        return article.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Articles> getArticleByAuthorName(String name) {
        return article.stream().filter(e -> Objects.equals(e.getAuthor().getName(), name)).toList();
    }

    public void addNewArticle(Articles articles) {
        article.add(articles);
    }

    public void deleteArticle(int id) {
        article.remove(article.stream().filter(e -> e.getId() == id).findFirst().orElse(null));
    }
}

