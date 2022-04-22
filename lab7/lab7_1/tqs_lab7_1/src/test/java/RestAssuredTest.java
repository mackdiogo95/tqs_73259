import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class RestAssuredTest {
    @Test
    public void listAllTodosIsAvailable() {
        when().get("https://jsonplaceholder.typicode.com/todos").then().statusCode(200);
    }

    @Test
    public void id4ReturnsCorrectTitle() {
        String expected = "et porro tempora";
        when()
                .get("https://jsonplaceholder.typicode.com/todos/4")
                .then().statusCode(200)
                .and().body("id", equalTo(4))
                .and().body("title", equalTo(expected));
    }

    @Test
    public void todosHaveCorrectIds() {
        when()
                .get("https://jsonplaceholder.typicode.com/todos")
                .then().statusCode(200)
                .and().body("id", hasItems(198, 199));
    }
}