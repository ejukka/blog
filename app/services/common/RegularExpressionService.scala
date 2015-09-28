package services.common

trait RegularExpressionService {

  def escapeSpecialChars(text: String): String = {
    text.replaceAll("[^+0-9\\s]", new String())
  }
}