package app.devops ;
import com.genexus.*;

public final  class StructSdtSDTBuild_artifact implements Cloneable, java.io.Serializable
{
   public StructSdtSDTBuild_artifact( )
   {
      this( -1, new ModelContext( StructSdtSDTBuild_artifact.class ));
   }

   public StructSdtSDTBuild_artifact( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTBuild_artifact_Version = "" ;
      gxTv_SdtSDTBuild_artifact_Builtat = cal.getTime() ;
      gxTv_SdtSDTBuild_artifact_Url = "" ;
      gxTv_SdtSDTBuild_artifact_Sha256 = "" ;
      gxTv_SdtSDTBuild_artifact_Size = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTBuild_artifact_Signatureurl = "" ;
      gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(1) ;
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

   public String getVersion( )
   {
      return gxTv_SdtSDTBuild_artifact_Version ;
   }

   public void setVersion( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Version = value ;
   }

   public java.util.Date getBuiltat( )
   {
      return gxTv_SdtSDTBuild_artifact_Builtat ;
   }

   public void setBuiltat( java.util.Date value )
   {
      gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Builtat = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtSDTBuild_artifact_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Url = value ;
   }

   public String getSha256( )
   {
      return gxTv_SdtSDTBuild_artifact_Sha256 ;
   }

   public void setSha256( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Sha256 = value ;
   }

   public java.math.BigDecimal getSize( )
   {
      return gxTv_SdtSDTBuild_artifact_Size ;
   }

   public void setSize( java.math.BigDecimal value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Size = value ;
   }

   public String getSignatureurl( )
   {
      return gxTv_SdtSDTBuild_artifact_Signatureurl ;
   }

   public void setSignatureurl( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Signatureurl = value ;
   }

   protected byte gxTv_SdtSDTBuild_artifact_Builtat_N ;
   protected byte gxTv_SdtSDTBuild_artifact_N ;
   protected String gxTv_SdtSDTBuild_artifact_Version ;
   protected String gxTv_SdtSDTBuild_artifact_Url ;
   protected String gxTv_SdtSDTBuild_artifact_Sha256 ;
   protected String gxTv_SdtSDTBuild_artifact_Signatureurl ;
   protected java.util.Date gxTv_SdtSDTBuild_artifact_Builtat ;
   protected java.math.BigDecimal gxTv_SdtSDTBuild_artifact_Size ;
}

