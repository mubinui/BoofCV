import boofcv.gui.BoofSwingUtil;
import boofcv.gui.image.ShowImages;
import boofcv.io.image.UtilImageIO;

import java.awt.image.BufferedImage;
import java.io.File;

public class ImageLoader {
    public static void main(String[] args) {
        File file = BoofSwingUtil.fileChooser("Bottle",null,true,".",null,BoofSwingUtil.FileTypes.IMAGES);
        if (file==null){
            System.out.println("Use Cancelled");
            return;
        }
        BufferedImage image = UtilImageIO.loadImage(file.getAbsolutePath());
        ShowImages.showWindow(image,"Open Image Example", true);
    }
}
