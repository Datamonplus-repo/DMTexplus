package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerValuesHighlightedData.Filter", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerValuesHighlightedData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerValuesHighlightedData_Filter( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerValuesHighlightedData_Filter.class ));
   }

   public StructSdtColDashboardViewerValuesHighlightedData_Filter( int remoteHandle ,
                                                                   ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerValuesHighlightedData_Filter( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Filter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerValuesHighlightedData.Filter",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Filter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Filter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Filter> item = new java.util.Vector<>();
}

