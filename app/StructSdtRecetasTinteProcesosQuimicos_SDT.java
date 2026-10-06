package app ;
import com.genexus.*;

public final  class StructSdtRecetasTinteProcesosQuimicos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtRecetasTinteProcesosQuimicos_SDT( )
   {
      this( -1, new ModelContext( StructSdtRecetasTinteProcesosQuimicos_SDT.class ));
   }

   public StructSdtRecetasTinteProcesosQuimicos_SDT( int remoteHandle ,
                                                     ModelContext context )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod = "" ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc = "" ;
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

   public boolean getEliminar( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar ;
   }

   public void setEliminar( boolean value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar = value ;
   }

   public short getNumerodelinea( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea ;
   }

   public void setNumerodelinea( short value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea = value ;
   }

   public String getProforcod( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod ;
   }

   public void setProforcod( String value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod = value ;
   }

   public String getProfordsc( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc ;
   }

   public void setProfordsc( String value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc = value ;
   }

   protected byte gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N ;
   protected short gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea ;
   protected String gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod ;
   protected String gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc ;
   protected boolean gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar ;
}

