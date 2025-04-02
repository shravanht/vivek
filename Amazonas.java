class Amazonas{
int id;
String name;
long phoneNumber;
String password;

Amazonas(){
System.out.println(" Amazon constructor is invoked ");
}
Amazonas(int id, String name, long phoneNumber, String password){
this.id=id;
this.name=name;
this.phoneNumber=phoneNumber;
this.password=password;
}
public void displaydetails(){
System.out.println("this id is"+id);
System.out.println("this name is"+name);
System.out.println("this phoneNumber is"+phoneNumber);
System.out.println("this passwordis"+password);
}
}