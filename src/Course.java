public class Course {

    Cross[] cross1 = new Cross[1];


    public void doIt(Team team) {
        Member[] members = team.getMembers();
        for (Member m : members) {
            m.crossrun();
        }
    }
}
//    public void doIt(Team team){
//        Competitor[] teamMembers = team.getMembers();
//        if(teamMembers.length > 0){
//            for (Competitor c: teamMembers){
//                for (Obstacle o: obstacles){
//                    o.doIt(c);
//                    if (!c.isOnDistance()) break;
//                }
//            }
//        } else {
//            System.out.println("There are no members in the team!");
//        }