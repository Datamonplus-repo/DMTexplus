package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.RegistroItem", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_RegistroItem implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_RegistroItem( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_RegistroItem.class ));
   }

   public StructSdtColRegistroFacturacionAlta_RegistroItem( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_RegistroItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.RegistroItem",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem> item = new java.util.Vector<>();
}

