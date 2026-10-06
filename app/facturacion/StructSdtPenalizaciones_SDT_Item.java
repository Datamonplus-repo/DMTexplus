package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPenalizaciones_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPenalizaciones_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPenalizaciones_SDT_Item.class ));
   }

   public StructSdtPenalizaciones_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnom = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodpar = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Precio = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Clinom = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddsc = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baracc = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins = new java.math.BigDecimal(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Mtsmins = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtPenalizaciones_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Seleccionar = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Clicod = value ;
   }

   public short getBarmancod1( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 ;
   }

   public void setBarmancod1( short value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnum = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnom = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodpar = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Albprocod = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getBaralbkgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm ;
   }

   public void setBaralbkgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm = value ;
   }

   public java.math.BigDecimal getPmddtotin( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin ;
   }

   public void setPmddtotin( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin = value ;
   }

   public java.math.BigDecimal getPmddtoaca( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca ;
   }

   public void setPmddtoaca( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca = value ;
   }

   public java.math.BigDecimal getPmdtinprc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc ;
   }

   public void setPmdtinprc( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc = value ;
   }

   public java.math.BigDecimal getPmdacaprc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc ;
   }

   public void setPmdacaprc( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc = value ;
   }

   public java.math.BigDecimal getPrecio( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Precio ;
   }

   public void setPrecio( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Precio = value ;
   }

   public java.math.BigDecimal getBarprekgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barprekgm ;
   }

   public void setBarprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barprekgm = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Clinom = value ;
   }

   public String getPmddsc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddsc ;
   }

   public void setPmddsc( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddsc = value ;
   }

   public byte getOkkgmin( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Okkgmin ;
   }

   public void setOkkgmin( byte value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Okkgmin = value ;
   }

   public java.math.BigDecimal getPmdpreuni( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni ;
   }

   public void setPmdpreuni( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni = value ;
   }

   public String getBaracc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Baracc ;
   }

   public void setBaracc( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baracc = value ;
   }

   public boolean getFase_618( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Fase_618 ;
   }

   public void setFase_618( boolean value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Fase_618 = value ;
   }

   public java.math.BigDecimal getPmdkgmmins( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins ;
   }

   public void setPmdkgmmins( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins = value ;
   }

   public java.math.BigDecimal getMtsmins( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Mtsmins ;
   }

   public void setMtsmins( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Mtsmins = value ;
   }

   protected byte gxTv_SdtPenalizaciones_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtPenalizaciones_SDT_Item_Okkgmin ;
   protected byte gxTv_SdtPenalizaciones_SDT_Item_N ;
   protected short gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Clicod ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Barcolnum ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Barcod ;
   protected long gxTv_SdtPenalizaciones_SDT_Item_Albprocod ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Barcolnom ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Barcodpar ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Clinom ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Pmddsc ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Baracc ;
   protected boolean gxTv_SdtPenalizaciones_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtPenalizaciones_SDT_Item_Fase_618 ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Precio ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Barprekgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Mtsmins ;
}

