
public class Main{
    public static void main(String[] args){
        Person person1 = new Person("Joaozin",30);
        Protagonista protagonista = new Protagonista("goku",30);
        protagonista.soltaPoder();
        System.out.println(person1.name);
        System.out.println(protagonista.soltaPoder());
    }
    
}

class Person{
    String name;
    Integer age;

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}

class Protagonista extends Person{
	
	public Protagonista(String name, Integer age) {
		super(name, age);
	}

    public String soltaPoder(){
        return this.name + " soutou poder";
    }

}







