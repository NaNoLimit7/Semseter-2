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

  public Torus(){

  }

  public Torus(double majorRadius, double minorRadius){
    this.majorRadius = majorRadius;
    this.minorRadius = minorRadius;
  }

  public double getVolume(){
    return 2 * Pi * Pi * majorRadius * minorRadius * minorRadius;
  }

  public double getSurfaceArea(){
    return 4 * Pi * Pi * majorRadius * minorRadius;
  }

  public double getMass(){
    return getSurfaceArea() * THICKNESS * DENSITY;
  }

  public void printInfo(){
    System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        System.out.println("Biaya kirim     : Rp" + calculateCost());
  }

  public double gramToKilogram(){
    return getMass() / 1000.0;
  }

  public double calculateCost(){
    return (int) Math.ceil(gramToKilogram()) * 10000;
  }
}