package app.facturacion ;
import com.genexus.*;

public final  class StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item.class ));
   }

   public StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item( int remoteHandle ,
                                                                      ModelContext context )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec = new java.math.BigDecimal(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec = new java.math.BigDecimal(0) ;
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

   public boolean getSeleccion( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion ;
   }

   public void setSeleccion( boolean value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion = value ;
   }

   public String getTabla( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla ;
   }

   public void setTabla( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla = value ;
   }

   public String getAlbenccli( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli ;
   }

   public void setAlbenccli( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol = value ;
   }

   public java.math.BigDecimal getBaralbmtre( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre ;
   }

   public void setBaralbmtre( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre = value ;
   }

   public java.math.BigDecimal getBarpremtr( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr ;
   }

   public void setBarpremtr( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr = value ;
   }

   public java.math.BigDecimal getBaralbkgme( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme ;
   }

   public void setBaralbkgme( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme = value ;
   }

   public java.math.BigDecimal getBarprekgm( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm ;
   }

   public void setBarprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm = value ;
   }

   public byte getAlbproesp( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp ;
   }

   public void setAlbproesp( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp = value ;
   }

   public java.math.BigDecimal getAlbimpman( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman ;
   }

   public void setAlbimpman( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman = value ;
   }

   public java.math.BigDecimal getAlbprorec( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec ;
   }

   public void setAlbprorec( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec = value ;
   }

   public short getGuifaslin( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin ;
   }

   public void setGuifaslin( short value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getAlbbarrec( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec ;
   }

   public void setAlbbarrec( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec = value ;
   }

   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N ;
   protected short gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin ;
   protected int gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod ;
   protected int gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc ;
   protected boolean gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec ;
}

