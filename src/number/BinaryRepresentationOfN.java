package number;

public class BinaryRepresentationOfN {
        /*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */

    public static void main(String[] args) {
        System.out.println(binaryOfN(10));
        System.out.println(binaryOfN(15));
        System.out.println(binaryOfN(16));

    }
    public static int binaryOfN(int n){ // 6 -> 3 -> 1 -> 0

        String binary = ""; // 0 -> 10 -> 110

        while(n > 0){
           binary = n % 2 + binary;
           n /= 2;
        }

        return binary.replace("0", "").length();
    }

}
