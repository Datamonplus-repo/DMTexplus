package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerValuesHighlightedData_Element implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerValuesHighlightedData_Element( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerValuesHighlightedData_Element.class ));
   }

   public StructSdtDashboardViewerValuesHighlightedData_Element( int remoteHandle ,
                                                                 ModelContext context )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name = "" ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value = "" ;
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

   public String getName( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value = value ;
   }

   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Element_N ;
   protected String gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name ;
   protected String gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value ;
}

