public class BankAccountRunner {
    public static void main(String[] args) {
        // Simulating Invalid Bank Account Creation
        String result = BankAccount.createAccount(
            "John", "john", "123", "john.doe@com", "98765", "St", "15-08-1990", "Male", "", "50"
        );
        System.out.println(result);
    }
}
