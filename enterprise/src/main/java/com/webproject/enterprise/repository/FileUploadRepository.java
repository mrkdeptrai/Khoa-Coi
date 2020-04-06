package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.FileUploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileUploadRepository extends JpaRepository<FileUploadEntity, Integer> {

    @Query(value = "SELECT * FROM fileupload WHERE id = ?1", nativeQuery = true)
    FileUploadEntity findById(int id);

    @Query(value = "SELECT * FROM fileupload WHERE fileName LIKE %?1%", nativeQuery = true)
    List<FileUploadEntity> findByFileName(String fileName);

    @Query (value = "INSERT INTO fileupload (commentId,fileName) values = ?1, ?2", nativeQuery = true)
    FileUploadEntity insertFile(FileUploadEntity fileUploadEntity);

    @Query (value = "UPDATE fileupload SET fileName = ?1 WHERE id = ?2", nativeQuery = true)
    FileUploadEntity updateFile(String fileName, int id);
}
