package app.devops ;
import com.genexus.*;

public final  class StructSdtLicenseSessionStart implements Cloneable, java.io.Serializable
{
   public StructSdtLicenseSessionStart( )
   {
      this( -1, new ModelContext( StructSdtLicenseSessionStart.class ));
   }

   public StructSdtLicenseSessionStart( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtLicenseSessionStart_Licensekey = "" ;
      gxTv_SdtLicenseSessionStart_Token = "" ;
      gxTv_SdtLicenseSessionStart_Environmentid = "" ;
      gxTv_SdtLicenseSessionStart_Userid = "" ;
      gxTv_SdtLicenseSessionStart_Sessionid = "" ;
      gxTv_SdtLicenseSessionStart_Program = "" ;
      gxTv_SdtLicenseSessionStart_Licensekey_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Token_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Environmentid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Userid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Sessionid_N = (byte)(1) ;
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
      return gxTv_SdtLicenseSessionStart_Licensekey ;
   }

   public void setLicensekey( String value )
   {
      gxTv_SdtLicenseSessionStart_Licensekey_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Licensekey = value ;
   }

   public String getToken( )
   {
      return gxTv_SdtLicenseSessionStart_Token ;
   }

   public void setToken( String value )
   {
      gxTv_SdtLicenseSessionStart_Token_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Token = value ;
   }

   public String getEnvironmentid( )
   {
      return gxTv_SdtLicenseSessionStart_Environmentid ;
   }

   public void setEnvironmentid( String value )
   {
      gxTv_SdtLicenseSessionStart_Environmentid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Environmentid = value ;
   }

   public String getUserid( )
   {
      return gxTv_SdtLicenseSessionStart_Userid ;
   }

   public void setUserid( String value )
   {
      gxTv_SdtLicenseSessionStart_Userid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Userid = value ;
   }

   public String getSessionid( )
   {
      return gxTv_SdtLicenseSessionStart_Sessionid ;
   }

   public void setSessionid( String value )
   {
      gxTv_SdtLicenseSessionStart_Sessionid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Sessionid = value ;
   }

   public String getProgram( )
   {
      return gxTv_SdtLicenseSessionStart_Program ;
   }

   public void setProgram( String value )
   {
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Program = value ;
   }

   protected byte gxTv_SdtLicenseSessionStart_Licensekey_N ;
   protected byte gxTv_SdtLicenseSessionStart_Token_N ;
   protected byte gxTv_SdtLicenseSessionStart_Environmentid_N ;
   protected byte gxTv_SdtLicenseSessionStart_Userid_N ;
   protected byte gxTv_SdtLicenseSessionStart_Sessionid_N ;
   protected byte gxTv_SdtLicenseSessionStart_N ;
   protected String gxTv_SdtLicenseSessionStart_Licensekey ;
   protected String gxTv_SdtLicenseSessionStart_Token ;
   protected String gxTv_SdtLicenseSessionStart_Environmentid ;
   protected String gxTv_SdtLicenseSessionStart_Userid ;
   protected String gxTv_SdtLicenseSessionStart_Sessionid ;
   protected String gxTv_SdtLicenseSessionStart_Program ;
}

