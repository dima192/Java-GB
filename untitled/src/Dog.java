class Dog extends Animal {
    double jump;
    int swim;
     public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
     }
             public void dogInfo() {
        System.out.println("Name: " + name  + "; RunLimit: " + run+ " meters;" + " Swim: " + swim + "; Jump: " +jump+ " meters.");
    }




}
