
import javax.swing.*;
import java.text.*;
import java.util.Calendar;
import java.util.function.*;
// import java.util.Font;
class DigitalClock extends JFrame {
    JLabel l1, l2;
    SimpleDateFormat d1;

    DigitalClock(String s1) {
        super(s1);
    }

    DigitalClock() {
    }

    void setComponents() {
        l1 = new JLabel();
        // setLayout(null);
        // l1.setFont(new font("Verdana", Font.Bold, 40));
        add(l1);
       

    }
    public void setTime(){

        l1.setBounds(50, 50, 150, 50);

        // d1 = new SimpleDataFormat("hh:mm:ss a");
        d1 = new SimpleDateFormat("hh:mm:ss a");
        String time = d1.format(Calendar.getInstance().getTime());
        l1.setText(time);
        while(true){
            time = d1.format(Calendar.getInstance().getTime());
            l1.setText(time);


            try{
                Thread.sleep(1000);
            }catch(Exception e1){

            }
        }
    }

    public static void main(String[] args) {
        DigitalClock d1 = new DigitalClock("Digital Clock");
        d1.setVisible(true);
        d1.setSize(500, 500);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();

    }
}
