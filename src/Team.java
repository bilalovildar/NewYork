public class Team {
    String teamName;
    Member[] members = new Member[4];

    public Team(String teamname, Member member1, Member member2) {
        this.teamName = teamname;
        members[0] = member1;
        members[1] = member2;
    }

    public Member[] getMembers() {
        return members;
    }

    public void teamInfo() {
        for (Member m : members) {
            m.showResults();
        }
    }

    public void showResults() {
        for (Member m : members) {
            if (m.winner) {
                m.showResults();
            }
            {
            }
        }
    }
    //program 2
    //program 2.1
}
