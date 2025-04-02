class AmazonRunner{
public static void main(String args[]){
Amazon ref = new Amazon(1, "Akash",9876543210L,"akash@123");
System.out.println(ref);
ref.displaydetails();

Amazon ref1 = new Amazon(2,"Hemanth",7676534210L,"hemu@123");
ref1.displaydetails();

Amazon ref2 = new Amazon(3,"Arun",7676534210L,"arun@123");
ref2.displaydetails();

Amazon ref3 = new Amazon (4,"Manja",7676534210L,"manja@123");
ref3.displaydetails();
}
}