public class Main {

        public static void main(String args[]) {
            factorial();
            fibonacci();
            missingnumber();
        }

        public static void factorial() {
            //factorial code functiona
            int i, f = 1;
            int number = 10; //factorial of this no will be calculated
            for (i = 1; i <= number; i++) {
                f = f * i;
            }

            System.out.println("Factorial of " + number + " is: " + f);
        }

        public static void fibonacci() {
            int max = 5, previous = 0, next = 1;
            int i = 1;
            System.out.println("fibonacci Series of " + max+" is:" );
            while (i <= max) {
                System.out.println(previous+"");
                int sum = previous + next;
                previous = next;
                next = sum;
                i++;
            }
        }

        public static void missingnumber(){
            int total_num;
            int[] numbers = new int[]{1,5,3,4,6,7};
            total_num = 7;
            int expected_num_sum = total_num * ((total_num + 1) / 2);
            int num_sum = 0;
            for (int i: numbers) {
                num_sum += i;}
            System.out.print("Missing no in Array is:\n");
            System.out.print( expected_num_sum - num_sum);

        }


    }


