package app ;
import com.genexus.*;

public final  class StructSdtSDTClientesDefectos_DefectosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientesDefectos_DefectosItem( )
   {
      this( -1, new ModelContext( StructSdtSDTClientesDefectos_DefectosItem.class ));
   }

   public StructSdtSDTClientesDefectos_DefectosItem( int remoteHandle ,
                                                     ModelContext context )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc = "" ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto = new java.math.BigDecimal(0) ;
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

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getKilosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto ;
   }

   public void setKilosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto = value ;
   }

   public java.math.BigDecimal getMetrosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto ;
   }

   public void setMetrosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectos_DefectosItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto = value ;
   }

   protected byte gxTv_SdtSDTClientesDefectos_DefectosItem_N ;
   protected String gxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto ;
}

