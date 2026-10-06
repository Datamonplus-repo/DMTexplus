package app ;
import com.genexus.*;

public final  class StructSdtSdtTipoColor implements Cloneable, java.io.Serializable
{
   public StructSdtSdtTipoColor( )
   {
      this( -1, new ModelContext( StructSdtSdtTipoColor.class ));
   }

   public StructSdtSdtTipoColor( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSdtTipoColor_Descripcion = "" ;
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

   public byte getCodigo( )
   {
      return gxTv_SdtSdtTipoColor_Codigo ;
   }

   public void setCodigo( byte value )
   {
      gxTv_SdtSdtTipoColor_N = (byte)(0) ;
      gxTv_SdtSdtTipoColor_Codigo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSdtTipoColor_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSdtTipoColor_N = (byte)(0) ;
      gxTv_SdtSdtTipoColor_Descripcion = value ;
   }

   protected byte gxTv_SdtSdtTipoColor_Codigo ;
   protected byte gxTv_SdtSdtTipoColor_N ;
   protected String gxTv_SdtSdtTipoColor_Descripcion ;
}

