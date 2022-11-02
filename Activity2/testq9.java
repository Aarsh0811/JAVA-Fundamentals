//NAME: AARSH PARIMAL PATEL
//Activity-2
//Semester-1

 class testq9
{
public static void ap1 (String armoury1,int weapons1){
if(armoury1 == "gun")
{
    System.out.println("999");
}
System.out.println("Number of armoury items are :" + armoury1.length());
System.out.println(armoury1.toLowerCase());

if(weapons1 % 2 == 0)
{
    System.out.println("The number is even");
}
else{
    System.out.println("The number is odd");
}
System.out.println("Character at index: " + armoury1.charAt(weapons1));
}
public static void ap2 (String armoury2,int weapons2){
if(armoury2 == "gun")
{
    System.out.println("999");
}
System.out.println("Number of armoury items are :" + armoury2.length());
System.out.println(armoury2.toLowerCase());

if(weapons2 % 2 == 0)
{
    System.out.println("The number is even");
}
else{
    System.out.println("The number is odd");
}
System.out.println("Character at index: " + armoury2.charAt(weapons2));
}
public static void ap3 (String armoury3,int weapons3){

if(armoury3 == "gun")
{
    System.out.println("999");
}
System.out.println("Number of armoury items are :" + armoury3.length());
System.out.println(armoury3.toLowerCase());

if(weapons3 % 2 == 0)
{
    System.out.println("The number is even");
}
else{
    System.out.println("The number is odd");
}
System.out.println("Character at index: " + armoury3.charAt(weapons3));
}         
}
public class result

{
public static void main(String[] args)
    {
        testq9 a1 = new testq9();
        a1.ap1("gun",3);
        a1.ap2("ak",1);
        a1.ap3("ma",2);
    }
}
