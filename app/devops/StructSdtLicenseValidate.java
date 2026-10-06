package app.devops ;
import com.genexus.*;

public final  class StructSdtLicenseValidate implements Cloneable, java.io.Serializable
{
   public StructSdtLicenseValidate( )
   {
      this( -1, new ModelContext( StructSdtLicenseValidate.class ));
   }

   public StructSdtLicenseValidate( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtLicenseValidate_Company = "" ;
      gxTv_SdtLicenseValidate_Product = "" ;
      gxTv_SdtLicenseValidate_Plan = "" ;
      gxTv_SdtLicenseValidate_Environment = "" ;
      gxTv_SdtLicenseValidate_Version = "" ;
      gxTv_SdtLicenseValidate_Contractstatus = "" ;
      gxTv_SdtLicenseValidate_Licensestatus = "" ;
      gxTv_SdtLicenseValidate_Expiresat = cal.getTime() ;
      gxTv_SdtLicenseValidate_Latestversion = "" ;
      gxTv_SdtLicenseValidate_Expiresat_N = (byte)(1) ;
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

   public boolean getAuthorized( )
   {
      return gxTv_SdtLicenseValidate_Authorized ;
   }

   public void setAuthorized( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Authorized = value ;
   }

   public String getCompany( )
   {
      return gxTv_SdtLicenseValidate_Company ;
   }

   public void setCompany( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Company = value ;
   }

   public String getProduct( )
   {
      return gxTv_SdtLicenseValidate_Product ;
   }

   public void setProduct( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Product = value ;
   }

   public String getPlan( )
   {
      return gxTv_SdtLicenseValidate_Plan ;
   }

   public void setPlan( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Plan = value ;
   }

   public String getEnvironment( )
   {
      return gxTv_SdtLicenseValidate_Environment ;
   }

   public void setEnvironment( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Environment = value ;
   }

   public String getVersion( )
   {
      return gxTv_SdtLicenseValidate_Version ;
   }

   public void setVersion( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Version = value ;
   }

   public String getContractstatus( )
   {
      return gxTv_SdtLicenseValidate_Contractstatus ;
   }

   public void setContractstatus( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Contractstatus = value ;
   }

   public String getLicensestatus( )
   {
      return gxTv_SdtLicenseValidate_Licensestatus ;
   }

   public void setLicensestatus( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Licensestatus = value ;
   }

   public java.util.Date getExpiresat( )
   {
      return gxTv_SdtLicenseValidate_Expiresat ;
   }

   public void setExpiresat( java.util.Date value )
   {
      gxTv_SdtLicenseValidate_Expiresat_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Expiresat = value ;
   }

   public boolean getManualoverrideused( )
   {
      return gxTv_SdtLicenseValidate_Manualoverrideused ;
   }

   public void setManualoverrideused( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Manualoverrideused = value ;
   }

   public String getLatestversion( )
   {
      return gxTv_SdtLicenseValidate_Latestversion ;
   }

   public void setLatestversion( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Latestversion = value ;
   }

   public boolean getNeedsupdate( )
   {
      return gxTv_SdtLicenseValidate_Needsupdate ;
   }

   public void setNeedsupdate( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Needsupdate = value ;
   }

   protected byte gxTv_SdtLicenseValidate_Expiresat_N ;
   protected byte gxTv_SdtLicenseValidate_N ;
   protected boolean gxTv_SdtLicenseValidate_Authorized ;
   protected boolean gxTv_SdtLicenseValidate_Manualoverrideused ;
   protected boolean gxTv_SdtLicenseValidate_Needsupdate ;
   protected String gxTv_SdtLicenseValidate_Company ;
   protected String gxTv_SdtLicenseValidate_Product ;
   protected String gxTv_SdtLicenseValidate_Plan ;
   protected String gxTv_SdtLicenseValidate_Environment ;
   protected String gxTv_SdtLicenseValidate_Version ;
   protected String gxTv_SdtLicenseValidate_Contractstatus ;
   protected String gxTv_SdtLicenseValidate_Licensestatus ;
   protected String gxTv_SdtLicenseValidate_Latestversion ;
   protected java.util.Date gxTv_SdtLicenseValidate_Expiresat ;
}

