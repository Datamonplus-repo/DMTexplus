package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TabOptions", namespace ="TexplusNET")
public final  class StructSdtTabOptions implements Cloneable, java.io.Serializable
{
   public StructSdtTabOptions( )
   {
      this( -1, new ModelContext( StructSdtTabOptions.class ));
   }

   public StructSdtTabOptions( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtTabOptions( java.util.Vector<StructSdtTabOptions_TabOptionsItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TabOptionsItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtTabOptions_TabOptionsItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTabOptions_TabOptionsItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTabOptions_TabOptionsItem> item = new java.util.Vector<>();
}

