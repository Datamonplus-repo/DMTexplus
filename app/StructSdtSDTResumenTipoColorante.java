package app ;
import com.genexus.*;

public final  class StructSdtSDTResumenTipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResumenTipoColorante( )
   {
      this( -1, new ModelContext( StructSdtSDTResumenTipoColorante.class ));
   }

   public StructSdtSDTResumenTipoColorante( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtSDTResumenTipoColorante_Tipcoldsc = "" ;
      gxTv_SdtSDTResumenTipoColorante_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTResumenTipoColorante_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public byte getHisprotc( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Hisprotc ;
   }

   public void setHisprotc( byte value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Hisprotc = value ;
   }

   public String getTipcoldsc( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Tipcoldsc ;
   }

   public void setTipcoldsc( String value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTResumenTipoColorante_Hisprotc ;
   protected byte gxTv_SdtSDTResumenTipoColorante_N ;
   protected String gxTv_SdtSDTResumenTipoColorante_Tipcoldsc ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoColorante_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoColorante_Metrosproduccion ;
}

