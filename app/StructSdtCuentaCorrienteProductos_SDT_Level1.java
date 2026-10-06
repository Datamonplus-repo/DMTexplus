package app ;
import com.genexus.*;

public final  class StructSdtCuentaCorrienteProductos_SDT_Level1 implements Cloneable, java.io.Serializable
{
   public StructSdtCuentaCorrienteProductos_SDT_Level1( )
   {
      this( -1, new ModelContext( StructSdtCuentaCorrienteProductos_SDT_Level1.class ));
   }

   public StructSdtCuentaCorrienteProductos_SDT_Level1( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos = new java.math.BigDecimal(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getCompras( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras ;
   }

   public void setCompras( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras = value ;
   }

   public java.math.BigDecimal getConsumos( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos ;
   }

   public void setConsumos( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos = value ;
   }

   public java.math.BigDecimal getDevoluciones( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones ;
   }

   public void setDevoluciones( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones = value ;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones ;
}

