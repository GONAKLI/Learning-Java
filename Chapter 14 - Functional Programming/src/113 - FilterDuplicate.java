
import java.util.List;


class FilterDuplicate {
    static void main() {
        List<Integer> numList = List.of(9,0,3,4,7,7,1,5,9,4,1);
        System.out.println("welcome to filteration Of Duplicate");
        System.out.println("Before filtration: " + numList);

        List<Integer> nums = numList.stream().distinct().toList();

        System.out.println("After filtration: " +nums);
    }
}
