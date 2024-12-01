package Alpha;

class BasicCheckHandler extends FraudCheckHandler {
    @Override
    protected boolean handle(Transaction transaction) {
        return transaction.getAmount() > 0; 
    }
}
