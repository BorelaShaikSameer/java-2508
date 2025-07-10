package fourteen_abstraction;

public class User {
public static void main(String[] args) {
//abstraction achied
     Laptop l=new Lenovo();
      l.usbA();
     l.hdmi();
      l.usbC();
      Laptop.sdcard();

System.out.println();
//not abstarction
       HP hp=new HP();
    hp.usbA();
     hp.hdmi();
      hp.usbC();
      hp.oldDisplay();

}
}
