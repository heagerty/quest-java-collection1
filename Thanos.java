import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<Hero> ();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
    	
    	heroes.add(new Hero("Black Widow", 34));
    	heroes.add(new Hero("Captain America", 100));
    	heroes.add(new Hero("Vision", 3));
    	heroes.add(new Hero("Iron Man", 48));
    	heroes.add(new Hero("Scarlet Witch", 29));
    	heroes.add(new Hero("Thor", 1500));
    	heroes.add(new Hero("Hulk", 49));
    	heroes.add(new Hero("Doctor Strange", 42));

    

        // TODO 3 : It's Thor birthday, now he's 1501
    	Hero thor = heroes.get(5);
    	thor.setAge(1501);
    	heroes.set(5, thor);

        // TODO 4 : Shuffle the heroes list
    
		Thanos.shuffle(heroes);
	

        // TODO 5 : Keep only the half of the list
		Thanos.half(heroes);
		

        // TODO 6 : Loop through the list and display the name of the remaining heroes
		for (int i=0; i<heroes.size(); i++) {
			Hero hero = heroes.get(i);
			System.out.println(hero.getName());
		}
    }
    
    public static void shuffle(ArrayList<Hero> heroes) {
    	Random random = new Random();
		
		for (int i=0; i<heroes.size(); i++) {
			Collections.swap(heroes, i, random.nextInt(heroes.size()));
		}
    }
    
    public static void half(ArrayList<Hero> heroes) {
    	int half = (heroes.size()/2);
		for (int i=0; i<half; i++) {
			heroes.remove(0);
		}
	
    }
    
    
    
    
}
