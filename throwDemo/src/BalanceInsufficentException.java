public class BalanceInsufficentException extends Exception{
    private String message;

    public BalanceInsufficentException(String message){
        this.message = message;

    }

    @Override
    public String getMessage() {

        //super keyword'ü ile exception içerisindeki önceden tanımlanmış metotu burada yazmış gibi davranabiliriz.
        //return super.getMessage();

        return this.message;
    }
}
