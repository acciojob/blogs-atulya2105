package com.driver.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String content;

    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdOn;

    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedOn;

    @ManyToOne
    @JoinColumn()
    private User user;

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    List<Image> imageList;

    public Blog(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public Blog(){

    }

    public Blog(int id, String title, String content, Date createdOn, Date updatedOn, User user, List<Image> imageList) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.user = user;
        this.imageList = imageList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
