package com.zipcodewilmington.bakery.Models;

import javax.persistence.*;

@Entity
public class Muffin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "muffin_id")
    private Long id;

    @Column(name = "flavor")
    private String flavor;

    public Muffin(String flavor) {
        this.flavor = flavor;
    }

    public Muffin() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
