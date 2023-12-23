public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int many = 1800;
        int bonusRub = many / 100;

        if (many < 1000) {
            bonusRub = 0;
        }
        int check = balance + many + bonusRub;

        System.out.println("Ваш баланс:" + check);
        System.out.println("Ваши бонусные рубли:" + bonusRub);
    }
}
