public class ex4
{
    public static void main(String[] args)
    {
        House a = new House("A02", 3, true, 100, 2500);

        System.out.println("House code: " + a.getHC());
        System.out.println("Number Of Bed Room: " + a.getNOBR());
        System.out.println("Has Swimming Pool: " + a.getHSP());
        System.out.println("Area: " + a.getArea());
        System.out.println("Cost Per Square Meter: " + a.getCPSM());
        System.out.println("SubTotal: " + a.calculateSellingPrice());
        System.out.println();

        House a1 = new House();

        System.out.println("Default:");
        System.out.println("House code: " + a1.getHC());
        System.out.println("Number Of Bed Room: " + a1.getNOBR());
        System.out.println("Has Swimming Pool: " + a1.getHSP());
        System.out.println("Area: " + a1.getArea());
        System.out.println("Cost Per Square Meter: " + a1.getCPSM());
    }
}
