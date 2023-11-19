import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
String example = scanner.nextLine();
String [] massiveOfSigns = {"+","-","*","/"};
String [] arabicNumbers = {"1","2","3","4","5","6","7","8","9","10"};
String [] roman = {"C","XC","L","XL","X","IX","V","IV","I"};
int [] arabic = {100,90,50,40,10,9,5,4,1};
int [] arabicNumbersInt = {1,2,3,4,5,6,7,8,9,10};
String [] romanNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
char[] charArray = example.toCharArray();
int numberOfSigns = 0;
String sign = null;
int numberOfRomanNumbers = 0;
int numberOfArabicNumbers = 0;
int result = 0;
int index = 0;
        for (int i = 0; i < charArray.length; i++ ) {
            for (int j = 0; j < massiveOfSigns.length; j++ ) {
                if (Character.toString(charArray[i]).equals(massiveOfSigns[j])) {
                    numberOfSigns = numberOfSigns + 1;
                    sign = Character.toString(charArray[i]);
                }
            }
            }
if (numberOfSigns !=1) {
    try {
        throw new IOException();
    } catch (IOException e) {
        System.out.println("throws Exception");
    }
} else {

    switch (sign) {

        case "+" :
            String[] massiveOfNumbers1 = example.split("\\+");
            for (int k = 0; k < massiveOfNumbers1.length; k++ ) {
                for (int l = 0; l < romanNumbers.length; l++) {
                    if (massiveOfNumbers1[k].equals(romanNumbers[l])) {
                        numberOfRomanNumbers = numberOfRomanNumbers + 1;
                    }
                }
                for (int m = 0; m < arabicNumbers.length; m++) {
                    if (massiveOfNumbers1[k].equals(arabicNumbers[m])) {
                        numberOfArabicNumbers = numberOfArabicNumbers + 1;
                    }
                }
            }
                if (numberOfArabicNumbers*numberOfRomanNumbers != 0 | (numberOfArabicNumbers+numberOfRomanNumbers) != 2) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                    }
                } else if (numberOfArabicNumbers != 0) {
                    int a = Integer.parseInt(massiveOfNumbers1[0]);
                    int b = Integer.parseInt(massiveOfNumbers1[1]);
                    result = a + b;
                    System.out.println(result);
                    } else {
                    int a = Integer.parseInt(Convert.valueOf(massiveOfNumbers1[0]).getConverting());
                    int b = Integer.parseInt(Convert.valueOf(massiveOfNumbers1[1]).getConverting());
                    result = a + b;
                    if (result >= 1) {
                        StringBuilder finalResult = new StringBuilder();
                        while (index < roman.length) {
                            while (result >= arabic[index]) {
                                int decade = result / arabic[index];
                                result = result % arabic[index];
                                for (int n = 0; n < decade; n++) {
                                    finalResult.append(roman[index]);
                                }
                            }
                            index++;
                        }
                        System.out.println(finalResult);
                    } else {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("throws Exception");
                        }
                    }
                }
            break;
        case "-" :
            String[] massiveOfNumbers2 = example.split("-");
            for (int o = 0; o < massiveOfNumbers2.length; o++ ) {
                for (int p = 0; p < romanNumbers.length; p++) {
                    if (massiveOfNumbers2[o].equals(romanNumbers[p])) {
                        numberOfRomanNumbers = numberOfRomanNumbers + 1;
                    }
                }
                for (int q = 0; q < arabicNumbers.length; q++) {
                    if (massiveOfNumbers2[o].equals(arabicNumbers[q])) {
                        numberOfArabicNumbers = numberOfArabicNumbers + 1;
                    }
                }
            }
            if (numberOfArabicNumbers*numberOfRomanNumbers != 0 | (numberOfArabicNumbers+numberOfRomanNumbers) != 2) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
            } else if (numberOfArabicNumbers != 0) {
                int a = Integer.parseInt(massiveOfNumbers2[0]);
                int b = Integer.parseInt(massiveOfNumbers2[1]);
                result = a - b;
                System.out.println(result);
            } else {
                int a = Integer.parseInt(Convert.valueOf(massiveOfNumbers2[0]).getConverting());
                int b = Integer.parseInt(Convert.valueOf(massiveOfNumbers2[1]).getConverting());
                result = a - b;
                if (result >= 1) {
                    StringBuilder finalResult = new StringBuilder();
                    while (index < roman.length) {
                        while (result >= arabic[index]) {
                            int decade = result / arabic[index];
                            result = result % arabic[index];
                            for (int r = 0; r < decade; r++) {
                                finalResult.append(roman[index]);
                            }
                        }
                        index++;
                    }
                    System.out.println(finalResult);
                } else {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                    }
                }
            }
            break;
        case "*" :
            String[] massiveOfNumbers3 = example.split("\\*");
            for (int s = 0; s < massiveOfNumbers3.length; s++ ) {
                for (int t = 0; t < romanNumbers.length; t++) {
                    if (massiveOfNumbers3[s].equals(romanNumbers[t])) {
                        numberOfRomanNumbers = numberOfRomanNumbers + 1;
                    }
                }
                for (int u = 0; u < arabicNumbers.length; u++) {
                    if (massiveOfNumbers3[s].equals(arabicNumbers[u])) {
                        numberOfArabicNumbers = numberOfArabicNumbers + 1;
                    }
                }
            }
            if (numberOfArabicNumbers*numberOfRomanNumbers != 0 | (numberOfArabicNumbers+numberOfRomanNumbers) != 2) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
            } else if (numberOfArabicNumbers != 0) {
                int a = Integer.parseInt(massiveOfNumbers3[0]);
                int b = Integer.parseInt(massiveOfNumbers3[1]);
                result = a * b;
                System.out.println(result);
            } else {
                int a = Integer.parseInt(Convert.valueOf(massiveOfNumbers3[0]).getConverting());
                int b = Integer.parseInt(Convert.valueOf(massiveOfNumbers3[1]).getConverting());
                result = a * b;
                if (result >= 1) {
                    StringBuilder finalResult = new StringBuilder();
                    while (index < roman.length) {
                        while (result >= arabic[index]) {
                            int decade = result / arabic[index];
                            result = result % arabic[index];
                            for (int v = 0; v < decade; v++) {
                                finalResult.append(roman[index]);
                            }
                        }
                        index++;
                    }
                    System.out.println(finalResult);
                } else {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                    }
                }
            }
            break;
        case "/" :
            String[] massiveOfNumbers4 = example.split("/");
            for (int w = 0; w < massiveOfNumbers4.length; w++ ) {
                for (int x = 0; x < romanNumbers.length; x++) {
                    if (massiveOfNumbers4[w].equals(romanNumbers[x])) {
                        numberOfRomanNumbers = numberOfRomanNumbers + 1;
                    }
                }
                for (int y = 0; y < arabicNumbers.length; y++) {
                    if (massiveOfNumbers4[w].equals(arabicNumbers[y])) {
                        numberOfArabicNumbers = numberOfArabicNumbers + 1;
                    }
                }
            }
            if (numberOfArabicNumbers*numberOfRomanNumbers != 0 | (numberOfArabicNumbers+numberOfRomanNumbers) != 2) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
            } else if (numberOfArabicNumbers != 0) {
                int a = Integer.parseInt(massiveOfNumbers4[0]);
                int b = Integer.parseInt(massiveOfNumbers4[1]);
                result = a / b;
                System.out.println(result);
            } else {
                int a = Integer.parseInt(Convert.valueOf(massiveOfNumbers4[0]).getConverting());
                int b = Integer.parseInt(Convert.valueOf(massiveOfNumbers4[1]).getConverting());
                result = a / b;
                if (result >= 1) {
                    StringBuilder finalResult = new StringBuilder();
                    while (index < roman.length) {
                        while (result >= arabic[index]) {
                            int decade = result / arabic[index];
                            result = result % arabic[index];
                            for (int z = 0; z < decade; z++) {
                                finalResult.append(roman[index]);
                            }
                        }
                        index++;
                    }
                    System.out.println(finalResult);
                } else {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                    }
                }
            }
            break;
    }
    }
    }
}