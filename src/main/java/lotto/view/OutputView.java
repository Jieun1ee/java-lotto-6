package lotto.view;

import java.util.List;
import lotto.domain.Lotto;

public class OutputView {
    private static final String LOTTO_COUNT = "개를 구매했습니다.";
    private static final String PROFITRATE = "총 수익률은 %.1f%%입니다.";

    public static void printLottoCount(int lottoCount) {
        System.out.println();
        System.out.println(lottoCount + LOTTO_COUNT);
    }

    public static void printLottos(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
        System.out.println();
    }
}
