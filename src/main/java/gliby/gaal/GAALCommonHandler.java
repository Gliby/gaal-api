package gliby.gaal;

import java.io.File;

public class GAALCommonHandler {

    private static final GAALCommonHandler INSTANCE = new GAALCommonHandler();

    public GAALCommonHandler() {

    }

    public static GAALCommonHandler instance() {
        return INSTANCE;
    }

    public GAALMod loadMod() {
        String className = "gliby.gaal.dummymod.DummyMod";
        try {
            Class<?> clazz = Class.forName(className);
            if (clazz != null) {
                Object modContainer = clazz.newInstance();
                GAALMod gaalMod = clazz.getAnnotation(GAALMod.class);
                return gaalMod;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
