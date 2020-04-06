package com.webproject.enterprise.services.FileUpload;


import com.webproject.enterprise.entity.FileUploadEntity;

import java.util.List;

public interface IFileUpload {

    List<FileUploadEntity> findAllFileUpload();

    FileUploadEntity findById(int id);

    List<FileUploadEntity> findByFileName(String fileName);

    FileUploadEntity insertFile(FileUploadEntity fileUploadEntity);

    FileUploadEntity updateFile(String fileName, int id);

}
