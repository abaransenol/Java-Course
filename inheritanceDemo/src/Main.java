public class Main {
    public static void main(String[] args) {
        FarmerCreditManager farmerCreditManager = new FarmerCreditManager();
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();

        CreditUI creditUI = new CreditUI();
        creditUI.calculate(teacherCreditManager);
        creditUI.calculate(farmerCreditManager);
    }
}