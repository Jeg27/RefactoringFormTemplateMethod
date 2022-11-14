

public class Main {

    static String getValueForField(String fieldName, String message) {
        final int indexOfFieldValue = message.indexOf(fieldName) + fieldName.length();
        final int indexOfEndOfFieldValue = message.indexOf("\"", indexOfFieldValue);
        return message.substring(indexOfFieldValue, indexOfEndOfFieldValue);
    }


}