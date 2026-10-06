package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerValuesHighlightedData extends GxUserType
{
   public SdtDashboardViewerValuesHighlightedData( )
   {
      this(  new ModelContext(SdtDashboardViewerValuesHighlightedData.class));
   }

   public SdtDashboardViewerValuesHighlightedData( ModelContext context )
   {
      super( context, "SdtDashboardViewerValuesHighlightedData");
   }

   public SdtDashboardViewerValuesHighlightedData( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerValuesHighlightedData");
   }

   public SdtDashboardViewerValuesHighlightedData( StructSdtDashboardViewerValuesHighlightedData struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Elements") )
            {
               if ( gxTv_SdtDashboardViewerValuesHighlightedData_Elements == null )
               {
                  gxTv_SdtDashboardViewerValuesHighlightedData_Elements = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element>(app.SdtDashboardViewerValuesHighlightedData_Element.class, "DashboardViewerValuesHighlightedData.Element", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerValuesHighlightedData_Elements.readxmlcollection(oReader, "Elements", "Element") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Elements") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AllFilters") )
            {
               if ( gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters == null )
               {
                  gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter>(app.SdtDashboardViewerValuesHighlightedData_Filter.class, "DashboardViewerValuesHighlightedData.Filter", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters.readxmlcollection(oReader, "AllFilters", "Filter") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "AllFilters") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "DashboardViewerValuesHighlightedData" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Elements != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtDashboardViewerValuesHighlightedData_Elements.writexmlcollection(oWriter, "Elements", sNameSpace1, "Element", sNameSpace1);
      }
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters.writexmlcollection(oWriter, "AllFilters", sNameSpace1, "Filter", sNameSpace1);
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
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Elements != null )
      {
         AddObjectProperty("Elements", gxTv_SdtDashboardViewerValuesHighlightedData_Elements, false, false);
      }
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters != null )
      {
         AddObjectProperty("AllFilters", gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters, false, false);
      }
   }

   public GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element> getgxTv_SdtDashboardViewerValuesHighlightedData_Elements( )
   {
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Elements == null )
      {
         gxTv_SdtDashboardViewerValuesHighlightedData_Elements = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element>(app.SdtDashboardViewerValuesHighlightedData_Element.class, "DashboardViewerValuesHighlightedData.Element", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerValuesHighlightedData_Elements ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Elements( GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element> value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements = value ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Elements_SetNull( )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements = null ;
   }

   public boolean getgxTv_SdtDashboardViewerValuesHighlightedData_Elements_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Elements == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerValuesHighlightedData_Elements_N( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N ;
   }

   public GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter> getgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters( )
   {
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters == null )
      {
         gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter>(app.SdtDashboardViewerValuesHighlightedData_Filter.class, "DashboardViewerValuesHighlightedData.Filter", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters( GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter> value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters = value ;
   }

   public void setgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_SetNull( )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters = null ;
   }

   public boolean getgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_N = (byte)(1) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_N ;
   }

   public app.SdtDashboardViewerValuesHighlightedData Clone( )
   {
      return (app.SdtDashboardViewerValuesHighlightedData)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerValuesHighlightedData struct )
   {
      GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element> gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element>(app.SdtDashboardViewerValuesHighlightedData_Element.class, "DashboardViewerValuesHighlightedData.Element", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerValuesHighlightedData_Element> gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux1 = struct.getElements();
      if (gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux.add(new app.SdtDashboardViewerValuesHighlightedData_Element(gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerValuesHighlightedData_Elements(gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux);
      GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter> gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux = new GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter>(app.SdtDashboardViewerValuesHighlightedData_Filter.class, "DashboardViewerValuesHighlightedData.Filter", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerValuesHighlightedData_Filter> gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux1 = struct.getAllfilters();
      if (gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux.add(new app.SdtDashboardViewerValuesHighlightedData_Filter(gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters(gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerValuesHighlightedData getStruct( )
   {
      app.StructSdtDashboardViewerValuesHighlightedData struct = new app.StructSdtDashboardViewerValuesHighlightedData ();
      struct.setElements(getgxTv_SdtDashboardViewerValuesHighlightedData_Elements().getStruct());
      struct.setAllfilters(getgxTv_SdtDashboardViewerValuesHighlightedData_Allfilters().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Elements_N ;
   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_N ;
   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element> gxTv_SdtDashboardViewerValuesHighlightedData_Elements_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter> gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Element> gxTv_SdtDashboardViewerValuesHighlightedData_Elements=null ;
   protected GXBaseCollection<app.SdtDashboardViewerValuesHighlightedData_Filter> gxTv_SdtDashboardViewerValuesHighlightedData_Allfilters=null ;
}

