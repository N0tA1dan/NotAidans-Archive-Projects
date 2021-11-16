import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class UwUcrypt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to do (encrypt/decrypt): ");

        String input_read = input.nextLine();

        if (input_read.contains("encrypt")){
            encrypt();
        }
        else if (input_read.contains("decrypt")){
            decrypt();
        }
    }
    public static void encrypt() {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to encrypt: ");

        String input_read = input.nextLine();

        // just turns the users input to numbers
        input_read = input_read.replace("a", "2007");
        input_read = input_read.replace("A", "2008");

        input_read = input_read.replace("b", "2384");
        input_read = input_read.replace("B", "2385");

        input_read = input_read.replace("c", "5712");
        input_read = input_read.replace("C", "5713");

        input_read = input_read.replace("d", "3921");
        input_read = input_read.replace("D", "3922");

        input_read = input_read.replace("e", "4976");
        input_read = input_read.replace("E", "4977");

        input_read = input_read.replace("f", "2138");
        input_read = input_read.replace("F", "2139");

        input_read = input_read.replace("g", "1653");
        input_read = input_read.replace("G", "1654");

        input_read = input_read.replace("h", "7329");
        input_read = input_read.replace("H", "7321");

        input_read = input_read.replace("i", "8121");
        input_read = input_read.replace("I", "8122");

        input_read = input_read.replace("j", "4612");
        input_read = input_read.replace("J", "4613");

        input_read = input_read.replace("k", "2783");
        input_read = input_read.replace("K", "2784");

        input_read = input_read.replace("l", "8724");
        input_read = input_read.replace("L", "8725");

        input_read = input_read.replace("m", "6211");
        input_read = input_read.replace("M", "6212");

        input_read = input_read.replace("n", "7143");
        input_read = input_read.replace("N", "7144");

        input_read = input_read.replace("o", "4279");
        input_read = input_read.replace("O", "4271");

        input_read = input_read.replace("p", "3842");
        input_read = input_read.replace("P", "3843");

        input_read = input_read.replace("q", "2274");
        input_read = input_read.replace("Q", "2275");

        input_read = input_read.replace("r", "1972");
        input_read = input_read.replace("R", "1973");

        input_read = input_read.replace("s", "9234");
        input_read = input_read.replace("S", "9235");

        input_read = input_read.replace("t", "4763");
        input_read = input_read.replace("T", "4764");

        input_read = input_read.replace("u", "5319");
        input_read = input_read.replace("U", "5311");

        input_read = input_read.replace("v", "3274");
        input_read = input_read.replace("V", "3275");

        input_read = input_read.replace("w", "4821");
        input_read = input_read.replace("W", "4822");

        input_read = input_read.replace("x", "7349");
        input_read = input_read.replace("X", "7341");

        input_read = input_read.replace("y", "6274");
        input_read = input_read.replace("Y", "6275");

        input_read = input_read.replace("z", "1738");
        input_read = input_read.replace("Z", "1739");

        input_read = input_read.replace(" ", "6969");


        BigInteger large_num = new BigInteger("123456789123456789");
        BigInteger large_num_2 = new BigInteger("123456789123456789123456789");

        Random rnd = new Random();

        int key_random = 100000 + rnd.nextInt(1000000 - 100000);

        BigInteger key_1 = new BigInteger("" + key_random);


        BigInteger key_2 = key_1.multiply(large_num);


        BigInteger cipher_1 = new BigInteger(input_read);

        BigInteger cipher_2 = cipher_1.multiply(key_1);

        BigInteger cipher_3 = cipher_2.multiply(key_2);

        BigInteger cipher_4 = cipher_3.multiply((large_num_2));

        BigInteger cipher_5 = cipher_4.multiply(key_2);

        BigInteger cipher_6 = cipher_5.add(large_num_2);

        System.out.print("your key is: ");
        System.out.print(key_2);
        System.out.println();

        System.out.println("--------------------------------------------------------");
        System.out.println("your hash is below");
        System.out.println("--------------------------------------------------------");
        System.out.println(cipher_6);

    }
    public static void decrypt() {
        Scanner user_key = new Scanner(System.in);
        System.out.print("Please enter your key: ");

        String user_key_read = user_key.nextLine();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter your encrypted text: ");

        String input_read = input.nextLine();

        BigInteger large_num = new BigInteger("123456789123456789");
        BigInteger large_num_2 = new BigInteger("123456789123456789123456789");

        BigInteger key_2 = new BigInteger(user_key_read);
        BigInteger key_1 = key_2.divide(large_num);

        BigInteger cipher_6 = new BigInteger(input_read);

        BigInteger cipher_5 = cipher_6.subtract(large_num_2);

        BigInteger cipher_4 = cipher_5.divide(key_2);

        BigInteger cipher_3 = cipher_4.divide(large_num_2);

        BigInteger cipher_2 = cipher_3.divide(key_2);

        BigInteger cipher_1 = cipher_2.divide(key_1);

        String cipher = cipher_1.toString();

        cipher = cipher.replace("2007", "a");
        cipher = cipher.replace("2008", "A");

        cipher = cipher.replace("2394", "b");
        cipher = cipher.replace("2385", "B");

        cipher = cipher.replace("5712", "c");
        cipher = cipher.replace("5713", "C");

        cipher = cipher.replace("3921", "d");
        cipher = cipher.replace("3922", "D");

        cipher = cipher.replace("4976", "e");
        cipher = cipher.replace("4977", "E");

        cipher = cipher.replace("2138", "f");
        cipher = cipher.replace("2129", "F");

        cipher = cipher.replace("1653", "g");
        cipher = cipher.replace("1654", "G");

        cipher = cipher.replace("7329", "h");
        cipher = cipher.replace("7321", "H");

        cipher = cipher.replace("8121", "i");
        cipher = cipher.replace("8122", "I");

        cipher = cipher.replace("4612", "j");
        cipher = cipher.replace("4613", "J");

        cipher = cipher.replace("2783", "k");
        cipher = cipher.replace("2784", "K");

        cipher = cipher.replace("8724", "l");
        cipher = cipher.replace("8725", "L");

        cipher = cipher.replace("6211", "m");
        cipher = cipher.replace("6212", "M");

        cipher = cipher.replace("7143", "n");
        cipher = cipher.replace("7144", "N");

        cipher = cipher.replace("4279", "o");
        cipher = cipher.replace("4271", "O");

        cipher = cipher.replace("3842", "p");
        cipher = cipher.replace("3843", "P");

        cipher = cipher.replace("2274", "q");
        cipher = cipher.replace("2275", "Q");

        cipher = cipher.replace("1972", "r");
        cipher = cipher.replace("1973", "R");

        cipher = cipher.replace("9234", "s");
        cipher = cipher.replace("9235", "S");

        cipher = cipher.replace("4763", "t");
        cipher = cipher.replace("4764", "T");

        cipher = cipher.replace("5319", "u");
        cipher = cipher.replace("5311", "U");

        cipher = cipher.replace("3274", "v");
        cipher = cipher.replace("3275", "V");

        cipher = cipher.replace("4821", "w");
        cipher = cipher.replace("4822", "W");

        cipher = cipher.replace("7349", "x");
        cipher = cipher.replace("7341", "X");

        cipher = cipher.replace("6274", "y");
        cipher = cipher.replace("6275", "Y");

        cipher = cipher.replace("1738", "z");
        cipher = cipher.replace("1739", "Z");

        cipher = cipher.replace("6969", " ");

        System.out.println("--------------------------------------------------------");
        System.out.println("your decrypted text is");
        System.out.println("--------------------------------------------------------");
        System.out.println(cipher);
    }
}
