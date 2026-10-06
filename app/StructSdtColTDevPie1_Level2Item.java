package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTDevPie1.Level2Item", namespace ="TexplusNET")
public final  class StructSdtColTDevPie1_Level2Item implements Cloneable, java.io.Serializable
{
   public StructSdtColTDevPie1_Level2Item( )
   {
      this( -1, new ModelContext( StructSdtColTDevPie1_Level2Item.class ));
   }

   public StructSdtColTDevPie1_Level2Item( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColTDevPie1_Level2Item( java.util.Vector<StructSdtTDevPie1_Level2Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TDevPie1.Level2Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTDevPie1_Level2Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTDevPie1_Level2Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTDevPie1_Level2Item> item = new java.util.Vector<>();
}

