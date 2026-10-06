package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerValuesHighlightedData_Element extends GxUserType
{
   public SdtDashboardViewerValuesHighlightedData_Element( )
   {
      this(  new ModelContext(SdtDashboardViewerValuesHighlightedData_Element.class));
   }

   public SdtDashboardViewerValuesHighlightedData_Element( ModelContext context )
   {
      super( context, "SdtDashboardViewerValuesHighlightedData_Element");
   }

   public SdtDashboardViewerValuesHighlightedData_Element( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerValuesHighlightedData_Element");
   }

   public SdtDashboardViewerValuesHighlightedData_Element( StructSdtDashboardViewerValuesHighlightedData_Element struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Value") )
            {
               gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "DashboardViewerValuesHighlightedData.Element" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("Name", gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Value", gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("Name", gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name, false, false);
      AddObjectProperty("Value", gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value, false, false);
   }

   public String getgxTv_SdtDashboardViewerValuesHighlightedData_Element_Name( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Element_Name( String value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name = value ;
   }

   public String getgxTv_SdtDashboardViewerValuesHighlightedData_Element_Value( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Element_Value( String value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name = "" ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Element_N ;
   }

   public app.SdtDashboardViewerValuesHighlightedData_Element Clone( )
   {
      return (app.SdtDashboardViewerValuesHighlightedData_Element)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerValuesHighlightedData_Element struct )
   {
      setgxTv_SdtDashboardViewerValuesHighlightedData_Element_Name(struct.getName());
      setgxTv_SdtDashboardViewerValuesHighlightedData_Element_Value(struct.getValue());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerValuesHighlightedData_Element getStruct( )
   {
      app.StructSdtDashboardViewerValuesHighlightedData_Element struct = new app.StructSdtDashboardViewerValuesHighlightedData_Element ();
      struct.setName(getgxTv_SdtDashboardViewerValuesHighlightedData_Element_Name());
      struct.setValue(getgxTv_SdtDashboardViewerValuesHighlightedData_Element_Value());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Element_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtDashboardViewerValuesHighlightedData_Element_Name ;
   protected String gxTv_SdtDashboardViewerValuesHighlightedData_Element_Value ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

