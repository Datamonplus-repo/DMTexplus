package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDT_PROCES", namespace ="TexplusNET")
public final  class StructSdtSDT_PROCES implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_PROCES( )
   {
      this( -1, new ModelContext( StructSdtSDT_PROCES.class ));
   }

   public StructSdtSDT_PROCES( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtSDT_PROCES( java.util.Vector<StructSdtSDT_PROCES_PROCESSO> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="PROCESSO",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_PROCES_PROCESSO> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_PROCES_PROCESSO> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_PROCES_PROCESSO> item = new java.util.Vector<>();
}

