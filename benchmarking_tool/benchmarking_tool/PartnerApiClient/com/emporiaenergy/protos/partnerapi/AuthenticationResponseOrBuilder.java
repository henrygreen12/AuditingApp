// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api.proto

package com.emporiaenergy.protos.partnerapi;

public interface AuthenticationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.AuthenticationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string auth_token = 1;</code>
   * @return The authToken.
   */
  java.lang.String getAuthToken();
  /**
   * <code>string auth_token = 1;</code>
   * @return The bytes for authToken.
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();

  /**
   * <code>.protos.ResultStatus result_status = 100;</code>
   * @return The enum numeric value on the wire for resultStatus.
   */
  int getResultStatusValue();
  /**
   * <code>.protos.ResultStatus result_status = 100;</code>
   * @return The resultStatus.
   */
  com.emporiaenergy.protos.partnerapi.ResultStatus getResultStatus();
}
