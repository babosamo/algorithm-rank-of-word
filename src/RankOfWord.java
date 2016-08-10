import java.util.*;

/**
 * Created by babosamo on 2016. 8. 10..
 */
public class RankOfWord {

    String word;

    public RankOfWord(String word) {
        this.word = word;
    }

    public int getRank(){
        return getRank(word);
    }

    public int getRank(String word){

        System.out.println(" --- input ---- " + word);
        int rank = 0;
        char[] chars = word.toCharArray();

        Hashtable frequency = getFrequency(word);
        Set keys = frequency.keySet();
        frequency.keys();
        Iterator iterator = keys.iterator();
        while(iterator.hasNext()){
            char key = (Character) iterator.next();
            if( key < chars[0]){
                int count = (int)frequency.get(key);
                frequency.put(key, count -1);
                rank += permutationCount(frequency);
                frequency.put(key, count);
            }
        }

        System.out.println(word + " rank " + rank);
        if(word.length() > 1) {
            rank += getRank(word.substring(1, word.length()));
        }

        return rank;
    }


    //서로 다른 n개에서 r개를 뽑아 일렬로 배열하는 방법. 그 방법은 nPr가지이다. 서로 다른 n개의 한 순열을 다른 순열로 바꿀 때, 즉 순열 a1, …, an을 다른 순열 b1, b2, …, bn으로 바꾸는 경우 ｜a1, a2, …, an｜, ｜b1, b2, …, bn｜으로 나타내고 치환이라고 한다.
    //[네이버 지식백과] 순열 [permutation, 順列] (IT용어사전, 한국정보통신기술협회)

    private int permutationCount(Hashtable frequencyTable){
        int count = 0;
        int divider = 1;
        int size = 0;

        ArrayList<Integer> frequency= new ArrayList<>(frequencyTable .values());
        for(int value : frequency){
            if(value > 0) {
                size += value;
                divider *= getFactorial(value);
            }
        }

        count = getFactorial(size) / divider;

        System.out.println(frequencyTable + ", permutationCount: " + count);
        return count;
    }

    private int getFactorial(int n){
        int total = 1;
        for(int i = n ; i > 1; i--){
            total *= i;
        }
        return total;
    }

    private Hashtable getFrequency(String str){
        Hashtable<Character, Integer> hashTable = new Hashtable<>();

        char[] chars = str.toCharArray();

        for(char key: chars){
            if(hashTable.containsKey(key)){
                int value = hashTable.get(key);
                hashTable.remove(key);
                hashTable.put(key, value + 1);
            }else{
                hashTable.put(key, 1);
            }
        }

        return hashTable;
    }
}
