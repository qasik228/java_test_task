import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class TurtlePathIntersection {
    public static boolean hasPathIntersection(String path) {
        int x = 0; // Координата по x
        int y = 0; // Координата по y
        ArrayList<String> list = new ArrayList<>(); // Объявляем список содержащий пройденные координаты 
        
        list.add("0,0"); // Добавляем начальные координаты
        
        for (char direction : path.toCharArray()) { // Проход по всем символам строки, содержащей маршрут черепахи
            switch (direction) { // Изменение координат
                case 'u':
                    y++;
                    break;
                case 'd':
                    y--;
                    break;
                case 'r':
                    x++;
                    break;
                case 'l':
                    x--;
                    break;
                default:
                    break;
            }
            
            String position = x + "," + y; // Текущие координаты черепахи
            if (list.contains(position)) { // Проверка пересечния
                return true;
            }
            
            list.add(position); // Добавление координат
        }
        
        return false;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем экземпляр Scanner, читающий с стандартного ввода
        System.out.println("This program determines whether the turtle has crossed its trajectory or not.");
        System.out.print("Enter the turtle's route (Example: uullrdrd): "); // Запрос пользователю
        String inputString = scanner.nextLine(); // Считываем строку, введенную пользователем
        //System.out.println(inputString);
        boolean result = hasPathIntersection(inputString);
        System.out.println(result);
        
        scanner.close(); // Закрываем сканер после использования
    }
}