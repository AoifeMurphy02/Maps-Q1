public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Tom", "042-9876542");
        pb.add("Annie","087-9876234");
        pb.add("Ron","0873556891");

        pb.displayPhoneBook();
        pb.remove("Ron");
        pb.displayPhoneBook();
        System.out.println(pb.findPhoneNumber("Tom"));

    }
}
