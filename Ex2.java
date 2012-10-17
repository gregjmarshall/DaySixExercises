class Ex2 {
Ex2(){
    
}
public void markComp() {
    int x = 0, noStudents = 0, noDistinctions = 0, noPasses = 0, noFails = 0, inValid = 0;
    do{
        System.out.println("Please input a mark: ");
        String str = System.console().readLine();
        x = Integer.parseInt(str);
        if ((x != -1) && (x > 100 || x < 0)) {
            System.out.println("Invalid entry.");
            inValid++;          
            }
        else if(x >= 70) {
                noStudents++;
                noDistinctions++;      
        }
        else if(x >= 50) {
            noStudents++;
            noPasses++;
        }
        else if (x > 0) {
            noStudents++;
            noFails++;
        }
    } while (x != -1);
            System.out.println("Number of students: " + noStudents + " Distinctions: " + noDistinctions +" Passes: "+ noPasses + " Fails: " + noFails + " (plus " + inValid + " invalid.)");
}
       
      
    public static void main(String[] args) {
        Ex2 myEx2 = new Ex2();
        myEx2.markComp();

    }
}
