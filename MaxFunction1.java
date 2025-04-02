class MaxFunction {

    public static boolean validateUseProfile(String firstName, String lastName, String phoneNumber, String Dob, String gmail, String gender) {
        boolean userValid = true;  // Assume valid unless proven otherwise
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGmailValid = false;
        boolean isGenderValid = false;

        // Validate first name
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("First name is invalid");
            userValid = false;
        }

        // Validate last name
        if (lastName != null && lastName.length() >= 3) {
            isLastNameValid = true;
        } else {
            System.out.println("Last name is invalid");
            userValid = false;
        }

        // Validate phone number (exactly 10 digits)
        if (phoneNumber != null && phoneNumber.length() == 10 && phoneNumber.matches("\\d+")) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid");
            userValid = false;
        }

        // Validate date of birth (simple null check)
        if (Dob != null) {
            isDobValid = true;
        } else {
            System.out.println("Date of birth is invalid");
            userValid = false;
        }

        // Validate Gmail (simple null check and contains '@' and '.')
        if (gmail != null && gmail.contains("@") && gmail.contains(".")) {
            isGmailValid = true;
        } else {
            System.out.println("Gmail is invalid");
            userValid = false;
        }

        // Validate gender (simple null check and gender value check)
        if (gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid");
            userValid = false;
        }

        // Return whether the user profile is valid or not
        return userValid;
    }

    public static void main(String[] args) {
        
        boolean isValid = validateUseProfile("John", "Doe", "1234567890", "01/01/2000", "john.doe@example.com", "Male");
        System.out.println("User profile valid: " + isValid);
    }
}
