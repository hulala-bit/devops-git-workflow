public class Main {
    public static boolean peutVendre(int stock, int quantite) {
        return quantite > 0 && quantite <= stock;
    }

    public static void main(String[] args) {
        System.out.println("DevOps Git Workflow - v2");

        System.out.println(peutVendre(5, 2));  // true
        System.out.println(peutVendre(5, 8));  // false
        System.out.println(peutVendre(5, -1)); // false
    }
}