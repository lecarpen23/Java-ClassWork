import java.util.Scanner;

    public class Module {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            int count = 0;
            do {
                //set up the inputs
                System.out.println("Enter your numbers: ");
                System.out.println("... Then enter a negative number: ");
                int nums = 0;
                //stops negative number from being included in average
                double next = keyboard.nextDouble();
                //initiate the variables for the  average and min/max
                double sum = 0;

                double avg = 0;
                double max = next;
                double min = max;

                while (next >= 0) {
                    sum = sum + next;
                    //counts the number of inputs w/ each iteration
                    nums++;

                    //stops code when less than 0
                    next = keyboard.nextDouble();

                    if (next > max)
                        max = next;
                    else if (next > 0 && next < min)
                        min = next;

                }
                double range = (max - min);
                avg = sum/nums;
                //has to be outside of while loop to exclude values out of desired range
                System.out.println("The max value is " + max + ", the min value is " + min + ", the range is " + range + ", and the average is " + avg + ".");

            count ++;
            } while (count < 1);

        }
    }








