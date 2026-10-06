package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerValuesHighlightedData implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerValuesHighlightedData( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerValuesHighlightedData.class ));
   }

   public StructSdtDashboardViewerValuesHighlightedData( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(1) ;
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

   public java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Element> getElements( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Elements ;
   }

   public void setElements( java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Element> value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements = value ;
   }

   public java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Filter> getAllfilters( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters ;
   }

   public void setAllfilters( java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Filter> value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters = value ;
   }

   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N ;
   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N ;
   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_N ;
   protected java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Element> gxTv_SdtDashboardViewerValuesHighlightedData_Elements=null ;
   protected java.util.Vector<app.StructSdtDashboardViewerValuesHighlightedData_Filter> gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters=null ;
}

