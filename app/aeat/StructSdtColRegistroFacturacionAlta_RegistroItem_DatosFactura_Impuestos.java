package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos.class ));
   }

   public StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( int remoteHandle ,
                                                                                   ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos> item = new java.util.Vector<>();
}

