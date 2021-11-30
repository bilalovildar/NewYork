public class Member {
    String name;
    int maxrun;
    boolean winner;

    public Member(String name, int maxrun) {
        this.name = name;
        this.maxrun = maxrun;
    }

    public String getName() {
        return name;
    }

    public void crossrun(Cross c) {
        if (maxrun <= c.crosslength) {
            winner = true;
        } else {
            winner = false;
        }
    }

    public void showResults() {
        System.out.println("участник " + getName() + "  кросс длиной " +" "+ winner);
    }
}

