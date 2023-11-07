public class cass {
    public static void main(String[] args) throws Exception {
       
        car hybrid=new car(50);
        hybrid.setDrive(200);
        hybrid.setAddgas(250);
        hybrid.setfuelNeeded(200/50);
        
         System.out.println("the gaslevel is " +hybrid.getgaslevel());
  
    }   

 }

 class car{
   double fuelEfficiency;
   int ammountOfFuel;
   int drive;
   double addgas;
   double fuelNeeded;

   public car(double fuelEfficiency){
    this.fuelEfficiency=fuelEfficiency;
    this.ammountOfFuel=0;
   }

   public void setDrive(int drive){
    this.drive=drive;
   }

   public void setAddgas(double addgas){
    this.addgas=addgas;
   }
   public void setfuelNeeded(double fuelNeeded){
    this.fuelNeeded=fuelNeeded;
   }
   public double  getgaslevel(){
    return addgas-fuelNeeded;
   }









    
   
 }








