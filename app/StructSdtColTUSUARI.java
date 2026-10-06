package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTUSUARI", namespace ="TexplusNET")
public final  class StructSdtColTUSUARI implements Cloneable, java.io.Serializable
{
   public StructSdtColTUSUARI( )
   {
      this( -1, new ModelContext( StructSdtColTUSUARI.class ));
   }

   public StructSdtColTUSUARI( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTUSUARI( java.util.Vector<StructSdtTUSUARI> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TUSUARI",namespace="TexplusNET")
   public java.util.Vector<StructSdtTUSUARI> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTUSUARI> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTUSUARI> item = new java.util.Vector<>();
}

