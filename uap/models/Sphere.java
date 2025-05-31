package uap.models;

import uap.bases.shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public class Sphere extends shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator{
  
  private double radius;

  Sphere(){

  }

  Sphere(double radius){
    this.radius = radius;
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
