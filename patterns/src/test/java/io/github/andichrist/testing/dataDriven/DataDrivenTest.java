package io.github.andichrist.testing.dataDriven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 Data-Driven Testing mit JUnit 5: ein Testkörper, viele Datensätze.
 Statt n fast identische @Test-Methoden zu schreiben, kommen die Fälle aus einer
 Datenquelle. Das deckt mehr Szenarien ab und bleibt deterministisch (feste Daten,
 keine Zufallswerte) — wie im PCS-QA-Testkonzept gefordert.
 */
class DataDrivenTest {

  @ParameterizedTest(name = "\"{0}\" ist ein Palindrom")
  @ValueSource(strings = {"otto", "Anna", "Reliefpfeiler", "A man a plan a canal Panama"})
  void erkennt_palindrome(String text) {
    assertTrue(Texts.isPalindrome(text));
  }

  @ParameterizedTest(name = "isPalindrome(\"{0}\") == {1}")
  @CsvSource({
      "otto, true",
      "hello, false",
      "'', true",
      "Was it a car or a cat I saw, true"
  })
  void prueft_erwartung_je_datensatz(String text, boolean expected) {
    assertEquals(expected, Texts.isPalindrome(text));
  }

  @ParameterizedTest
  @MethodSource("faelle")
  void datensaetze_aus_methode(String text, boolean expected) {
    assertEquals(expected, Texts.isPalindrome(text));
  }

  static Stream<Arguments> faelle() {
    return Stream.of(
        Arguments.of("Lagerregal", true),
        Arguments.of("Programm", false)
    );
  }
}
