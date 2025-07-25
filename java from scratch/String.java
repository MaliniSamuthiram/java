// public class String {
//     public static void main(String[] args) {
//         String input = "abc12xyz34m5";
//         int sum = sumOfNumbers(input);
//         System.out.println("Sum of numbers in the string: " + sum);
//     }

//     public static int sumOfNumbers(String str) {
//         int sum = 0;
//         int num = 0;
//         boolean inNumber = false;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (Character.isDigit(ch)) {
//                 num = num * 10 + (ch - '0');
//                 inNumber = true;
//             } else {
//                 if (inNumber) {
//                     sum += num;
//                     num = 0;
//                     inNumber = false;
//                 }
//             }
//         }
//         if (inNumber) {
//             sum += num;
//         }

//         return sum;
//     }
// }