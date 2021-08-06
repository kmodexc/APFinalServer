package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeoCoord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-12T15:26:34.001Z[GMT]")


public class GeoCoord   {
  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("logitude")
  private BigDecimal logitude = null;

  @JsonProperty("altitude")
  private BigDecimal altitude = null;

  public GeoCoord latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public GeoCoord logitude(BigDecimal logitude) {
    this.logitude = logitude;
    return this;
  }

  /**
   * Get logitude
   * @return logitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLogitude() {
    return logitude;
  }

  public void setLogitude(BigDecimal logitude) {
    this.logitude = logitude;
  }

  public GeoCoord altitude(BigDecimal altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getAltitude() {
    return altitude;
  }

  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoord geoCoord = (GeoCoord) o;
    return Objects.equals(this.latitude, geoCoord.latitude) &&
        Objects.equals(this.logitude, geoCoord.logitude) &&
        Objects.equals(this.altitude, geoCoord.altitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, logitude, altitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoord {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    logitude: ").append(toIndentedString(logitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
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
