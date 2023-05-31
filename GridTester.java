public class GridTester extends ConsoleProgram
{
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public void run()
    {
        Grid g1 = new Grid();
        g1.printStatus();
        System.out.println();
        
        g1.markMiss(0,0);
        g1.markMiss(1,1);
        g1.markMiss(2,2);
        g1.markMiss(3,3);
        g1.markMiss(4,4);
        g1.markMiss(5,5);
        g1.markMiss(6,6);
        g1.markMiss(7,7);
        g1.markMiss(8,8);
        g1.markMiss(9,9);
        g1.markHit(1,8);
        g1.markHit(2,8);
        
        g1.printStatus();
        System.out.println();
        Grid g2 = new Grid();
        
        Ship s1 = new Ship(5);
        s1.setLocation(1,1);
        s1.setDirection(HORIZONTAL);
        g2.addShip(s1);
        
        Ship s2 = new Ship(3);
        s2.setLocation(5,6);
        s2.setDirection(VERTICAL);
        g2.addShip(s2);
        
        g2.printShips();
    }
}
