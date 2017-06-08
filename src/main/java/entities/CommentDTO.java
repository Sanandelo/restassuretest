package entities;

/**
 * Created by radga on 23.05.2017.
 */
public class CommentDTO {
        public int id;
        public String body;
        public int postId;

    public int getId() {
        return id;
    }

    public CommentDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getBody() {
        return body;
    }

    public CommentDTO setBody(String body) {
        this.body = body;
        return this;
    }

    public int getPostId() {
        return postId;
    }

    public CommentDTO setPostId(int postId) {
        this.postId = postId;
        return this;
    }
}
