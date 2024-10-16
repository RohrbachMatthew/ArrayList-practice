/*
!!!!!!!!!!!! ADD COMMENTS !!!!!!!!!!!

---add to the lists, change index on new numbers


 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(28);
        numbers.add(42);
        numbers.add(32);
        numbers.add(19);
        numbers.add(27);
        numbers.add(49);
        numbers.add(43);
        numbers.add(38);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(5);
        numbers2.add(4);
        numbers2.add(3);

        findOddNumbers findOdds = new findOddNumbers();
        findEvenNumbers findEvens = new findEvenNumbers();
        deleteDuplicates delDups = new deleteDuplicates();

        System.out.println("Original lists:\n" + "List1: " + numbers + "  Length: " + numbers.size());
        System.out.println("List2: " + numbers2 + "  Length: " + numbers2.size() + "\n");

        System.out.print("Updated list without duplicates: ");
        delDups.printRemovedDuplicates(numbers2);
        System.out.println();

        System.out.println("List 1 Even/Odd:");
        findOdds.printOddNumbers(numbers);
        System.out.println();
        findEvens.printEvenNumbers(numbers);
        System.out.println();


        System.out.println("\nList 2 Even/Odd:");
        findOdds.printOddNumbers(numbers2);
        System.out.println();
        findEvens.printEvenNumbers(numbers2);
        System.out.println();


    }
}

class findOddNumbers {
    public void printOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>(numbers);
        for (int i = 0; i < oddNumbers.size(); i++) {
            if (oddNumbers.get(i) % 2 == 0) {
                oddNumbers.remove(oddNumbers.get(i));
                i--;
            }
        }
        System.out.print("Odd: " + oddNumbers + " Length: " + oddNumbers.size());

    }
}

class findEvenNumbers{
    public void printEvenNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>(numbers);
        for(int i=0; i < evenNumbers.size(); i++){
            if(evenNumbers.get(i) % 2 != 0){
                evenNumbers.remove(evenNumbers.get(i));
                i--;
            }

        }
        System.out.print("Even: " + evenNumbers + " Length: " + evenNumbers.size());
    }
}

class deleteDuplicates{
    public void printRemovedDuplicates(ArrayList<Integer> numbers){
        ArrayList<Integer> duplicates = new ArrayList<>(numbers);
        for(int i = 0; i < numbers.size(); i++){
            for(int d=i+1; d < duplicates.size(); d++) {
                if (duplicates.get(i).equals(duplicates.get(d))) {
                    duplicates.remove(d);
                    d--;

                }
            }
        } System.out.println(duplicates);
    }
}