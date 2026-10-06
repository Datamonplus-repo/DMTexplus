package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeComprasMes_MesesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeComprasMes_MesesItem( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeComprasMes_MesesItem.class ));
   }

   public StructSdtSDTInformeComprasMes_MesesItem( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_Compras = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras = new java.math.BigDecimal(0) ;
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

   public byte getMes( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Mes ;
   }

   public void setMes( byte value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Mes = value ;
   }

   public java.math.BigDecimal getCompras( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Compras ;
   }

   public void setCompras( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Compras = value ;
   }

   public java.math.BigDecimal getValorcompras( )
   {
      return gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras ;
   }

   public void setValorcompras( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeComprasMes_MesesItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras = value ;
   }

   protected byte gxTv_SdtSDTInformeComprasMes_MesesItem_Mes ;
   protected byte gxTv_SdtSDTInformeComprasMes_MesesItem_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeComprasMes_MesesItem_Compras ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras ;
}

