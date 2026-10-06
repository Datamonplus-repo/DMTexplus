package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtParametroCalls", namespace ="TexplusNET")
public final  class StructSdtColSdtParametroCalls implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtParametroCalls( )
   {
      this( -1, new ModelContext( StructSdtColSdtParametroCalls.class ));
   }

   public StructSdtColSdtParametroCalls( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSdtParametroCalls( java.util.Vector<StructSdtSdtParametroCalls> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtParametroCalls",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtParametroCalls> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtParametroCalls> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtParametroCalls> item = new java.util.Vector<>();
}

