import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Sanity check for the repository setup. If this test passes, JUnit and
 * Mockito are correctly configured and the repository was cloned correctly.
 */
class RepositorySetupTest {

    @Test
    void junitIsWorking() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void mockitoIsWorking() {
        List<String> mockedList = Mockito.mock(List.class);
        when(mockedList.get(0)).thenReturn("hello");

        assertEquals("hello", mockedList.get(0));
        verify(mockedList).get(0);
    }
}
