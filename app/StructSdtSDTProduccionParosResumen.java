package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionParosResumen implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionParosResumen( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionParosResumen.class ));
   }

   public StructSdtSDTProduccionParosResumen( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtSDTProduccionParosResumen_Maqcod = "" ;
      gxTv_SdtSDTProduccionParosResumen_Maqdsc = "" ;
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(1) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem> getParos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Paros ;
   }

   public void setParos( java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem> value )
   {
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Paros = value ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_Paros_N ;
   protected byte gxTv_SdtSDTProduccionParosResumen_N ;
   protected String gxTv_SdtSDTProduccionParosResumen_Maqcod ;
   protected String gxTv_SdtSDTProduccionParosResumen_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTProduccionParosResumen_ParosItem> gxTv_SdtSDTProduccionParosResumen_Paros=null ;
}

