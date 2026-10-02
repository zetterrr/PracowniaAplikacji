import java.sql.SQLOutput;
void main() {
//zad1
Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//
//    if (n > 0) {
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//    } else {
//        System.out.println("Liczba musi być dodatnia.");
//    }
//zad2
//    System.out.println("Podaj liczbe calkowita dodatnia: ");
//    int n;
//    while (true) {
//        n = scanner.nextInt();
//        if (n > 0) {
//            break;
//        }
//        System.out.println("Podaj liczbę dodatnią:");
//    }
//    int potega = 1;
//    while (potega <= n) {
//        System.out.println(potega);
//        potega *= 2;
//
//    }
//zad3
//    int suma = 0;
//    int liczba;
//    do {
//        System.out.println("Podaj liczbę:");
//        liczba = scanner.nextInt();
//        suma += liczba;
//    } while (liczba != 0);
//    System.out.println("Suma: " + suma);
//zad4
//int liczba;
//int suma = 0;
//int min = 0;
//int max = 0;
//int ile = 0;
//
//do {
//    System.out.println("Podaj liczbe (Liczba 0 konczy petle):");
//    liczba = scanner.nextInt();
//    if (liczba != 0) {
//        suma += liczba;
//        ile++;
//        if (ile == 1) {
//            min = liczba;
//            max = liczba;
//            }
//        if (liczba < min) {
//            min = liczba;
//            }
//        if (liczba > max) {
//            max = liczba;
//            }
//        }
//    } while (liczba != 0);
//    System.out.println("Najmniejsza: " + min);
//    System.out.println("Najwieksza: " + max);
//    System.out.println("Suma najmniejszej i najwiekszej: " + (min + max));
//    System.out.println("Srednia: " + (double) suma / ile);
//zad5
//    int random = (int)(Math.random() * 100) + 1;
//    int liczba;
//    do {
//        System.out.println("Podaj liczbe:");
//        liczba = scanner.nextInt();
//        if (liczba > random) {
//            System.out.println("Podales za duza wartosc");
//        } else if (liczba < random) {
//            System.out.println("Podales za mala wartosc");
//        } else {
//            System.out.println("Gratulacje");
//        }
//    } while (liczba != random);
//zad6
//    System.out.print("x = ");
//     int x = scanner.nextInt();
//    System.out.print("y = ");
//     int y = scanner.nextInt();
//    System.out.print("a = ");
//     int a = scanner.nextInt();
//    System.out.print("b = ");
//     int b = scanner.nextInt();
//    System.out.print("znak = ");
//     char znak = scanner.next().charAt(0);
//     for (int i = 0; i < y; i++)
//        System.out.println();
//     for (int i = 0; i < a; i++)
//    {
//         for (int j = 0; j < x; j++)
//            System.out.print(" ");
//         for (int j = 0; j < b; j++)
//            System.out.print(znak);
//        System.out.println();
//    }
//zad7
//    System.out.print("Podaj liczbe calkowita: ");
//    int n = scanner.nextInt();
//    for (int i = 1; i <= n; i++)
//    {
//        for (int j = 1; j <= n - i; j++)
//            System.out.print(" ");
//        for (int j = 1; j <= 2 * i - 1; j++)
//            System.out.print("*");
//        System.out.println();
//    }
//zad8
//    System.out.println("Podaj liczbe do silnii: ");
//    int n = scanner.nextInt();
//    int silnia = 1;
//    for (int i = 1; i <= n; i++)
//        silnia = silnia * i;
//    System.out.println("Silnia danej liczby to: " + silnia);
//zad9
//    System.out.println("Podaj dowolne slowo: ");
//    String slowo = scanner.next();
//    boolean palindrom = true;
//    for (int i = 0; i < slowo.length() / 2; i++)
//    {
//        if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i))
//        {
//            palindrom = false;
//            break;
//        }
//    }
//    if (palindrom)
//        System.out.println("Palindrom");
//    else
//        System.out.println("Nie jest palindromem");
//zad10
//    petla:
//    for (int i = 1; i <= 10; i++)
//    {
//        if (i % 2 != 0)
//            continue;
//        for (int j = 1; j <= 10; j++)
//        {
//            if (j > i)
//                continue petla;
//            System.out.print(j + " ");
//        }
//        System.out.println();
//    }
}
