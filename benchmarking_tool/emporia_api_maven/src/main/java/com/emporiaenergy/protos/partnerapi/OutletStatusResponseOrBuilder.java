// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api.proto

package com.emporiaenergy.protos.partnerapi;

public interface OutletStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.OutletStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  java.util.List<com.emporiaenergy.protos.partnerapi.OutletStatus> 
      getOutletStatusList();
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  com.emporiaenergy.protos.partnerapi.OutletStatus getOutletStatus(int index);
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  int getOutletStatusCount();
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  java.util.List<? extends com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder> 
      getOutletStatusOrBuilderList();
  /**
   * <code>repeated .protos.OutletStatus outlet_status = 1;</code>
   */
  com.emporiaenergy.protos.partnerapi.OutletStatusOrBuilder getOutletStatusOrBuilder(
      int index);

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
