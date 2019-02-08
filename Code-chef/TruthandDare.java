import java.util.*;

class TruthAndDare {
    public static boolean includes(Integer a[], Integer b[]) {
        return Arrays.asList(a).containsAll(Arrays.asList(b));
    }
};

class TruthandDare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] results = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            int ramTruthCasesLength = sc.nextInt();
            Integer ramTruthCases[] = new Integer[ramTruthCasesLength];
            for (int j = 0; j < ramTruthCasesLength; j++) {
                ramTruthCases[j] = sc.nextInt();
            }
            int ramDareCasesLength = sc.nextInt();
            Integer ramDareCases[] = new Integer[ramDareCasesLength];
            for (int j = 0; j < ramDareCasesLength; j++) {
                ramDareCases[j] = sc.nextInt();
            }

            int shyamTruthCasesLength = sc.nextInt();
            Integer shyamTruthCases[] = new Integer[shyamTruthCasesLength];
            for (int j = 0; j < shyamTruthCasesLength; j++) {
                shyamTruthCases[j] = sc.nextInt();
            }
            int shyamDareCasesLength = sc.nextInt();
            Integer shyamDareCases[] = new Integer[shyamDareCasesLength];
            for (int j = 0; j < shyamDareCasesLength; j++) {
                shyamDareCases[j] = sc.nextInt();
            }
            if (TruthAndDare.includes(ramTruthCases, shyamTruthCases)
                    && TruthAndDare.includes(ramDareCases, shyamDareCases)) {
                results[i] = "yes";
            } else {
                results[i] = "no";
            }
        }
        
        for (String result : results) {
            System.out.println(result);
        }
        sc.close();
    }
}