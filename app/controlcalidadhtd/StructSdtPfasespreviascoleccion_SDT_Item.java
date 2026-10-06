package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtPfasespreviascoleccion_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPfasespreviascoleccion_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPfasespreviascoleccion_SDT_Item.class ));
   }

   public StructSdtPfasespreviascoleccion_SDT_Item( int remoteHandle ,
                                                    ModelContext context )
   {
      gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion = "" ;
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

   public String getFasedescripcion( )
   {
      return gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion ;
   }

   public void setFasedescripcion( String value )
   {
      gxTv_SdtPfasespreviascoleccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion = value ;
   }

   protected byte gxTv_SdtPfasespreviascoleccion_SDT_Item_N ;
   protected String gxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion ;
}

