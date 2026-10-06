package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtMAnt_ErroresClienteArticuloSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMAnt_ErroresClienteArticuloSDT( )
   {
      this( -1, new ModelContext( StructSdtMAnt_ErroresClienteArticuloSDT.class ));
   }

   public StructSdtMAnt_ErroresClienteArticuloSDT( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc = "" ;
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
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod ;
   }

   public void setMantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod = value ;
   }

   public int getMantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod ;
   }

   public void setMantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod = value ;
   }

   public String getMantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom ;
   }

   public void setMantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom = value ;
   }

   public String getMantartcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod ;
   }

   public void setMantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod = value ;
   }

   public String getMantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc ;
   }

   public void setMantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc = value ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteArticuloSDT_N ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc ;
}

