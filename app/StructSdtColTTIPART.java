package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTIPART", namespace ="TexplusNET")
public final  class StructSdtColTTIPART implements Cloneable, java.io.Serializable
{
   public StructSdtColTTIPART( )
   {
      this( -1, new ModelContext( StructSdtColTTIPART.class ));
   }

   public StructSdtColTTIPART( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTTIPART( java.util.Vector<StructSdtTTIPART> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTIPART",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTIPART> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTIPART> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTIPART> item = new java.util.Vector<>();
}

