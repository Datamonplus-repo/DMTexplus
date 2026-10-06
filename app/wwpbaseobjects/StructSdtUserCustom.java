package app.wwpbaseobjects ;
import com.genexus.*;

public final  class StructSdtUserCustom implements Cloneable, java.io.Serializable
{
   public StructSdtUserCustom( )
   {
      this( -1, new ModelContext( StructSdtUserCustom.class ));
   }

   public StructSdtUserCustom( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtUserCustom_Secuserid = "" ;
      gxTv_SdtUserCustom_Usrcuskey = "" ;
      gxTv_SdtUserCustom_Usrcusval = "" ;
      gxTv_SdtUserCustom_Mode = "" ;
      gxTv_SdtUserCustom_Secuserid_Z = "" ;
      gxTv_SdtUserCustom_Usrcuskey_Z = "" ;
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

   public String getSecuserid( )
   {
      return gxTv_SdtUserCustom_Secuserid ;
   }

   public void setSecuserid( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Secuserid = value ;
   }

   public String getUsrcuskey( )
   {
      return gxTv_SdtUserCustom_Usrcuskey ;
   }

   public void setUsrcuskey( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Usrcuskey = value ;
   }

   public String getUsrcusval( )
   {
      return gxTv_SdtUserCustom_Usrcusval ;
   }

   public void setUsrcusval( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Usrcusval = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtUserCustom_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtUserCustom_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Initialized = value ;
   }

   public String getSecuserid_Z( )
   {
      return gxTv_SdtUserCustom_Secuserid_Z ;
   }

   public void setSecuserid_Z( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Secuserid_Z = value ;
   }

   public String getUsrcuskey_Z( )
   {
      return gxTv_SdtUserCustom_Usrcuskey_Z ;
   }

   public void setUsrcuskey_Z( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      gxTv_SdtUserCustom_Usrcuskey_Z = value ;
   }

   private byte gxTv_SdtUserCustom_N ;
   protected short gxTv_SdtUserCustom_Initialized ;
   protected String gxTv_SdtUserCustom_Mode ;
   protected String gxTv_SdtUserCustom_Usrcusval ;
   protected String gxTv_SdtUserCustom_Secuserid ;
   protected String gxTv_SdtUserCustom_Usrcuskey ;
   protected String gxTv_SdtUserCustom_Secuserid_Z ;
   protected String gxTv_SdtUserCustom_Usrcuskey_Z ;
}

