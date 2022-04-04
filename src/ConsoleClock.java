import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class ConsoleClock extends Thread{
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public void run(){
        while (!isInterrupted()){
            System.out.println(dateFormat.format(calendar.getTime()));
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("The clock was stopped");
                break;
            }
        }
    }



}