package io.github.andichrist.testing.dataDriven;

public final class Texts {
  private Texts() {
  }

  // Prüft auf Palindrom, ignoriert Groß-/Kleinschreibung und Nicht-Buchstaben/-Ziffern.
  public static boolean isPalindrome(String text) {
    String s = text.toLowerCase().replaceAll("[^a-z0-9]", "");
    return s.contentEquals(new StringBuilder(s).reverse());
  }
}
