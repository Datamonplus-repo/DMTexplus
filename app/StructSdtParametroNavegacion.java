package app ;
import com.genexus.*;

public final  class StructSdtParametroNavegacion implements Cloneable, java.io.Serializable
{
   public StructSdtParametroNavegacion( )
   {
      this( -1, new ModelContext( StructSdtParametroNavegacion.class ));
   }

   public StructSdtParametroNavegacion( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtParametroNavegacion_Identificador = "" ;
      gxTv_SdtParametroNavegacion_Valor = "" ;
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

   public String getIdentificador( )
   {
      return gxTv_SdtParametroNavegacion_Identificador ;
   }

   public void setIdentificador( String value )
   {
      gxTv_SdtParametroNavegacion_N = (byte)(0) ;
      gxTv_SdtParametroNavegacion_Identificador = value ;
   }

   public String getValor( )
   {
      return gxTv_SdtParametroNavegacion_Valor ;
   }

   public void setValor( String value )
   {
      gxTv_SdtParametroNavegacion_N = (byte)(0) ;
      gxTv_SdtParametroNavegacion_Valor = value ;
   }

   protected byte gxTv_SdtParametroNavegacion_N ;
   protected String gxTv_SdtParametroNavegacion_Identificador ;
   protected String gxTv_SdtParametroNavegacion_Valor ;
}

