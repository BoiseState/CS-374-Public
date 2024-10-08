package week5.w5_code;

import java.util.Random;

import week4.w4_code.TriangleClassifier;

public class TriangleClassifierFuzzer {
public static void main(String[] args) {
		
		int n = 1;
		if(args.length == 1) {
			n = Integer.parseInt(args[0]);
		}

		String className = "TriangleClassifierTestN_"+n; 

				
				String fileHeader = "package week5.w5_test;\nimport static org.junit.Assert.*;\n" +
						"import org.junit.Test;\n\n" +
						"import week5.w5_code.TriangleClassifier;" +
						"public class "+ className + " {\n\n";
				System.out.println(fileHeader);
				Random r = new Random();
				while(n > 0) {

					int valA = r.nextInt();
					int valB = r.nextInt();
					int valC = r.nextInt();
					
				
					String testCase = 	"@Test\n"+
						"public void test"+n+"() {\n"+
							"\t\tTriangleType type = TriangleClassifier.classify(" + valA + "," + valB + "," + valC+");\n";
					int oracleType = TriangleClassifier.classify(valA, valB, valC);
					String assertStmt = "\t\tassertEquals(type,TriangleType."+ oracleType + ");";
					testCase += assertStmt + "\n\t}";

					System.out.println(testCase);
						n--;
				}
				String fileFooter = "}";
				System.out.println(fileFooter);
				
				//TODO: Write it to a file className.java in week4.w5_test package
	}

}
