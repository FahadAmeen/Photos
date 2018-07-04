package com.example.fahdamin.photo.Model;

public class CategoryItem {
    String name,imageLink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public CategoryItem(String name, String imageLink) {

        this.name = name;
        this.imageLink = imageLink;
    }

    public CategoryItem() {

    }
}
