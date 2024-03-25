package udesc.eso.socketClient.view.viewStrategy;

import java.util.Arrays;
import java.util.Map;

public class MagoRequestStrategy implements RequestStrategyProtocol {
    @Override
    public String buildRequest(String operation, Map<String, String> attributes) {
        StringBuilder builder = new StringBuilder();
        builder.append(operation).append(";").append("Mago");
        if(Arrays.asList("Get", "Delete").contains(operation)) {
            builder.append(";cpf=").append(attributes.get("cpf"));
        } else {
            builder.append(";cpf=").append(attributes.get("cpf"))
                    .append(";nome=").append(attributes.get("nome"))
                    .append(";endereco=").append(attributes.get("endereco"))
                    .append(";idade=").append(attributes.get("idade"))
                    .append(";magia=").append(attributes.get("magia"))
                    .append(";elemento=").append(attributes.get("elemento"))
                    .append(";chapeu=").append(attributes.get("chapeu"));
        }
        return builder.toString();
    }
}
