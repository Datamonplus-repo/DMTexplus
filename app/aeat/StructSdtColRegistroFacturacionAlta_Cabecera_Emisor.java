package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.Cabecera.Emisor", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_Cabecera_Emisor implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_Cabecera_Emisor( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_Cabecera_Emisor.class ));
   }

   public StructSdtColRegistroFacturacionAlta_Cabecera_Emisor( int remoteHandle ,
                                                               ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_Cabecera_Emisor( java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera_Emisor> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.Cabecera.Emisor",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera_Emisor> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera_Emisor> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera_Emisor> item = new java.util.Vector<>();
}

