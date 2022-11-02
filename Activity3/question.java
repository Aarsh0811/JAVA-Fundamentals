//NAME: AARSH PARIMAL PATEL
//Activity-3
//Semester-1

class question
{
public static int like(String abp, String singleletter)
{
int indexnum= 0, calculate=0;
while(indexnum!=-1)
{
indexnum= abp.indexOf(singleletter,indexnum);
if(indexnum!=-1)
{
calculate++;
indexnum+=singleletter.length();
}
}
return calculate;
}
public static void main(String[] args)
{
String abp = "Hello Canada!";
String singleletter = "I";
int calculate = like(abp, singleletter);
System.out.println(calculate);
}
}
