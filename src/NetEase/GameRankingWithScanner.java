package NetEase;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 就是输入五组数据，每一组都是从大到小排列好的
 *
 * 让你找到这五组数据中最大的五个数，
 *
 *
 * 建立堆！！！
 * 小根堆
 */
public class GameRankingWithScanner {
    public static double[] topFiveRanking(double[][] sectWinRates) {
        // 最小堆，堆顶是当前堆中最小的元素
        PriorityQueue<Double> minHeap = new PriorityQueue<>(5);
        for (double[] sect : sectWinRates) {
            for (double winRate : sect) {
                minHeap.offer(winRate);
                if (minHeap.size() > 5) {
                    minHeap.poll();
                }
            }
        }
        double[] result = new double[5];
        for (int i = 4; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sectCount = 5;
        int playerCount = 5;
        double[][] sectWinRates = new double[sectCount][playerCount];

        // 从键盘输入每个门派的前 5 名玩家胜率
        for (int i = 0; i < sectCount; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个门派的前 5 名玩家胜率（用空格分隔）：");
            for (int j = 0; j < playerCount; j++) {
                sectWinRates[i][j] = scanner.nextDouble();
            }
        }

        double[] topFive = topFiveRanking(sectWinRates);
        System.out.println("所有门派合计的前 5 排名为：");
        for (double rate : topFive) {
            if (rate == (int) rate) {
                System.out.print((int) rate + " ");
            } else {
                System.out.print(rate + " ");
            }
        }
        scanner.close();
    }
}
