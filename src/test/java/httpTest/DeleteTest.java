package httpTest;

import org.junit.Test;
import utils.BaseTest;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

/**
 * Created by radga on 24.05.2017.
 */
public class DeleteTest extends BaseTest {
    @Test
    public void testCodeStatus() {
        given()
                .spec(spec)
                .when()
                .delete("posts/1")
                .then().statusCode(200);
    }

    @Test
    public void testBodyContent() {
        given()
                .spec(spec)
                .when()
                .delete("posts/1")
                .then().body(containsString(""));
    }
}
