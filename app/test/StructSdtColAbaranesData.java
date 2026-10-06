package app.test ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColAbaranesData", namespace ="TexplusNET")
public final  class StructSdtColAbaranesData implements Cloneable, java.io.Serializable
{
   public StructSdtColAbaranesData( )
   {
      this( -1, new ModelContext( StructSdtColAbaranesData.class ));
   }

   public StructSdtColAbaranesData( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColAbaranesData( java.util.Vector<StructSdtAbaranesData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AbaranesData",namespace="TexplusNET")
   public java.util.Vector<StructSdtAbaranesData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAbaranesData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAbaranesData> item = new java.util.Vector<>();
}

