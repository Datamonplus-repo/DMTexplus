package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTIncidencias", namespace ="TexplusNET")
public final  class StructSdtColSDTIncidencias implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTIncidencias( )
   {
      this( -1, new ModelContext( StructSdtColSDTIncidencias.class ));
   }

   public StructSdtColSDTIncidencias( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColSDTIncidencias( java.util.Vector<StructSdtSDTIncidencias> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTIncidencias",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTIncidencias> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTIncidencias> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTIncidencias> item = new java.util.Vector<>();
}

