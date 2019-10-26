package gliby.gaal;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.Manifest;

public class GAALCommonHandler {

    private static final GAALCommonHandler INSTANCE = new GAALCommonHandler();

    public GAALCommonHandler() {

    }

    public static GAALCommonHandler instance() {
        return INSTANCE;
    }

    public GAALMod loadMod() {
        Manifest manifest = getManifest();
        if (manifest != null) {
            System.out.println("manifest main: " + manifest);

            String className = "";
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
        }

        return null;
    }

    Manifest getManifest() {
        URLClassLoader cl = (URLClassLoader) getClass().getClassLoader();
        try {
            URL url = cl.findResource("META-INF/MANIFEST.MF");
            Manifest manifest = new Manifest(url.openStream());
            return manifest;
        } catch (IOException E) {
        }
        return null;
    }
}
