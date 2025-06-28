import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Mock the external API
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into the service
        MyService service = new MyService(mockApi);

        // Step 4: Call method and assert
        String result = service.fetchData();

        // Step 5: Verify result
        assertEquals("Mock Data", result);
    }
}
