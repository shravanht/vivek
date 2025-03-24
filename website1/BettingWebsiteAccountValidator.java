class BettingWebsiteAccountValidator {

    // Method to validate Betting Website account registration details
    public static boolean validateBettingWebsiteAccount(String firstName, String lastName, String phoneNumber, String dob, String email, String gender, String address, String userName, String preferredBetType) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isUserNameValid = false;
        boolean isPreferredBetTypeValid = false;
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

        // Validate phone number
        if (phoneNumber != null && phoneNumber.length() == 10) {
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

        // Validate preferred bet type (should be a valid option)
        if (preferredBetType != null && (preferredBetType.equalsIgnoreCase("Sports") || preferredBetType.equalsIgnoreCase("Casino") || preferredBetType.equalsIgnoreCase("Poker"))) {
            isPreferredBetTypeValid = true;
        } else {
            System.out.println("Preferred Bet Type is invalid");
        }

        // If all fields are valid, set userValid to true
        if (isFirstNameValid && isLastNameValid && isPhoneNumberValid && isDobValid && isEmailValid && isGenderValid && isUserNameValid && isAddressValid && isPreferredBetTypeValid && isAgeValid) {
            userValid = true;
        }

        return userValid;
    }

    // Helper method to calculate age from date of birth
    public static int calculateAge(String dob) {
        String[] dateParts = dob.split("/");
        int birthYear = Integer.parseInt(dateParts[2]);
        int birthMonth = Integer.parseInt(dateParts[1]);
        int birthDay = Integer.parseInt(dateParts[0]);

        // Get current year, month, and day
        java.util.Calendar now = java.util.Calendar.getInstance();
        int currentYear = now.get(java.util.Calendar.YEAR);
        int currentMonth = now.get(java.util.Calendar.MONTH) + 1; // Calendar months are 0-based
        int currentDay = now.get(java.util.Calendar.DAY_OF_MONTH);

        // Calculate age
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        return age;
    }

    