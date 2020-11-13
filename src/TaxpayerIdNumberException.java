public class TaxpayerIdNumberException extends  RuntimeException{
    public TaxpayerIdNumberException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}