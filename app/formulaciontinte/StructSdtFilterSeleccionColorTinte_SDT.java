package app.formulaciontinte ;
import com.genexus.*;

public final  class StructSdtFilterSeleccionColorTinte_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtFilterSeleccionColorTinte_SDT( )
   {
      this( -1, new ModelContext( StructSdtFilterSeleccionColorTinte_SDT.class ));
   }

   public StructSdtFilterSeleccionColorTinte_SDT( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forser = "" ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom = "" ;
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

   public int getClicod( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod = value ;
   }

   public String getForser( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forser ;
   }

   public void setForser( String value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forser = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtFilterSeleccionColorTinte_SDT_N = (byte)(0) ;
      gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod = value ;
   }

   protected byte gxTv_SdtFilterSeleccionColorTinte_SDT_Tipcolcod ;
   protected byte gxTv_SdtFilterSeleccionColorTinte_SDT_N ;
   protected int gxTv_SdtFilterSeleccionColorTinte_SDT_Clicod ;
   protected int gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnum ;
   protected String gxTv_SdtFilterSeleccionColorTinte_SDT_Forser ;
   protected String gxTv_SdtFilterSeleccionColorTinte_SDT_Forcolnom ;
}

