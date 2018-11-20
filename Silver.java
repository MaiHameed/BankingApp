public class Silver extends Tier {
    public int fee = 20;

    @Override
    public void changeTier(Customer c){
        double balance = c.getBalance();
        if( balance < 10000){
            c.setTier(new Silver());
        }else if(balance < 20000){
            c.setTier(new Gold());
        }else{
            c.setTier(new Platinum());
        }
    }

    public int getFee(){
        return fee;
    }

}
