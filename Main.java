import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(unikalnostBukv("Hello"));
        System.out.println(unikalnostBukv("World"));
        System.out.println(unikalnostBukv("Hanna"));
        System.out.println(unikalnostBukv("Andrey"));
    }
    public static boolean unikalnostBukv(String word) {
        HashSet<Character> znacheniya = new HashSet<>(); //создаем хашсет с чарзначениями
        for (char number : word.toCharArray()) { //проверка буквы есть или нет
            if (znacheniya.contains(number)) { //если есть возврат фальш
                return false;
            }
            znacheniya.add(number); //если нет добавляем в сет
        }
        return true; //если нет повторов тру
    }
}
