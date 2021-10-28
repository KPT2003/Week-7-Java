public class LabClass 

    void l1() {
        int count;
        int roll1;
        int roll2;

        roll1 = 1 +(int)(Math.random()*(6));
        while( roll1 != roll2){
            count++;
            roll2 = 1 +(int)(Math.random()*(6));
        }

    }

    void l2() {
        // your code for lab task 2
    }

    void l3() {
        int average;
        int totalCount = 0;
        int testNumber = 1;
        int dice1;
        int dice2;
        int count;
        while (testNumber <= 100){
            count = 0;
            dice1 = 1 +(int)(Math.random()*(6));
            while(dice1 != dice2){
                count++;
                dice2 = 1 +(int)(Math.random()*(6));

            }
            count++;

            totalCount += count;
            testNumber++;
        }
        average = totalCount/100;

    }

    void l4() {
        //Random rand = new Random();
        int counter = 0;
        int number;

        //number = ran.nextInt();
        if (number > 0){
            counter++;
            System.out.println(number);
        }
        while (number >= 0 && counter <10){

            //number = rand.nextInt();
            if (number >0 ){
                counter++;
                System.out.println(number);
            }
        }
    }

    void l5() {
        String ar[] = {"David", "Sally", "Ellen", "Adam", "Sally"};
        int i = 0;
        int j = ar.length - 1;
        String givenString = "Sally";
        boolean flag = true;
        for(i = 0; i <ar.length; i++) {
            if (ar[i] != ar[j]) {
                flag = false;
            } else {
                i++;
                j--;
            }System.out.println("false");
            System.out.println("For value = " + ar[1] + " the output = " +  i++);
        }
        }

.///
    void l6() {
        int ar[] = {2,6,3,9,0};
        int t;
        for(int i = 0; i <ar.length; i++){
            for(int j= i+1;j < ar.length;j++){
                if(ar[i] > ar[j]){
                    t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
        for(int i = 4; i <ar.length;i++)
            System.out.print((ar[ar.length-2]));

    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        // to execute, uncomment one method at a time
        //labClass.l1();
        //labClass.l2();
        //labClass.l3();
        //labClass.l4();
        labClass.l5();
        //labClass.l6();

    }


}
