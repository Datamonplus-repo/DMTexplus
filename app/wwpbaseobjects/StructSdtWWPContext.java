package app.wwpbaseobjects ;
import com.genexus.*;

public final  class StructSdtWWPContext implements Cloneable, java.io.Serializable
{
   public StructSdtWWPContext( )
   {
      this( -1, new ModelContext( StructSdtWWPContext.class ));
   }

   public StructSdtWWPContext( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtWWPContext_Userid = "" ;
      gxTv_SdtWWPContext_Username = "" ;
      gxTv_SdtWWPContext_Usurcod = "" ;
      gxTv_SdtWWPContext_Userguid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtWWPContext_Emprcod = "" ;
      gxTv_SdtWWPContext_Usumail = "" ;
      gxTv_SdtWWPContext_Usurprint = "" ;
      gxTv_SdtWWPContext_Usursockt = "" ;
      gxTv_SdtWWPContext_Licensekey = "" ;
      gxTv_SdtWWPContext_Token = "" ;
      gxTv_SdtWWPContext_Environmentid = "" ;
      gxTv_SdtWWPContext_Product = "" ;
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

   public String getUserid( )
   {
      return gxTv_SdtWWPContext_Userid ;
   }

   public void setUserid( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Userid = value ;
   }

   public String getUsername( )
   {
      return gxTv_SdtWWPContext_Username ;
   }

   public void setUsername( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Username = value ;
   }

   public String getUsurcod( )
   {
      return gxTv_SdtWWPContext_Usurcod ;
   }

   public void setUsurcod( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usurcod = value ;
   }

   public java.util.UUID getUserguid( )
   {
      return gxTv_SdtWWPContext_Userguid ;
   }

   public void setUserguid( java.util.UUID value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Userguid = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtWWPContext_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Emprcod = value ;
   }

   public String getUsumail( )
   {
      return gxTv_SdtWWPContext_Usumail ;
   }

   public void setUsumail( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usumail = value ;
   }

   public String getUsurprint( )
   {
      return gxTv_SdtWWPContext_Usurprint ;
   }

   public void setUsurprint( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usurprint = value ;
   }

   public String getUsursockt( )
   {
      return gxTv_SdtWWPContext_Usursockt ;
   }

   public void setUsursockt( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usursockt = value ;
   }

   public long getMtknid( )
   {
      return gxTv_SdtWWPContext_Mtknid ;
   }

   public void setMtknid( long value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Mtknid = value ;
   }

   public String getLicensekey( )
   {
      return gxTv_SdtWWPContext_Licensekey ;
   }

   public void setLicensekey( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Licensekey = value ;
   }

   public String getToken( )
   {
      return gxTv_SdtWWPContext_Token ;
   }

   public void setToken( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Token = value ;
   }

   public String getEnvironmentid( )
   {
      return gxTv_SdtWWPContext_Environmentid ;
   }

   public void setEnvironmentid( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Environmentid = value ;
   }

   public String getProduct( )
   {
      return gxTv_SdtWWPContext_Product ;
   }

   public void setProduct( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Product = value ;
   }

   protected byte gxTv_SdtWWPContext_N ;
   protected long gxTv_SdtWWPContext_Mtknid ;
   protected String gxTv_SdtWWPContext_Userid ;
   protected String gxTv_SdtWWPContext_Usurcod ;
   protected String gxTv_SdtWWPContext_Emprcod ;
   protected String gxTv_SdtWWPContext_Usumail ;
   protected String gxTv_SdtWWPContext_Username ;
   protected String gxTv_SdtWWPContext_Usurprint ;
   protected String gxTv_SdtWWPContext_Usursockt ;
   protected String gxTv_SdtWWPContext_Licensekey ;
   protected String gxTv_SdtWWPContext_Token ;
   protected String gxTv_SdtWWPContext_Environmentid ;
   protected String gxTv_SdtWWPContext_Product ;
   protected java.util.UUID gxTv_SdtWWPContext_Userguid ;
}

