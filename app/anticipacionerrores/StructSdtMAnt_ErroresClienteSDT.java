package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtMAnt_ErroresClienteSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMAnt_ErroresClienteSDT( )
   {
      this( -1, new ModelContext( StructSdtMAnt_ErroresClienteSDT.class ));
   }

   public StructSdtMAnt_ErroresClienteSDT( int remoteHandle ,
                                           ModelContext context )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom = "" ;
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

   public String getMantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod ;
   }

   public void setMantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod = value ;
   }

   public int getMantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod ;
   }

   public void setMantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod = value ;
   }

   public String getMantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom ;
   }

   public void setMantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom = value ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteSDT_N ;
   protected int gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod ;
   protected String gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom ;
}

