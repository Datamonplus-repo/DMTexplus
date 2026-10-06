package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTDevPie1", namespace ="TexplusNET")
public final  class StructSdtColTDevPie1 implements Cloneable, java.io.Serializable
{
   public StructSdtColTDevPie1( )
   {
      this( -1, new ModelContext( StructSdtColTDevPie1.class ));
   }

   public StructSdtColTDevPie1( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColTDevPie1( java.util.Vector<StructSdtTDevPie1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TDevPie1",namespace="TexplusNET")
   public java.util.Vector<StructSdtTDevPie1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTDevPie1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTDevPie1> item = new java.util.Vector<>();
}

