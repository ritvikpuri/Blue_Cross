import java.util.Scanner;

public class fan {

    public static final int off = 0;
    public static final int slowSpeed = 1;
    public static final int mediumSpeed = 2;
    public static final int fastSpeed = 3;

    public int speed;
    public boolean reversed;

    //constructor
    public fan(){
        this.speed = off;
    }

    // cycle through fan speed
    public void chord1(){
        if(speed == off){
            speed = slowSpeed;
        }
        else if(speed == slowSpeed){
            speed = mediumSpeed;
        }
        else if(speed == mediumSpeed){
            speed = fastSpeed;
        }
        else if(speed == fastSpeed){
            speed = off;
        }
    }

    // reverse direction
    public void chord2(){
        reversed = !reversed;
    }

    public void status(){
        if(reversed){
            System.out.println("The speed is: " + speed + " and the direction is reversed");
        }
        else{
            System.out.println("The speed is: " + speed + " and the direction is not reversed");
        }
    }

    public static void main(String[] args) {
        fan newFan = new fan();
        int chord;

        Scanner scanner = new Scanner(System.in);
        newFan.status();
        System.out.print("Which chord to pull? 1 or 2: ");

        while((chord = scanner.nextInt()) != 0) {

            if(chord == 1){
                newFan.chord1();
                newFan.status();
            }
            else if(chord == 2){
                newFan.chord2();
                newFan.status();
            }
            else{
                System.out.println("Please enter 1 or 2 (or 0 to exit)");
            }
            System.out.print("Which chord to pull? 1 or 2: ");
        }

    }
}