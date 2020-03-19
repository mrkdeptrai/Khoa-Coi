package model.response;

import entity.*;
import model.*;

public class convertFromEntity {
    public BlogDTO convertFromBlogEntity(BlogEntity blogEntity){
        int id = blogEntity.getId();
        String title = blogEntity.getTitle();
        String body = blogEntity.getBody();
        int userID = blogEntity.getUserID();
        int isPublic = blogEntity.getIsPublic();
        String createdAt = blogEntity.getCreatedAt();
        String updatedAt = blogEntity.getUpdatedAt();
        BlogDTO blog = new BlogDTO(id,title,body,userID,isPublic,createdAt,updatedAt);
        return blog;
    }

    public ClassDTO convertFromClassEntity(ClassEntity classEntity){
        int id = classEntity.getId();
        String title = classEntity.getTitle();
        String description = classEntity.getDescription();
        String createdAt = classEntity.getCreatedAt();
        String updatedAt = classEntity.getUpdatedAt();
        ClassDTO classs = new ClassDTO(id,title,description,createdAt,updatedAt);
        return classs;
    }

    public ClassMemberDTO convertFromClassMemberEntity(ClassMemberEntity classMemberEntity){
        int id = classMemberEntity.getId();
        int studentID = classMemberEntity.getStudentID();
        int classID = classMemberEntity.getClassID();
        String createdAt = classMemberEntity.getCreatedAt();
        String updatedAt = classMemberEntity.getUpdatedAt();
        ClassMemberDTO classmember = new ClassMemberDTO(id,studentID,classID,createdAt,updatedAt);
        return classmember;
    }

    public CommentDTO convertFromCommentEntity(CommentEntity commentEntity){
        int id = commentEntity.getId();
        String title = commentEntity.getTitle();
        int userID = commentEntity.getUserID();
        String createdAt = commentEntity.getCreatedAt();
        String updatedAt = commentEntity.getUpdatedAt();
        CommentDTO comment = new CommentDTO(id,title,userID,createdAt,updatedAt);
        return comment;
    }

    public PermissionDTO convertFromPermissionEntity(PermissionEntity permissionEntity){
        int id = permissionEntity.getId();
        String title = permissionEntity.getTitle();
        String createdAt = permissionEntity.getCreatedAt();
        String updatedAt = permissionEntity.getUpdatedAt();
        PermissionDTO permission = new PermissionDTO(id,title,createdAt,updatedAt);
        return permission;
    }

    public TutorDetailDTO convertFromTutorDetailEntity(TutorDetailEntity tutorDetailEntity){
        int id = tutorDetailEntity.getId();
        int tutorID = tutorDetailEntity.getTutorID();
        String startAt = tutorDetailEntity.getStartAt();
        String endAt = tutorDetailEntity.getEndAt();
        int classID = tutorDetailEntity.getClassID();
        String createdAt = tutorDetailEntity.getCreatedAt();
        String updatedAt = tutorDetailEntity.getUpdatedAt();
        TutorDetailDTO tutorDetail = new TutorDetailDTO(id,tutorID,startAt,endAt,classID,createdAt,updatedAt);
        return tutorDetail;
    }

    public UserDTO convertFromUserEntity(UserEntity userEntity){
        int id = userEntity.getId();
        String email = userEntity.getEmail();
        String password = userEntity.getPassword();
        String name = userEntity.getName();
        String dob = userEntity.getDob();
        String gender = userEntity.getGender();
        int phone = userEntity.getPhone();
        String address = userEntity.getAddress();
        String avatar = userEntity.getAvatar();
        String createdAt = userEntity.getCreatedAt();
        String updatedAt = userEntity.getUpdatedAt();
        UserDTO user = new UserDTO(id,email,password,name,dob,gender,phone,address,avatar,createdAt,updatedAt);
        return user;
    }

    public UserPermissionDTO convertFromUserPermissionEntity(UserPermissionEntity userPermissionEntity){
        int id = userPermissionEntity.getId();
        int userID = userPermissionEntity.getUserID();
        int permissionID = userPermissionEntity.getPermissionID();
        int status = userPermissionEntity.getStatus();
        String createdAt = userPermissionEntity.getCreatedAt();
        String updatedAt = userPermissionEntity.getUpdatedAt();
        UserPermissionDTO userpermission = new UserPermissionDTO(id,userID,permissionID,status,createdAt,updatedAt);
        return userpermission;
    }


}
