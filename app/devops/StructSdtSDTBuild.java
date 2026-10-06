package app.devops ;
import com.genexus.*;

public final  class StructSdtSDTBuild implements Cloneable, java.io.Serializable
{
   public StructSdtSDTBuild( )
   {
      this( -1, new ModelContext( StructSdtSDTBuild.class ));
   }

   public StructSdtSDTBuild( int remoteHandle ,
                             ModelContext context )
   {
      gxTv_SdtSDTBuild_App = "" ;
      gxTv_SdtSDTBuild_Latestversion = "" ;
      gxTv_SdtSDTBuild_Releasenotes = "" ;
      gxTv_SdtSDTBuild_Signatureurl = "" ;
      gxTv_SdtSDTBuild_Artifact_N = (byte)(1) ;
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(1) ;
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

   public String getApp( )
   {
      return gxTv_SdtSDTBuild_App ;
   }

   public void setApp( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_App = value ;
   }

   public String getLatestversion( )
   {
      return gxTv_SdtSDTBuild_Latestversion ;
   }

   public void setLatestversion( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Latestversion = value ;
   }

   public boolean getMandatory( )
   {
      return gxTv_SdtSDTBuild_Mandatory ;
   }

   public void setMandatory( boolean value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Mandatory = value ;
   }

   public app.devops.StructSdtSDTBuild_artifact getArtifact( )
   {
      return gxTv_SdtSDTBuild_Artifact ;
   }

   public void setArtifact( app.devops.StructSdtSDTBuild_artifact value )
   {
      gxTv_SdtSDTBuild_Artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Artifact = value;
   }

   public String getReleasenotes( )
   {
      return gxTv_SdtSDTBuild_Releasenotes ;
   }

   public void setReleasenotes( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Releasenotes = value ;
   }

   public String getSignatureurl( )
   {
      return gxTv_SdtSDTBuild_Signatureurl ;
   }

   public void setSignatureurl( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Signatureurl = value ;
   }

   public java.util.Vector<app.devops.StructSdtSDTBuild_allArtifactsItem> getAllartifacts( )
   {
      return gxTv_SdtSDTBuild_Allartifacts ;
   }

   public void setAllartifacts( java.util.Vector<app.devops.StructSdtSDTBuild_allArtifactsItem> value )
   {
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Allartifacts = value ;
   }

   protected byte gxTv_SdtSDTBuild_Artifact_N ;
   protected byte gxTv_SdtSDTBuild_Allartifacts_N ;
   protected byte gxTv_SdtSDTBuild_N ;
   protected boolean gxTv_SdtSDTBuild_Mandatory ;
   protected String gxTv_SdtSDTBuild_App ;
   protected String gxTv_SdtSDTBuild_Latestversion ;
   protected String gxTv_SdtSDTBuild_Releasenotes ;
   protected String gxTv_SdtSDTBuild_Signatureurl ;
   protected app.devops.StructSdtSDTBuild_artifact gxTv_SdtSDTBuild_Artifact=null ;
   protected java.util.Vector<app.devops.StructSdtSDTBuild_allArtifactsItem> gxTv_SdtSDTBuild_Allartifacts=null ;
}

