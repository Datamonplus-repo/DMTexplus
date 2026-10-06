package app.asyncbatch ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColJOB", namespace ="TexplusNET")
public final  class StructSdtColJOB implements Cloneable, java.io.Serializable
{
   public StructSdtColJOB( )
   {
      this( -1, new ModelContext( StructSdtColJOB.class ));
   }

   public StructSdtColJOB( int remoteHandle ,
                           ModelContext context )
   {
   }

   public  StructSdtColJOB( java.util.Vector<StructSdtJOB> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="JOB",namespace="TexplusNET")
   public java.util.Vector<StructSdtJOB> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtJOB> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtJOB> item = new java.util.Vector<>();
}

