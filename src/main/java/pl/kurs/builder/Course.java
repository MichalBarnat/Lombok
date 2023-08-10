package pl.kurs.builder;

import lombok.*;

import java.io.FileReader;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

@Builder
public class Course {
    private String name;
    private String location;

    @Singular("studentList")
    private List<Student> studentList;

    @SneakyThrows
    public void fileRead() {
        FileReader fileReader = new FileReader("");
    }
}
