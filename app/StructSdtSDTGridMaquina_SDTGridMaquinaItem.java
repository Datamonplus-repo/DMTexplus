package app ;
import com.genexus.*;

public final  class StructSdtSDTGridMaquina_SDTGridMaquinaItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTGridMaquina_SDTGridMaquinaItem( )
   {
      this( -1, new ModelContext( StructSdtSDTGridMaquina_SDTGridMaquinaItem.class ));
   }

   public StructSdtSDTGridMaquina_SDTGridMaquinaItem( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod = "" ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc = "" ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc = value ;
   }

   public byte getTabla_mpreven( )
   {
      return gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven ;
   }

   public void setTabla_mpreven( byte value )
   {
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven = value ;
   }

   protected byte gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven ;
   protected byte gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_N ;
   protected String gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod ;
   protected String gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc ;
   protected boolean gxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected ;
}

