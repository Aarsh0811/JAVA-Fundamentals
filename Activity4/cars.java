//NAME: AARSH PARIMAL PATEL
//Activity-4
//Semester-1

class cars
{
    private String model;
    private double price;
    
    public cars() {}
    
    public cars(String model, double price)
    {
        this.model = model;
        this.price = price;
    }
    

    //Setter & Getter for both variables
    
    public void setModelname(String model)
    {
        this.model = model;
    }
    public String getModelname()
    {
        return model;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
}
class testharnesstwo
{
    public static void main(String[] args)
    {
    cars crs = new cars("Mercedes",50000);
    System.out.println("Model of the car is " + crs.getModelname());
    System.out.println("Price the car is " + crs.getPrice());
    System.out.println("----------------------------------");
    
    crs.setModelname("BMW");
    crs.setPrice(60000);
    System.out.println("Model name is " + crs.getModelname());
    System.out.println("Price of the car is " + crs.getPrice());
    System.out.println("----------------------------------");
    }
    
}
