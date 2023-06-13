import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> HumanList = new ArrayList<>();
        HumanList.add(new Human("Ichiro", 31));
        HumanList.add(new Human("Jiro", 22));
        HumanList.add(new Human("Saburo", 23));

        for (Human human : HumanList) {
            if (human.getName().equals("Ichiro")) {
                System.out.println("名前" + human.getName());
                System.out.println("年齢" + human.getAge());
            }
        }

    }
}