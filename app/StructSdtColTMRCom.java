package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTMRCom", namespace ="TexplusNET")
public final  class StructSdtColTMRCom implements Cloneable, java.io.Serializable
{
   public StructSdtColTMRCom( )
   {
      this( -1, new ModelContext( StructSdtColTMRCom.class ));
   }

   public StructSdtColTMRCom( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColTMRCom( java.util.Vector<StructSdtTMRCom> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TMRCom",namespace="TexplusNET")
   public java.util.Vector<StructSdtTMRCom> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTMRCom> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTMRCom> item = new java.util.Vector<>();
}

