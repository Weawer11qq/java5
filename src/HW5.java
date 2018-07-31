public class HW5 {
    public static void main(String[] args) {
        Sotrydnik[] Sotrydnik = new Sotrydnik[6];
        Sotrydnik[0] = new Sotrydnik("Ivanov Ivan Ivanovich", "Top manager", "ivanovii@mail.me",
                45000,  45);
        Sotrydnik[1] = new Sotrydnik("Kislyakov Yan Vladimirovich", "Student", "Weawer11qq@gmail.com",
                9999,22);
        Sotrydnik[2] = new Sotrydnik("Sidorov Sidr Sidorovich", "manager", "sidorovss@mail.me",
                30000,32);
        Sotrydnik[3] = new Sotrydnik("Pupkin Vasiliy Achamatovich", "manager", "pupkinvi@mail.me",
                30000,29);
        Sotrydnik[4] = new Sotrydnik("Semenov Semen Semenich", "manager", "semenovss@mail.me",
                30000,36);
        Sotrydnik[5] = new Sotrydnik("test","test","test",100,100);


        for (Sotrydnik e : Sotrydnik) if (e.getAge() > 40) e.getFullInfo();
    }
}