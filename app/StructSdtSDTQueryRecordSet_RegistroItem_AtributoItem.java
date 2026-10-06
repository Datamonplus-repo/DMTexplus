package app ;
import com.genexus.*;

public final  class StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem.class ));
   }

   public StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem( int remoteHandle ,
                                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String = "" ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = cal.getTime() ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(1) ;
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

   public java.math.BigDecimal getValor( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor ;
   }

   public void setValor( java.math.BigDecimal value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor = value ;
   }

   public long getNumero( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero ;
   }

   public void setNumero( long value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero = value ;
   }

   public String getString( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String ;
   }

   public void setString( String value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String = value ;
   }

   public java.util.Date getData( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data ;
   }

   public void setData( java.util.Date value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = value ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N ;
   protected long gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero ;
   protected String gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String ;
   protected java.math.BigDecimal gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor ;
   protected java.util.Date gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data ;
}

