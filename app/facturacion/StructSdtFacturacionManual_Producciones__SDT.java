package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "FacturacionManual_Producciones__SDT", namespace ="TexplusNET")
public final  class StructSdtFacturacionManual_Producciones__SDT implements Cloneable, java.io.Serializable
{
   public StructSdtFacturacionManual_Producciones__SDT( )
   {
      this( -1, new ModelContext( StructSdtFacturacionManual_Producciones__SDT.class ));
   }

   public StructSdtFacturacionManual_Producciones__SDT( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtFacturacionManual_Producciones__SDT( java.util.Vector<StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FacturacionManual_Producciones__SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> item = new java.util.Vector<>();
}

