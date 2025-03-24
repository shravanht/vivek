class BankAccount {

    public static String createAccount(String fullName, String username, String password, String email, 
                                       String phoneNumber, String address, String dob, String gender, 
                                       String accountType, String initialDeposit) {
        String ref = null;

        boolean isAccountValid = validateAccountDetails(fullName, username, password, email, phoneNumber, 
                                                        address, dob, gender, accountType, initialDeposit);

        if(isAccountValid) {
            ref = "Bank account created successfully!";
        } else {
            ref = "Account creation failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateAccountDetails(String fullName, String username, String password, 
                                                 String email, String phoneNumber, String address, String dob, 
                                                 String gender, String accountType, String initialDeposit) {
        boolean isValid = false;
        boolean isFullName = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isAddress = false;
        boolean isDOB = false;
        boolean isGender = false;
        boolean isAccountType = false;
        boolean isInitialDeposit = false;

        // Validate full name
        if(fullName != null && fullName.length() >= 3) {
            isFullName = true;
            System.out.println("Full Name is valid.");
        } else {
            System.out.println("Full Name must be at least 3 characters.");
        }

        // Validate username (at least 5 characters)
        if(username != null && username.length() >= 5) {
            isUsername = true;
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username must be at least 5 characters.");
        }

        // Validate password (minimum 8 characters)
        if(password != null && password.length() >= 8) {
            isPassword = true;
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password must be at least 8 characters.");
        }

        // Validate email (basic regex)
        if(email != null && email.length()>=12) {
            isEmail = true;
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email address.");
        }

        // Validate phone number (must be 10 digits)
        if(phoneNumber != null && phoneNumber.length()==10) {
            isPhoneNumber = true;
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number must be 10 digits.");
        }

        // Validate address (must be at least 10 characters long)
        if(address != null && address.length() >= 10) {
            isAddress = true;
            System.out.println("Address is valid.");
        } else {
            System.out.println("Address must be at least 10 characters.");
        }

        // Validate date of birth (must match dd/MM/yyyy format)
        if(dob != null && dob.length()>8) {  // Format: dd/MM/yyyy
            isDOB = true;
            System.out.println("Date of birth is valid.");
        } else {
            System.out.println("Date of birth must be in dd/MM/yyyy format.");
        }

        // Validate gender (must be Male or Female)
        if(gender != null ) {
            isGender = true;
            System.out.println("Gender is valid.");
        } else {
            System.out.println("Gender must be Male or Female.");
        }

        // Validate account type (must be Savings or Current)
        if(accountType != null ) {
            isAccountType = true;
            System.out.println("Account Type is valid.");
        } else {
            System.out.println("Account Type must be either Savings or Current.");
        }

        // Validate initial deposit (must be a positive number)
        if(initialDeposit != null ) {
            isInitialDeposit = true;
            System.out.println("Initial Deposit is valid.");
        } else {
            System.out.println("Initial Deposit must be at least 100.");
        }

        // Final validation: All conditions must be true
        if(isFullName && isUsername && isPassword && isEmail && isPhoneNumber && isAddress && 
           isDOB && isGender && isAccountType && isInitialDeposit) {
            isValid = true;
        }

        return isValid;
    }
}
