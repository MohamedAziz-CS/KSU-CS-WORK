import java.util.Scanner;

public class Species {

	String name;
	int population;
	double growthRate;

	public Species() {

		name = "";
		population = 0;
		growthRate = 0.0;

	}

	public Species(String name, int population, double growthRate) {

		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}

	public void readInput() {
		Scanner in = new Scanner(System.in);

		System.out.print("What is the species' name? ");
		name = in.next();
		System.out.print("What is the population of the species? ");
		population = in.nextInt();

		while (population < 0) {

			System.out.print("You entered an invalid population, re-enter the population again? ");
			population = in.nextInt();

		}

		System.out.print("Enter the growth rate (% increase per year): ");
		growthRate = in.nextDouble();
		in.close();

	}

	public void writeOutput() {

		System.out.println("The name of specie is " + name + " and its population is " + population
				+ " and growth rate of " + growthRate + "% per year");

	}

	public int predictPopulation(int years) {
		double x = 0;
		if (years >= 0) {

			x = population * (Math.pow((1 + growthRate / 100), ((double) years)));

		}
		return (int) x;
	}

	public void setSpecies(String newName, int newPopulation, double newGrowthRate) {

		this.name = newName;
		if (newPopulation >= 0) {
			this.population = newPopulation;
		} else {
			System.exit(0);

		}
		
		this.growthRate=newGrowthRate;

	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public double getGrowthRate() {
		return growthRate;
	}
	
	     
	 

}
