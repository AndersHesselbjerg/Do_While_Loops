package com.example.demo.Models;

public class CatFact { implements Comparable<CatFact> {




}
}









@Override
public String toString(){
    return "CatJoke{"
            + "text='"
            + text
            + '\''
            + ", createdAt="
            + createdAt
            +",updateAt="
            +updatedAt
            +''
}



@Override
public int compareTo(CatFact catFact){
    int dayDiff = this.createdAt.compareTo(catFact.getCreatedAt());
    return dayDiff

}