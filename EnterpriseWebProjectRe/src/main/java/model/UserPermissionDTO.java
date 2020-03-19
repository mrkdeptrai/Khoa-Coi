package model;

public class UserPermissionDTO extends AbstractModel{

    private int userID;
    private int permissionID;
    private int status;

    public UserPermissionDTO(int id, int userID, int permissionID, int status, String createdAt, String updatedAt) {
        this.id = id;
        this.userID = userID;
        this.permissionID = permissionID;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserPermissionDTO(int userID, int permissionID, int status, String createdAt, String updatedAt) {
        this.userID = userID;
        this.permissionID = permissionID;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

}
