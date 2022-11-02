//NAME: AARSH PARIMAL PATEL
//Activity-1
//Semester-1

class blueprint
{
String vehicles;
int speed;
public blueprint(){}
public blueprint(String vehicles,int speed)
{
this.vehicles=vehicles;
this.speed=speed;
}
public String getmodels()
{
return this.vehicles;
}
public void setmodels(String vehicles)
{
this.vehicles=vehicles;
}
public int getspeed()
{
return this.speed;
}
public void setspeed(int speed)
{
this.speed=speed;
}
}
public class TestHarness
{
public static void main(String[] args)
{
blueprint aarpat= new blueprint ("Trucks",55);
System.out.println("Vehicle name: "+ aarpat.getmodels());
System.out.println("Average speed of vehicle is: "+ aarpat.getspeed());
}
}
