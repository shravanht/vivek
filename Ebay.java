public class Ebay {
    public static boolean userDetails(String firstName,String lastName,String email,String password){
        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isEmail = false;
        boolean isPassword = false;
        boolean uservalid = false;
        if(firstName!=null && firstName.length()>=4 && !firstName.isEmpty()){
            isFirstName = true;

        }
        else{
            System.out.println("first name is invalid");
        }
        if(lastName!=null && lastName.length()>=2){
            isLastName = true;


        }
        else{
            System.out.println("last name is invalid");
        }
        if(password!=null && password.length()>=7){
            isPassword = true;
        }
        else{
            System.out.println("Password lenght is invalid");
        }
        if(email!=null && email.length()>=9){
            isEmail=true;

        }
        else{
            System.out.println("Email is invalid");
        }
        if(isFirstName == true && isLastName == true && isPassword == true && isEmail == true){
            uservalid = true;

        }
        return uservalid;
    }
        public static String checkSignUp(String firstName,String lastName,String email,String password){
            boolean verify = userDetails(firstName,lastName,email,password);
            String ref = null;
            if(verify){
                ref = "Register success";
            }
            else{
                ref = "register unsuccesful";
            }
            return ref;
        }

    }