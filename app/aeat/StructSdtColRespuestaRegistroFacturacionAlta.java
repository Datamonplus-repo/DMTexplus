package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRespuestaRegistroFacturacionAlta", namespace ="TexplusNET")
public final  class StructSdtColRespuestaRegistroFacturacionAlta implements Cloneable, java.io.Serializable
{
   public StructSdtColRespuestaRegistroFacturacionAlta( )
   {
      this( -1, new ModelContext( StructSdtColRespuestaRegistroFacturacionAlta.class ));
   }

   public StructSdtColRespuestaRegistroFacturacionAlta( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtColRespuestaRegistroFacturacionAlta( java.util.Vector<StructSdtRespuestaRegistroFacturacionAlta> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RespuestaRegistroFacturacionAlta",namespace="TexplusNET")
   public java.util.Vector<StructSdtRespuestaRegistroFacturacionAlta> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRespuestaRegistroFacturacionAlta> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRespuestaRegistroFacturacionAlta> item = new java.util.Vector<>();
}

