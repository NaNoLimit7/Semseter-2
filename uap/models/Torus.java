package uap.models;

import uap.bases.shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public class Torus extends shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator{
  
  private double majorRadius;
  private double minorRadius;

  Torus(){

  }

  Torus(double majorRadius, double minorRadius){
    this.majorRadius = majorRadius;
    this.minorRadius = minorRadius;
  }

  public double getVolume(){

  }

  public double getSurfaceArea(){

  }

  public double getMass(){

  }

  public void printInfo(){

  }

  public double gramToKilogram(){

  }

  public double calculateCost(){

  }
}