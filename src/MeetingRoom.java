public class MeetingRoom  {
    public void joinRoom(Training[] trainee){
        for (Training t: trainee){
            t.attendTraining();
        }
    }


}
