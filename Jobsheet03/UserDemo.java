public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User("annas", "Annas Tri W.", "annas@gmail.com");

        System.out.println("Username  : " + user1.username);
        System.out.println("Nama      : " + user1.nama);
        System.out.println("Email     : " + user1.email);
        System.out.println("Alamat    : " + user1.alamat);       // bernilai null (default)
        System.out.println("Pekerjaan : " + user1.pekerjaan);    // bernilai null (default)
    }
}
