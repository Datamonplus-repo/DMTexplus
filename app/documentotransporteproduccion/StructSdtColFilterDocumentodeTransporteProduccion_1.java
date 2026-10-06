package app.documentotransporteproduccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterDocumentodeTransporteProduccion_1", namespace ="TexplusNET")
public final  class StructSdtColFilterDocumentodeTransporteProduccion_1 implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterDocumentodeTransporteProduccion_1( )
   {
      this( -1, new ModelContext( StructSdtColFilterDocumentodeTransporteProduccion_1.class ));
   }

   public StructSdtColFilterDocumentodeTransporteProduccion_1( int remoteHandle ,
                                                               ModelContext context )
   {
   }

   public  StructSdtColFilterDocumentodeTransporteProduccion_1( java.util.Vector<StructSdtFilterDocumentodeTransporteProduccion_1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterDocumentodeTransporteProduccion_1",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterDocumentodeTransporteProduccion_1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterDocumentodeTransporteProduccion_1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterDocumentodeTransporteProduccion_1> item = new java.util.Vector<>();
}

