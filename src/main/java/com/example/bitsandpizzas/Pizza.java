package com.example.bitsandpizzas;

public class Pizza {
    private String name;
    private String ham;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo","ham1", R.drawable.diavolo),
            new Pizza("Funghi","ham2", R.drawable.funghi)
    };
    private Pizza(String name, String ham, int imageResourceId) {
        this.name = name;
        this.ham = ham;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getHam() {
        return ham;
    }
}
