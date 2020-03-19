package org.ap.eTutoring.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tblClassMember")
public class ClassMemberEntity {

    @Column
    private int studentID;

    @Column
    private int classID;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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
