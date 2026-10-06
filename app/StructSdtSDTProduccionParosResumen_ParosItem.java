package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionParosResumen_ParosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionParosResumen_ParosItem( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionParosResumen_ParosItem.class ));
   }

   public StructSdtSDTProduccionParosResumen_ParosItem( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom = "" ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(1) ;
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

   public short getParcod( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom = value ;
   }

   public java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> getRepeticiones( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones ;
   }

   public void setRepeticiones( java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones = value ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N ;
   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_N ;
   protected short gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod ;
   protected String gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom ;
   protected java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones=null ;
}

