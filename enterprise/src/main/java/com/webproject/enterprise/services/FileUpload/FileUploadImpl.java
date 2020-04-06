package com.webproject.enterprise.services.FileUpload;

import com.webproject.enterprise.entity.FileUploadEntity;
import com.webproject.enterprise.repository.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileUploadImpl implements IFileUpload {

    @Autowired
    private FileUploadRepository fileUploadRepository;


    @Override
    public List<FileUploadEntity> findAllFileUpload() {
        List<FileUploadEntity> findAllFileUpload = fileUploadRepository.findAll();
        return findAllFileUpload;
    }

    @Override
    public FileUploadEntity findById(int id) {
        FileUploadEntity findById = fileUploadRepository.findById(id);
        return findById;
    }

    @Override
    public List<FileUploadEntity> findByFileName(String fileName) {
        List<FileUploadEntity> findByFileName = fileUploadRepository.findByFileName(fileName);
        return findByFileName;
    }

    @Override
    public FileUploadEntity insertFile(FileUploadEntity fileUploadEntity) {
        return fileUploadRepository.insertFile(fileUploadEntity);
    }

    @Override
    public FileUploadEntity updateFile(String fileName, int id) {
        return fileUploadRepository.updateFile(fileName,id);
    }
}
