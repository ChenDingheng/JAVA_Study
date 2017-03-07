
public class ClassTypeParameter {
	private String name;
	private int population;
	
	public void tryToChange(int intVariable){
		intVariable=this.population;
	}
	
	public void tryToReplace(ClassTypeParameter otherObject){
		otherObject=this;
	}
	
	public void change(ClassTypeParameter otherObject){
		otherObject.name=this.name;
		otherObject.population=this.population;
	}
	
	public static void main(String[] args){
		ClassTypeParameter c1=new ClassTypeParameter();
		ClassTypeParameter c2=new ClassTypeParameter();
		
		c1.setSpecies("Klingon Ox",10);
		int aPopulation=42;
		System.out.println("aPopulation before calling tryToChange: "+aPopulation);
		c1.tryToChange(aPopulation);
		System.out.println("aPopulation after calling tryToChange: "+aPopulation);
		
		c2.setSpecies("Ferengie Fur Ball", 90);
		System.out.println("c2 before calling tryToReplace: ");
		c2.writeOutput();
		
		c1.tryToReplace(c2);
		System.out.println("c2 after calling tryToReplace: ");
		c2.writeOutput();
		
		c1.change(c2);
		System.out.println("c2 after calling change: ");
		c2.writeOutput();
	}

	public void writeOutput() {
		System.out.println("Name: "+this.name);
		System.out.println("Population: "+this.population);	
	}

	public void setSpecies(String name, int population) {
		this.name=name;
		this.population=population;
	}
}
