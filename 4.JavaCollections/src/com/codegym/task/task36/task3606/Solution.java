package com.codegym.task.task36.task3606;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* 
Mastering ClassLoader and Reflection

*/

public class Solution {
    private List<Class> hiddenClasses = new ArrayList<>();
    private String packageName;

    public Solution(String packageName) {
        this.packageName = packageName;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Solution solution = new Solution(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "com/codegym/task/task36/task3606/data/second");
        solution.scanFileSystem();
        System.out.println(solution.getHiddenClassObjectByKey("secondhiddenclassimpl"));
        System.out.println(solution.getHiddenClassObjectByKey("firsthiddenclassimpl"));
        System.out.println(solution.getHiddenClassObjectByKey("packa"));
    }

    public void scanFileSystem() throws ClassNotFoundException {
        File[] files = new File(packageName).listFiles();
        CustomClassLoader classLoader = new CustomClassLoader();
        for (File file : files) {
            Class<?> load = classLoader.load(file.toPath());
            if(load!=null)
                hiddenClasses.add(load);
        }
    }

    public HiddenClass getHiddenClassObjectByKey(String key) {
        for (Class<?> hiddenClass : hiddenClasses) {
            if(hiddenClass.getSimpleName().toLowerCase().startsWith(key.toLowerCase())){
                try {
                    Constructor<?>[] declaredConstructors = hiddenClass.getDeclaredConstructors();
                    for (Constructor<?> declaredConstructor : declaredConstructors) {
                        if(declaredConstructor.getParameterTypes().length == 0){
                            declaredConstructor.setAccessible(true);
                            return (HiddenClass) declaredConstructor.newInstance(null);
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static class CustomClassLoader extends ClassLoader {

        public Class<?> load(Path path) {
            if (path.getFileName().toString().lastIndexOf(".class") == -1) {
                return null;
            }
            try {
                byte[] bytes = Files.readAllBytes(path);
                return defineClass(null, bytes, 0, bytes.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
