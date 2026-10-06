package app ;
import com.genexus.*;

public final  class StructSdtSDTClientesDefectosMaquinas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientesDefectosMaquinas( )
   {
      this( -1, new ModelContext( StructSdtSDTClientesDefectosMaquinas.class ));
   }

   public StructSdtSDTClientesDefectosMaquinas( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_Clinom = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(1) ;
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

   public String getClinom( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem> getMaq( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_Maq ;
   }

   public void setMaq( java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem> value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Maq = value ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_Maq_N ;
   protected byte gxTv_SdtSDTClientesDefectosMaquinas_N ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_Clinom ;
   protected java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem> gxTv_SdtSDTClientesDefectosMaquinas_Maq=null ;
}

