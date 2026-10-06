package app.pedidos ;
import com.genexus.*;

public final  class StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem.class ));
   }

   public StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( int remoteHandle ,
                                                                        ModelContext context )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc = "" ;
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

   public boolean getSeleccion( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion ;
   }

   public void setSeleccion( boolean value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion = value ;
   }

   public short getTipprecod( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod ;
   }

   public void setTipprecod( short value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod = value ;
   }

   public String getTippredsc( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc ;
   }

   public void setTippredsc( String value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc = value ;
   }

   protected byte gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N ;
   protected short gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod ;
   protected String gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc ;
   protected boolean gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion ;
}

