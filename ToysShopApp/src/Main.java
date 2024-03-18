/* Магазин игрушек (Java).
Необходимо написать проект, для розыгрыша в магазине игрушек. Функционал должен содержать добавление новых игрушек и задания веса для выпадения игрушек.

Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки.

Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.

Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию.

Организовать общую очередь.

Вызвать Get 10 раз и записать результат в файл.*/


public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Ball", 5, 20);
        toyStore.addToy(toy1);

        Toy toy2 = new Toy(2, "Doll", 11, 50);
        toyStore.addToy(toy2);

        Toy toy3 = new Toy(3, "Car", 30, 45);
        toyStore.addToy(toy3);

        Toy toy4 = new Toy(4, "Robot", 10, 10);
        toyStore.addToy(toy4);
        
        Toy toy5 = new Toy(5, "Bear", 20, 40);
        toyStore.addToy(toy5); 

        toyStore.showAvailableToys();

        toyStore.playToys();

        toyStore.showAvailableToys();
    }
}
