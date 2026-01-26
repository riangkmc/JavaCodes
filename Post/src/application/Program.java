package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

    public static void main(String[] args) {
        //teste

        Post post1 = new Post(LocalDateTime.now(),"Traveling to new Zealand","I´m going to visit a new country!");
        Comment comment01 = new Comment("Have a nice trip!");
        Comment comment02 = new Comment("WOW, thats awesome!");

        post1.liked();
        post1.addComment(comment01);
        post1.liked();
        post1.liked();
        post1.addComment(comment02);
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();
        post1.liked();

        System.out.println(post1);


        //POST 2
        System.out.println("----------------");


        Post post2 = new Post(LocalDateTime.now());
        Comment comment03 = new Comment("Good nigth!");

        post2.liked();
        post2.addComment(comment03);
        post2.liked();
        post2.liked();
        post2.liked();
        post2.liked();

        System.out.println(post2);



    }

}
