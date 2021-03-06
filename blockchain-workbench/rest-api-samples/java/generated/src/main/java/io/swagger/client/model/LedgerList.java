/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Ledger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LedgerList
 */

public class LedgerList {
  @SerializedName("nextLink")
  private String nextLink = null;

  @SerializedName("ledgers")
  private List<Ledger> ledgers = null;

  public LedgerList nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

   /**
   * Get nextLink
   * @return nextLink
  **/
  @ApiModelProperty(value = "")
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }

  public LedgerList ledgers(List<Ledger> ledgers) {
    this.ledgers = ledgers;
    return this;
  }

  public LedgerList addLedgersItem(Ledger ledgersItem) {
    if (this.ledgers == null) {
      this.ledgers = new ArrayList<Ledger>();
    }
    this.ledgers.add(ledgersItem);
    return this;
  }

   /**
   * Get ledgers
   * @return ledgers
  **/
  @ApiModelProperty(value = "")
  public List<Ledger> getLedgers() {
    return ledgers;
  }

  public void setLedgers(List<Ledger> ledgers) {
    this.ledgers = ledgers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerList ledgerList = (LedgerList) o;
    return Objects.equals(this.nextLink, ledgerList.nextLink) &&
        Objects.equals(this.ledgers, ledgerList.ledgers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextLink, ledgers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerList {\n");
    
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    ledgers: ").append(toIndentedString(ledgers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

