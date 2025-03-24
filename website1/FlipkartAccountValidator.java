class FlipkartAccountValidator {

    
    public static boolean validateFlipkartAccount(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String password) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isPasswordValid = false;

        
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

        
        if (dob != null) {
            isDobValid = true;
        } else {
            System.out.println("Date of Birth is invalid");
        }

        
        if (email != null && email.contains("@") && email.contains(".")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        
        if (gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other"))) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid");
        }

       
        if (password != null && password.length() >= 8 && password.matches(".[0-9].") && password.matches(".[a-z].") && password.matches(".[A-Z].")) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid");
        }

        
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid && isPasswordValid) {
            userValid = true;
        }

        return userValid;
    }

    