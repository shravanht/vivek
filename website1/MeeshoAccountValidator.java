class MeeshoAccountValidator {

    // Method to validate Meesho account registration details
    public static boolean validateMeeshoAccount(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String address, String userName) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isUserNameValid = false;

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

        // Validate phone number
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid");
        }

        // Validate date of birth (checks if it's in valid format: dd/MM/yyyy)
        if (dob != null && dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
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

        // Validate username (alphanumeric, no special characters)
        if (userName != null && userName.matches("^[a-zA-Z0-9]*$") && userName.length() >= 3) {
            isUserNameValid = true;
        } else {
            System.out.println("Username is invalid");
        }

        // Validate address (simple check for minimum length, can be more complex)
        if (address != null && address.length() >= 10) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        // If all fields are valid, set userValid to true
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid && isUserNameValid && isAddressValid) {
            userValid = true;
        }

        return userValid;
    }

    public static void main(String[] args) {
        // Test case: runner program to validate Meesho account details
        String firstName = "Alice";
        String lastName = "Johnson";
        String phoneNumber = "9876543210";
        String dob = "20/03/1995";  // dd/MM/yyyy
        String email = "alice.johnson@example.com";
        String gender = "Female";
        String userName = "alice123";  // Valid username (alphanumeric)
        String address = "1234 Elm Street, Cityville, XYZ"; // Valid address

        // Validate user
        boolean isValid = validateMeeshoAccount(firstName, lastName, phoneNumber, dob, email, gender, address, userName);

        // Output result
        if (isValid) {
            System.out.println("Meesho account registration is valid.");
        } else {
            System.out.println("Meesho account registration is invalid.");
        }
    }
}