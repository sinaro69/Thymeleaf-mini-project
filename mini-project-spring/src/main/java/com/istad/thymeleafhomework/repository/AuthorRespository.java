package com.istad.thymeleafhomework.repository;

import com.istad.thymeleafhomework.Model.Authors;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRespository {
    List<Authors> authors = new ArrayList<>(){{
        add(new Authors(101, "IronMan", "https://playcontestofchampions.com/wp-content/uploads/2021/11/champion-iron-man-infinity-war.jpg",  "male", "James was born on October 6, 2004 to reigning NBA Rookie of the Year LeBron James, age 19, and his girlfriend Savannah Brinson", "IronMan.org@gmail.com", "phnomPenh", "https://w0.peakpx.com/wallpaper/19/644/HD-wallpaper-iron-man-2018-art-iron-man-superheroes.jpg"));
        add(new Authors(102, "SpiderMan", "https://i.pinimg.com/736x/42/d7/be/42d7beeaf3251080f7df2c6532ab3f57.jpg" ,"male", "A student of ISTAD", "SpiderMan.org@gmail.com", "UnitedState", "https://www.pixelstalk.net/wp-content/uploads/2016/08/Beautiful-Spiderman-Wallpaper.jpg"));
        add(new Authors(103, "Lufy","https://yt3.googleusercontent.com/NG0QEKencmNbKKJpjANk9tqvtlHxvEpaFRu-50wkzti2TGXK9cPf5c7OCF2-LYsRquAALzjzRg=s900-c-k-c0x00ffffff-no-rj" ,  "female", "A student of American university of Phnom Penh", "vichara.org@gmail.com", "Phnom Penh", "https://i.pinimg.com/originals/78/2f/03/782f032235bd4b00c80de140b8e70538.jpg"));
        add(new Authors(104, "seangleng", "https://scontent.fpnh10-1.fna.fbcdn.net/v/t39.30808-6/329835809_735322284655079_3345566267683874665_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGDKM0rLosNjEgzcn51JLUQlsYWsTy7q3aWxhaxPLurdghLgugRx1rSwWpgd9aI4kszaopKRdTL1WmvmsdoRZsr&_nc_ohc=CsbXvLKyGaUAX_JVnp1&_nc_ht=scontent.fpnh10-1.fna&oh=00_AfClNEcbMu8DVEtUWOHSR7mzGVWNuNJCzIJTEzsPkDWnjQ&oe=644C09F3", "male", "Do the right think", "mr.seangleng507@gmail.com", "phnom penh", "https://scontent.fpnh10-1.fna.fbcdn.net/v/t39.30808-6/327869181_1642566236194238_7760086691244597302_n.png?_nc_cat=100&ccb=1-7&_nc_sid=e3f864&_nc_eui2=AeEfOcPWVmjDi7UQaK2jsFpl4idQWAnioMfiJ1BYCeKgxypSLjI0_O3zyVdAX3vSmHEsFlsPRo4Uc25ZH70oErov&_nc_ohc=4Tc_FILNBLYAX-Kd0Ja&_nc_ht=scontent.fpnh10-1.fna&oh=00_AfCe-ESrPowuureCOrGa26hM84nB0kmUTS6Un5fgFn3Tzg&oe=644C3C05"));

    }};
    public List<Authors> getAllAuthor(){
        return authors;
    }

}
