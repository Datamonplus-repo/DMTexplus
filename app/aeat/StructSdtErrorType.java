package app.aeat ;
import com.genexus.*;

public final  class StructSdtErrorType implements Cloneable, java.io.Serializable
{
   public StructSdtErrorType( )
   {
      this( -1, new ModelContext( StructSdtErrorType.class ));
   }

   public StructSdtErrorType( int remoteHandle ,
                              ModelContext context )
   {
      gxTv_SdtErrorType_Codigoerror = "" ;
      gxTv_SdtErrorType_Descripcionerror = "" ;
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

   public String getCodigoerror( )
   {
      return gxTv_SdtErrorType_Codigoerror ;
   }

   public void setCodigoerror( String value )
   {
      gxTv_SdtErrorType_N = (byte)(0) ;
      gxTv_SdtErrorType_Codigoerror = value ;
   }

   public String getDescripcionerror( )
   {
      return gxTv_SdtErrorType_Descripcionerror ;
   }

   public void setDescripcionerror( String value )
   {
      gxTv_SdtErrorType_N = (byte)(0) ;
      gxTv_SdtErrorType_Descripcionerror = value ;
   }

   protected byte gxTv_SdtErrorType_N ;
   protected String gxTv_SdtErrorType_Codigoerror ;
   protected String gxTv_SdtErrorType_Descripcionerror ;
}

