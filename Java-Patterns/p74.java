//             A 
//           A B
//         A B C
//       A B C D
//     A B C D E
//   A B C D E F
// A B C D E F G
//   A B C D E F
//     A B C D E
//       A B C D
//         A B C
//           A B
//             A


public class p74 {
    public static void main(String[] args) {
        int rows = 13;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            if (i <= (rows + 1) / 2) { // top half
                for (int j = 1; j <= (rows + 1) / 2; j++) {
                    if (i + j >= (rows + 3) / 2) {
                        System.out.print(ch + " ");
                        ch++;
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                ch = 'A';
            } else { // bottom half
                for (int j = 1; j <= (rows + 1) / 2; j++) {
                    if (i - j < (rows + 1) / 2) {
                        System.out.print(ch + " ");
                        ch++;
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                ch = 'A';
            }
        }
    }
}
