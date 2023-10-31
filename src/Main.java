public class Main {
    public static void main(String[] args) {
//Exercitiu 1
     Programmer programmer = new Programmer("Vasile","068545785","Stefan Voda");
     programmer.attendTraining();

     Manager manager= new Manager("Ana","0586542556","Soroca");
     manager.attendTraining();
     manager.conductInterview();
     System.out.println();
     System.out.println("--------------------------------");

//     Exercitiu 2:
      Training t1 = new Programmer("Stefan  ","025485555   ","Chisinau   ");
      Training t2 = new Programmer("Oleg   ","24685685   ","Balti   ");
      Training t3 = new Programmer("Elena   ","5566236597   ","Ocnita   ");

      MeetingRoom meetingRoom = new MeetingRoom();
      meetingRoom.joinRoom(new Training[]{t1,t2,t3 });
}}