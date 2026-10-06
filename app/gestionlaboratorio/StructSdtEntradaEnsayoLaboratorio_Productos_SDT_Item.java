package app.gestionlaboratorio ;
import com.genexus.*;

public final  class StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item.class ));
   }

   public StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum = "" ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom = "" ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc = "" ;
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
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar = value ;
   }

   public short getLb_lingru( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru ;
   }

   public void setLb_lingru( short value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru = value ;
   }

   public String getPrdnum( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom = value ;
   }

   public byte getValcod( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod ;
   }

   public void setValcod( byte value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod = value ;
   }

   public String getValdsc( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc ;
   }

   public void setValdsc( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc = value ;
   }

   protected byte gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod ;
   protected byte gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N ;
   protected short gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc ;
   protected boolean gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar ;
}

