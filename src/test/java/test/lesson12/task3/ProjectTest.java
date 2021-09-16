package test.lesson12.task3;

import Lesson12.task3.project.Permission;
import Lesson12.task3.project.Project;
import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ProjectTest {
    private final String PATH = "src\\main\\java\\Lesson12\\task3\\project\\project.json";

    @Test
    @DisplayName("Проверка корректности десериализации класса project")
    void testPersonDeserialization() throws IOException {
        List<String> content = Files.readAllLines(Paths.get(PATH));
        String projectToString = String.join("", content);
        Project project = new Gson().fromJson(projectToString, Project.class);

        Project expectedProject = new Project()
                .setId(154)
                .setStartDate("2020-07-14")
                .setEndDate("2020-10-01")
                .setName("automation_current")
                .setChildIds(Arrays.asList(157, 192, 198))
                .setPermissions(Arrays.asList(
                        new Permission().setId(17).setName("Обновление данных"),
                        new Permission().setId(18).setName("Создание данных"),
                        new Permission().setId(19).setName("Удаление данных")
                ))
                .setParentProject(new Project()
                        .setId(19)
                        .setStartDate("2020-05-14")
                        .setEndDate("2021-10-01")
                        .setName("automation")
                        .setChildIds(Arrays.asList(154, 157, 192, 198))
                        .setPermissions(Arrays.asList(
                                new Permission().setId(17).setName("Обновление данных"),
                                new Permission().setId(18).setName("Создание данных"),
                                new Permission().setId(19).setName("Удаление данных")
                        ))
                        .setParentProject(null)
                );

        Assertions.assertEquals(expectedProject, project);
    }
}