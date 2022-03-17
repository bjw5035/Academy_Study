package homeStudy.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        saleRatio = 0.1;
        bonusRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }
}
