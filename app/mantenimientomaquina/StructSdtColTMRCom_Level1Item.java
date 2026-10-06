package app.mantenimientomaquina ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTMRCom.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColTMRCom_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColTMRCom_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColTMRCom_Level1Item.class ));
   }

   public StructSdtColTMRCom_Level1Item( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColTMRCom_Level1Item( java.util.Vector<StructSdtTMRCom_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TMRCom.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTMRCom_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTMRCom_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTMRCom_Level1Item> item = new java.util.Vector<>();
}

