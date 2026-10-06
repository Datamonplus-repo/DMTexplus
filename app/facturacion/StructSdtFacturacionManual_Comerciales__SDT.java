package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "FacturacionManual_Comerciales__SDT", namespace ="TexplusNET")
public final  class StructSdtFacturacionManual_Comerciales__SDT implements Cloneable, java.io.Serializable
{
   public StructSdtFacturacionManual_Comerciales__SDT( )
   {
      this( -1, new ModelContext( StructSdtFacturacionManual_Comerciales__SDT.class ));
   }

   public StructSdtFacturacionManual_Comerciales__SDT( int remoteHandle ,
                                                       ModelContext context )
   {
   }

   public  StructSdtFacturacionManual_Comerciales__SDT( java.util.Vector<StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> value )
   {
      item = value;
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

   @jakarta.xml.bind.annotation.XmlElement(name="FacturacionManual_Comerciales__SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> item = new java.util.Vector<>();
}

