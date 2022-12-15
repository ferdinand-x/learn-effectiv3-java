package effectivejava.chapter2.item2.hierarchicalbuilder;

abstract class Animal<T extends Animal<T>>{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void mating(T t);

    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("111");
        Dog dog2 = new Dog("111");
        Cat cat = new Cat("222");
        dog.mating(dog2);
    }
}

class Dog extends Animal<Dog> {
    public Dog(String name) {
        super(name);
    }

    @Override
    void mating(Dog dog) {
        System.out.println(this + "和" + dog + "生小狗");
    }
}

class Cat extends  Animal<Cat> {

    public Cat(String name) {
        super(name);
    }

    @Override
    void mating(Cat cat) {
        System.out.println(this + "和" + cat + "生小猫");
    }
}