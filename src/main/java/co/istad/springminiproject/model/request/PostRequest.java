package co.istad.springminiproject.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
    private int id;
    private String name;
    @NotEmpty(message = "Description must be input !!!")
    private String description;
    private int authorID;
    private int[] categoryID;
    private MultipartFile file;
}
