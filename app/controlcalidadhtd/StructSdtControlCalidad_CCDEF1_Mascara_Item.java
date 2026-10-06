package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlCalidad_CCDEF1_Mascara_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CCDEF1_Mascara_Item( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CCDEF1_Mascara_Item.class ));
   }

   public StructSdtControlCalidad_CCDEF1_Mascara_Item( int remoteHandle ,
                                                       ModelContext context )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor = "" ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion = "" ;
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

   public String getValor( )
   {
      return gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor ;
   }

   public void setValor( String value )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion = value ;
   }

   protected byte gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N ;
   protected String gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor ;
   protected String gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion ;
}

