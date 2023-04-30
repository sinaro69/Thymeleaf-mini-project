package com.istad.thymeleafhomework.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authors {
    private int id;
    private String name;
    private String profileURLs;
    private String Gender;
    private String bio;
    private String email;
    private String address;
    private String imgUrl = "https://developers.elementor.com/docs/assets/img/elementor-placeholder-image.png";
}
