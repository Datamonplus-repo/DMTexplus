package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "JobParameterData.JobParSdtItem", namespace ="TexplusNET")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtJobParameterData_JobParSdtItem_RESTInterface extends GxGenericCollectionItem<app.asyncbatch.SdtJobParameterData_JobParSdtItem>
{
   public SdtJobParameterData_JobParSdtItem_RESTInterface( )
   {
      super(new app.asyncbatch.SdtJobParameterData_JobParSdtItem ());
   }

   public SdtJobParameterData_JobParSdtItem_RESTInterface( app.asyncbatch.SdtJobParameterData_JobParSdtItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("ParKey")
   public String getgxTv_SdtJobParameterData_JobParSdtItem_Parkey( )
   {
      return GXutil.rtrim(((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).getgxTv_SdtJobParameterData_JobParSdtItem_Parkey()) ;
   }

   @JsonProperty("ParKey")
   public void setgxTv_SdtJobParameterData_JobParSdtItem_Parkey(  String Value )
   {
      ((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).setgxTv_SdtJobParameterData_JobParSdtItem_Parkey(Value);
   }


   @JsonProperty("ParVal")
   public String getgxTv_SdtJobParameterData_JobParSdtItem_Parval( )
   {
      return GXutil.rtrim(((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).getgxTv_SdtJobParameterData_JobParSdtItem_Parval()) ;
   }

   @JsonProperty("ParVal")
   public void setgxTv_SdtJobParameterData_JobParSdtItem_Parval(  String Value )
   {
      ((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).setgxTv_SdtJobParameterData_JobParSdtItem_Parval(Value);
   }


   @JsonProperty("ValTyp")
   public String getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp( )
   {
      return GXutil.rtrim(((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp()) ;
   }

   @JsonProperty("ValTyp")
   public void setgxTv_SdtJobParameterData_JobParSdtItem_Valtyp(  String Value )
   {
      ((app.asyncbatch.SdtJobParameterData_JobParSdtItem)getSdt()).setgxTv_SdtJobParameterData_JobParSdtItem_Valtyp(Value);
   }


   int remoteHandle = -1;
}

