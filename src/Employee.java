public class Employee implements Training {
   private String name;
   private String phone;
   private String adress;
    public Employee(String name,String phone, String adress){
        this.name=name;
        this.phone=phone;
        this.adress=adress;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public void attendTraining() {
        System.out.println("Attend Training Employee");
    }
    }
