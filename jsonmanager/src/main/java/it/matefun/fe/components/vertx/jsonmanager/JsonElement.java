/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.matefun.fe.components.vertx.jsonmanager;

public abstract class JsonElement {
  public boolean isArray() {
    return this instanceof JsonArray;
  }

  public boolean isObject() {
    return this instanceof JsonObject;
  }

  public JsonArray asArray() {
    return (JsonArray) this;
  }

  public JsonObject asObject() {
    return (JsonObject) this;
  }
}