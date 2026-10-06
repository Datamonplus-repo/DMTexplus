package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDefectos", namespace ="TexplusNET")
public final  class StructSdtColSDTDefectos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDefectos( )
   {
      this( -1, new ModelContext( StructSdtColSDTDefectos.class ));
   }

   public StructSdtColSDTDefectos( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColSDTDefectos( java.util.Vector<StructSdtSDTDefectos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDefectos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDefectos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDefectos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDefectos> item = new java.util.Vector<>();
}

