package app.formulaciontinte ;
import com.genexus.*;

public final  class StructSdtRecetadeTinte_Cierre_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtRecetadeTinte_Cierre_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtRecetadeTinte_Cierre_SDT_Item.class ));
   }

   public StructSdtRecetadeTinte_Cierre_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = cal.getTime() ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(1) ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar = value ;
   }

   public String getPesado( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado ;
   }

   public void setPesado( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado = value ;
   }

   public String getAdicion( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion ;
   }

   public void setAdicion( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion = value ;
   }

   public short getIncidencias( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias ;
   }

   public void setIncidencias( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar = value ;
   }

   public short getReclinmaq( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq ;
   }

   public void setReclinmaq( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq = value ;
   }

   public byte getBarsit( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit ;
   }

   public void setBarsit( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit = value ;
   }

   public String getBaragrest( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest ;
   }

   public void setBaragrest( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli = value ;
   }

   public int getBarnumcli( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli ;
   }

   public void setBarnumcli( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod = value ;
   }

   public java.math.BigDecimal getRectotkgm( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm ;
   }

   public void setRectotkgm( java.math.BigDecimal value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm = value ;
   }

   public int getRecvolprd( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd ;
   }

   public void setRecvolprd( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd = value ;
   }

   public java.util.Date getRecfecalt( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt ;
   }

   public void setRecfecalt( java.util.Date value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = value ;
   }

   public short getBarnumany( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany ;
   }

   public void setBarnumany( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany = value ;
   }

   public byte getLconti( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti ;
   }

   public void setLconti( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti = value ;
   }

   public byte getHisreh( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh ;
   }

   public void setHisreh( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh = value ;
   }

   public String getBatchcode( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode ;
   }

   public void setBatchcode( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode = value ;
   }

   public long getWeigprodid( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid ;
   }

   public void setWeigprodid( long value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid = value ;
   }

   public short getColorservicedatos( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos ;
   }

   public void setColorservicedatos( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos = value ;
   }

   public int getRecnropar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar ;
   }

   public void setRecnropar( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar = value ;
   }

   public String getRechayany( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany ;
   }

   public void setRechayany( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany = value ;
   }

   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar ;
   protected long gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany ;
   protected boolean gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar ;
   protected java.math.BigDecimal gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm ;
   protected java.util.Date gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt ;
}

