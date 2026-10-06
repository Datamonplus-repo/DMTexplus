package app ;
import com.genexus.*;

public final  class StructSdtSDTReoperados implements Cloneable, java.io.Serializable
{
   public StructSdtSDTReoperados( )
   {
      this( -1, new ModelContext( StructSdtSDTReoperados.class ));
   }

   public StructSdtSDTReoperados( int remoteHandle ,
                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTReoperados_Tiporeoperado = "" ;
      gxTv_SdtSDTReoperados_Hisreofec = cal.getTime() ;
      gxTv_SdtSDTReoperados_Hishorreo = "" ;
      gxTv_SdtSDTReoperados_Hisreohdr = "" ;
      gxTv_SdtSDTReoperados_Hisreolote = "" ;
      gxTv_SdtSDTReoperados_Tipdefdsc = "" ;
      gxTv_SdtSDTReoperados_Dsccausa = "" ;
      gxTv_SdtSDTReoperados_Rps_dsc = "" ;
      gxTv_SdtSDTReoperados_Maqcod = "" ;
      gxTv_SdtSDTReoperados_Maqdsc = "" ;
      gxTv_SdtSDTReoperados_Clinom = "" ;
      gxTv_SdtSDTReoperados_Hisbarser = "" ;
      gxTv_SdtSDTReoperados_Hisreodsc = "" ;
      gxTv_SdtSDTReoperados_Hiscolnom = "" ;
      gxTv_SdtSDTReoperados_Hisnomcli = "" ;
      gxTv_SdtSDTReoperados_Hisbarkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTReoperados_Hisbarmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTReoperados_Hisusu = "" ;
      gxTv_SdtSDTReoperados_Hisadeobs = "" ;
      gxTv_SdtSDTReoperados_Hisadesn = "" ;
      gxTv_SdtSDTReoperados_Hisaccot = "" ;
      gxTv_SdtSDTReoperados_Hisacco = "" ;
      gxTv_SdtSDTReoperados_Hisadeacct = "" ;
      gxTv_SdtSDTReoperados_Hisadeacco = "" ;
      gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(1) ;
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

   public String getTiporeoperado( )
   {
      return gxTv_SdtSDTReoperados_Tiporeoperado ;
   }

   public void setTiporeoperado( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tiporeoperado = value ;
   }

   public java.util.Date getHisreofec( )
   {
      return gxTv_SdtSDTReoperados_Hisreofec ;
   }

   public void setHisreofec( java.util.Date value )
   {
      gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreofec = value ;
   }

   public String getHishorreo( )
   {
      return gxTv_SdtSDTReoperados_Hishorreo ;
   }

   public void setHishorreo( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hishorreo = value ;
   }

   public String getHisreohdr( )
   {
      return gxTv_SdtSDTReoperados_Hisreohdr ;
   }

   public void setHisreohdr( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreohdr = value ;
   }

   public String getHisreolote( )
   {
      return gxTv_SdtSDTReoperados_Hisreolote ;
   }

   public void setHisreolote( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreolote = value ;
   }

   public short getTipdefcod( )
   {
      return gxTv_SdtSDTReoperados_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTReoperados_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tipdefdsc = value ;
   }

   public short getCodcausa( )
   {
      return gxTv_SdtSDTReoperados_Codcausa ;
   }

   public void setCodcausa( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Codcausa = value ;
   }

   public String getDsccausa( )
   {
      return gxTv_SdtSDTReoperados_Dsccausa ;
   }

   public void setDsccausa( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Dsccausa = value ;
   }

   public short getRps_cod( )
   {
      return gxTv_SdtSDTReoperados_Rps_cod ;
   }

   public void setRps_cod( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Rps_cod = value ;
   }

   public String getRps_dsc( )
   {
      return gxTv_SdtSDTReoperados_Rps_dsc ;
   }

   public void setRps_dsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Rps_dsc = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTReoperados_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTReoperados_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Maqdsc = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTReoperados_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTReoperados_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Clinom = value ;
   }

   public String getHisbarser( )
   {
      return gxTv_SdtSDTReoperados_Hisbarser ;
   }

   public void setHisbarser( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarser = value ;
   }

   public String getHisreodsc( )
   {
      return gxTv_SdtSDTReoperados_Hisreodsc ;
   }

   public void setHisreodsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreodsc = value ;
   }

   public short getHistipart( )
   {
      return gxTv_SdtSDTReoperados_Histipart ;
   }

   public void setHistipart( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Histipart = value ;
   }

   public String getHiscolnom( )
   {
      return gxTv_SdtSDTReoperados_Hiscolnom ;
   }

   public void setHiscolnom( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hiscolnom = value ;
   }

   public int getHiscolnum( )
   {
      return gxTv_SdtSDTReoperados_Hiscolnum ;
   }

   public void setHiscolnum( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hiscolnum = value ;
   }

   public byte getHistipcol( )
   {
      return gxTv_SdtSDTReoperados_Histipcol ;
   }

   public void setHistipcol( byte value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Histipcol = value ;
   }

   public String getHisnomcli( )
   {
      return gxTv_SdtSDTReoperados_Hisnomcli ;
   }

   public void setHisnomcli( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnomcli = value ;
   }

   public int getHisnumcli( )
   {
      return gxTv_SdtSDTReoperados_Hisnumcli ;
   }

   public void setHisnumcli( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnumcli = value ;
   }

   public java.math.BigDecimal getHisbarkgm( )
   {
      return gxTv_SdtSDTReoperados_Hisbarkgm ;
   }

   public void setHisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getHisbarmtr( )
   {
      return gxTv_SdtSDTReoperados_Hisbarmtr ;
   }

   public void setHisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarmtr = value ;
   }

   public short getHisnumpie( )
   {
      return gxTv_SdtSDTReoperados_Hisnumpie ;
   }

   public void setHisnumpie( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnumpie = value ;
   }

   public byte getHisopetur( )
   {
      return gxTv_SdtSDTReoperados_Hisopetur ;
   }

   public void setHisopetur( byte value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisopetur = value ;
   }

   public int getHisopecod( )
   {
      return gxTv_SdtSDTReoperados_Hisopecod ;
   }

   public void setHisopecod( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisopecod = value ;
   }

   public String getHisusu( )
   {
      return gxTv_SdtSDTReoperados_Hisusu ;
   }

   public void setHisusu( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisusu = value ;
   }

   public String getHisadeobs( )
   {
      return gxTv_SdtSDTReoperados_Hisadeobs ;
   }

   public void setHisadeobs( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeobs = value ;
   }

   public String getHisadesn( )
   {
      return gxTv_SdtSDTReoperados_Hisadesn ;
   }

   public void setHisadesn( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadesn = value ;
   }

   public String getHisaccot( )
   {
      return gxTv_SdtSDTReoperados_Hisaccot ;
   }

   public void setHisaccot( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisaccot = value ;
   }

   public String getHisacco( )
   {
      return gxTv_SdtSDTReoperados_Hisacco ;
   }

   public void setHisacco( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisacco = value ;
   }

   public String getHisadeacct( )
   {
      return gxTv_SdtSDTReoperados_Hisadeacct ;
   }

   public void setHisadeacct( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeacct = value ;
   }

   public String getHisadeacco( )
   {
      return gxTv_SdtSDTReoperados_Hisadeacco ;
   }

   public void setHisadeacco( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeacco = value ;
   }

   public int getHisreotn( )
   {
      return gxTv_SdtSDTReoperados_Hisreotn ;
   }

   public void setHisreotn( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreotn = value ;
   }

   protected byte gxTv_SdtSDTReoperados_Histipcol ;
   protected byte gxTv_SdtSDTReoperados_Hisopetur ;
   protected byte gxTv_SdtSDTReoperados_Hisreofec_N ;
   protected byte gxTv_SdtSDTReoperados_N ;
   protected short gxTv_SdtSDTReoperados_Tipdefcod ;
   protected short gxTv_SdtSDTReoperados_Codcausa ;
   protected short gxTv_SdtSDTReoperados_Rps_cod ;
   protected short gxTv_SdtSDTReoperados_Histipart ;
   protected short gxTv_SdtSDTReoperados_Hisnumpie ;
   protected int gxTv_SdtSDTReoperados_Clicod ;
   protected int gxTv_SdtSDTReoperados_Hiscolnum ;
   protected int gxTv_SdtSDTReoperados_Hisnumcli ;
   protected int gxTv_SdtSDTReoperados_Hisopecod ;
   protected int gxTv_SdtSDTReoperados_Hisreotn ;
   protected String gxTv_SdtSDTReoperados_Tiporeoperado ;
   protected String gxTv_SdtSDTReoperados_Hishorreo ;
   protected String gxTv_SdtSDTReoperados_Hisreohdr ;
   protected String gxTv_SdtSDTReoperados_Hisreolote ;
   protected String gxTv_SdtSDTReoperados_Tipdefdsc ;
   protected String gxTv_SdtSDTReoperados_Dsccausa ;
   protected String gxTv_SdtSDTReoperados_Rps_dsc ;
   protected String gxTv_SdtSDTReoperados_Maqcod ;
   protected String gxTv_SdtSDTReoperados_Maqdsc ;
   protected String gxTv_SdtSDTReoperados_Clinom ;
   protected String gxTv_SdtSDTReoperados_Hisbarser ;
   protected String gxTv_SdtSDTReoperados_Hisreodsc ;
   protected String gxTv_SdtSDTReoperados_Hiscolnom ;
   protected String gxTv_SdtSDTReoperados_Hisnomcli ;
   protected String gxTv_SdtSDTReoperados_Hisusu ;
   protected String gxTv_SdtSDTReoperados_Hisadesn ;
   protected String gxTv_SdtSDTReoperados_Hisadeobs ;
   protected String gxTv_SdtSDTReoperados_Hisaccot ;
   protected String gxTv_SdtSDTReoperados_Hisacco ;
   protected String gxTv_SdtSDTReoperados_Hisadeacct ;
   protected String gxTv_SdtSDTReoperados_Hisadeacco ;
   protected java.util.Date gxTv_SdtSDTReoperados_Hisreofec ;
   protected java.math.BigDecimal gxTv_SdtSDTReoperados_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTReoperados_Hisbarmtr ;
}

