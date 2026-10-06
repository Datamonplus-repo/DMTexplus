package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRegistroFacturacionAlta.Cabecera", namespace ="https://www.agenciatributaria.gob.es/sif/verifactu")
public final  class StructSdtColRegistroFacturacionAlta_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtColRegistroFacturacionAlta_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtColRegistroFacturacionAlta_Cabecera.class ));
   }

   public StructSdtColRegistroFacturacionAlta_Cabecera( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtColRegistroFacturacionAlta_Cabecera( java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RegistroFacturacionAlta.Cabecera",namespace="https://www.agenciatributaria.gob.es/sif/verifactu")
   public java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRegistroFacturacionAlta_Cabecera> item = new java.util.Vector<>();
}

