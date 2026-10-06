package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColInFilSDT", namespace ="TexplusNET")
public final  class StructSdtColInFilSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColInFilSDT( )
   {
      this( -1, new ModelContext( StructSdtColInFilSDT.class ));
   }

   public StructSdtColInFilSDT( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColInFilSDT( java.util.Vector<StructSdtInFilSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InFilSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtInFilSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInFilSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInFilSDT> item = new java.util.Vector<>();
}

