package app.license ;
import com.genexus.*;

public final  class StructSdtLicenseData implements Cloneable, java.io.Serializable
{
   public StructSdtLicenseData( )
   {
      this( -1, new ModelContext( StructSdtLicenseData.class ));
   }

   public StructSdtLicenseData( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtLicenseData_Licensekey = "" ;
      gxTv_SdtLicenseData_Token = "" ;
      gxTv_SdtLicenseData_Environmentid = "" ;
      gxTv_SdtLicenseData_Version = "" ;
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
      return gxTv_SdtLicenseData_Licensekey ;
   }

   public void setLicensekey( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Licensekey = value ;
   }

   public String getToken( )
   {
      return gxTv_SdtLicenseData_Token ;
   }

   public void setToken( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Token = value ;
   }

   public String getEnvironmentid( )
   {
      return gxTv_SdtLicenseData_Environmentid ;
   }

   public void setEnvironmentid( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Environmentid = value ;
   }

   public String getVersion( )
   {
      return gxTv_SdtLicenseData_Version ;
   }

   public void setVersion( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Version = value ;
   }

   protected byte gxTv_SdtLicenseData_N ;
   protected String gxTv_SdtLicenseData_Licensekey ;
   protected String gxTv_SdtLicenseData_Token ;
   protected String gxTv_SdtLicenseData_Environmentid ;
   protected String gxTv_SdtLicenseData_Version ;
}

