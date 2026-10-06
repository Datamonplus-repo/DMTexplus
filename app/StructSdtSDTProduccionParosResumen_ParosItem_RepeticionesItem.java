package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem.class ));
   }

   public StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( int remoteHandle ,
                                                                         ModelContext context )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos = new java.math.BigDecimal(0) ;
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

   public short getNumeroparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos ;
   }

   public void setNumeroparos( short value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos = value ;
   }

   public int getTiempoparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos ;
   }

   public void setTiempoparos( int value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos = value ;
   }

   public java.math.BigDecimal getHhmmparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos ;
   }

   public void setHhmmparos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos = value ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N ;
   protected short gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos ;
   protected int gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos ;
}

