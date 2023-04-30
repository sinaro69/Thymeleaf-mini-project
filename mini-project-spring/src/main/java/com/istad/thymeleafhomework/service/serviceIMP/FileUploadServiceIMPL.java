package com.istad.thymeleafhomework.service.serviceIMP;

import com.istad.thymeleafhomework.service.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

@Service
public class FileUploadServiceIMPL implements FileUploadService {
    Path fileLocationStorage;
    FileUploadServiceIMPL(){
        fileLocationStorage = Paths.get("src/main/resources/images");
    }
    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        if(fileName != null){
            if (fileName.contains("..")){
                System.out.println("File is not respond!");
                return null;
            }
            String[] filepath = fileName.split("\\.");
            fileName = UUID.randomUUID() + "." + filepath[1];

            Path resolvepath = fileLocationStorage.resolve(fileName);
            Files.copy(file.getInputStream(), resolvepath, StandardCopyOption.REPLACE_EXISTING);
            return fileName;
        }else{
            return null;
        }
    }
}
