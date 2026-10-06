package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTDevPieCopy1", namespace ="TexplusNET")
public final  class StructSdtColTDevPieCopy1 implements Cloneable, java.io.Serializable
{
   public StructSdtColTDevPieCopy1( )
   {
      this( -1, new ModelContext( StructSdtColTDevPieCopy1.class ));
   }

   public StructSdtColTDevPieCopy1( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColTDevPieCopy1( java.util.Vector<StructSdtTDevPieCopy1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TDevPieCopy1",namespace="TexplusNET")
   public java.util.Vector<StructSdtTDevPieCopy1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTDevPieCopy1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTDevPieCopy1> item = new java.util.Vector<>();
}

