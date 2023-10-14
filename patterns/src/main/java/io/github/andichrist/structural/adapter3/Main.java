package io.github.andichrist.structural.adapter3;

import java.beans.EventHandler;

import static java.lang.System.out;

public class Main {

  public void notifyDuke() {
    out.println("run was called");
  }

  static void execute(Runnable command) {
    command.run();
  }

  public static void main(String[] args) {
    var app = new Main();
    var runnable = EventHandler.create(Runnable.class, app, "notifyDuke");
    execute(runnable);
  }
}
