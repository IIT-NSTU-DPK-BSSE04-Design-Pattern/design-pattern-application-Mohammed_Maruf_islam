package Alpha;

class BlackListHandler extends FraudCheckHandler {
    @Override
    protected boolean handle(Transaction transaction) {
        return !transaction.getMerchant().equalsIgnoreCase("blacklisted-merchant"); // Example
    }
}
