package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTMENUNIVEL1", namespace ="TexplusNET")
public final  class StructSdtColTMENUNIVEL1 implements Cloneable, java.io.Serializable
{
   public StructSdtColTMENUNIVEL1( )
   {
      this( -1, new ModelContext( StructSdtColTMENUNIVEL1.class ));
   }

   public StructSdtColTMENUNIVEL1( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColTMENUNIVEL1( java.util.Vector<StructSdtTMENUNIVEL1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TMENUNIVEL1",namespace="TexplusNET")
   public java.util.Vector<StructSdtTMENUNIVEL1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTMENUNIVEL1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTMENUNIVEL1> item = new java.util.Vector<>();
}

