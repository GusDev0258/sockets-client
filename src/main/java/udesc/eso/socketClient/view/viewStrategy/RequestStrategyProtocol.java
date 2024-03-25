package udesc.eso.socketClient.view.viewStrategy;

import java.util.Map;

public interface RequestStrategyProtocol {
    String buildRequest(String operation, Map<String, String> attributes);
}
