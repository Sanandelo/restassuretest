package httpTest;

import entities.PostDTO;
import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

/**
 * Created by radga on 23.05.2017.
 */
public class PostTest extends BaseTest {
    PostDTO postDTO;
    @Before
    public void before() {
        postDTO = new PostDTO().setBody("this is a very important sentence").setTitle("Article").setUserId(12);
    }

    @Test
    public void testPostPutResponse(){
     given()
           .spec(spec)
           .body(postDTO)
           .when()
           .post("posts")
           .then().statusCode(201);
    }

    @Test
    public void testBody() {
        given()
                .spec(spec)
                .body(postDTO)
                .when()
                .post("posts")
                .then().body(containsString("this is a very important sentence"));
    }
}
