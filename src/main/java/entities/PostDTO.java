package entities;

/**
 * Created by radga on 22.05.2017.
 */
public class PostDTO {
    public int userId;
    public int id;
    public String title;
    public String body;

    public int getUserId() {
        return userId;
    }

    public PostDTO setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public PostDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public PostDTO setBody(String body) {
        this.body = body;
        return this;
    }
}
