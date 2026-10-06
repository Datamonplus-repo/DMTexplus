package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPrecios_cliente_mailsclientes_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPrecios_cliente_mailsclientes_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPrecios_cliente_mailsclientes_SDT_Item.class ));
   }

   public StructSdtPrecios_cliente_mailsclientes_SDT_Item( int remoteHandle ,
                                                           ModelContext context )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente = "" ;
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
      return gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar = value ;
   }

   public String getEmailcliente( )
   {
      return gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente ;
   }

   public void setEmailcliente( String value )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente = value ;
   }

   protected byte gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N ;
   protected boolean gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar ;
   protected String gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente ;
}

