public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1.getData());  // Imprime: Data inicial

        Database db2 = Database.getInstance();
        db2.setData("Nova data");
        System.out.println(db1.getData());  // Imprime: Nova data
    }
}