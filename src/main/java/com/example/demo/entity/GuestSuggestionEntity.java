package com.example.demo.entity;


 import jakarta.persistence.*;

@Entity

public class GuestSuggestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private double rate;
    private String suggestionText;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }


    @Override
    public String toString() {
        return "GuestSuggestionEntity{" +
                "id=" + id +
                ", rate=" + rate +
                ", suggestionText='" + suggestionText + '\'' +
                '}';
    }
}
