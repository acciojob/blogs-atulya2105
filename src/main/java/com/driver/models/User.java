package com.driver.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;
    private String email;
    private String mobileNo;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Image> imageList;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Blog> blogList;

    public User(int id, String userName, String email, String mobileNo, List<Image> imageList, List<Blog> blogList) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.imageList = imageList;
        this.blogList = blogList;
    }

    public User() {
    }

    public User(String userName, String email, String mobileNo) {
        this.userName = userName;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
