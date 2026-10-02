void main() {
//zad1
//int[] tab1 = {1, 2, 3, 4, 5, 6};
//String[] tab2 = {"Ala", "ma", "kota", "i", "psa"};
//for (int i = 0; i < tab1.length; i += 2) {
//    System.out.println(tab1[i]);
//}
//for (int i = 0; i < tab2.length; i += 2) {
//    System.out.println(tab2[i]);
//}
////zad2
//    int[] tab = {5, 12, 3, 25, 8, 17};
//    int max = tab[0];
//    for (int i = 1; i < tab.length; i++) {
//        if (tab[i] > max) {
//            max = tab[i];
//        }
//    }
//    System.out.println("Największa liczba: " + max);
////zad3
//    String[] tab = {"Ala", "ma", "kota", "Java"};
//    for (String slowo : tab) {
//        System.out.println(slowo.toUpperCase());
//    }
//zad4
      Scanner scanner = new Scanner(System.in);
//    String[] slowa = new String[5];
//    for (int i = 0; i < 5; i++) {
//        System.out.print("Podaj słowo: ");
//        slowa[i] = scanner.nextLine();
//    }
//    for (int i = 4; i >= 0; i--) {
//        String slowo = slowa[i];
//        for (int j = slowo.length() - 1; j >= 0; j--) {
//            System.out.print(slowo.charAt(j));
//        }
//        System.out.println();
//    }
//zad5
//    int[] tab = new int[8];
//    for (int i = 0; i < 8; i++) {
//        System.out.print("Podaj liczbę: ");
//        tab[i] = scanner.nextInt();
//    }
//    for (int i = 0; i < tab.length - 1; i++) {
//        for (int j = 0; j < tab.length - 1 - i; j++) {
//            if (tab[j] > tab[j + 1]) {
//                int pomoc = tab[j];
//                tab[j] = tab[j + 1];
//                tab[j + 1] = pomoc;
//            }
//        }
//    }
//    System.out.println("Posortowana tablica:");
//    for (int liczba : tab) {
//        System.out.print(liczba + " ");
//    }
//zad6
//    int[] tab = new int[5];
//    for (int i = 0; i < 5; i++) {
//        System.out.print("Podaj liczbę: ");
//        tab[i] = scanner.nextInt();
//    }
//    for (int liczba : tab) {
//        long silnia = 1;
//        for (int i = 1; i <= liczba; i++) {
//            silnia = silnia * i;
//        }
//        System.out.println(liczba + "! = " + silnia);
//    }
//zad7
//    String[] tab1 = {"Ala", "ma", "kota"};
//    String[] tab2 = {"Ala", "ma", "kota"};
//    if (Arrays.equals(tab1, tab2)) {
//        System.out.println("Tablice są takie same.");
//    } else {
//        System.out.println("Tablice są różne.");
//    }
//zad8 (to jakis lvl wyzej biala flaga)
//zad9
// Random random = new Random();
//    int[] tab = new int[20];
//    for (int i = 0; i < tab.length; i++) {
//        tab[i] = random.nextInt(1, 11);
//    }
//    for (int liczba = 1; liczba <= 10; liczba++) {
//        int ile = 0;
//        for (int element : tab) {
//            if (element == liczba) {
//                ile++;
//            }
//        }
//        System.out.println(liczba + " występuje " + ile + " razy");
//    }
}
