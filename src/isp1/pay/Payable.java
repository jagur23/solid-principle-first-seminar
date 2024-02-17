package isp1.pay;

public interface Payable {
    public void payWebMoney(int amount);
    public void payCreditCard(int amount);
}
