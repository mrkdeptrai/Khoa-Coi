package model;

public class TutorDetailDTO extends AbstractModel{

    private int tutorID;
    private String startAt;
    private String endAt;
    private int classID;

    public TutorDetailDTO(int id, int tutorID, String startAt, String endAt, int classID, String createdAt, String updatedAt) {
        this.id = id;
        this.tutorID = tutorID;
        this.startAt = startAt;
        this.endAt = endAt;
        this.classID = classID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public TutorDetailDTO(int tutorID, String startAt, String endAt, int classID, String createdAt, String updatedAt) {
        this.tutorID = tutorID;
        this.startAt = startAt;
        this.endAt = endAt;
        this.classID = classID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

}
