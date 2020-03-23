package repository;

import entity.ClassEntity;
import model.ClassDTO;
import org.springframework.data.jpa.repository.Query;

public interface ClassRepository {
    @Query(value = "SELECT * FROM tblClass WHERE id = ?1", nativeQuery = true)
    ClassEntity findById(int id);

    @Query(value = "SELECT * FROM tblClass WHERE title LIKE  %?1", nativeQuery = true)
    ClassEntity findByTitle(String title);

    @Query (value = "INSERT INTO tblClass (title,description,createdAt,updatedAt) values = ?1, ?2, ?3, ?4", nativeQuery = true)
    ClassDTO insertClass(ClassDTO classDTO);

    @Query (value = "UPDATE tblClass SET title = ?1, description = ?2, updatedAt = ?3 WHERE id = ?4", nativeQuery = true)
    ClassDTO updateClass(String title,String description,String updatedAt, int id);
}
