package app.documentotransportecomercial ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterdocumentotransportecomercial_cabeceraww", namespace ="TexplusNET")
public final  class StructSdtColFilterdocumentotransportecomercial_cabeceraww implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterdocumentotransportecomercial_cabeceraww( )
   {
      this( -1, new ModelContext( StructSdtColFilterdocumentotransportecomercial_cabeceraww.class ));
   }

   public StructSdtColFilterdocumentotransportecomercial_cabeceraww( int remoteHandle ,
                                                                     ModelContext context )
   {
   }

   public  StructSdtColFilterdocumentotransportecomercial_cabeceraww( java.util.Vector<StructSdtFilterdocumentotransportecomercial_cabeceraww> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Filterdocumentotransportecomercial_cabeceraww",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterdocumentotransportecomercial_cabeceraww> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterdocumentotransportecomercial_cabeceraww> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterdocumentotransportecomercial_cabeceraww> item = new java.util.Vector<>();
}

