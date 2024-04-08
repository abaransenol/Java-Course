public class Main {
    public static void main(String[] args) {
        //Bu projedeki yapı temel bir repository tasarım deseni yapısıdır.

        Validator validator = new Validator();
        validator.validate(new Product());
        validator.validate(new Customer());
    }
}