package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTERMIN", namespace ="TexplusNET")
public final  class StructSdtColTTERMIN implements Cloneable, java.io.Serializable
{
   public StructSdtColTTERMIN( )
   {
      this( -1, new ModelContext( StructSdtColTTERMIN.class ));
   }

   public StructSdtColTTERMIN( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTTERMIN( java.util.Vector<StructSdtTTERMIN> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTERMIN",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTERMIN> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTERMIN> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTERMIN> item = new java.util.Vector<>();
}

