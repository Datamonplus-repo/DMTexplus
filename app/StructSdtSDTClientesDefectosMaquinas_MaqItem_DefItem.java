package app ;
import com.genexus.*;

public final  class StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem( )
   {
      this( -1, new ModelContext( StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem.class ));
   }

   public StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getKilosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto ;
   }

   public void setKilosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto = value ;
   }

   public java.math.BigDecimal getMetrosdefecto( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto ;
   }

   public void setMetrosdefecto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto = value ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_N ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto ;
   protected java.math.BigDecimal gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto ;
}

