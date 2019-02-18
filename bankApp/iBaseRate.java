package bankApp;

public interface iBaseRate {
	// Write a method that returns base rate
	default double getBaseRate(){
		return 2.5;
	}
}
