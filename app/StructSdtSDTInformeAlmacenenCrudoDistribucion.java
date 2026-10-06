package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenenCrudoDistribucion implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenenCrudoDistribucion( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenenCrudoDistribucion.class ));
   }

   public StructSdtSDTInformeAlmacenenCrudoDistribucion( int remoteHandle ,
                                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = cal.getTime() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = cal.getTime() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = cal.getTime() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 = value ;
   }

   public String getAlbrlote( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote ;
   }

   public void setAlbrlote( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote = value ;
   }

   public java.math.BigDecimal getUnidadesentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas ;
   }

   public void setUnidadesentradas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas = value ;
   }

   public java.math.BigDecimal getUnidadesutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas ;
   }

   public void setUnidadesutilizadas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas = value ;
   }

   public java.math.BigDecimal getUnidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres ;
   }

   public void setUnidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres = value ;
   }

   public int getPiezasentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas ;
   }

   public void setPiezasentradas( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas = value ;
   }

   public int getPiezasutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas ;
   }

   public void setPiezasutilizadas( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas = value ;
   }

   public int getPiezasdisponibles( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles ;
   }

   public void setPiezasdisponibles( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr = value ;
   }

   public java.util.Date getFechahdr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr ;
   }

   public void setFechahdr( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr = value ;
   }

   public int getBarpie( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie ;
   }

   public void setBarpie( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = value ;
   }

   public java.math.BigDecimal getBaralbkgme( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme ;
   }

   public void setBaralbkgme( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme = value ;
   }

   public java.math.BigDecimal getBaralbmtre( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre ;
   }

   public void setBaralbmtre( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre = value ;
   }

   public int getBaralbpie( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie ;
   }

   public void setBaralbpie( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie ;
   protected long gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre ;
}

