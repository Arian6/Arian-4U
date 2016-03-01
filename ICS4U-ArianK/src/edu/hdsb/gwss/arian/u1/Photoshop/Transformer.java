/*
 * ICS4U.2015.16.S2
 */
package edu.hdsb.gwss.arian.u1.Photoshop;

import becker.xtras.imageTransformation.ITransformations;

import java.util.ArrayList;

public class Transformer extends Object implements ITransformations {

    public static final int MIN_NUM_TRANS = 11;
    public static final String DARKEN = "Darken";
    public static final String BRIGHTEN = "Brighten";
    public static final String INVERT = "Invert";
    public static final String FLIPX = "Flip X";
    public static final String FLIPY = "Flip Y";
    public static final String ROTATE = "Rotate";
    public static final String SCALE50 = "Scale 50%";
    public static final String MIRROR = "Mirror";
    public static final String BLUR = "Blur";
    public static final String UNDO = "Undo";
    public static final String RESET = "Reset";

    private String[] transformations = new String[MIN_NUM_TRANS];

    private int[][] pictureOriginal;
    private int[][] picture;

    static ArrayList<int[][]> allEdits = new ArrayList<int[][]>();

    /**
     * Construct a Transformer object by setting the possible transformations
     * available.
     */
    public Transformer() {
        super();
        this.transformations[0] = DARKEN;
        this.transformations[1] = BRIGHTEN;
        this.transformations[2] = INVERT;
        this.transformations[3] = FLIPX;
        this.transformations[4] = FLIPY;
        this.transformations[5] = ROTATE;
        this.transformations[6] = SCALE50;
        this.transformations[7] = MIRROR;
        this.transformations[8] = BLUR;
        this.transformations[9] = UNDO;
        this.transformations[10] = RESET;
    }

    /**
     * Construct a Transformer object by setting the possible transformations
     * available and initializing the state of the image.
     *
     * @param originalPic A 2-D array representing a grey scale image. The array
     * contains values from 0 - 255.
     */
    public Transformer(int[][] originalPic) {
        this();
        this.setPixels(originalPic);

    }

    /**
     * Get the image that was transformed.
     *
     * @return The pixels representing the image.
     */
    public int[][] getPixels() {
        return this.picture;
    }

    /**
     * Set the image to be transformed to a new set of pixels.
     *
     * @param newPix The new image to be used for subsequent transformations.
     */
    public void setPixels(int[][] newPix) {
        this.pictureOriginal = newPix;
        this.picture = this.copyArray(newPix);

    }

    /**
     * A array filled with the names of the transformations implemented by this
     * class.
     *
     * @return The array of transformation names.
     */
    public String[] getTransformationNames() {
        return transformations;
    }

    public static void display(int[][] twoDArray) {
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                if (twoDArray[row][col] == 0) {
                    System.out.print(" .");
                } else {
                    System.out.print(" O");
                }
            }
            System.out.println("");
        }
    }

    /**
     * Perform the transformation indicated.
     *
     * @param transformationName The name of the transformation to perform. Must
     * be one of the transformation names returned by {@link #getTransformationNames
     * getTransformationNames}.
     */
    public void performTransformation(String transformationName) {

        if (DARKEN.equals(transformationName)) {
            this.picture = changeIntensity(-10, this.picture);
        } else if (BRIGHTEN.equals(transformationName)) {
            this.picture = changeIntensity(10, this.picture);
        } else if (INVERT.equals(transformationName)) {
            this.picture = invert(this.picture);
        } else if (FLIPX.equals(transformationName)) {
            this.picture = flipX(this.picture);
        } else if (FLIPY.equals(transformationName)) {
            this.picture = flipY(this.picture);
        } else if (ROTATE.equals(transformationName)) {
            this.picture = rotate(this.picture);
        } else if (MIRROR.equals(transformationName)) {
            this.picture = mirror(this.picture);
        } else if (SCALE50.equals(transformationName)) {
            this.picture = scale50(this.picture);
        } else if (BLUR.equals(transformationName)) {
            this.picture = blur(this.picture);
        } else if (RESET.equals(transformationName)) {
            this.picture = this.reset(this.picture);
        } else if (UNDO.equals(transformationName)) {
            this.picture = this.undo();
        } else {
            throw new Error("Invalid transformation requested.");
        }
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] copyArray(int[][] sourcePixels) {

        allEdits.add(pictureOriginal);

        return sourcePixels;

    }

    private int[][] reset(int[][] sourcePixels) {

        this.picture.equals(allEdits.get(0));

        return allEdits.get(0);
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] undo() {

        if (allEdits.size() > 1) {
            this.picture.equals(allEdits.get(allEdits.size() - 1));

            allEdits.remove(allEdits.size() - 1);
        }

        return allEdits.get(allEdits.size() - 1);
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] changeIntensity(double percent, int[][] sourcePixels) {
        // TO DO

        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length];
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length; row++) {

            for (int pass = 0; pass < temporaryArray[row].length - 1; pass++) {

                if (temporaryArray[row][pass] + (int) percent > 255) {
                    temporaryArray[row][pass] = 255;

                } else if (temporaryArray[row][pass] + (int) percent < 0) {
                    temporaryArray[row][pass] = 0;
                } else {
                    temporaryArray[row][pass] = temporaryArray[row][pass] + (int) percent;
                }

            }

        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;

    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] invert(int[][] sourcePixels) {
        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length];
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length; row++) {

            for (int pass = 0; pass < temporaryArray[row].length - 1; pass++) {

                temporaryArray[row][pass] = 255 - temporaryArray[row][pass];

            }
        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] flipX(int[][] sourcePixels) {
        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length];
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length - row; row++) {
            for (int pass = 0; pass < temporaryArray[row].length; pass++) {

                int swap = temporaryArray[row][pass];

                temporaryArray[row][pass] = temporaryArray[temporaryArray.length - (row + 1)][pass];
                temporaryArray[temporaryArray.length - (row + 1)][pass] = swap;
            }
        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;

    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] flipY(int[][] sourcePixels) {
        // TO DO
        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length];
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length; row++) {
            for (int pass = 0; pass < temporaryArray[row].length - pass; pass++) {

                int swap = temporaryArray[row][pass];

                temporaryArray[row][pass] = temporaryArray[row][temporaryArray[row].length - (pass + 1)];
                temporaryArray[row][temporaryArray[row].length - (pass + 1)] = swap;

            }
        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] rotate(int[][] sourcePixels) {
        // TO DO

        int[][] temporaryArray = new int[sourcePixels[0].length][sourcePixels.length];

        fillNewArrayWithOldArrayRotation(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length; row++) {
            for (int pass = 0; pass < temporaryArray[row].length - pass; pass++) {

                int swap = temporaryArray[row][pass];

                temporaryArray[row][pass] = temporaryArray[row][temporaryArray[row].length - (pass + 1)];
                temporaryArray[row][temporaryArray[row].length - (pass + 1)] = swap;

            }
        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;
        return sourcePixels;

    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] mirror(int[][] sourcePixels) {
        // TO DO
        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length * 2];
        int count = 0;
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);

        for (int row = 0; row < temporaryArray.length; row++) {

            for (int pass = temporaryArray[row].length - 1; pass > temporaryArray[row].length / 2; pass--) {

                temporaryArray[row][pass] = sourcePixels[row][count];
                count = count + 1;
            }
            count = 0;

        }

        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;

    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] scale50(int[][] sourcePixels) {
        // TO DO

        int[][] temporaryArray = new int[sourcePixels.length / 2][sourcePixels[0].length / 2];
        int count2 = 1;

        for (int row = 0; row < temporaryArray.length; row++) {

            int count = 1;

            for (int pass = 0; pass < temporaryArray[row].length - 1; pass++) {

                temporaryArray[row][pass] = sourcePixels[count2][count];

                count = count + 2;
            }
            count2 = count2 + 2;

        }
        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;

        return sourcePixels;
    }

    /**
     * TODO: ICS4U - TODO
     */
    private int[][] blur(int[][] sourcePixels) {

        int[][] temporaryArray = new int[sourcePixels.length][sourcePixels[0].length];
        fillNewArrayWithOldArray(temporaryArray, sourcePixels);
        int lmao = 0;

        for (int row = 1; row < temporaryArray.length - 1; row++) {
            for (int pass = 1; pass < temporaryArray[row].length - 1; pass++) {

                lmao = (temporaryArray[row - 1][pass - 1] + temporaryArray[row - 1][pass] + temporaryArray[row - 1][pass + 1] + temporaryArray[row][pass - 1] + temporaryArray[row][pass] + temporaryArray[row][pass + 1] + temporaryArray[row + 1][pass - 1] + temporaryArray[row + 1][pass] + temporaryArray[row][pass + 1]) / 9;

                temporaryArray[row][pass] = lmao;

            }
        }

        allEdits.add(temporaryArray);
        sourcePixels = temporaryArray;
        return sourcePixels;

    }

    private int[][] fillNewArrayWithOldArray(int[][] temporaryArray, int[][] sourcePixels) {

        for (int row = 0; row < sourcePixels.length; row++) {
            for (int pass = 0; pass < sourcePixels[row].length; pass++) {

                temporaryArray[row][pass] = sourcePixels[row][pass];
            }
        }

        return temporaryArray;
    }

    private int[][] fillNewArrayWithOldArrayRotation(int[][] temporaryArray, int[][] sourcePixels) {

        for (int row = 0; row < temporaryArray.length; row++) {
            for (int pass = 0; pass < temporaryArray[row].length; pass++) {

                temporaryArray[row][pass] = sourcePixels[pass][row];

            }

        }
        return temporaryArray;
    }

    /**
     * TODO: ICS4U - TODO
     */
    public static void main(String[] args) {

        int[][] myPicture = new int[4][15];

        myPicture[0][0] = 1;
        myPicture[1][1] = 1;
        myPicture[2][2] = 1;
        myPicture[3][3] = 1;
        myPicture[2][4] = 1;
        myPicture[1][5] = 1;
        myPicture[2][6] = 1;
        myPicture[3][7] = 1;
        myPicture[2][8] = 1;
        myPicture[1][9] = 1;
        myPicture[0][10] = 1;

//       Construct the test object
        Transformer test = new Transformer(myPicture);

//       Display Original Image
        System.out.println("Original\n");
        display(myPicture);

//       Test flip on X-axis
        System.out.println("\nFlipped on the X axis.\n");
        test.performTransformation(FLIPX);
        display(test.getPixels());

//       Test flip on Y-axis
        System.out.println("\nFlipped on the Y axis.\n");
        test.performTransformation(FLIPY);
        display(test.getPixels());

//       Test Rotate 90 degrees
        System.out.println("\nRotated 90 degrees.\n");
        test.performTransformation(ROTATE);
        display(test.getPixels());

//       Test Rotate Scale 50%
        System.out.println("\nScaled 50%.\n");
        test.performTransformation(SCALE50);
        display(test.getPixels());

//       Test Mirror Image
        System.out.println("\nMirror image.\n");
        test.performTransformation(MIRROR);
        display(test.getPixels());

//       Test Reset
        System.out.println("\nReset image.\n");
        test.performTransformation(RESET);
        display(test.getPixels());

    }

}
