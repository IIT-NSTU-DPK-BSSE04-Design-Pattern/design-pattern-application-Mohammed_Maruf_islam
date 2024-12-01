package Alpha;
class GeoAnamolyHandler extends FraudCheckHandler {
    @Override
    protected boolean handle(Transaction transaction) {
        return !transaction.getLocation().equalsIgnoreCase("Chattogram"); 
    }
}
