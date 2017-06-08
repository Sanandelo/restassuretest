package httpTest;

import entities.PostDTO;
import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

/**
 * Created by radga on 24.05.2017.
 */
public class PutTest extends BaseTest {
    PostDTO blogPost;
    @Before
    public void before(){
        blogPost = new PostDTO().setBody("test body").setTitle("Test title");
    }

    @Test
    public void testStatusCode(){
        given().spec(spec)
                .body(blogPost)
                .when()
                .put("posts/1")
                .then().statusCode(200);
    }

    @Test
    public void testBodyContent(){
        given().spec(spec)
                .body(blogPost)
                .when()
                .put("posts/1")
                .then().body(containsString("test body"));
    }

}
