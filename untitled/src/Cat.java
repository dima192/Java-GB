class Cat extends Animal {
    boolean swim;
    int jump;
    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void catInfo() {
                System.out.println("Name: " + name + " RunLimit: " + run+ " meters;" + " swim: " + swim + "; Jump: " +jump+ " meters.");
    }
}
