package app.facturacion ;
import com.genexus.*;

public final  class StructSdtDocumentos_Produccion_Comercial_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtDocumentos_Produccion_Comercial_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtDocumentos_Produccion_Comercial_SDT_Item.class ));
   }

   public StructSdtDocumentos_Produccion_Comercial_SDT_Item( int remoteHandle ,
                                                             ModelContext context )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo = "" ;
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

   public String getTipo( )
   {
      return gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo ;
   }

   public void setTipo( String value )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo = value ;
   }

   public long getDocumento( )
   {
      return gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento ;
   }

   public void setDocumento( long value )
   {
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento = value ;
   }

   protected byte gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_N ;
   protected long gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento ;
   protected String gxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo ;
}

