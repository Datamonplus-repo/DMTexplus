package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "JobParameterData", namespace ="TexplusNET")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtJobParameterData_RESTInterface extends GxGenericCollectionItem<app.asyncbatch.SdtJobParameterData>
{
   public SdtJobParameterData_RESTInterface( )
   {
      super(new app.asyncbatch.SdtJobParameterData ());
   }

   public SdtJobParameterData_RESTInterface( app.asyncbatch.SdtJobParameterData psdt )
   {
      super(psdt);
   }

   @JsonProperty("JobId")
   public java.util.UUID getgxTv_SdtJobParameterData_Jobid( )
   {
      return ((app.asyncbatch.SdtJobParameterData)getSdt()).getgxTv_SdtJobParameterData_Jobid() ;
   }

   @JsonProperty("JobId")
   public void setgxTv_SdtJobParameterData_Jobid(  java.util.UUID Value )
   {
      ((app.asyncbatch.SdtJobParameterData)getSdt()).setgxTv_SdtJobParameterData_Jobid(Value);
   }


   @JsonProperty("JobParSdt")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface> getgxTv_SdtJobParameterData_Jobparsdt( )
   {
      return SdtJobParameterData_JobParSdtItem_RESTInterfacefromGXObjectCollection(((app.asyncbatch.SdtJobParameterData)getSdt()).getgxTv_SdtJobParameterData_Jobparsdt()) ;
   }

   @JsonProperty("JobParSdt")
   public void setgxTv_SdtJobParameterData_Jobparsdt(  Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface> Value )
   {
      ((app.asyncbatch.SdtJobParameterData)getSdt()).setgxTv_SdtJobParameterData_Jobparsdt(SdtJobParameterData_JobParSdtItem_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> SdtJobParameterData_JobParSdtItem_RESTInterfacetoGXObjectCollection( Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface> collection )
   {
      GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> result = new GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem>(app.asyncbatch.SdtJobParameterData_JobParSdtItem.class, "JobParameterData.JobParSdtItem", "TexplusNET.JobParameterData", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((app.asyncbatch.SdtJobParameterData_JobParSdtItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface> SdtJobParameterData_JobParSdtItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> collection )
   {
      Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface> result = new Vector<app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.asyncbatch.SdtJobParameterData_JobParSdtItem_RESTInterface((app.asyncbatch.SdtJobParameterData_JobParSdtItem)collection.elementAt(i)));
      }
      return result ;
   }

}

