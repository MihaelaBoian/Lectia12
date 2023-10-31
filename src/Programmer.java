 class Programmer extends Employee {

    public Programmer (String name,String phone, String adress){
        super(name,phone,adress);
    }

     @Override
     public void attendTraining() {
         System.out.println("Attend Training Programator "  +getName()+getAdress()+getPhone());
     }

 }
