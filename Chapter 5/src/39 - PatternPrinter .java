import java.util.Scanner;

class PatternPrinter {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("now we print patterns, tell me number: ");
        int occurence = input.nextInt();

        pattern1(occurence);
        System.out.println();
        pattern2(occurence);
        System.out.println();
        pattern3(occurence);
    }
    static void pattern1(int occurence){
        int i=0;
        while(i<occurence){
            int j =0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void pattern2(int occurence){
        while(occurence > 0){
            int j = occurence;
            while( j> 0 ){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            occurence--;
        }

    }

    static void pattern3(int occurence){
        int i =0;
        while(i<occurence){
            int j=occurence-1;
            while(j>i){
                System.out.print("  ");
                j--;
            }
            int p =0;
            while(p<=i){
                System.out.print("* ");
                p++;
            }


            System.out.println();
            i++;
        }


    }
}
