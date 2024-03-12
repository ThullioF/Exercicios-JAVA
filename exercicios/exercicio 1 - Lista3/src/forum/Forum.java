package forum;
import java.util.ArrayList;
import java.util.List;
import message.Message;
import person.Person;

public class Forum {
    private int id;
    private String name, url;
    private List<Message> messages;

    public Forum(){
        this.messages = new ArrayList<Message>();
    }
    public Forum(int id, String name, String url) {
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.messages = new ArrayList<Message>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messages=" + messages +
                '}';
    }
}
