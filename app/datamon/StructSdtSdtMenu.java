package app.datamon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SdtMenu", namespace ="TexplusNET")
public final  class StructSdtSdtMenu implements Cloneable, java.io.Serializable
{
   public StructSdtSdtMenu( )
   {
      this( -1, new ModelContext( StructSdtSdtMenu.class ));
   }

   public StructSdtSdtMenu( int remoteHandle ,
                            ModelContext context )
   {
   }

   public  StructSdtSdtMenu( java.util.Vector<StructSdtSdtMenu_ITEM> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ITEM",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtMenu_ITEM> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtMenu_ITEM> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtMenu_ITEM> item = new java.util.Vector<>();
}

