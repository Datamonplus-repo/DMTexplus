package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTForColNom", namespace ="TexplusNET")
public final  class StructSdtColSDTForColNom implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTForColNom( )
   {
      this( -1, new ModelContext( StructSdtColSDTForColNom.class ));
   }

   public StructSdtColSDTForColNom( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTForColNom( java.util.Vector<StructSdtSDTForColNom> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTForColNom",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTForColNom> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTForColNom> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTForColNom> item = new java.util.Vector<>();
}

