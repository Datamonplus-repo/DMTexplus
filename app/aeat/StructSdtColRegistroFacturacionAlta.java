package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta.class ));
   }

   public StructSdtColRegistroFacturacionAlta( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta( java.util.Vector<StructSdtRegistroFacturacionAlta> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta> item = new java.util.Vector<>();
}

