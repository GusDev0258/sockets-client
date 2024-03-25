package udesc.eso.socketClient.view.viewStrategy;

import java.util.Arrays;
import java.util.Map;

public class GuerreiroStrategy implements RequestStrategyProtocol {
    @Override
    public String buildRequest(String operation, Map<String, String> attributes) {
        StringBuilder builder = new StringBuilder();
        builder.append(operation).append(";").append("Guerreiro");
        if(Arrays.asList("Get", "Delete").contains(operation)) {
            builder.append(";cpf=").append(attributes.get("cpf"));
        } else {
            builder.append(";cpf=").append(attributes.get("cpf"))
                    .append(";nome=").append(attributes.get("nome"))
                    .append(";endereco=").append(attributes.get("endereco"))
                    .append(";idade=").append(attributes.get("idade"))
                    .append(";arma=").append(attributes.get("arma"))
                    .append(";escudo=").append(attributes.get("escudo"));
        }
        return builder.toString();
    }
}
