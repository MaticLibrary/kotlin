import java.util.*;
import static java.lang.Math.*;

//Ćwiczenie 1
//Napisać program obliczający pole trójkąta. Program wczytuje wysokość h oraz podstawę
// a (dowolne liczby rzeczywiste), następnie oblicza pole trójkąta według wzoru
//P = (a · h) / 2
//Długości a i h podane są w centymetrach, natomiast wynik należy wyświetlić
// w metrach kwadratowych.
//Program na początku powinien wyświetlić krótką informację o swoim przeznaczeniu,
// a po wyświetleniu wyniku wstrzymać wykonanie do momentu naciśnięcia klawisza Enter.


//Ćwiczenie 2
//Napisać program obliczający pole koła oraz pole kwadratu opisanego na tym kole.
// Program wczytuje promień r (dowolna liczba rzeczywista), oblicza pole koła według wzoru
//P = π · r²
//następnie wyznacza długość boku a kwadratu opisanego na tym kole oraz oblicza jego pole
//P = a²
//Program powinien wyświetlić wszystkie obliczone wartości. Na początku należy wyświetlić
// informację o przeznaczeniu programu, a po wyświetleniu wyników zatrzymać jego wykonanie
// do czasu naciśnięcia klawisza Enter.


//Ćwiczenie 3
//Dana jest funkcja liniowa opisana równaniem y = ax + b.
// Napisać program obliczający miejsce zerowe równania liniowego
//ax + b = 0
//Program wczytuje współczynniki a i b (dowolne liczby rzeczywiste) i wyświetla wynik.
// Program powinien na początku wyświetlić informację o swoim przeznaczeniu oraz zakończyć działanie po naciśnięciu klawisza Enter

//Ćwiczenie 4
//Teoretyczna szybkostrzelność karabinka automatycznego AK wynosi 10 strzałów  // 1 s.
// 1 s to 10 naboi
// Magazynek mieści 30 naboi.
//Napisać program, który wczyta czas trwania ognia ciągłego wyrażony w sekundach
// (dowolna liczba całkowita), a następnie obliczy liczbę magazynków, które należy wymienić, aby prowadzić ogień ciągły przez podany czas. Program powinien na początku wyświetlić informację o swoim przeznaczeniu
// , a po wyświetleniu wyniku zakończyć działanie po naciśnięciu klawisza Enter.
public class Main {
    Scanner sc = new Scanner(System.in);

    public double cwiczenie_4(){
        System.out.println("\nObliczanie ilosci zmiany bądź przeładowania karabinu AK \n");
        System.out.println("Prosze podac czas przeprowadzania ostrzalu: ");
        double time = sc.nextDouble();
        double magazynkow = ceil((time * 10) / 30);
        double czasDodatkowyNaPrzeladowanie = magazynkow * 7;
        double GlobalTime = time + czasDodatkowyNaPrzeladowanie;
        double GlobalTimeMin = GlobalTime/60;
        System.out.println("\nWykorzystano magazynkow: " + magazynkow + "\nCzas ostrzalu wraz z czasem przeladowania: " + GlobalTime + "\nCzas w min: " + GlobalTimeMin + "\n");
        sc.nextLine();
        sc.nextLine();
        return GlobalTime;
    }

    public double cwiczenie_3(){
        System.out.println("\nProgram pobierajacy a oraz b oraz zwracajacy miejsca zerowe funckji liniowej. \n");
        System.out.println("\nProsze wprowadzic a: ");
        double a = sc.nextDouble();
        System.out.println("\nProsze wprowadzic b: ");
        double b = sc.nextDouble();
        System.out.println("\nNasza funkcja liniowa ma postac: \n\n 0 = " + a + "x + " + b + "\n");
        double miejsceZerowe = -(b/a);
        System.out.println("Miejsce zerowe: " + miejsceZerowe);
        sc.nextLine();
        sc.nextLine();
        return miejsceZerowe;
    }

    public double cwiczenie_1(){
        System.out.println("\nMetoda obliczajaca pole trójkąta pobierając a oraz h\n");
        System.out.println("Prosze podac wysokosc (h): ");
        double height = sc.nextDouble();
        System.out.println("Prosze podac bok (a): ");
        double a = sc.nextDouble();
        double wynikcm2 = (height * a)/2;
        double wynikm2 = wynikcm2/10000;
        System.out.println("Wynik w [m2]: " + wynikm2 + " [m2]" + "\nWynik w [cm2]: " + wynikcm2 + "[ cm2]");
        sc.nextLine();
        sc.nextLine();
        return wynikm2;
    }

    public double cwiczenie_2(){
        System.out.println("\nProgram obliczajacy pole koła oraz pole kwadratu opisanego na tym kole\n");
        System.out.println("Prosze podac promien (r): ");
        double r = sc.nextDouble();
        double poleKola = Math.PI * r * r;
        double a = 2 * r;
        double poleKwadratu = a * a;
        System.out.println("Pole kola wynosi: " + poleKola + "\npromien wynosi: " + r + "\nPole kwadratu: " + poleKwadratu);
        sc.nextLine();
        sc.nextLine();
        return poleKwadratu;
    }

    public static void main(String[] args) {
        new Main().cwiczenie_1();
        new Main().cwiczenie_2();
        new Main().cwiczenie_3();
        new Main().cwiczenie_4();
    }
}

