package app ;
import com.genexus.*;

public final  class StructSdtEmails_Config implements Cloneable, java.io.Serializable
{
   public StructSdtEmails_Config( )
   {
      this( -1, new ModelContext( StructSdtEmails_Config.class ));
   }

   public StructSdtEmails_Config( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtEmails_Config_User = "" ;
      gxTv_SdtEmails_Config_Password = "" ;
      gxTv_SdtEmails_Config_Email = "" ;
      gxTv_SdtEmails_Config_Smtp = "" ;
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

   public String getUser( )
   {
      return gxTv_SdtEmails_Config_User ;
   }

   public void setUser( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_User = value ;
   }

   public String getPassword( )
   {
      return gxTv_SdtEmails_Config_Password ;
   }

   public void setPassword( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Password = value ;
   }

   public boolean getAuthentication( )
   {
      return gxTv_SdtEmails_Config_Authentication ;
   }

   public void setAuthentication( boolean value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Authentication = value ;
   }

   public boolean getSecurity( )
   {
      return gxTv_SdtEmails_Config_Security ;
   }

   public void setSecurity( boolean value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Security = value ;
   }

   public short getPort( )
   {
      return gxTv_SdtEmails_Config_Port ;
   }

   public void setPort( short value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Port = value ;
   }

   public String getEmail( )
   {
      return gxTv_SdtEmails_Config_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Email = value ;
   }

   public String getSmtp( )
   {
      return gxTv_SdtEmails_Config_Smtp ;
   }

   public void setSmtp( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Smtp = value ;
   }

   protected byte gxTv_SdtEmails_Config_N ;
   protected short gxTv_SdtEmails_Config_Port ;
   protected boolean gxTv_SdtEmails_Config_Authentication ;
   protected boolean gxTv_SdtEmails_Config_Security ;
   protected String gxTv_SdtEmails_Config_User ;
   protected String gxTv_SdtEmails_Config_Password ;
   protected String gxTv_SdtEmails_Config_Email ;
   protected String gxTv_SdtEmails_Config_Smtp ;
}

