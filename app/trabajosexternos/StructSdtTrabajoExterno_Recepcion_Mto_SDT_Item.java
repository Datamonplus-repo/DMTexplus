package app.trabajosexternos ;
import com.genexus.*;

public final  class StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item.class ));
   }

   public StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item( int remoteHandle ,
                                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = cal.getTime() ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(1) ;
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
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar = value ;
   }

   public java.util.Date getRpexhdfe( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe ;
   }

   public void setRpexhdfe( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = value ;
   }

   public int getRpexhdalb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb ;
   }

   public void setRpexhdalb( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb = value ;
   }

   public short getRpexhdli( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli ;
   }

   public void setRpexhdli( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc = value ;
   }

   public java.math.BigDecimal getRpexhdkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs ;
   }

   public void setRpexhdkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs = value ;
   }

   public java.math.BigDecimal getRpexhdmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts ;
   }

   public void setRpexhdmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts = value ;
   }

   public short getRpexhdcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns ;
   }

   public void setRpexhdcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns = value ;
   }

   public short getRpexsalln( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln ;
   }

   public void setRpexsalln( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln = value ;
   }

   public String getRpexhdtip( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip ;
   }

   public void setRpexhdtip( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip = value ;
   }

   public java.math.BigDecimal getKgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs ;
   }

   public void setKgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs = value ;
   }

   public java.math.BigDecimal getMts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts ;
   }

   public void setMts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts = value ;
   }

   public int getPzs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs ;
   }

   public void setPzs( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs = value ;
   }

   public java.math.BigDecimal getOldkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs ;
   }

   public void setOldkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs = value ;
   }

   public java.math.BigDecimal getOldmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts ;
   }

   public void setOldmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts = value ;
   }

   public int getOldpzs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs ;
   }

   public void setOldpzs( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed = value ;
   }

   public boolean getCerrarfase( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase ;
   }

   public void setCerrarfase( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin = value ;
   }

   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase ;
   protected java.util.Date gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts ;
}

