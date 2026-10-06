package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProductosConsumos", namespace ="TexplusNET")
public final  class StructSdtColSDTProductosConsumos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProductosConsumos( )
   {
      this( -1, new ModelContext( StructSdtColSDTProductosConsumos.class ));
   }

   public StructSdtColSDTProductosConsumos( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColSDTProductosConsumos( java.util.Vector<StructSdtSDTProductosConsumos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProductosConsumos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProductosConsumos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProductosConsumos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProductosConsumos> item = new java.util.Vector<>();
}

