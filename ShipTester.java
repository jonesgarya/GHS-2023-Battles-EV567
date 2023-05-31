public class ShipTester extends ConsoleProgram
{
    public void run()
    {
        Ship s1 = new Ship(5);
        System.out.println(s1);
        s1.setLocation(5, 2);
        System.out.println(s1);
        s1.setDirection(0);
        System.out.println(s1);
    }
}
