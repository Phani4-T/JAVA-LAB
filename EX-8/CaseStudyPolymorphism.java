class Animal{  
        void eat(){System.out.println("Types of foods Animals Eats..");}  
    }  
    class Dog extends Animal{  
        void eat(){System.out.println("The Dog Eats The MilkBread&Rice...");}  
    }  
    class Cat extends Animal{  
        void eat(){System.out.println("The Cat Eats The Rats&Milk... ");}  
    }  
    class Lion extends Animal{  
        void eat(){System.out.println("The Lion Eats Raw Meet...");}  
    }  
    class  CaseStudyPolymorphism{  
        public static void main(String[] args){  
            Animal a;  
            a=new Dog();  
            a.eat();  
            a=new Cat();  
            a.eat();  
            a=new Lion();  
            a.eat();  
        }
}  