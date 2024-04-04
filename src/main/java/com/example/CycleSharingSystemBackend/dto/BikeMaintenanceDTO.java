//package com.example.CycleSharingSystemBackend.dto;
//
//
//import com.example.CycleSharingSystemBackend.model.Bikes;
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import java.util.Date;
//
//public class BikeMaintenanceDTO {
//    private Long maintenanceId;
//    private Bikes bikes;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date date;
//    private String type;
//    private boolean status;
//    private String comments;
//
//    public Long getMaintenanceId() {
//        return this.maintenanceId;
//    }
//
//    public Bikes getBikes() {
//        return this.bikes;
//    }
//
//    public Date getDate() {
//        return this.date;
//    }
//
//    public String getType() {
//        return this.type;
//    }
//
//    public boolean isStatus() {
//        return this.status;
//    }
//
//    public String getComments() {
//        return this.comments;
//    }
//
//    public void setMaintenanceId(final Long maintenanceId) {
//        this.maintenanceId = maintenanceId;
//    }
//
//    public void setBikeId(final Long Bike_id) {
//        this.bikes = bikes;
//    }
//
//    public void setDate(final Date date) {
//        this.date = date;
//    }
//
//    public void setType(final String type) {
//        this.type = type;
//    }
//
//    public void setStatus(final boolean status) {
//        this.status = status;
//    }
//
//    public void setComments(final String comments) {
//        this.comments = comments;
//    }
//
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof BikeMaintenanceDTO)) {
//            return false;
//        } else {
//            BikeMaintenanceDTO other = (BikeMaintenanceDTO)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (this.isStatus() != other.isStatus()) {
//                return false;
//            } else {
//                label73: {
//                    Object this$maintenanceId = this.getMaintenanceId();
//                    Object other$maintenanceId = other.getMaintenanceId();
//                    if (this$maintenanceId == null) {
//                        if (other$maintenanceId == null) {
//                            break label73;
//                        }
//                    } else if (this$maintenanceId.equals(other$maintenanceId)) {
//                        break label73;
//                    }
//
//                    return false;
//                }
//
//                Object this$bike = this.getBikes();
//                Object other$bike = other.getBikes();
//                if (this$bike == null) {
//                    if (other$bike != null) {
//                        return false;
//                    }
//                } else if (!this$bike.equals(other$bike)) {
//                    return false;
//                }
//
//                label59: {
//                    Object this$date = this.getDate();
//                    Object other$date = other.getDate();
//                    if (this$date == null) {
//                        if (other$date == null) {
//                            break label59;
//                        }
//                    } else if (this$date.equals(other$date)) {
//                        break label59;
//                    }
//
//                    return false;
//                }
//
//                Object this$type = this.getType();
//                Object other$type = other.getType();
//                if (this$type == null) {
//                    if (other$type != null) {
//                        return false;
//                    }
//                } else if (!this$type.equals(other$type)) {
//                    return false;
//                }
//
//                Object this$comments = this.getComments();
//                Object other$comments = other.getComments();
//                if (this$comments == null) {
//                    if (other$comments != null) {
//                        return false;
//                    }
//                } else if (!this$comments.equals(other$comments)) {
//                    return false;
//                }
//
//                return true;
//            }
//        }
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof BikeMaintenanceDTO;
//    }
//
//    public int hashCode() {
//        boolean PRIME = true;
//        int result = 1;
//        result = result * 59 + (this.isStatus() ? 79 : 97);
//        Object $maintenanceId = this.getMaintenanceId();
//        result = result * 59 + ($maintenanceId == null ? 43 : $maintenanceId.hashCode());
//        Object $bikeId = this.getBikes();
//        result = result * 59 + ($bikeId == null ? 43 : $bikeId.hashCode());
//        Object $date = this.getDate();
//        result = result * 59 + ($date == null ? 43 : $date.hashCode());
//        Object $type = this.getType();
//        result = result * 59 + ($type == null ? 43 : $type.hashCode());
//        Object $comments = this.getComments();
//        result = result * 59 + ($comments == null ? 43 : $comments.hashCode());
//        return result;
//    }
//
//    public String toString() {
//        Long var10000 = this.getMaintenanceId();
//        return "BikeMaintenanceDTO(maintenanceId=" + var10000 + ", bikeId=" + this.getBikes() + ", date=" + String.valueOf(this.getDate()) + ", type=" + this.getType() + ", status=" + this.isStatus() + ", comments=" + this.getComments() + ")";
//    }
//
//    public BikeMaintenanceDTO(final Long maintenanceId, final Long bikeId, final Date date, final String type, final boolean status, final String comments) {
//        this.maintenanceId = maintenanceId;
//        this.bikes = bikes;
//        this.date = date;
//        this.type = type;
//        this.status = status;
//        this.comments = comments;
//    }
//
//    public BikeMaintenanceDTO() {
//    }
//}