package app ;
import com.genexus.*;

public final  class StructSdtSDTQueryRecordSet_AtributoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTQueryRecordSet_AtributoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTQueryRecordSet_AtributoItem.class ));
   }

   public StructSdtSDTQueryRecordSet_AtributoItem( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods = "" ;
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

   public String getAtributods( )
   {
      return gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods ;
   }

   public void setAtributods( String value )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods = value ;
   }

   public short getAtributotipoic( )
   {
      return gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic ;
   }

   public void setAtributotipoic( short value )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic = value ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_AtributoItem_N ;
   protected short gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic ;
   protected String gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods ;
}

