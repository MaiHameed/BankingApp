import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Customer {
    private Tier myTier;
    private double balance;
    private String password;

    public Customer(File file){
        /* TODO
        read balance + tier from file
         */
        BufferedReader reader;
        String tier;
        try {
            reader = new BufferedReader( new FileReader(file));
            password = reader.readLine();
            balance = Double.parseDouble(reader.readLine());
            tier = reader.readLine();
            switch(tier.toLowerCase()){
                case "silver":
                    myTier = new Silver();
                    break;
                case "gold":
                    myTier = new Gold();
                    break;
                case "platinum":
                    myTier = new Platinum();
                    break;
                default:
                    System.out.println("Customer has invalid tier");
                    break;
            }
        } catch (Exception e) {
            System.err.println("Customer file read error");
        }

    }

    public double getBalance(){
        return balance;
    }

    public void setTier(Tier t) {
        myTier = t;
    }
}
