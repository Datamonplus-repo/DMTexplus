package app ;
import com.genexus.*;

public final  class StructSdtSDTForColNom implements Cloneable, java.io.Serializable
{
   public StructSdtSDTForColNom( )
   {
      this( -1, new ModelContext( StructSdtSDTForColNom.class ));
   }

   public StructSdtSDTForColNom( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDTForColNom_Codigo = "" ;
      gxTv_SdtSDTForColNom_Descripcion = "" ;
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

   public String getCodigo( )
   {
      return gxTv_SdtSDTForColNom_Codigo ;
   }

   public void setCodigo( String value )
   {
      gxTv_SdtSDTForColNom_N = (byte)(0) ;
      gxTv_SdtSDTForColNom_Codigo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTForColNom_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTForColNom_N = (byte)(0) ;
      gxTv_SdtSDTForColNom_Descripcion = value ;
   }

   protected byte gxTv_SdtSDTForColNom_N ;
   protected String gxTv_SdtSDTForColNom_Codigo ;
   protected String gxTv_SdtSDTForColNom_Descripcion ;
}

