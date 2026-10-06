package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTFases", namespace ="TexplusNET")
public final  class StructSdtColSDTFases implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTFases( )
   {
      this( -1, new ModelContext( StructSdtColSDTFases.class ));
   }

   public StructSdtColSDTFases( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColSDTFases( java.util.Vector<StructSdtSDTFases> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTFases",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTFases> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTFases> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTFases> item = new java.util.Vector<>();
}

