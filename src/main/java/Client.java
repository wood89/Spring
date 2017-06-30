
public class Client{

    Client(){

    }

    Client(String number, String nameClient){
        id = number;
        name = nameClient;
    }
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
