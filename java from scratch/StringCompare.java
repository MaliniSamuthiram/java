class StringCompare{
    public static void main(String[]args){
        String a1 = "Apple";
        String b1 = "Apple";
        System.out.println(a1==b1);
        //compares references in string pool(diff values points at same content)
        String a2 = new String("Apple");
        String b2 = new String("Apple");
        System.out.println(a2==b2);
        //compares references which was created as two diff objects in heap
        String a3 = new String("Apple");
        String b3 = "Apple";
        System.out.println(a3==b3);
        //comparing two string in which one was stored at heap and another one at the 
        //string pool as both are obviously having diff reference addresses(locations)
        String a4 = new String("Apple");
        String b4 = new String("Apple");
        System.out.print(a4.equals(b4));
        //to compare the content not reference while creating as two diff objects
    }
}