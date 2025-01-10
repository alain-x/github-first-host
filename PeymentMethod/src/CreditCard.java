public class CreaditCard implements Payment{
    @Override
    public double initiatePayment(double amount) {
        return 0;
    }

    @Override
    public void acceptPayment() {

    }

    @Override
    public double refundPayment(double amount) {
        return 0;
    }

    @Override
    public double paymentComplete() {
        return 0;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public boolean cancelPayment() {
        return false;
    }
}
