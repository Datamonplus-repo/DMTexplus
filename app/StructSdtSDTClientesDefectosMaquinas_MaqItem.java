package app ;
import com.genexus.*;

public final  class StructSdtSDTClientesDefectosMaquinas_MaqItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientesDefectosMaquinas_MaqItem( )
   {
      this( -1, new ModelContext( StructSdtSDTClientesDefectosMaquinas_MaqItem.class ));
   }

   public StructSdtSDTClientesDefectosMaquinas_MaqItem( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(1) ;
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

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> getDef( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def ;
   }

   public void setDef( java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def = value ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N ;
   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def=null ;
}

