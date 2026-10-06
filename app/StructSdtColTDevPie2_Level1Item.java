package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTDevPie2.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColTDevPie2_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColTDevPie2_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColTDevPie2_Level1Item.class ));
   }

   public StructSdtColTDevPie2_Level1Item( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColTDevPie2_Level1Item( java.util.Vector<StructSdtTDevPie2_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TDevPie2.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTDevPie2_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTDevPie2_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTDevPie2_Level1Item> item = new java.util.Vector<>();
}

