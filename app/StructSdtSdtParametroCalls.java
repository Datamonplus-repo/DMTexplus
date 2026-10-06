package app ;
import com.genexus.*;

public final  class StructSdtSdtParametroCalls implements Cloneable, java.io.Serializable
{
   public StructSdtSdtParametroCalls( )
   {
      this( -1, new ModelContext( StructSdtSdtParametroCalls.class ));
   }

   public StructSdtSdtParametroCalls( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtSdtParametroCalls_Nombreparametro = "" ;
      gxTv_SdtSdtParametroCalls_Valorparametro = "" ;
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

   public String getNombreparametro( )
   {
      return gxTv_SdtSdtParametroCalls_Nombreparametro ;
   }

   public void setNombreparametro( String value )
   {
      gxTv_SdtSdtParametroCalls_N = (byte)(0) ;
      gxTv_SdtSdtParametroCalls_Nombreparametro = value ;
   }

   public String getValorparametro( )
   {
      return gxTv_SdtSdtParametroCalls_Valorparametro ;
   }

   public void setValorparametro( String value )
   {
      gxTv_SdtSdtParametroCalls_N = (byte)(0) ;
      gxTv_SdtSdtParametroCalls_Valorparametro = value ;
   }

   protected byte gxTv_SdtSdtParametroCalls_N ;
   protected String gxTv_SdtSdtParametroCalls_Nombreparametro ;
   protected String gxTv_SdtSdtParametroCalls_Valorparametro ;
}

