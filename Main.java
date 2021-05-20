class Main 
{
  /* Main method for testing */
  public static void main(String[] args) 
  {
    Picture pic = new Picture("javapicture.jpg");//pic.zeroBlue();
    //pic.negate();
    //pic.grayscale();
    //pic.edgeDetection(10);
    //pic.mirrorVerticalB();
    //pic.mirrorHorizontal();
    pic.mirrorHorizontalTwoB(100);

    pic.write("output.jpg");
  }
}
