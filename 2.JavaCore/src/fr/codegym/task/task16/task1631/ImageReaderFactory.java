package fr.codegym.task.task16.task1631;

import fr.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){
        if(ImageTypes.JPG == imageTypes){
            return new JpgReader();
        }else if(ImageTypes.PNG == imageTypes){
            return new PngReader();
        }else if(ImageTypes.BMP == imageTypes){
            return new BmpReader();
        }else {
            throw new IllegalArgumentException("Type d'image inconnu");
        }

    }
}
