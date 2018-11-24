public abstract class Tier {
    protected int fee;
    public abstract void changeTier(Customer c);
    public abstract int getFee();
}
