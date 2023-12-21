package gb.HomeWork.Static;

import static java.lang.Thread.sleep;

public class Notice {

    public static void introduction(){
        System.out.println(Colors.GREEN + "\n~~~Добро пожаловать!~~~\n" + Colors.RESET);
    }
    public static void addPerson(){
        boolean cursor = true;
        System.out.println();
        System.out.print("Введите: ФИО, дату рождения, номер телефона и пол.\n" +
                "Данные разделяйте пробелом, пол укажите латинской буквой M или W\n" +
                "дату рождения вводите в формате ДД.ММ.ГГГГ\n" +
                "Если данные будут введены некорректно, система вас уведомит.\n\n" +
                Colors.BLUE + "ВВедите дынные или нажмите" + Colors.YELLOW + " q " + Colors.BLUE + "чтобы выйти: " + Colors.RESET);

    }
    public static void success(){
        System.out.println(Colors.GREEN + "\nДанные приняты!\n" + Colors.RESET);
    }
    public static void repeat(){
        System.out.print(Colors.BLUE + "Повторите ввод, или нажмите" + Colors.YELLOW + " q " + Colors.BLUE + "чтобы выйти: " + Colors.RESET);
    }

    public static void tryAgain() {
        System.out.println(Colors.RED + "\nНет такого пункта в меню!\n" + Colors.RESET);
    }
    public static void tryInputNumber(){
        System.out.println(Colors.RED + "\nНекорректный ввод, введите число!\n" + Colors.RESET);
    }
    public static void makeChoice(){
        System.out.print(Colors.BLUE + " Выберите пункт: " + Colors.RESET);
    }
    public static void fewDataException(){
        System.out.println(Colors.RED + "\nДанных недостаточно!\n" + Colors.RESET);
    }
    public static void extraDataException(){
        System.out.println(Colors.RED + "\nВы ввели лишние данные!\n" + Colors.RESET);
    }
    public static void extraSpacesException(){
        System.out.println((Colors.RED + "\nСлишком много пробелов" + Colors.RESET));
    }
    public static void nameError(){
        System.out.println(("\nВводите Ф, И и О с заглавной буквы"));
    }

    public static void incorrectFIO(int i){
        System.out.println("Данные ФИО под номером " + i + " некорректны");
    }
    public static void correctFIO(int i){
        System.out.println("данные ФИО под номером " + i + " корректны");
    }

    public static void incorrectGender(int i) {
        System.out.println("Данные о поле под номером " + i + " некорректны");
    }
    public static void correctGender(int i) {
        System.out.println("Данные о поле под номером " + i + " корректны");
    }

    public static void correctLetters(int i) {
        System.out.println("все данные под номером " + i + " корректны");
    }

    public static void incorrectGenderFormat(int i) {
        System.out.println("Много букав в указании пола под номером " + i);
    }
    public static void wrongPhoneFormat(){
        System.out.println("неверный формат даты");
    }
}
