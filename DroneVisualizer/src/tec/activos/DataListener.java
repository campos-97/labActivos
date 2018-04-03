package tec.activos;

import java.awt.image.BufferedImage;

public interface DataListener {
    public void onDirty(BufferedImage bufferedImage);
}