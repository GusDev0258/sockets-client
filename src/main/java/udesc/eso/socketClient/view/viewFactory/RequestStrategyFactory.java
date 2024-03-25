package udesc.eso.socketClient.view.viewFactory;

import udesc.eso.socketClient.view.viewStrategy.GuerreiroStrategy;
import udesc.eso.socketClient.view.viewStrategy.GuildaRequestStrategy;
import udesc.eso.socketClient.view.viewStrategy.MagoRequestStrategy;
import udesc.eso.socketClient.view.viewStrategy.RequestStrategyProtocol;

public class RequestStrategyFactory {
    public static RequestStrategyProtocol makeStrategy(String entityType) {
        return switch (entityType) {
            case "Guilda" -> new GuildaRequestStrategy();
            case "Mago" -> new MagoRequestStrategy();
            case "Guerreiro" -> new GuerreiroStrategy();
            default -> throw new IllegalArgumentException("Entidade desconhecida: " + entityType);
        };
    }
}
