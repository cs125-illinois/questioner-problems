package com.examples.cougarfeliform;

public abstract class Feliform {
  private final String type;

  public Feliform(String setType) {
    type = setType;
  }

  public String getType() {
    return type;
  }

  public abstract int dangerousness();
}
