class PanCardValidator {

   
    public static boolean validatePanCardApplication(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String panNumber) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isPanNumberValid = false;

        
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            
        System.out.println("The first name is " + firstName + " && !firstName.isEmpty()");
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

        
        if (dob != null ) { 
            isDobValid = true;
        } else {
            System.out.println("Date of Birth is invalid");
        }

        
        if (email != null ) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        
        if (gender != null ) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid");
        }

        
        if (panNumber != null ) { 
            isPanNumberValid = true;
        } else {
            System.out.println("PAN Number is invalid");
        }

        
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid && isPanNumberValid) {
            userValid = true;
        }

        return userValid;
    }

  }