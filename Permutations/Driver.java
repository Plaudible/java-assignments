
public class Driver
{
    public static void main(String[] args) {
        PermutationGenerator pg = new PermutationGenerator(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(pg.nextPermutation());
        }
    }
}