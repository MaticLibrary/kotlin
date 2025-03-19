fun Min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun usunNieparzyste(lista: List<Int>): List<Int> {
    val wynik = mutableListOf<Int>()
    for (liczba in lista) {
        if (liczba % 2 == 0) {
            wynik.add(liczba)
        }
    }
    return wynik
}

fun sumaZnakowImion(imiona: List<String>): Int {
    var suma = 0
    for (imie in imiona) {
        suma += imie.length
    }
    return suma
}

fun rzymskaNaArabska(cyfraRzymska: String): Int? {
    val mapaRzymskie = mapOf(
        "I" to 1, "II" to 2, "III" to 3, "IV" to 4, "V" to 5, "VI" to 6, "VII" to 7, "VIII" to 8, "IX" to 9,
        "X" to 10, "XI" to 11, "XII" to 12, "XIII" to 13, "XIV" to 14, "XV" to 15, "XX" to 20, "XXX" to 30,
        "XL" to 40, "L" to 50, "LX" to 60, "LXX" to 70, "LXXX" to 80, "XC" to 90, "C" to 100, "CC" to 200,
        "CCC" to 300, "CD" to 400, "D" to 500, "DC" to 600, "DCC" to 700, "DCCC" to 800, "CM" to 900, "M" to 1000,
        "MM" to 2000, "MMM" to 3000, "MMMCMXCIX" to 3999
    )

    val roman = cyfraRzymska.toUpperCase()
    return mapaRzymskie[roman] ?: run {
        var total = 0
        var i = 0
        while (i < roman.length) {
            val current = roman[i].toString()
            val next = if (i + 1 < roman.length) roman[i + 1].toString() else ""
            val pair = current + next

            if (mapaRzymskie[pair] != null) {
                total += mapaRzymskie[pair]!!
                i += 2
            } else {
                total += mapaRzymskie[current]!!
                i += 1
            }
        }
        total
    }
}

fun logowanie(login: String, haslo: String): Boolean {
    // Bez zmian w tej funkcji
    val uzytkownicy = mapOf(
        "admin" to "admin",
        "kali" to "kali",
        "adam" to "adam",
        "lexary" to "lexary"
    )
    return uzytkownicy[login] == haslo
}

fun main() {
    println("Podaj dwie liczby :")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println("Min: ${Min(a, b)}")

    println("Podaj liczby do listy :")
    val lista = readLine()!!.split(" ").map { it.toInt() }
    println("Lista po filtrze parzystych: ${usunNieparzyste(lista)}")

    println("Podaj imiona :")
    val imiona = readLine()!!.split(" ")
    println("Suma znakow imion: ${sumaZnakowImion(imiona)}")

    println("Podaj cyfre rzymska:")
    val cyfraRzymska = readLine()!!.toUpperCase()
    println("Cyfra arabska dla $cyfraRzymska: ${rzymskaNaArabska(cyfraRzymska)}")

    println("Podaj login:")
    val login = readLine()!!
    println("Podaj haslo:")
    val haslo = readLine()!!
    println("Logowanie... ${logowanie(login, haslo)}")
}
