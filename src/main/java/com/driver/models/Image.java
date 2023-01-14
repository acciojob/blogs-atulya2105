package com.driver.models;

import com.driver.Enums.ImageType;

import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private ImageType imageType;
    private String dimension;
    private String description;

    private String screenDimensions;

    @ManyToOne
    @JoinColumn()
    private User user;
    @ManyToOne
    @JoinColumn()
    private Blog blog;

    public Image() {

    }

    public Image(int id, String name, ImageType imageType, String dimension, String description, String screenDimensions, User user, Blog blog) {
        this.id = id;
        this.name = name;
        this.imageType = imageType;
        this.dimension = dimension;
        this.description = description;
        this.screenDimensions = screenDimensions;
        this.user = user;
        this.blog = blog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageType getImageType() {
        return imageType;
    }

    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}

