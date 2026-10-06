package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerValuesHighlightedData.Element", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerValuesHighlightedData_Element implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerValuesHighlightedData_Element( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerValuesHighlightedData_Element.class ));
   }

   public StructSdtColDashboardViewerValuesHighlightedData_Element( int remoteHandle ,
                                                                    ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerValuesHighlightedData_Element( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Element> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerValuesHighlightedData.Element",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Element> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Element> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerValuesHighlightedData_Element> item = new java.util.Vector<>();
}

