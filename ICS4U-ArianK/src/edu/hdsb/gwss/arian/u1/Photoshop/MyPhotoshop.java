package edu.hdsb.gwss.arian.u1.Photoshop;

import becker.xtras.imageTransformation.ITransformations;
import becker.xtras.imageTransformation.ImageTransformerGUI;

public class MyPhotoshop extends Object {

    public static void main(String args[]) {
        ITransformations trans = new Transformer();
        ImageTransformerGUI theGUI = new ImageTransformerGUI(trans);
    }
}
