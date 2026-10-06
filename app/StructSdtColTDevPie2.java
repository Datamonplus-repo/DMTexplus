package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTDevPie2", namespace ="TexplusNET")
public final  class StructSdtColTDevPie2 implements Cloneable, java.io.Serializable
{
   public StructSdtColTDevPie2( )
   {
      this( -1, new ModelContext( StructSdtColTDevPie2.class ));
   }

   public StructSdtColTDevPie2( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColTDevPie2( java.util.Vector<StructSdtTDevPie2> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TDevPie2",namespace="TexplusNET")
   public java.util.Vector<StructSdtTDevPie2> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTDevPie2> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTDevPie2> item = new java.util.Vector<>();
}

