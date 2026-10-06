package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDispos", namespace ="TexplusNET")
public final  class StructSdtColSDTDispos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDispos( )
   {
      this( -1, new ModelContext( StructSdtColSDTDispos.class ));
   }

   public StructSdtColSDTDispos( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColSDTDispos( java.util.Vector<StructSdtSDTDispos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDispos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDispos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDispos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDispos> item = new java.util.Vector<>();
}

