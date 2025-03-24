class DrivingLicenseValidator {

    
    public static boolean validateDrivingLicenseApplication(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String licenseNumber, String address) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isLicenseNumberValid = false;
        boolean isAddressValid = false;

       
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("First Name is invalid");
        }

       
        if (lastName != null && lastName.length() >= 3) {
            isLastNameValid = true;
        } else {
            System.out.println("Last Name is invalid");
        }

        
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid");
        }

        
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

        // Validate license number (format: DL1234567890 where DL is alphanumeric)
        if (licenseNumber != null && licenseNumber.matches("[A-Za-z]{2}\\d{10}")) {
            isLicenseNumberValid = true;
        } else {
            System.out.println("License Number is invalid");
        }

        // Validate address (simple check for minimum length, can be more complex)
        if (address != null && address.length() >= 10) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        // If all fields are valid, set userValid to true
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid