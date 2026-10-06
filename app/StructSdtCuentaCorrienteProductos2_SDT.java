package app ;
import com.genexus.*;

public final  class StructSdtCuentaCorrienteProductos2_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtCuentaCorrienteProductos2_SDT( )
   {
      this( -1, new ModelContext( StructSdtCuentaCorrienteProductos2_SDT.class ));
   }

   public StructSdtCuentaCorrienteProductos2_SDT( int remoteHandle ,
                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = cal.getTime() ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = cal.getTime() ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(1) ;
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

   public long getCcstklin( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin ;
   }

   public void setCcstklin( long value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin = value ;
   }

   public java.util.Date getCcstkdiahora( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora ;
   }

   public void setCcstkdiahora( java.util.Date value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = value ;
   }

   public String getTipmovcc( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc ;
   }

   public void setTipmovcc( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc = value ;
   }

   public String getCcstkdsc( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc ;
   }

   public void setCcstkdsc( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc = value ;
   }

   public java.math.BigDecimal getCcstkcane( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane ;
   }

   public void setCcstkcane( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane = value ;
   }

   public java.math.BigDecimal getCcstkcans( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans ;
   }

   public void setCcstkcans( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans = value ;
   }

   public java.math.BigDecimal getCcstkpre( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre ;
   }

   public void setCcstkpre( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre = value ;
   }

   public String getCcstklot( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot ;
   }

   public void setCcstklot( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot = value ;
   }

   public short getCcstklen( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen ;
   }

   public void setCcstklen( short value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen = value ;
   }

   public int getCcstkped( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped ;
   }

   public void setCcstkped( int value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped = value ;
   }

   public String getCcstkusu( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu ;
   }

   public void setCcstkusu( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu = value ;
   }

   public int getCcstkbar( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar ;
   }

   public void setCcstkbar( int value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar = value ;
   }

   public byte getCcstkreo( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo ;
   }

   public void setCcstkreo( byte value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo = value ;
   }

   public String getCcstkpar( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar ;
   }

   public void setCcstkpar( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar = value ;
   }

   public String getCcstknhdr( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr ;
   }

   public void setCcstknhdr( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr = value ;
   }

   public java.util.Date getCcstkfec( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec ;
   }

   public void setCcstkfec( java.util.Date value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = value ;
   }

   public java.math.BigDecimal getExistencias( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias ;
   }

   public void setExistencias( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias = value ;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_N ;
   protected short gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen ;
   protected int gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped ;
   protected int gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar ;
   protected long gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr ;
   protected java.util.Date gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre ;
   protected java.util.Date gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias ;
}

