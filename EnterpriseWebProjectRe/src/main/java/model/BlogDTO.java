package model;

public class BlogDTO extends AbstractModel{

    private String title;
    private String body;
    private int userID;
    private int isPublic;

    public BlogDTO(int id, String title, String body, int userID, int isPublic, String createdAt, String updatedAt) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userID = userID;
        this.isPublic = isPublic;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BlogDTO(String title, String body, int userID, int isPublic, String createdAt, String updatedAt) {
        this.title = title;
        this.body = body;
        this.userID = userID;
        this.isPublic = isPublic;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(int isPublic) {
        this.isPublic = isPublic;
    }

}
