package app.expedicionesautomatizadas ;
import com.genexus.*;

public final  class StructSdtSDT_Hdr implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_Hdr( )
   {
      this( -1, new ModelContext( StructSdtSDT_Hdr.class ));
   }

   public StructSdtSDT_Hdr( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDT_Hdr_Emprcod = "" ;
      gxTv_SdtSDT_Hdr_Barcodpar = "" ;
      gxTv_SdtSDT_Hdr_Clinom = "" ;
      gxTv_SdtSDT_Hdr_Disdes = "" ;
      gxTv_SdtSDT_Hdr_Barser = "" ;
      gxTv_SdtSDT_Hdr_Barserdsc = "" ;
      gxTv_SdtSDT_Hdr_Barcolnom = "" ;
      gxTv_SdtSDT_Hdr_Barnomcli = "" ;
      gxTv_SdtSDT_Hdr_Barfecgen = cal.getTime() ;
      gxTv_SdtSDT_Hdr_Bardisnum = "" ;
      gxTv_SdtSDT_Hdr_Barunimed = "" ;
      gxTv_SdtSDT_Hdr_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Hdr_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Hdr_Barrdt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Hdr_Barhdr = "" ;
      gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtSDT_Hdr_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Emprcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtSDT_Hdr_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSDT_Hdr_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSDT_Hdr_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcodpar = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDT_Hdr_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Clinom = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDT_Hdr_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Clicod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtSDT_Hdr_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Discod = value ;
   }

   public String getDisdes( )
   {
      return gxTv_SdtSDT_Hdr_Disdes ;
   }

   public void setDisdes( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Disdes = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDT_Hdr_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDT_Hdr_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barserdsc = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtSDT_Hdr_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bartipart = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDT_Hdr_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcolnum = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDT_Hdr_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcolnom = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDT_Hdr_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barnomcli = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtSDT_Hdr_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bartipcol = value ;
   }

   public java.util.Date getBarfecgen( )
   {
      return gxTv_SdtSDT_Hdr_Barfecgen ;
   }

   public void setBarfecgen( java.util.Date value )
   {
      gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barfecgen = value ;
   }

   public String getBardisnum( )
   {
      return gxTv_SdtSDT_Hdr_Bardisnum ;
   }

   public void setBardisnum( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bardisnum = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtSDT_Hdr_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barunimed = value ;
   }

   public short getBarancaca1( )
   {
      return gxTv_SdtSDT_Hdr_Barancaca1 ;
   }

   public void setBarancaca1( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barancaca1 = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtSDT_Hdr_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barmtr = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtSDT_Hdr_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barkgm = value ;
   }

   public int getBarpie( )
   {
      return gxTv_SdtSDT_Hdr_Barpie ;
   }

   public void setBarpie( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barpie = value ;
   }

   public short getBargraaca( )
   {
      return gxTv_SdtSDT_Hdr_Bargraaca ;
   }

   public void setBargraaca( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bargraaca = value ;
   }

   public short getBarpes( )
   {
      return gxTv_SdtSDT_Hdr_Barpes ;
   }

   public void setBarpes( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barpes = value ;
   }

   public java.math.BigDecimal getBarrdt( )
   {
      return gxTv_SdtSDT_Hdr_Barrdt ;
   }

   public void setBarrdt( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barrdt = value ;
   }

   public String getBarhdr( )
   {
      return gxTv_SdtSDT_Hdr_Barhdr ;
   }

   public void setBarhdr( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barhdr = value ;
   }

   protected byte gxTv_SdtSDT_Hdr_Barcodreo ;
   protected byte gxTv_SdtSDT_Hdr_Bartipcol ;
   protected byte gxTv_SdtSDT_Hdr_Barfecgen_N ;
   protected byte gxTv_SdtSDT_Hdr_N ;
   protected short gxTv_SdtSDT_Hdr_Bartipart ;
   protected short gxTv_SdtSDT_Hdr_Barancaca1 ;
   protected short gxTv_SdtSDT_Hdr_Bargraaca ;
   protected short gxTv_SdtSDT_Hdr_Barpes ;
   protected int gxTv_SdtSDT_Hdr_Barcod ;
   protected int gxTv_SdtSDT_Hdr_Clicod ;
   protected int gxTv_SdtSDT_Hdr_Discod ;
   protected int gxTv_SdtSDT_Hdr_Barcolnum ;
   protected int gxTv_SdtSDT_Hdr_Barpie ;
   protected String gxTv_SdtSDT_Hdr_Emprcod ;
   protected String gxTv_SdtSDT_Hdr_Barcodpar ;
   protected String gxTv_SdtSDT_Hdr_Clinom ;
   protected String gxTv_SdtSDT_Hdr_Disdes ;
   protected String gxTv_SdtSDT_Hdr_Barser ;
   protected String gxTv_SdtSDT_Hdr_Barserdsc ;
   protected String gxTv_SdtSDT_Hdr_Barcolnom ;
   protected String gxTv_SdtSDT_Hdr_Barnomcli ;
   protected String gxTv_SdtSDT_Hdr_Bardisnum ;
   protected String gxTv_SdtSDT_Hdr_Barunimed ;
   protected String gxTv_SdtSDT_Hdr_Barhdr ;
   protected java.util.Date gxTv_SdtSDT_Hdr_Barfecgen ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barrdt ;
}

