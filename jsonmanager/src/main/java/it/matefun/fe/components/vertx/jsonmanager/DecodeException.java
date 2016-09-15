/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.matefun.fe.components.vertx.jsonmanager;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class DecodeException extends RuntimeException {

  public DecodeException() {
  }

  public DecodeException(String message) {
    super(message);
  }
}