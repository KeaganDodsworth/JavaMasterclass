package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	iTelephone timsPhone;
    timsPhone = new DeskPhone(12345);
    timsPhone.powerOn();
    timsPhone.callPhone(12345);
    timsPhone.answer();
    }
}
