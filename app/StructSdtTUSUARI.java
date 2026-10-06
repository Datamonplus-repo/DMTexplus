package app ;
import com.genexus.*;

public final  class StructSdtTUSUARI implements Cloneable, java.io.Serializable
{
   public StructSdtTUSUARI( )
   {
      this( -1, new ModelContext( StructSdtTUSUARI.class ));
   }

   public StructSdtTUSUARI( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTUSUARI_Usurcod = "" ;
      gxTv_SdtTUSUARI_Usurnom = "" ;
      gxTv_SdtTUSUARI_Usurpwd = "" ;
      gxTv_SdtTUSUARI_Usurfec = cal.getTime() ;
      gxTv_SdtTUSUARI_Usumail = "" ;
      gxTv_SdtTUSUARI_Usumailp = "" ;
      gxTv_SdtTUSUARI_Usumailu = "" ;
      gxTv_SdtTUSUARI_Usurtkn = "" ;
      gxTv_SdtTUSUARI_Usurtkncrd = cal.getTime() ;
      gxTv_SdtTUSUARI_Usurtknvto = cal.getTime() ;
      gxTv_SdtTUSUARI_Usurguid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtTUSUARI_Usurprint = "" ;
      gxTv_SdtTUSUARI_Usursockt = "" ;
      gxTv_SdtTUSUARI_Mode = "" ;
      gxTv_SdtTUSUARI_Usurcod_Z = "" ;
      gxTv_SdtTUSUARI_Usurnom_Z = "" ;
      gxTv_SdtTUSUARI_Usurpwd_Z = "" ;
      gxTv_SdtTUSUARI_Usurfec_Z = cal.getTime() ;
      gxTv_SdtTUSUARI_Usumail_Z = "" ;
      gxTv_SdtTUSUARI_Usumailp_Z = "" ;
      gxTv_SdtTUSUARI_Usumailu_Z = "" ;
      gxTv_SdtTUSUARI_Usurtkn_Z = "" ;
      gxTv_SdtTUSUARI_Usurtkncrd_Z = cal.getTime() ;
      gxTv_SdtTUSUARI_Usurtknvto_Z = cal.getTime() ;
      gxTv_SdtTUSUARI_Usurguid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtTUSUARI_Usurprint_Z = "" ;
      gxTv_SdtTUSUARI_Usursockt_Z = "" ;
      gxTv_SdtTUSUARI_Usurnom_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurpwd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurfec_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usumailp_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usumailu_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtkn_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurguid_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usurprint_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Usursockt_N = (byte)(1) ;
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

   public String getUsurcod( )
   {
      return gxTv_SdtTUSUARI_Usurcod ;
   }

   public void setUsurcod( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurcod = value ;
   }

   public String getUsurnom( )
   {
      return gxTv_SdtTUSUARI_Usurnom ;
   }

   public void setUsurnom( String value )
   {
      gxTv_SdtTUSUARI_Usurnom_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurnom = value ;
   }

   public String getUsurpwd( )
   {
      return gxTv_SdtTUSUARI_Usurpwd ;
   }

   public void setUsurpwd( String value )
   {
      gxTv_SdtTUSUARI_Usurpwd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurpwd = value ;
   }

   public java.util.Date getUsurfec( )
   {
      return gxTv_SdtTUSUARI_Usurfec ;
   }

   public void setUsurfec( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurfec_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurfec = value ;
   }

   public String getUsumail( )
   {
      return gxTv_SdtTUSUARI_Usumail ;
   }

   public void setUsumail( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumail = value ;
   }

   public String getUsumailp( )
   {
      return gxTv_SdtTUSUARI_Usumailp ;
   }

   public void setUsumailp( String value )
   {
      gxTv_SdtTUSUARI_Usumailp_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailp = value ;
   }

   public String getUsumailu( )
   {
      return gxTv_SdtTUSUARI_Usumailu ;
   }

   public void setUsumailu( String value )
   {
      gxTv_SdtTUSUARI_Usumailu_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailu = value ;
   }

   public boolean getUsurcmbpwd( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd ;
   }

   public void setUsurcmbpwd( boolean value )
   {
      gxTv_SdtTUSUARI_Usurcmbpwd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurcmbpwd = value ;
   }

   public String getUsurtkn( )
   {
      return gxTv_SdtTUSUARI_Usurtkn ;
   }

   public void setUsurtkn( String value )
   {
      gxTv_SdtTUSUARI_Usurtkn_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkn = value ;
   }

   public java.util.Date getUsurtkncrd( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd ;
   }

   public void setUsurtkncrd( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurtkncrd_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkncrd = value ;
   }

   public java.util.Date getUsurtknvto( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto ;
   }

   public void setUsurtknvto( java.util.Date value )
   {
      gxTv_SdtTUSUARI_Usurtknvto_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtknvto = value ;
   }

   public java.util.UUID getUsurguid( )
   {
      return gxTv_SdtTUSUARI_Usurguid ;
   }

   public void setUsurguid( java.util.UUID value )
   {
      gxTv_SdtTUSUARI_Usurguid_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurguid = value ;
   }

   public String getUsurprint( )
   {
      return gxTv_SdtTUSUARI_Usurprint ;
   }

   public void setUsurprint( String value )
   {
      gxTv_SdtTUSUARI_Usurprint_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurprint = value ;
   }

   public String getUsursockt( )
   {
      return gxTv_SdtTUSUARI_Usursockt ;
   }

   public void setUsursockt( String value )
   {
      gxTv_SdtTUSUARI_Usursockt_N = (byte)(0) ;
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usursockt = value ;
   }

   public java.util.Vector<app.StructSdtTUSUARI_Level1Item> getLevel1( )
   {
      return gxTv_SdtTUSUARI_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtTUSUARI_Level1Item> value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTUSUARI_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTUSUARI_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Initialized = value ;
   }

   public String getUsurcod_Z( )
   {
      return gxTv_SdtTUSUARI_Usurcod_Z ;
   }

   public void setUsurcod_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurcod_Z = value ;
   }

   public String getUsurnom_Z( )
   {
      return gxTv_SdtTUSUARI_Usurnom_Z ;
   }

   public void setUsurnom_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurnom_Z = value ;
   }

   public String getUsurpwd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurpwd_Z ;
   }

   public void setUsurpwd_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurpwd_Z = value ;
   }

   public java.util.Date getUsurfec_Z( )
   {
      return gxTv_SdtTUSUARI_Usurfec_Z ;
   }

   public void setUsurfec_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurfec_Z = value ;
   }

   public String getUsumail_Z( )
   {
      return gxTv_SdtTUSUARI_Usumail_Z ;
   }

   public void setUsumail_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumail_Z = value ;
   }

   public String getUsumailp_Z( )
   {
      return gxTv_SdtTUSUARI_Usumailp_Z ;
   }

   public void setUsumailp_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailp_Z = value ;
   }

   public String getUsumailu_Z( )
   {
      return gxTv_SdtTUSUARI_Usumailu_Z ;
   }

   public void setUsumailu_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailu_Z = value ;
   }

   public boolean getUsurcmbpwd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd_Z ;
   }

   public void setUsurcmbpwd_Z( boolean value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurcmbpwd_Z = value ;
   }

   public String getUsurtkn_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtkn_Z ;
   }

   public void setUsurtkn_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkn_Z = value ;
   }

   public java.util.Date getUsurtkncrd_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd_Z ;
   }

   public void setUsurtkncrd_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkncrd_Z = value ;
   }

   public java.util.Date getUsurtknvto_Z( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto_Z ;
   }

   public void setUsurtknvto_Z( java.util.Date value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtknvto_Z = value ;
   }

   public java.util.UUID getUsurguid_Z( )
   {
      return gxTv_SdtTUSUARI_Usurguid_Z ;
   }

   public void setUsurguid_Z( java.util.UUID value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurguid_Z = value ;
   }

   public String getUsurprint_Z( )
   {
      return gxTv_SdtTUSUARI_Usurprint_Z ;
   }

   public void setUsurprint_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurprint_Z = value ;
   }

   public String getUsursockt_Z( )
   {
      return gxTv_SdtTUSUARI_Usursockt_Z ;
   }

   public void setUsursockt_Z( String value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usursockt_Z = value ;
   }

   public byte getUsurnom_N( )
   {
      return gxTv_SdtTUSUARI_Usurnom_N ;
   }

   public void setUsurnom_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurnom_N = value ;
   }

   public byte getUsurpwd_N( )
   {
      return gxTv_SdtTUSUARI_Usurpwd_N ;
   }

   public void setUsurpwd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurpwd_N = value ;
   }

   public byte getUsurfec_N( )
   {
      return gxTv_SdtTUSUARI_Usurfec_N ;
   }

   public void setUsurfec_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurfec_N = value ;
   }

   public byte getUsumailp_N( )
   {
      return gxTv_SdtTUSUARI_Usumailp_N ;
   }

   public void setUsumailp_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailp_N = value ;
   }

   public byte getUsumailu_N( )
   {
      return gxTv_SdtTUSUARI_Usumailu_N ;
   }

   public void setUsumailu_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usumailu_N = value ;
   }

   public byte getUsurcmbpwd_N( )
   {
      return gxTv_SdtTUSUARI_Usurcmbpwd_N ;
   }

   public void setUsurcmbpwd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurcmbpwd_N = value ;
   }

   public byte getUsurtkn_N( )
   {
      return gxTv_SdtTUSUARI_Usurtkn_N ;
   }

   public void setUsurtkn_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkn_N = value ;
   }

   public byte getUsurtkncrd_N( )
   {
      return gxTv_SdtTUSUARI_Usurtkncrd_N ;
   }

   public void setUsurtkncrd_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtkncrd_N = value ;
   }

   public byte getUsurtknvto_N( )
   {
      return gxTv_SdtTUSUARI_Usurtknvto_N ;
   }

   public void setUsurtknvto_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurtknvto_N = value ;
   }

   public byte getUsurguid_N( )
   {
      return gxTv_SdtTUSUARI_Usurguid_N ;
   }

   public void setUsurguid_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurguid_N = value ;
   }

   public byte getUsurprint_N( )
   {
      return gxTv_SdtTUSUARI_Usurprint_N ;
   }

   public void setUsurprint_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usurprint_N = value ;
   }

   public byte getUsursockt_N( )
   {
      return gxTv_SdtTUSUARI_Usursockt_N ;
   }

   public void setUsursockt_N( byte value )
   {
      gxTv_SdtTUSUARI_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Usursockt_N = value ;
   }

   protected byte gxTv_SdtTUSUARI_Usurnom_N ;
   protected byte gxTv_SdtTUSUARI_Usurpwd_N ;
   protected byte gxTv_SdtTUSUARI_Usurfec_N ;
   protected byte gxTv_SdtTUSUARI_Usumailp_N ;
   protected byte gxTv_SdtTUSUARI_Usumailu_N ;
   protected byte gxTv_SdtTUSUARI_Usurcmbpwd_N ;
   protected byte gxTv_SdtTUSUARI_Usurtkn_N ;
   protected byte gxTv_SdtTUSUARI_Usurtkncrd_N ;
   protected byte gxTv_SdtTUSUARI_Usurtknvto_N ;
   protected byte gxTv_SdtTUSUARI_Usurguid_N ;
   protected byte gxTv_SdtTUSUARI_Usurprint_N ;
   protected byte gxTv_SdtTUSUARI_Usursockt_N ;
   private byte gxTv_SdtTUSUARI_N ;
   protected short gxTv_SdtTUSUARI_Initialized ;
   protected String gxTv_SdtTUSUARI_Usurcod ;
   protected String gxTv_SdtTUSUARI_Usurnom ;
   protected String gxTv_SdtTUSUARI_Usurpwd ;
   protected String gxTv_SdtTUSUARI_Usumail ;
   protected String gxTv_SdtTUSUARI_Mode ;
   protected String gxTv_SdtTUSUARI_Usurcod_Z ;
   protected String gxTv_SdtTUSUARI_Usurnom_Z ;
   protected String gxTv_SdtTUSUARI_Usurpwd_Z ;
   protected String gxTv_SdtTUSUARI_Usumail_Z ;
   protected boolean gxTv_SdtTUSUARI_Usurcmbpwd ;
   protected boolean gxTv_SdtTUSUARI_Usurcmbpwd_Z ;
   protected String gxTv_SdtTUSUARI_Usumailp ;
   protected String gxTv_SdtTUSUARI_Usumailu ;
   protected String gxTv_SdtTUSUARI_Usurtkn ;
   protected String gxTv_SdtTUSUARI_Usurprint ;
   protected String gxTv_SdtTUSUARI_Usursockt ;
   protected String gxTv_SdtTUSUARI_Usumailp_Z ;
   protected String gxTv_SdtTUSUARI_Usumailu_Z ;
   protected String gxTv_SdtTUSUARI_Usurtkn_Z ;
   protected String gxTv_SdtTUSUARI_Usurprint_Z ;
   protected String gxTv_SdtTUSUARI_Usursockt_Z ;
   protected java.util.UUID gxTv_SdtTUSUARI_Usurguid ;
   protected java.util.UUID gxTv_SdtTUSUARI_Usurguid_Z ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurfec ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurtkncrd ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurtknvto ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurfec_Z ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurtkncrd_Z ;
   protected java.util.Date gxTv_SdtTUSUARI_Usurtknvto_Z ;
   protected java.util.Vector<app.StructSdtTUSUARI_Level1Item> gxTv_SdtTUSUARI_Level1=null ;
}

