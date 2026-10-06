package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientesDefectos", namespace ="TexplusNET")
public final  class StructSdtColSDTClientesDefectos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientesDefectos( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientesDefectos.class ));
   }

   public StructSdtColSDTClientesDefectos( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColSDTClientesDefectos( java.util.Vector<StructSdtSDTClientesDefectos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientesDefectos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientesDefectos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientesDefectos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientesDefectos> item = new java.util.Vector<>();
}

