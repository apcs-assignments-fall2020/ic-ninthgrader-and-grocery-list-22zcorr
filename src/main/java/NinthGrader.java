public class NinthGrader extends Student {
    public NinthGrader(String a, String b){
        super(a,b,2024);
    }
    public NinthGrader(){
        super();
    }

    public void doSomething(){
        System.out.println(this.getFirstName() +" ('24) is working on Physics homework.");
    }

    public String toString(){
        return this.getFirstName()+" "+this.getLastName()+", 2024 (Ninth Grader)";
    }

    

}