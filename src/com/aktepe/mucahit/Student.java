package com.aktepe.mucahit;

public interface Student {

    public void graduated();

    public void examOfNumber();

    public void teachername();

    class Math implements Student {
        public void graduated() {

            System.out.println("You need over 70 points");
        }

        public void examOfNumber() {
            System.out.println("4");

        }

        public void teachername() {
            System.out.println("Your teacher name is Mary");
        }
    }
        class Science implements Student {
            public void graduated() {

                System.out.println("You need over 60 points");
            }

            public void examOfNumber() {
                System.out.println("5");

            }

            public void teachername() {
                System.out.println("Your teacher name is Tom");
            }
        }
            class English implements Student {
                public void graduated() {

                    System.out.println("You need over 65 points");
                }

                public void examOfNumber() {
                    System.out.println("3");

                }

                public void teachername() {
                    System.out.println("Your teacher name is Richard");
                }

            }


        public static void main(String[] args) {
            Math myMath = new Math();
            Science myScience = new Science();
            English myEnglish = new English();
            myMath.examOfNumber();
            myEnglish.teachername();
            myScience.graduated();


        }

    }


