package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.RegistroItem.CabeceraFactura", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_RegistroItem_CabeceraFactura implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_RegistroItem_CabeceraFactura( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_RegistroItem_CabeceraFactura.class ));
   }

   public StructSdtColRegistroFacturacionAlta_RegistroItem_CabeceraFactura( int remoteHandle ,
                                                                            ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_RegistroItem_CabeceraFactura( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.RegistroItem.CabeceraFactura",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura> item = new java.util.Vector<>();
}

