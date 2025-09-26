class animal{
    void eat(){
        System.out.println("Sor");
    }


}
class Dog extends animal{
    void bark(){
        System.out.println("bark");
    }
}
class main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
