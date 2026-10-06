package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos.IVA", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA.class ));
   }

   public StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( int remoteHandle ,
                                                                                       ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos.IVA",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA> item = new java.util.Vector<>();
}

