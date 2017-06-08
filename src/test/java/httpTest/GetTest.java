package httpTest;

import entities.PostDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by radga on 22.05.2017.
 */
public class GetTest extends BaseTest {
    PostDTO blogPost;
    @Before
    public void beforeMethod(){
         blogPost = given().spec(spec).when().get("posts/1").then().statusCode(200).extract().as(PostDTO.class);

    }
    @Test
    public void testResponse(){
        given().spec(spec).when().get("posts").then().statusCode(200);
    }

    @Test
    public void testAuthor(){
        assertThat("Author not match", blogPost.getBody(),containsString("quia et suscipit"));
    }

    @Test
    public void testTitle(){
        Assert.assertEquals("Title not match", blogPost.getTitle(),"sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
    }

    @Test
    public void testId(){
            Assert.assertEquals("Id not mathc",blogPost.getId(), 1);
    }



}
