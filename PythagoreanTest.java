public class PythagoreanTest{
    public static void main(String[] args) {
        Pythagorean test1 = new Pythagorean();
        double result1 = test1.calculateHypotenuse(2,2);
        System.out.println(result1);

        Pythagorean test2 = new Pythagorean();
        double result2 = test2.calculateHypotenuse(3,8);
        System.out.println(result2);

        Pythagorean test3 = new Pythagorean();
        double result3 = test3.calculateHypotenuse(10,17);
        System.out.println(result3);
        
    }
}