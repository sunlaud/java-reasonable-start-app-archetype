package $groupId;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void someTest() {
        //GIVEN
        App sut = new App();

        //WHEN
        String uncamelized = sut.uncamelize("someFooBar");

        //THEN
        assertThat(uncamelized).isEqualTo("some foo bar");
    }
}
