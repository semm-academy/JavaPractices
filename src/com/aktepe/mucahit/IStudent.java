package com.aktepe.mucahit;

public interface IStudent {

    public void graduated();

    public void examOfNumber(int num);

    public void teacherName();


        class Science implements IStudent {
            public void graduated() {

                System.out.println("You need over 60 points");
            }

            public void examOfNumber(int num) {
                System.out.println("");

            }

            public void teacherName() {
                System.out.println("Your teacher name is Tom");
            }
        }
            class English implements IStudent {
                public void graduated() {

                    System.out.println("You need over 65 points");
                }

                public void examOfNumber(int num) {
                    System.out.println("3");

                }

                public void teacherName() {
                    System.out.println("Your teacher name is Richard");
                }

            }


        public static void main(String[] args) {
            Math myMath = new Math();
            Science myScience = new Science();
            English myEnglish = new English();
            myMath.examOfNumber(4);
            myEnglish.teacherName();
            myScience.graduated();


        }

    }

class Math implements IStudent {
    public void graduated() {

        System.out.println("You need over 70 points");
    }

    public void examOfNumber(int num) {

        System.out.println("You are pass");

    }

    public void teacherName() {
        System.out.println("Your teacher name is Mary");
    }
}
