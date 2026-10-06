package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesProductos_Cabecera", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesProductos_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesProductos_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesProductos_Cabecera.class ));
   }

   public StructSdtColSalidasManualesProductos_Cabecera( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesProductos_Cabecera( java.util.Vector<StructSdtSalidasManualesProductos_Cabecera> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesProductos_Cabecera",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesProductos_Cabecera> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesProductos_Cabecera> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesProductos_Cabecera> item = new java.util.Vector<>();
}

