package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterDocumentoTransporteProveedor_1", namespace ="TexplusNET")
public final  class StructSdtColFilterDocumentoTransporteProveedor_1 implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterDocumentoTransporteProveedor_1( )
   {
      this( -1, new ModelContext( StructSdtColFilterDocumentoTransporteProveedor_1.class ));
   }

   public StructSdtColFilterDocumentoTransporteProveedor_1( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColFilterDocumentoTransporteProveedor_1( java.util.Vector<StructSdtFilterDocumentoTransporteProveedor_1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterDocumentoTransporteProveedor_1",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterDocumentoTransporteProveedor_1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterDocumentoTransporteProveedor_1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterDocumentoTransporteProveedor_1> item = new java.util.Vector<>();
}

