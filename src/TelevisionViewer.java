
public class TelevisionViewer {

    public static void main(String[] args) {

        Television tv = new Television();

        int[] channelsPerDay = {3, 4, 6, 4, 6, 4, 6, 4, 6, 4};

        for (int day = 1; day <= 10; day++) {

            System.out.println("Woke up, day " + day);

            tv.setOn(true);

            for (int i = 0; i < channelsPerDay[day - 1]; i++) {
                System.out.println("Watching channel " + tv.getChannel());
                tv.nextChannel();
            }

            tv.setOn(false);

            System.out.println("Falling asleep");
        }
    }
}
