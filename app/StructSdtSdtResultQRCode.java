package app ;
import com.genexus.*;

public final  class StructSdtSdtResultQRCode implements Cloneable, java.io.Serializable
{
   public StructSdtSdtResultQRCode( )
   {
      this( -1, new ModelContext( StructSdtSdtResultQRCode.class ));
   }

   public StructSdtSdtResultQRCode( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(1) ;
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

   public app.StructSdtSdtQRCode getResult( )
   {
      return gxTv_SdtSdtResultQRCode_Result ;
   }

   public void setResult( app.StructSdtSdtQRCode value )
   {
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(0) ;
      gxTv_SdtSdtResultQRCode_N = (byte)(0) ;
      gxTv_SdtSdtResultQRCode_Result = value;
   }

   protected byte gxTv_SdtSdtResultQRCode_Result_N ;
   protected byte gxTv_SdtSdtResultQRCode_N ;
   protected app.StructSdtSdtQRCode gxTv_SdtSdtResultQRCode_Result=null ;
}

