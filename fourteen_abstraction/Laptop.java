package fourteen_abstraction;

public interface Laptop {
 public void usbA();
public void hdmi();
public void usbC();
default void oldDisplay(){
    System.out.println("provided  24inches display");
}
public static void sdcard(){
    System.out.println("fully installed sdcard");
}
}
