package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TraspasarArticulosTodos_SDT", namespace ="TexplusNET")
public final  class StructSdtTraspasarArticulosTodos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTraspasarArticulosTodos_SDT( )
   {
      this( -1, new ModelContext( StructSdtTraspasarArticulosTodos_SDT.class ));
   }

   public StructSdtTraspasarArticulosTodos_SDT( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtTraspasarArticulosTodos_SDT( java.util.Vector<StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TraspasarArticulosTodos_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem> item = new java.util.Vector<>();
}

