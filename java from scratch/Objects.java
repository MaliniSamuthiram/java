public class Objects{
    String name = "";
    String processor = "";
    int ram = 0;
    int price = 0;

    public static void main(String[]args){

        Objects laptop1 = new Objects();
        laptop1.name = "Lenovo";
        laptop1.processor = "intel i5";
        laptop1.ram = 16;
        laptop1.price = 48000;

        System.out.println(laptop1.name);
        System.out.println(laptop1.processor);
        System.out.println(laptop1.ram);

        Objects laptop2 = new Objects();
        laptop2.name = "hp";
        laptop2.processor = "intel i3";
        laptop2.ram = 8;
        laptop2.price = 35000;

        System.out.println(laptop2.name);
        System.out.print(laptop2.price);
      
    }
}