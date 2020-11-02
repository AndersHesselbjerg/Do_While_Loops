package com.example.demo.models;

public class Course {
    int kursus_id;
    String kursusNavn;
    String startDato;
    int etcs;
    String kursusBeskrivelse;

    public Course(int kursus_id, String kursusNavn, String startDato, int etcs, String kursusBeskrivelse) {
        this.kursus_id = kursus_id;
        this.kursusNavn = kursusNavn;
        this.startDato = startDato;
        this.etcs = etcs;
        this.kursusBeskrivelse = kursusBeskrivelse;
    }

    public int getKursus_id() {
        return kursus_id;
    }

    public void setKursus_id(int kursus_id) {
        this.kursus_id = kursus_id;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public String getStartDato() {
        return startDato;
    }

    public void setStartDato(String startDato) {
        this.startDato = startDato;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }

    public String getKursusBeskrivelse() {
        return kursusBeskrivelse;
    }

    public void setKursusBeskrivelse(String kursusBeskrivelse) {
        this.kursusBeskrivelse = kursusBeskrivelse;
    }

    public Course(){

    }

    @Override
    public String toString() {
        return "Course{" +
                "kursus_id=" + kursus_id +
                ", kursusNavn='" + kursusNavn + '\'' +
                ", startDato='" + startDato + '\'' +
                ", etcs=" + etcs +
                ", kursusBeskrivelse='" + kursusBeskrivelse + '\'' +
                '}';
    }
}