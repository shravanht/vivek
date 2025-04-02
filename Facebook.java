class Facebook {
    
public static String register(String firstName, String lastName, double mobileNumber, String DOB, String gmailid,String gender )
{
  String message = null;
if( firstName!= null){
message = " User Registeration Successful";
}else{
 message =" User Registratiom unsuccesfull";
}
return message;
}
}