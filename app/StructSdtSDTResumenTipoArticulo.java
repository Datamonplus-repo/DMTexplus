package app ;
import com.genexus.*;

public final  class StructSdtSDTResumenTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResumenTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtSDTResumenTipoArticulo.class ));
   }

   public StructSdtSDTResumenTipoArticulo( int remoteHandle ,
                                           ModelContext context )
   {
      gxTv_SdtSDTResumenTipoArticulo_Tipartdsc = "" ;
      gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public short getHisprotip( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Hisprotip ;
   }

   public void setHisprotip( short value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Hisprotip = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Tipartdsc = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTResumenTipoArticulo_N ;
   protected short gxTv_SdtSDTResumenTipoArticulo_Hisprotip ;
   protected String gxTv_SdtSDTResumenTipoArticulo_Tipartdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion ;
}

