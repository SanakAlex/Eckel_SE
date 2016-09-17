package C_6;

import static C_6.Connection.availabilityCheck;

/**
 * Created by Sanak Alex on 01.05.2016.
 */
public class Ex_8_ConnectionManager {


}
class Connection{
    private static int availableConnections = 5;
    Connection(){}
    void connectionConfirmation(){
        availableConnections--;
    }
     static boolean availabilityCheck() {
        return availableConnections > 0;
    }

}
class ConnectionManager{
    static Connection makeConnection(){
        if (availabilityCheck()) {
            Connection con = new Connection();
            con.connectionConfirmation();
            return con;
        } else {
            System.out.println("Connection is blocked");
            return null;
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            System.out.println(makeConnection());
        }
    }
}