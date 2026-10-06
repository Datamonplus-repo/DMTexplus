package app ;
import com.genexus.*;

public final  class StructSdtSdtTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtSdtTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtSdtTipoArticulo.class ));
   }

   public StructSdtSdtTipoArticulo( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtSdtTipoArticulo_Descripcion = "" ;
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

   public short getCodigo( )
   {
      return gxTv_SdtSdtTipoArticulo_Codigo ;
   }

   public void setCodigo( short value )
   {
      gxTv_SdtSdtTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSdtTipoArticulo_Codigo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSdtTipoArticulo_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSdtTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSdtTipoArticulo_Descripcion = value ;
   }

   protected byte gxTv_SdtSdtTipoArticulo_N ;
   protected short gxTv_SdtSdtTipoArticulo_Codigo ;
   protected String gxTv_SdtSdtTipoArticulo_Descripcion ;
}

