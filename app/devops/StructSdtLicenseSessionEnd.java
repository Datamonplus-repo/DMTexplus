package app.devops ;
import com.genexus.*;

public final  class StructSdtLicenseSessionEnd implements Cloneable, java.io.Serializable
{
   public StructSdtLicenseSessionEnd( )
   {
      this( -1, new ModelContext( StructSdtLicenseSessionEnd.class ));
   }

   public StructSdtLicenseSessionEnd( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtLicenseSessionEnd_Licensekey = "" ;
      gxTv_SdtLicenseSessionEnd_Environmentid = "" ;
      gxTv_SdtLicenseSessionEnd_Userid = "" ;
      gxTv_SdtLicenseSessionEnd_Sessionid = "" ;
      gxTv_SdtLicenseSessionEnd_Licensekey_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Environmentid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Userid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Sessionid_N = (byte)(1) ;
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

   public String getLicensekey( )
   {
      return gxTv_SdtLicenseSessionEnd_Licensekey ;
   }

   public void setLicensekey( String value )
   {
      gxTv_SdtLicenseSessionEnd_Licensekey_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Licensekey = value ;
   }

   public String getEnvironmentid( )
   {
      return gxTv_SdtLicenseSessionEnd_Environmentid ;
   }

   public void setEnvironmentid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Environmentid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Environmentid = value ;
   }

   public String getUserid( )
   {
      return gxTv_SdtLicenseSessionEnd_Userid ;
   }

   public void setUserid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Userid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Userid = value ;
   }

   public String getSessionid( )
   {
      return gxTv_SdtLicenseSessionEnd_Sessionid ;
   }

   public void setSessionid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Sessionid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Sessionid = value ;
   }

   protected byte gxTv_SdtLicenseSessionEnd_Licensekey_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Environmentid_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Userid_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Sessionid_N ;
   protected byte gxTv_SdtLicenseSessionEnd_N ;
   protected String gxTv_SdtLicenseSessionEnd_Licensekey ;
   protected String gxTv_SdtLicenseSessionEnd_Environmentid ;
   protected String gxTv_SdtLicenseSessionEnd_Userid ;
   protected String gxTv_SdtLicenseSessionEnd_Sessionid ;
}

