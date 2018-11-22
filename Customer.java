import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Customer {
    private Tier myTier;
    private double balance;
    private String password;
    private String username;
    private File file;

    public Customer(File file, String name){
        this.file = file;
        BufferedReader reader;
        String tier;
        username = name;
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

    public void setBalance(double value){
        balance = value;
    }

    public void setTier(Tier t) {
        myTier = t;
    }

    public String getUsername() {
        return username;
    }

    public void updateFile(){
        try {
            myTier.changeTier(this); //Updates tier based on current balance
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println(password); //First line will be password
            writer.println(balance); //Second line initial balance
            writer.println(myTier.toString()); //Third line initial tier
            writer.close();
        }catch(Exception e){
            System.out.println("Error updating file");
        }
    }
}
