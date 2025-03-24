import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VoterIdValidator {

    // Method to validate Voter ID registration details
    public static boolean validateVoterIdDetails(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String address, String voterIdNumber, String voterIdType) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isVoterIdNumberValid = false;
        boolean isVoterIdTypeValid = false;
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

        // Validate email
        if (email != null && email.contains("@") && email.contains(".")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        // Validate gender
        if (gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other"))) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid");
        }

        // Validate address (simple check for minimum length, can be more complex)
        if (address != null && address.length() >= 10) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        // Validate voter ID number (should follow a specific pattern, for example "VOTER-XXXX")
        if (voterIdNumber != null && voterIdNumber.matches("VOTER-\\d{4}