package app.asyncbatch ;
import com.genexus.*;

public final  class StructSdtJobParameterData_JobParSdtItem implements Cloneable, java.io.Serializable
{
   public StructSdtJobParameterData_JobParSdtItem( )
   {
      this( -1, new ModelContext( StructSdtJobParameterData_JobParSdtItem.class ));
   }

   public StructSdtJobParameterData_JobParSdtItem( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_Parkey = "" ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parval = "" ;
      gxTv_SdtJobParameterData_JobParSdtItem_Valtyp = "" ;
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

   public String getParkey( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Parkey ;
   }

   public void setParkey( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parkey = value ;
   }

   public String getParval( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Parval ;
   }

   public void setParval( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parval = value ;
   }

   public String getValtyp( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Valtyp ;
   }

   public void setValtyp( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Valtyp = value ;
   }

   protected byte gxTv_SdtJobParameterData_JobParSdtItem_N ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Parkey ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Parval ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Valtyp ;
}

