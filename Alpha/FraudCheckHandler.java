package Alpha;

abstract class FraudCheckHandler {
    protected FraudCheckHandler nextHandler;
    public void setNextHandler(FraudCheckHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void process(Transaction transaction) {
        if (handle(transaction)) {
            System.out.println(this.getClass().getSimpleName() + " approved it.");
        } else if (nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + " escalated it.");
            nextHandler.process(transaction);
        } else {
            System.out.println("Transaction is rejected.");
        }
    }
    protected abstract boolean handle(Transaction transaction);
}
