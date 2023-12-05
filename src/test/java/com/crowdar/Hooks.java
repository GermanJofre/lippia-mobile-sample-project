package com.crowdar;

import com.crowdar.core.PropertyManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import java.io.IOException;
import java.util.List;

public class Hooks {
    private static final ClockifyAPI api = new ClockifyAPI(PropertyManager.getProperty("apiKey"));

    @After(order = Integer.MAX_VALUE)
    public void afterScenario(Scenario scenario) {
        if (scenario.getName().equals("El cliente ingresa fecha")) {
            try {
                List<Workspace[]> workspaces = api.traerWorkspaces();

                for (Workspace[] workspace : workspaces) {
                    String workspaceId = workspace[0].getId();

                    List<Usuario> usuario = api.traerUsuario(workspaceId);

                    for (Usuario usuarios : usuario) {
                        String usuarioId = usuarios.getId();

                        List<EntradaHoraria> entradaHoraria = api.traerEntradaHoraria(workspaceId, usuarioId);

                        for (EntradaHoraria entradasHorarias : entradaHoraria) {
                            String entradasHorariaId = entradasHorarias.getId();

                            api.eliminarEntradaHoraria(workspaceId, entradasHorariaId);
                        }
                    }
                }
                    } catch (IOException e) {
                    throw new RuntimeException(e);
            }
        }
    }
}
