package org.ap.eTutoring.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tblTutorDetail")
public class TutorDetailEntity {

    @Column
    private int tutorID;

    @Column
    private String startAt;

    @Column
    private String endAt;

    @Column
    private int classID;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;


    public int getTutorID() {
        return tutorID;
    }

    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
