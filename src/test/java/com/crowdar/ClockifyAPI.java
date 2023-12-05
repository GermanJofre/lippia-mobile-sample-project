package com.crowdar;

import com.google.gson.Gson;
import okhttp3.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ClockifyAPI {
    private final String apiKey;
    private final OkHttpClient httpClient;

    public ClockifyAPI(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = new OkHttpClient();
    }

    public List<Workspace[]> traerWorkspaces() throws IOException {
        Request request = new Request.Builder()
                .url("https://api.clockify.me/api/v1/workspaces")
                .addHeader("X-Api-Key", apiKey)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error response code: " + response);
            }

            Gson gson = new Gson();
            Workspace[] workspaces = gson.fromJson(response.body().string(), Workspace[].class);

            List<Workspace[]> workspaceList = new ArrayList<>();
            workspaceList.add(workspaces);
            return workspaceList;
        }
    }

    public List<Usuario> traerUsuario(String workspaceId) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.clockify.me/api/v1/workspaces/" + workspaceId + "/users")
                .addHeader("X-Api-Key", apiKey)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error response code: " + response);
            }

            Gson gson = new Gson();
            Usuario[] usuario = gson.fromJson(response.body().string(), Usuario[].class);
            return List.of(usuario);
        }
    }

    public List<EntradaHoraria> traerEntradaHoraria(String workspaceId, String usuarioId) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.clockify.me/api/v1/workspaces/" + workspaceId + "/user/" + usuarioId + "/time-entries")
                .addHeader("X-Api-Key", apiKey)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error response code: " + response);
            }

            Gson gson = new Gson();
            EntradaHoraria[] entradaHoraria = gson.fromJson(response.body().string(), EntradaHoraria[].class);
            return List.of(entradaHoraria);
        }
    }

    public void eliminarEntradaHoraria(String workspaceId,String entradasHorariaId) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.clockify.me/api/v1/workspaces/" + workspaceId + "/time-entries/" + entradasHorariaId)
                .addHeader("X-Api-Key", apiKey)
                .delete()
                .build();

        System.out.println("request = " + request);

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error response code: " + response);
            }
        }
    }
}
