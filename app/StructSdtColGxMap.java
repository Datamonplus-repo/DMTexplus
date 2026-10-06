package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGxMap", namespace ="TexplusNET")
public final  class StructSdtColGxMap implements Cloneable, java.io.Serializable
{
   public StructSdtColGxMap( )
   {
      this( -1, new ModelContext( StructSdtColGxMap.class ));
   }

   public StructSdtColGxMap( int remoteHandle ,
                             ModelContext context )
   {
   }

   public  StructSdtColGxMap( java.util.Vector<StructSdtGxMap> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GxMap",namespace="TexplusNET")
   public java.util.Vector<StructSdtGxMap> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGxMap> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGxMap> item = new java.util.Vector<>();
}

