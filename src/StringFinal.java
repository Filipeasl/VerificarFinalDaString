public class StringFinal {
    public static boolean VerificarFinalDaString(String str, String finalDaString)
    {
        try {
            // Crie um código em Java capaz de verificar se os dois últimos caracteres de uma string são iguais aos dois primeiros de outra string
            finalDaString = String.valueOf(finalDaString.charAt(0)) + String.valueOf(finalDaString.charAt(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if(str.lastIndexOf(finalDaString) + finalDaString.length() == str.length()){
            return true;
        }
        return false;
    }
}