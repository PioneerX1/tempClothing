import java.io.Console;

//ask for temparature
//assess temparature
//recommend clothing

public class TempClothing {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Give me a temparature and I will recommend clothes to wear");
    int temp = Integer.parseInt(myConsole.readLine());

    if (temp > 75) {
      System.out.println("It's hot. Shirts and shorts for you today!");
    } else if (temp > 50 && temp <= 75) {
      System.out.println("Nice weather. Maybe some jeans and short-sleeve shirt, maybe bring a sweater in case you get cold");
    } else if (temp <= 50 && temp > 35) {
      System.out.println("Bring a jacket, dress warm");
    } else if (temp <= 35) {
      System.out.println("It's super cold, better bundle up with lots of layers!");
    }
  }
}
