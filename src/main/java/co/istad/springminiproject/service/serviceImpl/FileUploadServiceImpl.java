package co.istad.springminiproject.service.serviceImpl;

import co.istad.springminiproject.service.FileUploadService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

public class FileUploadServiceImpl implements FileUploadService {
    Path fileLocationStorage;
    FileUploadServiceImpl(){
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
