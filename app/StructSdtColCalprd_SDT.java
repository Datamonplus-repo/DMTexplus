package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCalprd_SDT", namespace ="TexplusNET")
public final  class StructSdtColCalprd_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColCalprd_SDT( )
   {
      this( -1, new ModelContext( StructSdtColCalprd_SDT.class ));
   }

   public StructSdtColCalprd_SDT( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColCalprd_SDT( java.util.Vector<StructSdtCalprd_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Calprd_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtCalprd_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCalprd_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCalprd_SDT> item = new java.util.Vector<>();
}

