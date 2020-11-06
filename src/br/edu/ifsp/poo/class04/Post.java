package br.edu.ifsp.poo.class04;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate postDate;
    private int claps;
    private int boos;

    private UserAccount user;

    public Post(String quote, UserAccount user) {
        this.quote = quote;
        this.user = user;
        this.postDate = LocalDate.now();
    }

    public String show(){
        return  "[" + postDate + "] " + user.getUsername() + " says \""+ quote + "\" | Claps: " + claps + " | Boos: " + boos;
    }

    public void clap(){
        claps++;
    }

    public void boo(){
        boos++;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

    public UserAccount getUser() {
        return user;
    }
}
