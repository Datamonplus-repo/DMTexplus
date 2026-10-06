package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "WWCCPoln1SDT", namespace ="TexplusNET")
public final  class StructSdtWWCCPoln1SDT implements Cloneable, java.io.Serializable
{
   public StructSdtWWCCPoln1SDT( )
   {
      this( -1, new ModelContext( StructSdtWWCCPoln1SDT.class ));
   }

   public StructSdtWWCCPoln1SDT( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtWWCCPoln1SDT( java.util.Vector<StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="WWCCPoln1SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem> item = new java.util.Vector<>();
}

