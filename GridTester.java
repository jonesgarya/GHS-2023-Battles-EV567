public class GridTester extends ConsoleProgram
{
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
        g2.setShip(1,1,true);
        g2.setShip(1,2,true);
        g2.setShip(1,3,true);
        g2.setShip(1,4,true);
        g2.setShip(1,5,true);
        g2.setShip(5,6,true);
        g2.setShip(6,6,true);
        g2.setShip(7,6,true);
        g2.printShips();

    }
}
