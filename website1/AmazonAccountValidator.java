import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmazonAccountValidator {

    // Method to validate Amazon account registration details
    public static boolean validateAmazonAccountDetails(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String address, String userName, String paymentMethod) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isUserNameValid = false;
        boolean isPaymentMethodValid = false;
        boolean isAgeValid = false;

        // Validate first name
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("First Name is invalid");
        }

        // Validate last name
        if (lastName != null && lastName.length() >= 3) {
            isLastNameValid = true;
        } else {
            System.out.println("Last Name is invalid");
        }

        // Validate phone number (should be 10 digits)
        if (phoneNumber != null && phoneNumber.length() == 10 && phoneNumber.matches("\\d+")) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid");
        }

        // Validate date of birth (must be at least 18 years old)
        if (dob != null && dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            int age = calculateAge(dob);
            if (age >= 18) {
                isAgeValid = true;
            } else {
                System.out.println("You must be at least 18 years old to register");
            }
            isDobValid = true;
        } else {
            System.out.println("Date of Birth is invalid");
        }

        // Validate email (basic check for "@" and ".")
        if (email != null && email.contains("@") && email.contains(".")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        // Validate gender (optional but expected)
        if (gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other"))) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid");
        }

        // Validate address (minimum length check, can be more detailed)
        if (address != null && address.length() >= 10) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        // Validate username (alphanumeric and at least 3 characters)
        if (userName != null && userName.matches("^[a-zA-Z0-9]*$") && userName.length() >= 3) {
            isUserNameValid = true;
        } else {
            System.out.println("Username is invalid");
        }

        // Validate payment method (simple check for a basic credit card pattern)
        if (paymentMethod != null && paymentMethod.matches("\\d{16}")) {  // Example: basic validation for a 16-digit card number
            isPaymentMethodValid = true;
        } else {
            System.out.println("Payment method is invalid");
        }

        // If all fields are valid, set userValid to true
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid && isAddressValid && isUserNameValid && isPaymentMethodValid && isAgeValid) {
            userValid = true;
        }

        return userValid;
    }

 }