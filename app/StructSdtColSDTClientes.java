package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientes", namespace ="TexplusNET")
public final  class StructSdtColSDTClientes implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientes( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientes.class ));
   }

   public StructSdtColSDTClientes( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColSDTClientes( java.util.Vector<StructSdtSDTClientes> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientes",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientes> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientes> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientes> item = new java.util.Vector<>();
}

