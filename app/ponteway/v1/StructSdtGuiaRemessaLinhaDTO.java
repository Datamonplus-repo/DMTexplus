package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtGuiaRemessaLinhaDTO implements Cloneable, java.io.Serializable
{
   public StructSdtGuiaRemessaLinhaDTO( )
   {
      this( -1, new ModelContext( StructSdtGuiaRemessaLinhaDTO.class ));
   }

   public StructSdtGuiaRemessaLinhaDTO( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(1) ;
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

   public java.util.Vector<app.ponteway.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> getGuiasremessa( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa ;
   }

   public void setGuiasremessa( java.util.Vector<app.ponteway.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa = value ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_N ;
   protected java.util.Vector<app.ponteway.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa=null ;
}

