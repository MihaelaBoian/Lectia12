public class Manager extends Employee  implements Interview{
    public Manager( String name,String phone, String adress){
        super(name, phone, adress);
     }

     @Override
     public void attendTraining() {
        System.out.println("Training din Manager");

     }

     @Override
     public void conductInterview() {
        System.out.println("Interview din Manager");

     }
 }
