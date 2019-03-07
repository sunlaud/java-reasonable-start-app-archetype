package $groupId;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void someTest() {
        //GIVEN
        String src = "someFooBar";

        //WHEN
        String uncamelized = App.uncamelize(src);

        //THEN
        assertThat(uncamelized).isEqualTo("some foo bar");
    }
}
