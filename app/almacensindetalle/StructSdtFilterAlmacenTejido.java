package app.almacensindetalle ;
import com.genexus.*;

public final  class StructSdtFilterAlmacenTejido implements Cloneable, java.io.Serializable
{
   public StructSdtFilterAlmacenTejido( )
   {
      this( -1, new ModelContext( StructSdtFilterAlmacenTejido.class ));
   }

   public StructSdtFilterAlmacenTejido( int remoteHandle ,
                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom = cal.getTime() ;
      gxTv_SdtFilterAlmacenTejido_Albrfento = cal.getTime() ;
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(1) ;
      gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(1) ;
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

   public int getAlbreccod( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albreccod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFilterAlmacenTejido_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Clicod = value ;
   }

   public java.util.Date getAlbrfenfrom( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrfenfrom ;
   }

   public void setAlbrfenfrom( java.util.Date value )
   {
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom = value ;
   }

   public java.util.Date getAlbrfento( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrfento ;
   }

   public void setAlbrfento( java.util.Date value )
   {
      gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrfento = value ;
   }

   public byte getAlbrest( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrest ;
   }

   public void setAlbrest( byte value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrest = value ;
   }

   protected byte gxTv_SdtFilterAlmacenTejido_Albrest ;
   protected byte gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N ;
   protected byte gxTv_SdtFilterAlmacenTejido_Albrfento_N ;
   protected byte gxTv_SdtFilterAlmacenTejido_N ;
   protected int gxTv_SdtFilterAlmacenTejido_Albreccod ;
   protected int gxTv_SdtFilterAlmacenTejido_Clicod ;
   protected java.util.Date gxTv_SdtFilterAlmacenTejido_Albrfenfrom ;
   protected java.util.Date gxTv_SdtFilterAlmacenTejido_Albrfento ;
}

