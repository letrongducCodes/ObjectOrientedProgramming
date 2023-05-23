package hus.oop.lab10.SingletonPattern.Pseudocode;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }
    public Database query(String sql) {
        return Database.instance;
    }
}
