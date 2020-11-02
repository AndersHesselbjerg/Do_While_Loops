package com.mewie.mewie.Beans;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int movie_id;
    private String title;
    private int productionYear;
    private com.mewie.mewie.Beans.Genre genre;
    private List<com.mewie.mewie.Beans.Actor> actors;


    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", productionYear=" + productionYear +
                ", genre=" + genre +
                ", actors=" + actors +
                '}';
    }

    public Movie() {
        genre = new com.mewie.mewie.Beans.Genre();
        actors = new ArrayList<>();
    }

    public Movie(int id, String title, int productionYear, com.mewie.mewie.Beans.Genre genre, ArrayList<com.mewie.mewie.Beans.Actor> actors) {
        this.movie_id = id;
        this.title = title;
        this.productionYear = productionYear;
        this.genre = genre;
        this.actors = actors;
    }

    public List<com.mewie.mewie.Beans.Actor> getActors() {
        return actors;
    }
    /*
        public void setActors(List<Actor> actors) {
            this.actors = actors;
        }
    */
    public void setActors(List<String> actors) {
        List<com.mewie.mewie.Beans.Actor> generatedActors = new ArrayList<>();

        for(String s : actors){
            int value = Integer.valueOf(s);
            generatedActors.add(new com.mewie.mewie.Beans.Actor(value));
        }
        this.actors = generatedActors;


    }

    public void setActors(int[] actorsIds) {
        for (int i = 0; actorsIds.length > i; i++){
            actors.add(new com.mewie.mewie.Beans.Actor(actorsIds[i]));
        }
        this.actors = actors;
    }
    public void setActors(String[] actorsIds) {
        for (int i = 0; actorsIds.length > i; i++){
            actors.add(new com.mewie.mewie.Beans.Actor(Integer.parseInt(actorsIds[i])));
        }
        this.actors = actors;
    }


    public void setActors(int id){
        actors.add(new com.mewie.mewie.Beans.Actor(id,"",0,null));
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public com.mewie.mewie.Beans.Genre getGenre() {
        return genre;
    }

    public void setGenre(com.mewie.mewie.Beans.Genre genre) {
        this.genre = genre;
    }
}
