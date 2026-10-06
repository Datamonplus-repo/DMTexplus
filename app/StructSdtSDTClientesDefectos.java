package app ;
import com.genexus.*;

public final  class StructSdtSDTClientesDefectos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientesDefectos( )
   {
      this( -1, new ModelContext( StructSdtSDTClientesDefectos.class ));
   }

   public StructSdtSDTClientesDefectos( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtSDTClientesDefectos_Clinom = "" ;
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(1) ;
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
      return gxTv_SdtSDTClientesDefectos_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTClientesDefectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTClientesDefectos_DefectosItem> getDefectos( )
   {
      return gxTv_SdtSDTClientesDefectos_Defectos ;
   }

   public void setDefectos( java.util.Vector<app.StructSdtSDTClientesDefectos_DefectosItem> value )
   {
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_Defectos = value ;
   }

   protected byte gxTv_SdtSDTClientesDefectos_Defectos_N ;
   protected byte gxTv_SdtSDTClientesDefectos_N ;
   protected String gxTv_SdtSDTClientesDefectos_Clinom ;
   protected java.util.Vector<app.StructSdtSDTClientesDefectos_DefectosItem> gxTv_SdtSDTClientesDefectos_Defectos=null ;
}

