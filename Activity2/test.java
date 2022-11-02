//NAME: AARSH PARIMAL PATEL
//Activity-2
//Semester-1
class test
{
public static void ap (String arm1,int wp1){
if(arm1 == "gun")
{
System.out.println("999");
}
System.out.println("Number of arm items are :" + arm1.length());
System.out.println(arm1.toLowerCase());
if(wp1 % 2 == 0)
{
System.out.println("The number is even");
}
else{
System.out.println("The number is odd");
}
System.out.println("Character at index: " + arm1.charAt(wp1));
if(arm1=="ing")
{
System.out.println(arm1.charAt(0));
}
}
public static void a (String arm2,int wp2){
if(arm2 == "gun")
{
System.out.println("999");
}
System.out.println("Number of arm items are :" + arm2.length());
System.out.println(arm2.toLowerCase());
if(wp2 % 2 == 0)
{
System.out.println("The number is even");
}
else{
System.out.println("The number is odd");
}
System.out.println("Character at index: " + arm2.charAt(wp2));
if(arm2=="ing")
{
System.out.println(arm2.charAt(0));
}
}
public static void p (String arm3,int wp3){
if(arm3 == "gun")
{
System.out.println("999");
}
System.out.println("Number of arm items are :" + arm3.length());
System.out.println(arm3.toLowerCase());
if(wp3 % 2 == 0)
{
System.out.println("The number is even");
}
else{
System.out.println("The number is odd");
}
System.out.println("Character at index: " + arm3.charAt(wp3));
if(arm3=="ing")
{
System.out.println(arm3.charAt(0));
}
}
}
public class result
{
public static void main(String[] args)
{
test app = new test();
app.ap("gun",1);
app.a("akash",2);
app.p("mamaearth",3);
}
}
