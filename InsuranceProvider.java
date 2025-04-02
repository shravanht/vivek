class InsuranceProvider {
public static double search(String InsuranceName){
double termprice = 0.0;
if(InsuranceName == "LIC"){
termprice = 10000.00;
}
 else if(InsuranceName == "Bajaj"){
termprice = 30000.00;
}
else
{
System.out.println("Doesnot exist");
}
return termprice;
}
}