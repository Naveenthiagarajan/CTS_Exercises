import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class DataServiceTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi api = mock(ExternalApi.class);

        DataService service = new DataService(api);

        service.process();

        verify(api).sendData("Hello");
    }
}