class MaxFunction{

public static boolean validateUserProfile( String firstName, String lastName, String phoneNumber, String Dob, String gmail, String gender){
 boolean userValid= false;
boolean isfirstNameValid  = false;
boolean islastNameValid  = false;
boolean isphoneNumber  = false;
boolean isDob  = false;
boolean isgmail  = false;
boolean isgender = false;

if (firstName !=null && firstname.length()>=3){
isfirstNameValid= true;
}
else{
   System.out.println(" Name is invalid");
}
if (lastName !=null && lastname.length()>=3){
islastNameValid = true;
}
else{
   System.out.println(" Name is invalide");
}
if (phoneNumber !=null && phoneNumber.length()==10){
isphoneNumber= true;
}
else{
   System.out.println(" phoneNumber is invalid");
}
if (Dob !=null ){
isDob= true;
}
else{
   System.out.println(" Dob is invalid");
}
if (gmail !=null ){
isgmail= true;
}
else{
   System.out.println(" gmail is invalid");
}
if (gender !=null ){
isgender= true;
}
else{
   System.out.println(" gender is invalid");
}
if (isfirstNameValid==true && islastNameValid==true && isphoneNumber==true && isDob==true && isgmail==true && isgender==true){
userValid = true;
}
return userValid ;
}
}              

   
