import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner quizsc = new Scanner(System.in);

        System.out.println("This Quiz Contains 4 Mathematical questions, To Start Quiz Press '1': ");
        int ans = quizsc.nextInt();

        int score = 0;

        while (true) {

            if (ans != 1) {
                System.out.println("Entered Option is Wrong, Try Again:");
            } else if (ans == 1) {
                Random random = new Random();
                int ques1 = random.nextInt(1000);
                int ques12 = random.nextInt(1000);

                System.out.println("Question No.1 - What is " + ques1 + " + " + ques12 );
                double firstans = quizsc.nextDouble();

                if (firstans == ques1+ques12) {
                    System.out.println("Correct Answer 1 Point.");
                    score++;
                } else {
                    System.out.println("Wrong Answer 0 Point.");
                }

                int ques2 = random.nextInt(1000);
                int ques22 = random.nextInt(1000);

                System.out.println("Question No.2 - What is " + ques2 + "-" + ques22);
                double secondans = quizsc.nextDouble();

                if (secondans == ques2-ques22) {
                    System.out.println("Correct Answer 1 Point.");
                    score++;
                } else {
                    System.out.println("Wrong Answer 0 Point.");
                }

                int ques3 = random.nextInt(100);
                int ques32 = random.nextInt(100);

                System.out.println("Question No.3 - What is " + ques3 + "x" + ques32);
                double thirdans = quizsc.nextDouble();

                if (thirdans == ques3*ques32) {
                    System.out.println("Correct Answer 1 Point.");
                    score++;
                } else {
                    System.out.println("Wrong Answer 0 Point.");
                }

                int ques4 = random.nextInt(10);
                int ques42 = random.nextInt(10);

                System.out.println("Question No.4 - What is " + ques4*ques42 + "/" + ques42);
                double fourthans = quizsc.nextDouble();

                if (fourthans == (ques4*ques42)/ques42) {
                    System.out.println("Correct Answer 1 Point.");
                    score++;
                } else {
                    System.out.println("Wrong Answer 0 Point.");
                }


                int ques52 = random.nextInt(2);

                System.out.println("Question No.5 - What is 'OR' of this : "+ ques52);
                double fifthans = quizsc.nextDouble();

                if (ques52 == 1 && fifthans == 1 || ques52 == 0 && fifthans == 0) {
                    System.out.println("Correct Answer 1 Point.");
                    score++;
                } else {
                    System.out.println("Wrong Answer 0 Point.");

                }
                System.out.println("-------------------------- \n Your Total Points are = "+ score);
                break;
            }

        }
    }
}

