class animal{
    void eat(){
        System.out.println("eat");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("bark");
    }
}
class pup  extends Dog{
    void weep(){
        System.out.println("weep");
    }
}
class main{
    public static void main(String[] args) {
        pup dog = new pup();
        dog.weep();
        dog.eat();
        dog.bark();
        
    }
}
