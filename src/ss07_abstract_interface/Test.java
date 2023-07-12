package ss07_abstract_interface;

public class Test {
    public static void main(String[] args) {
        Person people[] = new Person[3];
        people[0] = new Engineer();
        people[1] = new Student() ;
        people[2] = new Pilot() ;

        loop(people);

    }
    private static void loop(Person[] people){
        for (Person person : people){
             person.love();

            if(person instanceof Student){
                 ((Student) person).playGame();
            }
            if(person instanceof Engineer){
                ((Engineer) person).playGame();
            }
        }
    }
}
