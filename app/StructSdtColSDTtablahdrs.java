package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTtablahdrs", namespace ="TexplusNET")
public final  class StructSdtColSDTtablahdrs implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTtablahdrs( )
   {
      this( -1, new ModelContext( StructSdtColSDTtablahdrs.class ));
   }

   public StructSdtColSDTtablahdrs( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTtablahdrs( java.util.Vector<StructSdtSDTtablahdrs> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTtablahdrs",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTtablahdrs> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTtablahdrs> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTtablahdrs> item = new java.util.Vector<>();
}

