package app ;
import com.genexus.*;

public final  class StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem.class ));
   }

   public StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( int remoteHandle ,
                                                                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = cal.getTime() ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = cal.getTime() ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol = value ;
   }

   public java.math.BigDecimal getBarpiekil( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil ;
   }

   public void setBarpiekil( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil = value ;
   }

   public java.math.BigDecimal getBarpiemet( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet ;
   }

   public void setBarpiemet( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet = value ;
   }

   public int getBarpiepie( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie ;
   }

   public void setBarpiepie( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = value ;
   }

   public java.math.BigDecimal getBaralbkgm( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm ;
   }

   public void setBaralbkgm( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm = value ;
   }

   public java.math.BigDecimal getBaralbmtr( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr ;
   }

   public void setBaralbmtr( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr = value ;
   }

   public int getBaralbpie( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie ;
   }

   public void setBaralbpie( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie = value ;
   }

   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie ;
   protected long gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom ;
   protected java.util.Date gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet ;
   protected java.util.Date gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr ;
}

