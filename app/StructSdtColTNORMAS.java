package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTNORMAS", namespace ="TexplusNET")
public final  class StructSdtColTNORMAS implements Cloneable, java.io.Serializable
{
   public StructSdtColTNORMAS( )
   {
      this( -1, new ModelContext( StructSdtColTNORMAS.class ));
   }

   public StructSdtColTNORMAS( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTNORMAS( java.util.Vector<StructSdtTNORMAS> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TNORMAS",namespace="TexplusNET")
   public java.util.Vector<StructSdtTNORMAS> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTNORMAS> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTNORMAS> item = new java.util.Vector<>();
}

