package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTQueryRecordSet", namespace ="TexplusNET")
public final  class StructSdtColSDTQueryRecordSet implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTQueryRecordSet( )
   {
      this( -1, new ModelContext( StructSdtColSDTQueryRecordSet.class ));
   }

   public StructSdtColSDTQueryRecordSet( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSDTQueryRecordSet( java.util.Vector<StructSdtSDTQueryRecordSet> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTQueryRecordSet",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTQueryRecordSet> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTQueryRecordSet> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTQueryRecordSet> item = new java.util.Vector<>();
}

