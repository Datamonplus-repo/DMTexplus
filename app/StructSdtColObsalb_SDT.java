package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColObsalb_SDT", namespace ="TexplusNET")
public final  class StructSdtColObsalb_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColObsalb_SDT( )
   {
      this( -1, new ModelContext( StructSdtColObsalb_SDT.class ));
   }

   public StructSdtColObsalb_SDT( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColObsalb_SDT( java.util.Vector<StructSdtObsalb_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Obsalb_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtObsalb_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtObsalb_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtObsalb_SDT> item = new java.util.Vector<>();
}

