package Alpha;

class Transaction {
    private String customer;
    private String location;
    private String merchant;
    private double amount;

    public Transaction(String customer, String location, String merchant, double amount) {
        this.customer = customer;
        this.location = location;
        this.merchant = merchant;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public String getLocation() {
        return location;
    }

    public String getMerchant() {
        return merchant;
    }

    public double getAmount() {
        return amount;
    }
}