public class Database {
    private static Database instance;
    private String data;

    private Database() {
        data = "Data inicial";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
