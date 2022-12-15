package effectivejava.chapter2.item2.hierarchicalbuilder;

public abstract class Animal2 {

    protected String name;

    protected Animal2(String name){
        this.name = name;
    }

    abstract void mating(Animal2 animal2);

    public static void main(String[] args) {
        Dog2 dog = new Dog2("111");
        Dog2 dog2 = new Dog2("111");
        Cat2 cat = new Cat2("222");
        dog.mating(dog2);
        dog.mating(cat);
    }
}

class Dog2 extends Animal2{


    protected Dog2(String name) {
        super(name);
    }

    @Override
    void mating(Animal2 animal2) {
        System.out.println(this + "和" + animal2 + "生小狗");
    }
}

class Cat2 extends Animal2{
    protected Cat2(String name) {
        super(name);
    }

    @Override
    void mating(Animal2 animal2) {
        System.out.println(this + "和" + animal2 + "生小猫");
    }
}