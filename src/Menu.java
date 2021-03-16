import AutoMesh.Audi;
import AutoMesh.Protection_200;
import AutoMesh.Protection_400;
import AutoMesh.Volkswagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Menu {
    private static Protection_200 protection_200 = new Protection_200();
    private static Protection_400 protection_400 = new Protection_400();
    private static Audi audi;
    private static Volkswagen volkswagen;

    //Создаем считыватель текста
    public static BufferedReader reader;

    //Чтобы ввод русских букв был корректным, зададим другуб кодировку для нашего потока
    static {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in, "CP1251"));
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex);
        }
    }

    //Метод ввода
    //Взаимодействие с пользователем
    public static String input() {
        String str;
        try {
            str = reader.readLine();
            if (str.length()== 0)
            {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            System.out.println("Вы ничего не ввели! Повторите ввод!");
            str = input();
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода!");
            str = input();
        }
        return str;
    }

    //Взаимодействие с пользователем
    public static void Menu() {
        String choice;
        System.out.print("\nЛабораторная работа 2 \nВариант 20 \nШаблоны проектирования"
                + "\nПаттерн Мост ");
        do {
            System.out.println("\nВыберите модель сигнализации \n"
                    + "1. Защита-200\n"
                    + "2. Защита-400\n"
                    + "3. Выйти");
            choice = input();
            switch (choice) {
                case "1": {
                    markChoose(protection_200, protection_400);
                    break;
                }
                case "2": {
                    markChoose(protection_200, protection_400);
                    break;
                }
                case "3": {
                    choice = "5";
                    System.out.println("Выход");
                    System.exit(0);
                }
                default: {
                    System.out.println("Ошибка!");
                    Menu();
                    break;
                }
            }
        } while (choice != "5");
    }

    public static void markChoose(Protection_200 obj_1, Protection_400 obj_2) {
        System.out.println("\nВыберите марку автомобиля:\n"
                + "1. Volkswagen \n"
                + "2. Audi \n"
                + "3. Выйти");
        String choice = input();
        switch (choice) {
            case "1": {
                volkswagen = new Volkswagen(obj_1);
                volkswagen.installed();
                break;
            }
            case "2": {
                audi = new Audi(obj_2);
                audi.installed();
                break;
            }
            case "3": {
                System.exit(0);
            }
            default: {
                System.out.println("Ошибка! Повторите ввод.");
                Menu();
                break;
            }
        }
    }
}
