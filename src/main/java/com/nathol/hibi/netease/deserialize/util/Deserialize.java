package com.nathol.hibi.netease.deserialize.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;

@SuppressWarnings("unused")
public class Deserialize {
    private static final Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();

    public static <T> T deserialize(String json, Class<T> classOfT){
        return gson.fromJson(json, classOfT);
    }
    public static <T> T deserialize(JsonElement jsonElement, Class<T> classOfT){
        return gson.fromJson(jsonElement, classOfT);
    }
    public static <T> T deserialize(Reader reader, Class<T> classOfT){
        return gson.fromJson(reader, classOfT);
    }

    public static <T> T deserialize(String json, TypeToken<T> typeOfT){
        return gson.fromJson(json, typeOfT);
    }
    public static <T> T deserialize(JsonElement jsonElement, TypeToken<T> typeOfT){
        return gson.fromJson(jsonElement, typeOfT);
    }
    public static <T> T deserialize(Reader reader, TypeToken<T> typeOfT){
        return gson.fromJson(reader, typeOfT);
    }

    public static String prettyPrinting(String json){
        return gson.toJson(json);
    }
}
