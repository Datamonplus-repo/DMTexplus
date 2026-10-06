package app ;
import com.genexus.*;

public final  class StructSdtSDTHdrsaReoperar implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHdrsaReoperar( )
   {
      this( -1, new ModelContext( StructSdtSDTHdrsaReoperar.class ));
   }

   public StructSdtSDTHdrsaReoperar( int remoteHandle ,
                                     ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTHdrsaReoperar_Barnhdr = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen = cal.getTime() ;
      gxTv_SdtSDTHdrsaReoperar_Clinom = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barser = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barserdsc = "" ;
      gxTv_SdtSDTHdrsaReoperar_Tipartdsc = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnom = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barnomcli = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsaReoperar_Baragrest = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barunimed = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcodpar = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcospro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcosany = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHdrsaReoperar_Disdes = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(1) ;
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

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barnhdr = value ;
   }

   public java.util.Date getBarfecgen( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barfecgen ;
   }

   public void setBarfecgen( java.util.Date value )
   {
      gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barserdsc = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Bartipart = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Tipartdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Bartipcol = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barnomcli = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barkgm = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barmtr = value ;
   }

   public int getBarpie( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barpie ;
   }

   public void setBarpie( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barpie = value ;
   }

   public byte getBarsit( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barsit ;
   }

   public void setBarsit( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barsit = value ;
   }

   public String getBaragrest( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Baragrest ;
   }

   public void setBaragrest( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Baragrest = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barunimed = value ;
   }

   public boolean getRctinte( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Rctinte ;
   }

   public void setRctinte( boolean value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Rctinte = value ;
   }

   public boolean getRcacabado( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Rcacabado ;
   }

   public void setRcacabado( boolean value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Rcacabado = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcodpar = value ;
   }

   public byte getBarconreo( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barconreo ;
   }

   public void setBarconreo( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barconreo = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Discod = value ;
   }

   public java.math.BigDecimal getBarcospro( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcospro ;
   }

   public void setBarcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcospro = value ;
   }

   public java.math.BigDecimal getBarcosany( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcosany ;
   }

   public void setBarcosany( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcosany = value ;
   }

   public String getDisdes( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Disdes ;
   }

   public void setDisdes( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Disdes = value ;
   }

   protected byte gxTv_SdtSDTHdrsaReoperar_Bartipcol ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barsit ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barcodreo ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barconreo ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barfecgen_N ;
   protected byte gxTv_SdtSDTHdrsaReoperar_N ;
   protected short gxTv_SdtSDTHdrsaReoperar_Bartipart ;
   protected int gxTv_SdtSDTHdrsaReoperar_Clicod ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barcolnum ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barpie ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barcod ;
   protected int gxTv_SdtSDTHdrsaReoperar_Discod ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barnhdr ;
   protected String gxTv_SdtSDTHdrsaReoperar_Clinom ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barser ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barserdsc ;
   protected String gxTv_SdtSDTHdrsaReoperar_Tipartdsc ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barcolnom ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barnomcli ;
   protected String gxTv_SdtSDTHdrsaReoperar_Baragrest ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barunimed ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barcodpar ;
   protected String gxTv_SdtSDTHdrsaReoperar_Disdes ;
   protected boolean gxTv_SdtSDTHdrsaReoperar_Rctinte ;
   protected boolean gxTv_SdtSDTHdrsaReoperar_Rcacabado ;
   protected java.util.Date gxTv_SdtSDTHdrsaReoperar_Barfecgen ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barcospro ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barcosany ;
}

