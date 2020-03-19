package org.ap.eTutoring.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tblUserPermission")
public class UserPermissionEntity {

    @Column(name = "userID")
    private int userID;

    @Column(name = "permissionID")
    private int permissionID;

    @Column(name = "status")
    private int status;

    @Column(name = "createdAt")
    private String createdAt;

    @Column(name = "updateAt")
    private String updateAt;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(int permissionID) {
        this.permissionID = permissionID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
