
public class Spy {
    int identifier;
    private static int spyCount = 0;
    public Spy(int ID){
        this.identifier = ID;
        spyCount++;
        System.out.println("Spy ID: " + identifier);
        System.out.println("There are now " + spyCount + " spies.");
    }
    public void die(){
        spyCount--;
        System.out.println("Spy" + identifier + "has been detected and eliminated!");
        System.out.println("There are now " + spyCount + " spies.");
        this.get= null;
    }
    public static void main(String[] args) {
        Spy spyOne = new Spy(111);
        Spy spyTwo = new Spy(222);
        Spy spyThree = new Spy(333);
        Spy spyFour = new Spy(444);
        spyOne.die();
        spyThree.die();

    }
}
