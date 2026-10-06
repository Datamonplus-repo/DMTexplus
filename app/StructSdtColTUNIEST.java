package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTUNIEST", namespace ="TexplusNET")
public final  class StructSdtColTUNIEST implements Cloneable, java.io.Serializable
{
   public StructSdtColTUNIEST( )
   {
      this( -1, new ModelContext( StructSdtColTUNIEST.class ));
   }

   public StructSdtColTUNIEST( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTUNIEST( java.util.Vector<StructSdtTUNIEST> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TUNIEST",namespace="TexplusNET")
   public java.util.Vector<StructSdtTUNIEST> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTUNIEST> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTUNIEST> item = new java.util.Vector<>();
}

