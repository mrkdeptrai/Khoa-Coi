package org.ap.eTutoring.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tblComment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private int userID;

    @Column
    private String createdAt;

    @Column
    private String updateAt;


    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
