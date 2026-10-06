package app.trabajosexternos ;
import com.genexus.*;

public final  class StructSdtTrabajoExterno_Recepcion_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno_Recepcion_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno_Recepcion_SDT_Item.class ));
   }

   public StructSdtTrabajoExterno_Recepcion_SDT_Item( int remoteHandle ,
                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = cal.getTime() ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts = new java.math.BigDecimal(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(1) ;
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
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar = value ;
   }

   public int getSalextalb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb ;
   }

   public void setSalextalb( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb = value ;
   }

   public short getSalexnln( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln ;
   }

   public void setSalexnln( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln = value ;
   }

   public java.util.Date getSalextfec( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec ;
   }

   public void setSalextfec( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc = value ;
   }

   public String getFascodn( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn ;
   }

   public void setFascodn( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc = value ;
   }

   public short getRpexhdcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns ;
   }

   public void setRpexhdcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns = value ;
   }

   public java.math.BigDecimal getRpexhdkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs ;
   }

   public void setRpexhdkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs = value ;
   }

   public java.math.BigDecimal getRpexhdmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts ;
   }

   public void setRpexhdmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts = value ;
   }

   public String getRpexhdtip( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip ;
   }

   public void setRpexhdtip( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip = value ;
   }

   public boolean getCerrarfase( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase ;
   }

   public void setCerrarfase( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase = value ;
   }

   public java.math.BigDecimal getOldkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs ;
   }

   public void setOldkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs = value ;
   }

   public java.math.BigDecimal getOldmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts ;
   }

   public void setOldmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts = value ;
   }

   public short getOldcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns ;
   }

   public void setOldcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli = value ;
   }

   public short getOrdlin( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin ;
   }

   public void setOrdlin( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin = value ;
   }

   public short getMancod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod ;
   }

   public void setMancod( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed = value ;
   }

   public byte getExhdpz( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz ;
   }

   public void setExhdpz( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz = value ;
   }

   public byte getSalexesb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb ;
   }

   public void setSalexesb( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb = value ;
   }

   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase ;
   protected java.util.Date gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts ;
}

