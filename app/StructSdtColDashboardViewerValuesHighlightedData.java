package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerValuesHighlightedData", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerValuesHighlightedData implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerValuesHighlightedData( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerValuesHighlightedData.class ));
   }

   public StructSdtColDashboardViewerValuesHighlightedData( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerValuesHighlightedData( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerValuesHighlightedData",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerValuesHighlightedData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerValuesHighlightedData> item = new java.util.Vector<>();
}

