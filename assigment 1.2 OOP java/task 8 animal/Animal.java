public class Animal {
    public String food, location;
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Horse horse1 = new Horse();


        public void makeNoise(String animal){
        if(animal.equals("Dog")){
            dog1.makeNoise1(animal);

        } else if (animal.equals("Horse")) {
            horse1.makeNoise1(animal);
        } else if (animal.equals("Cat")) {
            cat1.makeNoise1(animal);
        }
        }

        public void eat(String animal){
            if(animal.equals("Dog")){
                dog1.eat1(animal);
            } else if (animal.equals("Horse")) {
                horse1.eat1(animal);
            } else if (animal.equals("Cat")) {
                cat1.eat1(animal);
            }
        }

        public void sleep(String animal){
        System.out.println(animal + " an animal is sleeping");
        }




}
