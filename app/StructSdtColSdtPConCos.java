package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtPConCos", namespace ="TexplusNET")
public final  class StructSdtColSdtPConCos implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtPConCos( )
   {
      this( -1, new ModelContext( StructSdtColSdtPConCos.class ));
   }

   public StructSdtColSdtPConCos( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSdtPConCos( java.util.Vector<StructSdtSdtPConCos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtPConCos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtPConCos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtPConCos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtPConCos> item = new java.util.Vector<>();
}

