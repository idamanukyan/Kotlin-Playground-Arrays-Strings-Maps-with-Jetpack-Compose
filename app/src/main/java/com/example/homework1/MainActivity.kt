import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.homework1.ui.theme.Homework1Theme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.Scanner

class Person(val name: String, val age: Int)

class Person2(val name: String, val age: Int) {
    fun determineLifeStage(): String {
        return when (age) {
            in 0..12 -> "Kind"
            in 13..19 -> "Teenager"
            else -> "Erwachsener"
        }
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myArray = arrayOf(10, 100, 1000, 10000, 100000)
        val myList = listOf("liebe", "ist", "fur", "alle", "da")

        val originalString = "Hallo, Leute!"

        val concatenatedString = originalString + "Willkommen auf der Erde"
        val substring = originalString.substring(7)
        val lowercaseString = originalString.toLowerCase()
        val uppercaseString = originalString.toUpperCase()

        val result1 = classifyNumber(15)
        val result2 = classifyNumber(-13)
        val result3 = classifyNumber(10)

        val modifiedStrings = """
            Original String: $originalString
            Concatenated String: $concatenatedString
            Substring: $substring
            Lowercase String: $lowercaseString
            Uppercase String: $uppercaseString
        """.trimIndent()

        val meinWortMap = mapOf(
            "Apfel" to 5,
            "Banane" to 6,
            "Kirsche" to 7,
            "Dattel" to 6,
            "Holunder" to 8
        )

        val mapOutput = buildMapOutput(meinWortMap)

        val resultsOutput = """
            Result for 15: $result1
            Result for -13: $result2
            Result for 10: $result3
        """.trimIndent()

        val scanner = Scanner(System.`in`)
        print("Bitte geben Sie Ihren Namen ein: ")
        val name = scanner.nextLine()
        print("Bitte geben Sie Ihr Alter ein: ")
        val age = scanner.nextInt()

        val greeting = when {
            age < 18 -> "Hallo, $name! Du bist noch jung."
            age in 18..65 -> "Hallo, $name! Du befindest dich in deiner Blütezeit."
            else -> "Hallo, $name! Du verfügst über reichlich Lebenserfahrung."
        }

        println(greeting)

        print("Bitte geben Sie die erste Zahl ein: ")
        val num1 = scanner.nextDouble()
        print("Bitte geben Sie die zweite Zahl ein: ")
        val num2 = scanner.nextDouble()
        scanner.close()
        divideNumbers(num1, num2)

        val currentDate = Date()
        val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.GERMAN)
        val formattedDate = dateFormat.format(currentDate)
        println("Das aktuelle Datum und Uhrzeit ist: $formattedDate")


        val person = Person("Max Mustermann", 30)
        println("Name: ${person.name}")
        println("Alter: ${person.age}")

        val person2 = Person2("Max Mustermann", 30)
        println("Name: ${person2.name}")
        println("Alter: ${person2.age}")
        val lifeStage = person2.determineLifeStage()
        println("Lebensphase: $lifeStage")

        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Gerade Zahlen in der Liste: $evenNumbers")



        setContent {
            Homework1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArrayAndList(myArray, myList)
                    StringManipulation(modifiedStrings)
                    MapIteration(mapOutput)
                    NumberClassification(resultsOutput)
                }
            }
        }
    }
}

@Composable
fun ArrayAndList(array: Array<Int>, list: List<String>) {
    Text("Array elements:")
    for (element in array) {
        Text(element.toString())
    }
    Text("List elements:")
    for (element in list) {
        Text(element)
    }
}

@Composable
fun StringManipulation(modifiedStrings: String) {
    Text(modifiedStrings)
}

@Composable
fun MapIteration(mapOutput: String) {
    Text(mapOutput)
}

fun buildMapOutput(map: Map<String, Int>): String {
    val outputBuilder = StringBuilder()
    for ((key, value) in map) {
        outputBuilder.append("$key: $value\n")
    }
    return outputBuilder.toString()
}

@Composable
fun NumberClassification(resultsOutput: String) {
    Text(resultsOutput)
}

fun classifyNumber(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}

fun divideNumbers(num1: Double, num2: Double) {
    try {
        val result = num1 / num2
        println("Die Division ergibt: $result")
    } catch (e: ArithmeticException) {
        println("Fehler: Division durch Null ist nicht erlaubt.")
    }
}
