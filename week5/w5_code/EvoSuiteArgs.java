package week5.w5_code;

import org.evosuite.EvoSuite;

public class EvoSuiteArgs {

	public static void main(String[] args) {
		String[] evoArgs = {"-class", "week5.w5_code.TriangleClassifier", "-projectCP", "./out/production/CS-374-Public", "-Dcriterion=branch", "-Dsearch_budget=20", "-Drandom_seed=111"};
		String[] help = {"-listParameters"};
		//EvoSuite.main(help);
		EvoSuite.main(evoArgs);

	}

}
