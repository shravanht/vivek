class AmazonasRunner{
public static void main(String args[]){
Amazonas ref = new Amazonas(1, "Akash",9876543210L,"akash@123");
System.out.println(ref);
ref.displaydetails();

Amazonas ref1 = new Amazonas(2,"Hemanth",7676534210L,"hemu@123");
ref1.displaydetails();

Amazonas ref2 = new Amazonas(3,"Arun",7676534210L,"arun@123");
ref2.displaydetails();

Amazonas ref3 = new Amazonas (4,"Manja",7676534210L,"manja@123");
ref3.displaydetails();
}
}