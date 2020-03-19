package model;



public class ClassMemberDTO extends AbstractModel{

    private int studentID;
    private int classID;

    public ClassMemberDTO(int id,int studentID, int classID, String createdAt, String updatedAt) {
        this.id = id;
        this.studentID = studentID;
        this.classID = classID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ClassMemberDTO(int studentID, int classID, String createdAt, String updatedAt) {
        this.studentID = studentID;
        this.classID = classID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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
}
