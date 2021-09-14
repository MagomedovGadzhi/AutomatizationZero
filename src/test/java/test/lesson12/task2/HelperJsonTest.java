package test.lesson12.task2;

import Lesson12.task2.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HelperJsonTest {
    private final String PATH = "src\\main\\java\\Lesson12\\task2\\data.xlsx";

    @Test
    @DisplayName("JSON: Проверка листа users")
    void jsonTestUsersSheet() throws IOException {
        String actualResult = Helper.getJsonArrayFromXls(PATH, "users");
        String expectedResult = "[{\"action\":\"api\",\"created_on\":\"2020-09-26 23:07:34\",\"id\":\"10\",\"updated_on\":\"2020-09-26 23:07:34\",\"user_id\":\"6\",\"value\":\"6218bbecc4dec9fce01dd1b7f26cef55e9c4dfb4\"},{\"action\":\"feeds\",\"created_on\":\"2020-09-26 23:08:23\",\"id\":\"12\",\"updated_on\":\"2020-09-26 23:08:23\",\"user_id\":\"6\",\"value\":\"b6cfe70e7a4ee8e8cef07c9df60b6228639bb553\"},{\"action\":\"session\",\"created_on\":\"2020-09-26 22:48:56\",\"id\":\"2\",\"updated_on\":\"2020-09-26 22:49:29\",\"user_id\":\"1\",\"value\":\"751e032dcc4b5b219efb7f72b608b9063a595509\"},{\"action\":\"session\",\"created_on\":\"2020-09-26 22:50:30\",\"id\":\"4\",\"updated_on\":\"2020-09-26 22:50:30\",\"user_id\":\"1\",\"value\":\"1a0e210e0a8e1f63a96ea2d4326a48346a6dff74\"}]";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("JSON: Проверка листа projects")
    void jsonTestProjectSheet() throws IOException {
        String actualResult = Helper.getJsonArrayFromXls(PATH, "projects");
        String expectedResult = "[{\"description\":\"дескрипшен\",\"homepage\":\"нет\",\"id\":\"1\",\"is_public\":\"true\",\"name\":\"Тестовый проект\"},{\"description\":\"дескрипшен 2\",\"homepage\":\"нет\",\"id\":\"2\",\"is_public\":\"false\",\"name\":\"Тестовый проект 2\"},{\"description\":\"public\",\"homepage\":\"нет\",\"id\":\"4\",\"is_public\":\"true\",\"name\":\"Тестовый проект public\"},{\"description\":\"private\",\"homepage\":\"нет\",\"id\":\"5\",\"is_public\":\"false\",\"name\":\"Тестовый проект private\"}]";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("JSON: Проверка листа roles")
    void jsonTestRolesSheet() throws IOException {
        String actualResult = Helper.getJsonArrayFromXls(PATH, "roles");
        String expectedResult = "[{\"builtin\":\"1\",\"id\":\"1\",\"is_assignable\":\"true\",\"name\":\"Non member\",\"position\":\"0\"},{\"builtin\":\"2\",\"id\":\"2\",\"is_assignable\":\"true\",\"name\":\"Anonymous\",\"position\":\"0\"},{\"builtin\":\"0\",\"id\":\"3\",\"is_assignable\":\"true\",\"name\":\"new_role\",\"position\":\"1\"}]";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}