package app ;
import com.genexus.*;

public final  class StructSdtSDTCompraProductoQuimico_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCompraProductoQuimico_Item( )
   {
      this( -1, new ModelContext( StructSdtSDTCompraProductoQuimico_Item.class ));
   }

   public StructSdtSDTCompraProductoQuimico_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Disponible = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc = "" ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valor = new java.math.BigDecimal(0) ;
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

   public String getPrdnum( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdcanpen( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen ;
   }

   public void setPrdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen = value ;
   }

   public java.math.BigDecimal getDisponible( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Disponible ;
   }

   public void setDisponible( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Disponible = value ;
   }

   public String getValdsc( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc ;
   }

   public void setValdsc( String value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc = value ;
   }

   public java.math.BigDecimal getCantidad( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad ;
   }

   public void setCantidad( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact = value ;
   }

   public java.math.BigDecimal getValor( )
   {
      return gxTv_SdtSDTCompraProductoQuimico_Item_Valor ;
   }

   public void setValor( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCompraProductoQuimico_Item_N = (byte)(0) ;
      gxTv_SdtSDTCompraProductoQuimico_Item_Valor = value ;
   }

   protected byte gxTv_SdtSDTCompraProductoQuimico_Item_N ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Prdnum ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Prdnom ;
   protected String gxTv_SdtSDTCompraProductoQuimico_Item_Valdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Disponible ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Cantidad ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtSDTCompraProductoQuimico_Item_Valor ;
}

