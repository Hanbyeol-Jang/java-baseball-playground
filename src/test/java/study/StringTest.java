package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    @DisplayName("[TEST] replace")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /* Req.1 */
    @Test
    @DisplayName("[TEST] split")
    void split() {
        String s = "1,2";
        String[] arr = s.split(",");

        assertThat(arr).contains("1");
        assertThat(arr).containsExactly("1");
    }

    /* Req.2 */
    @Test
    @DisplayName("[TEST] substring")
    void substring() {
        String s = "(1,2)";
        String sub = s.substring(1, s.length() - 1);

        assertThat(sub).isEqualTo("1,2");
    }

}
