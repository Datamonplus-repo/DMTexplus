package app.asyncbatch ;
import com.genexus.*;

public final  class StructSdtJobParameterData implements Cloneable, java.io.Serializable
{
   public StructSdtJobParameterData( )
   {
      this( -1, new ModelContext( StructSdtJobParameterData.class ));
   }

   public StructSdtJobParameterData( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtJobParameterData_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public java.util.UUID getJobid( )
   {
      return gxTv_SdtJobParameterData_Jobid ;
   }

   public void setJobid( java.util.UUID value )
   {
      gxTv_SdtJobParameterData_N = (byte)(0) ;
      gxTv_SdtJobParameterData_Jobid = value ;
   }

   public java.util.Vector<app.asyncbatch.StructSdtJobParameterData_JobParSdtItem> getJobparsdt( )
   {
      return gxTv_SdtJobParameterData_Jobparsdt ;
   }

   public void setJobparsdt( java.util.Vector<app.asyncbatch.StructSdtJobParameterData_JobParSdtItem> value )
   {
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(0) ;
      gxTv_SdtJobParameterData_N = (byte)(0) ;
      gxTv_SdtJobParameterData_Jobparsdt = value ;
   }

   protected byte gxTv_SdtJobParameterData_Jobparsdt_N ;
   protected byte gxTv_SdtJobParameterData_N ;
   protected java.util.UUID gxTv_SdtJobParameterData_Jobid ;
   protected java.util.Vector<app.asyncbatch.StructSdtJobParameterData_JobParSdtItem> gxTv_SdtJobParameterData_Jobparsdt=null ;
}

