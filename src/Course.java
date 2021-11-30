public class Course {

    Cross[] cross1 = new Cross[1];


    public void doIt(Team team) {
        Member[] members = team.getMembers();
        for (Member m : members) {
            m.crossrun();
        }
    }
}
