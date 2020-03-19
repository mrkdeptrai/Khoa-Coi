package model;

public class CommentDTO extends AbstractModel{

    private String title;
    private int userID;

    public CommentDTO(int id, String title, int userID, String createdAt, String updatedAt) {
        this.id = id;
        this.title = title;
        this.userID = userID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CommentDTO(String title, int userID, String createdAt, String updatedAt) {
        this.title = title;
        this.userID = userID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

}
