package Alpha;

class HighRiskHandler extends FraudCheckHandler {
    @Override
    protected boolean handle(Transaction transaction) {
        return transaction.getAmount() < 10000; 
    }
}