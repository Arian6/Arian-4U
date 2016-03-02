/* Name: MyPhotoshop
 * Version: v1
 * Date: March 1 2016
 * Author: Arian Krasniqi
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

    static ArrayList<int[][]> allTransformations = new ArrayList<int[][]>();

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
     * Set arrayList value 0 to store the original picture
     */
    private int[][] copyArray(int[][] sourcePixels) {

        allTransformations.add(pictureOriginal);

        return sourcePixels;

    }

    /**
     * reset image to picture original an remove all stored edits
     */
    private int[][] reset(int[][] sourcePixels) {

        //set picture back to original
        this.picture.equals(allTransformations.get(0));

        //loop through array list
        for (int arrayListIndex = allTransformations.size() - 1; arrayListIndex > 1; arrayListIndex--) {

            // remove all stored versions
            allTransformations.remove(arrayListIndex);

        }

        //return original array
        return allTransformations.get(0);
    }

    /**
     * Visit previously store this.picture in the array list
     */
    private int[][] undo() {

        //as long as there is more than 1 stored
        if (allTransformations.size() > 1) {
            //set picture to previously edited
            this.picture.equals(allTransformations.get(allTransformations.size() - 1));
            //remove edit just made
            allTransformations.remove(allTransformations.size() - 1);
        }
        //return previous image
        return allTransformations.get(allTransformations.size() - 1);
    }

    /**
     * decrease or increase color values by increments of 10
     */
    private int[][] changeIntensity(double intensityIncrement, int[][] sourcePixels) {

        //initialize new storage array
        int[][] transformationArray = new int[sourcePixels.length][sourcePixels[0].length];
        //copy current SourcePixels into new array
        fillNewArrayWithOldArray(transformationArray, sourcePixels);

        //Loop throug han change each colour value
        for (int row = 0; row < transformationArray.length; row++) {

            for (int column = 0; column < transformationArray[row].length - 1; column++) {

                if (transformationArray[row][column] + (int) intensityIncrement > 255) {
                    transformationArray[row][column] = 255;

                } else if (transformationArray[row][column] + (int) intensityIncrement < 0) {
                    transformationArray[row][column] = 0;
                } else {
                    transformationArray[row][column] = transformationArray[row][column] + (int) intensityIncrement;
                }

            }

        }
        // add to arraylist for undo
        allTransformations.add(transformationArray);
        //make sourcepixels = to changed array
        sourcePixels = transformationArray;

        //return new image
        return sourcePixels;

    }

    /**
     * change every pixels color value to the opposite
     */
    private int[][] invert(int[][] sourcePixels) {
        //initialize new array storage
        int[][] transformationArray = new int[sourcePixels.length][sourcePixels[0].length];
        //copy current SourcePixels into new array
        fillNewArrayWithOldArray(transformationArray, sourcePixels);

        //loop through an change each pixel value
        for (int row = 0; row < transformationArray.length; row++) {

            for (int column = 0; column < transformationArray[row].length - 1; column++) {

                transformationArray[row][column] = 255 - transformationArray[row][column];

            }
        }
        // add to arraylist for undo
        allTransformations.add(transformationArray);
        //make sourcepixels = to changed array
        sourcePixels = transformationArray;

        //return new image
        return sourcePixels;
    }

    /**
     * Flip the image on the x-axis
     */
    private int[][] flipX(int[][] sourcePixels) {
        //initialize new storage array
        int[][] transformationArray = new int[sourcePixels.length][sourcePixels[0].length];
        //fill new array with sourcePixels
        fillNewArrayWithOldArray(transformationArray, sourcePixels);

        //loop through each pixel and flip it to the opposite side
        for (int row = 0; row < transformationArray.length - row; row++) {
            for (int column = 0; column < transformationArray[row].length; column++) {

                int holderForSwap = transformationArray[row][column];

                transformationArray[row][column] = transformationArray[transformationArray.length - (row + 1)][column];
                transformationArray[transformationArray.length - (row + 1)][column] = holderForSwap;
            }
        }
        //add to arraylist for undo
        allTransformations.add(transformationArray);
        //source pixels = newl;y created array
        sourcePixels = transformationArray;

        // return transformed image
        return sourcePixels;

    }

    /**
     * flip pixels on the y-axis
     */
    private int[][] flipY(int[][] sourcePixels) {

        //intitialize new array for transformations
        int[][] transformationArray = new int[sourcePixels.length][sourcePixels[0].length];
        //fill new array with sourcePixels
        fillNewArrayWithOldArray(transformationArray, sourcePixels);

        //loop array and flip pxelks on the x axis
        for (int row = 0; row < transformationArray.length; row++) {
            for (int column = 0; column < transformationArray[row].length - column; column++) {

                int holderForSwap = transformationArray[row][column];

                transformationArray[row][column] = transformationArray[row][transformationArray[row].length - (column + 1)];
                transformationArray[row][transformationArray[row].length - (column + 1)] = holderForSwap;

            }
        }
        //add transformations to array list for undo
        allTransformations.add(transformationArray);
        //apply tranmformations to sourcePixels
        sourcePixels = transformationArray;

        //Retuirn sourcePixels
        return sourcePixels;
    }

    /**
     * rotate pixels 90 degrees clockwise
     */
    private int[][] rotate(int[][] sourcePixels) {

        //intialize new array for transformatiuons
        int[][] transformationArray = new int[sourcePixels[0].length][sourcePixels.length];
        //fill new array with sourcePixels
        fillNewArrayWithOldArrayRotation(transformationArray, sourcePixels);

        //Switch rows with columns, rotating the image 90 degrees clockwise
        for (int row = 0; row < transformationArray.length; row++) {
            for (int column = 0; column < transformationArray[row].length - column; column++) {

                int holderForSwap = transformationArray[row][column];

                transformationArray[row][column] = transformationArray[row][transformationArray[row].length - (column + 1)];
                transformationArray[row][transformationArray[row].length - (column + 1)] = holderForSwap;

            }
        }
        //add transformations to arraylist for undo
        allTransformations.add(transformationArray);
        // apply transofrmations to sourcePixels
        sourcePixels = transformationArray;
        //return sourcePixels
        return sourcePixels;

    }

    /**
     * Create duplicate of the image and flip it opposite the existing one
     */
    private int[][] mirror(int[][] sourcePixels) {
        // intialize new array for transformations
        int[][] transformationArray = new int[sourcePixels.length][(sourcePixels[0].length - 1) * 2];
        //fill new array with sourcePixels
        fillNewArrayWithOldArray(transformationArray, sourcePixels);
        // coloumn place holder for the loop
        int columnPlaceHolder = 0;

        //copppy array backwards into second half of the new array
        for (int row = 0; row < transformationArray.length; row++) {

            for (int column = transformationArray[row].length - 1; column > transformationArray[row].length / 2; column--) {

                transformationArray[row][column] = sourcePixels[row][columnPlaceHolder];
                columnPlaceHolder = columnPlaceHolder + 1;
            }
            columnPlaceHolder = 0;

        }

        //add transformations to the array list for undo
        allTransformations.add(transformationArray);
        //apply transformations to sourcePixels
        sourcePixels = transformationArray;
        //return sourcePixels
        return sourcePixels;

    }

    /**
     * scale down picture by 50 (width /2 + height / 2)
     */
    private int[][] scale50(int[][] sourcePixels) {
        //intialize new array for transformations

        int[][] transformationArray = new int[sourcePixels.length / 2][sourcePixels[0].length / 2];

        //place holder for row
        int rowPlaceHolder = 1;

        //for loop that adds every other pixel to the new array
        for (int row = 0; row < transformationArray.length; row++) {

            int columnPlaceHolder = 1;

            for (int column = 0; column < transformationArray[row].length; column++) {

                transformationArray[row][column] = sourcePixels[rowPlaceHolder][columnPlaceHolder];

                columnPlaceHolder = columnPlaceHolder + 2;
            }
            rowPlaceHolder = rowPlaceHolder + 2;

        }

        //add transformations to the array lsit for undo
        allTransformations.add(transformationArray);
        //apply transformations to sourcepixels
        sourcePixels = transformationArray;

        //return sourcePIxels
        return sourcePixels;
    }

    /**
     * average out the colors in every pixel with the ones surrounding it, thus
     * blurring the image
     */
    private int[][] blur(int[][] sourcePixels) {

        //initialize new array for the transformation
        int[][] transformationArray = new int[sourcePixels.length][sourcePixels[0].length];
        //fill nbew array with current picture
        fillNewArrayWithOldArray(transformationArray, sourcePixels);
        //intialize average colour value
        int averageColorValueBetweenSurroundingPixels = 0;

        // loop around and add up surrounding pixels to current pixel
        for (int row = 0; row < transformationArray.length; row++) {
            for (int column = 0; column < transformationArray[row].length; column++) {

                //FOR SPECIAL CASES WHERE THERE ARE NOT 9 PIXELS SURROUNDING
                //if top left corner
                if (row == 0 && column == 0) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column + 1] + transformationArray[row + 1][column + 1] + transformationArray[row + 1][column]) / 4;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if top row, inbetween corners
                if (row == 0 && column > 0 && column < transformationArray[row].length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column + 1] + transformationArray[row][column - 1] + transformationArray[row + 1][column] + transformationArray[row + 1][column + 1] + transformationArray[row + 1][column - 1]) / 6;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if top row, right corner
                if (row == 0 && column == transformationArray[row].length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column - 1] + transformationArray[row + 1][column] + transformationArray[row + 1][column - 1]) / 4;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if bottom row left corner
                if (row == transformationArray.length - 1 && column == 0) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column + 1] + transformationArray[row - 1][column + 1] + transformationArray[row - 1][column]) / 4;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if bottom row inbetween corners
                if (row == transformationArray.length - 1 && column > 0 && column < transformationArray[row].length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column + 1] + transformationArray[row][column - 1] + transformationArray[row - 1][column] + transformationArray[row - 1][column + 1] + transformationArray[row - 1][column - 1]) / 6;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if bottom row, right corner
                if (row == transformationArray.length && column == transformationArray[row].length) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column - 1] + transformationArray[row - 1][column - 1] + transformationArray[row - 1][column]) / 4;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if first column, inbetween corners
                if (column == 0 && row > 0 && row < transformationArray.length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column + 1] + transformationArray[row - 1][column] + transformationArray[row - 1][column + 1] + transformationArray[row + 1][column] + transformationArray[row + 1][column + 1]) / 6;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if last col,oumn, inbetween corners
                if (column == transformationArray[row].length - 1 && row > 0 && row < transformationArray.length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column - 1] + transformationArray[row - 1][column] + transformationArray[row - 1][column - 1] + transformationArray[row + 1][column] + transformationArray[row + 1][column - 1]) / 6;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }
                //if anywhere where 9 pixels surround the current pixel
                if (row > 0 && row < transformationArray.length - 1 && column > 0 && column < transformationArray[row].length - 1) {
                    averageColorValueBetweenSurroundingPixels = (transformationArray[row][column] + transformationArray[row][column - 1] + transformationArray[row][column + 1] + transformationArray[row - 1][column] + transformationArray[row - 1][column - 1] + transformationArray[row - 1][column + 1] + transformationArray[row + 1][column] + transformationArray[row + 1][column - 1] + transformationArray[row + 1][column + 1]) / 9;
                    transformationArray[row][column] = averageColorValueBetweenSurroundingPixels;
                    averageColorValueBetweenSurroundingPixels = 0;
                }

            }
        }

        // add transformations to the array list for undo
        allTransformations.add(transformationArray);
        //apply transformations to sourcePixels
        sourcePixels = transformationArray;
        //return sourcePixels
        return sourcePixels;

    }

    //fill any new array with custom dimensions with sourcePixels
    private int[][] fillNewArrayWithOldArray(int[][] transformationArray, int[][] sourcePixels) {

        for (int row = 0; row < sourcePixels.length; row++) {
            for (int column = 0; column < sourcePixels[row].length; column++) {

                transformationArray[row][column] = sourcePixels[row][column];
            }
        }

        return transformationArray;
    }

    //fill any new array with custom dimensions with sourcePixels for rotation
    private int[][] fillNewArrayWithOldArrayRotation(int[][] transformationArray, int[][] sourcePixels) {

        for (int row = 0; row < transformationArray.length; row++) {
            for (int column = 0; column < transformationArray[row].length; column++) {

                transformationArray[row][column] = sourcePixels[column][row];

            }

        }
        return transformationArray;
    }

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
