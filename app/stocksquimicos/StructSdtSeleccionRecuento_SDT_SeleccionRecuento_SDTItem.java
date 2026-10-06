package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem.class ));
   }

   public StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = cal.getTime() ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(1) ;
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

   public java.util.Date getRecfec( )
   {
      return gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec ;
   }

   public void setRecfec( java.util.Date value )
   {
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(0) ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N = (byte)(0) ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = value ;
   }

   protected byte gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N ;
   protected byte gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N ;
   protected java.util.Date gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec ;
}

