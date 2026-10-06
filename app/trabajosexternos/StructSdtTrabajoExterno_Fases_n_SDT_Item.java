package app.trabajosexternos ;
import com.genexus.*;

public final  class StructSdtTrabajoExterno_Fases_n_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno_Fases_n_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno_Fases_n_SDT_Item.class ));
   }

   public StructSdtTrabajoExterno_Fases_n_SDT_Item( int remoteHandle ,
                                                    ModelContext context )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod = "" ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod = "" ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc = "" ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc = value ;
   }

   protected byte gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_N ;
   protected short gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod ;
   protected String gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc ;
   protected boolean gxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar ;
}

