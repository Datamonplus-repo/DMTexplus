package app ;
import com.genexus.*;

public final  class StructSdtSDTConsultaMaquina_OrdenesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTConsultaMaquina_OrdenesItem( )
   {
      this( -1, new ModelContext( StructSdtSDTConsultaMaquina_OrdenesItem.class ));
   }

   public StructSdtSDTConsultaMaquina_OrdenesItem( int remoteHandle ,
                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = cal.getTime() ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion = "" ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(1) ;
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

   public long getId( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id ;
   }

   public void setId( long value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id = value ;
   }

   public int getOmcod( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod ;
   }

   public void setOmcod( int value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod = value ;
   }

   public java.util.Date getOmfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre ;
   }

   public void setOmfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = value ;
   }

   public String getOmduracion( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion ;
   }

   public void setOmduracion( String value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion = value ;
   }

   protected byte gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_OrdenesItem_N ;
   protected int gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod ;
   protected long gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id ;
   protected String gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre ;
}

