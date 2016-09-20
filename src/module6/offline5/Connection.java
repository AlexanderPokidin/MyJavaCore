package module6.offline5;

public class Connection {
    private static Connection INSTANCE;

    /*static {
        INSTANCE = new Connection();
    }*/

    private Connection() {

    }

    public static Connection getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }
}
