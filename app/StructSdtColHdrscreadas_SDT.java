package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColHdrscreadas_SDT", namespace ="TexplusNET")
public final  class StructSdtColHdrscreadas_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColHdrscreadas_SDT( )
   {
      this( -1, new ModelContext( StructSdtColHdrscreadas_SDT.class ));
   }

   public StructSdtColHdrscreadas_SDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColHdrscreadas_SDT( java.util.Vector<StructSdtHdrscreadas_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Hdrscreadas_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtHdrscreadas_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtHdrscreadas_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtHdrscreadas_SDT> item = new java.util.Vector<>();
}

