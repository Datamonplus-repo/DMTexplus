package app ;
import com.genexus.*;

public final  class StructSdtSdtRecepcionPedido implements Cloneable, java.io.Serializable
{
   public StructSdtSdtRecepcionPedido( )
   {
      this( -1, new ModelContext( StructSdtSdtRecepcionPedido.class ));
   }

   public StructSdtSdtRecepcionPedido( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtSdtRecepcionPedido_Kilos = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtRecepcionPedido_Metros = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtRecepcionPedido_Kilosuti = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtRecepcionPedido_Metrosuti = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(1) ;
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

   public int getAlbreccod( )
   {
      return gxTv_SdtSdtRecepcionPedido_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Albreccod = value ;
   }

   public int getPiezas( )
   {
      return gxTv_SdtSdtRecepcionPedido_Piezas ;
   }

   public void setPiezas( int value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Piezas = value ;
   }

   public java.math.BigDecimal getKilos( )
   {
      return gxTv_SdtSdtRecepcionPedido_Kilos ;
   }

   public void setKilos( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Kilos = value ;
   }

   public java.math.BigDecimal getMetros( )
   {
      return gxTv_SdtSdtRecepcionPedido_Metros ;
   }

   public void setMetros( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Metros = value ;
   }

   public java.math.BigDecimal getKilosuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Kilosuti ;
   }

   public void setKilosuti( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Kilosuti = value ;
   }

   public java.math.BigDecimal getMetrosuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Metrosuti ;
   }

   public void setMetrosuti( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Metrosuti = value ;
   }

   public short getPiezasuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Piezasuti ;
   }

   public void setPiezasuti( short value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Piezasuti = value ;
   }

   public java.util.Vector<app.StructSdtSdtPiezasPedido> getDetalle( )
   {
      return gxTv_SdtSdtRecepcionPedido_Detalle ;
   }

   public void setDetalle( java.util.Vector<app.StructSdtSdtPiezasPedido> value )
   {
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Detalle = value ;
   }

   protected byte gxTv_SdtSdtRecepcionPedido_Detalle_N ;
   protected byte gxTv_SdtSdtRecepcionPedido_N ;
   protected short gxTv_SdtSdtRecepcionPedido_Piezasuti ;
   protected int gxTv_SdtSdtRecepcionPedido_Albreccod ;
   protected int gxTv_SdtSdtRecepcionPedido_Piezas ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Kilos ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Metros ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Kilosuti ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Metrosuti ;
   protected java.util.Vector<app.StructSdtSdtPiezasPedido> gxTv_SdtSdtRecepcionPedido_Detalle=null ;
}

