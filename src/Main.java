public class Main {
    public static void main(String[] args) {
        Cross cross1 = new Cross(450);
        Course c = new Course(); // Создаем полосу препятствий
        Member member1= new Member("Igor", 400);
        Member member2= new Member("Sasha", 500);
        Team team = new Team("Winners", member1, member2); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

    }
}
