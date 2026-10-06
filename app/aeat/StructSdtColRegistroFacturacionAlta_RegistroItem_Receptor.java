package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.RegistroItem.Receptor", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_RegistroItem_Receptor implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_RegistroItem_Receptor( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_RegistroItem_Receptor.class ));
   }

   public StructSdtColRegistroFacturacionAlta_RegistroItem_Receptor( int remoteHandle ,
                                                                     ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_RegistroItem_Receptor( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_Receptor> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.RegistroItem.Receptor",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_Receptor> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_Receptor> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_RegistroItem_Receptor> item = new java.util.Vector<>();
}

