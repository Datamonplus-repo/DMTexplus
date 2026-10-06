package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDashboardViewerItemClickData extends GxUserType
{
   public SdtDashboardViewerItemClickData( )
   {
      this(  new ModelContext(SdtDashboardViewerItemClickData.class));
   }

   public SdtDashboardViewerItemClickData( ModelContext context )
   {
      super( context, "SdtDashboardViewerItemClickData");
   }

   public SdtDashboardViewerItemClickData( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtDashboardViewerItemClickData");
   }

   public SdtDashboardViewerItemClickData( StructSdtDashboardViewerItemClickData struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Object") )
            {
               gxTv_SdtDashboardViewerItemClickData_Object = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Element") )
            {
               gxTv_SdtDashboardViewerItemClickData_Element = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Value") )
            {
               gxTv_SdtDashboardViewerItemClickData_Value = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Context") )
            {
               if ( gxTv_SdtDashboardViewerItemClickData_Context == null )
               {
                  gxTv_SdtDashboardViewerItemClickData_Context = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Element>(app.SdtDashboardViewerItemClickData_Element.class, "DashboardViewerItemClickData.Element", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerItemClickData_Context.readxmlcollection(oReader, "Context", "Element") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Context") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AllFilters") )
            {
               if ( gxTv_SdtDashboardViewerItemClickData_Allfilters == null )
               {
                  gxTv_SdtDashboardViewerItemClickData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter>(app.SdtDashboardViewerItemClickData_Filter.class, "DashboardViewerItemClickData.Filter", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtDashboardViewerItemClickData_Allfilters.readxmlcollection(oReader, "AllFilters", "Filter") ;
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
         sName = "DashboardViewerItemClickData" ;
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
      oWriter.writeElement("Object", gxTv_SdtDashboardViewerItemClickData_Object);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Element", gxTv_SdtDashboardViewerItemClickData_Element);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Value", gxTv_SdtDashboardViewerItemClickData_Value);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtDashboardViewerItemClickData_Context != null )
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
         gxTv_SdtDashboardViewerItemClickData_Context.writexmlcollection(oWriter, "Context", sNameSpace1, "Element", sNameSpace1);
      }
      if ( gxTv_SdtDashboardViewerItemClickData_Allfilters != null )
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
         gxTv_SdtDashboardViewerItemClickData_Allfilters.writexmlcollection(oWriter, "AllFilters", sNameSpace1, "Filter", sNameSpace1);
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
      AddObjectProperty("Object", gxTv_SdtDashboardViewerItemClickData_Object, false, false);
      AddObjectProperty("Element", gxTv_SdtDashboardViewerItemClickData_Element, false, false);
      AddObjectProperty("Value", gxTv_SdtDashboardViewerItemClickData_Value, false, false);
      if ( gxTv_SdtDashboardViewerItemClickData_Context != null )
      {
         AddObjectProperty("Context", gxTv_SdtDashboardViewerItemClickData_Context, false, false);
      }
      if ( gxTv_SdtDashboardViewerItemClickData_Allfilters != null )
      {
         AddObjectProperty("AllFilters", gxTv_SdtDashboardViewerItemClickData_Allfilters, false, false);
      }
   }

   public String getgxTv_SdtDashboardViewerItemClickData_Object( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Object ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Object( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Object = value ;
   }

   public String getgxTv_SdtDashboardViewerItemClickData_Element( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Element ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Element( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Element = value ;
   }

   public String getgxTv_SdtDashboardViewerItemClickData_Value( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Value ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Value( String value )
   {
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Value = value ;
   }

   public GXBaseCollection<app.SdtDashboardViewerItemClickData_Element> getgxTv_SdtDashboardViewerItemClickData_Context( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Context == null )
      {
         gxTv_SdtDashboardViewerItemClickData_Context = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Element>(app.SdtDashboardViewerItemClickData_Element.class, "DashboardViewerItemClickData.Element", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerItemClickData_Context ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Context( GXBaseCollection<app.SdtDashboardViewerItemClickData_Element> value )
   {
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Context = value ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Context_SetNull( )
   {
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Context = null ;
   }

   public boolean getgxTv_SdtDashboardViewerItemClickData_Context_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Context == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerItemClickData_Context_N( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Context_N ;
   }

   public GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter> getgxTv_SdtDashboardViewerItemClickData_Allfilters( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Allfilters == null )
      {
         gxTv_SdtDashboardViewerItemClickData_Allfilters = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter>(app.SdtDashboardViewerItemClickData_Filter.class, "DashboardViewerItemClickData.Filter", "TexplusNET", remoteHandle);
      }
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      return gxTv_SdtDashboardViewerItemClickData_Allfilters ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Allfilters( GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter> value )
   {
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(0) ;
      gxTv_SdtDashboardViewerItemClickData_Allfilters = value ;
   }

   public void setgxTv_SdtDashboardViewerItemClickData_Allfilters_SetNull( )
   {
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Allfilters = null ;
   }

   public boolean getgxTv_SdtDashboardViewerItemClickData_Allfilters_IsNull( )
   {
      if ( gxTv_SdtDashboardViewerItemClickData_Allfilters == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtDashboardViewerItemClickData_Allfilters_N( )
   {
      return gxTv_SdtDashboardViewerItemClickData_Allfilters_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDashboardViewerItemClickData_Object = "" ;
      gxTv_SdtDashboardViewerItemClickData_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Element = "" ;
      gxTv_SdtDashboardViewerItemClickData_Value = "" ;
      gxTv_SdtDashboardViewerItemClickData_Context_N = (byte)(1) ;
      gxTv_SdtDashboardViewerItemClickData_Allfilters_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDashboardViewerItemClickData_N ;
   }

   public app.SdtDashboardViewerItemClickData Clone( )
   {
      return (app.SdtDashboardViewerItemClickData)(clone()) ;
   }

   public void setStruct( app.StructSdtDashboardViewerItemClickData struct )
   {
      setgxTv_SdtDashboardViewerItemClickData_Object(struct.getObject());
      setgxTv_SdtDashboardViewerItemClickData_Element(struct.getElement());
      setgxTv_SdtDashboardViewerItemClickData_Value(struct.getValue());
      GXBaseCollection<app.SdtDashboardViewerItemClickData_Element> gxTv_SdtDashboardViewerItemClickData_Context_aux = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Element>(app.SdtDashboardViewerItemClickData_Element.class, "DashboardViewerItemClickData.Element", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerItemClickData_Element> gxTv_SdtDashboardViewerItemClickData_Context_aux1 = struct.getContext();
      if (gxTv_SdtDashboardViewerItemClickData_Context_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerItemClickData_Context_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerItemClickData_Context_aux.add(new app.SdtDashboardViewerItemClickData_Element(gxTv_SdtDashboardViewerItemClickData_Context_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerItemClickData_Context(gxTv_SdtDashboardViewerItemClickData_Context_aux);
      GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter> gxTv_SdtDashboardViewerItemClickData_Allfilters_aux = new GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter>(app.SdtDashboardViewerItemClickData_Filter.class, "DashboardViewerItemClickData.Filter", "TexplusNET", remoteHandle);
      Vector<app.StructSdtDashboardViewerItemClickData_Filter> gxTv_SdtDashboardViewerItemClickData_Allfilters_aux1 = struct.getAllfilters();
      if (gxTv_SdtDashboardViewerItemClickData_Allfilters_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtDashboardViewerItemClickData_Allfilters_aux1.size(); i++)
         {
            gxTv_SdtDashboardViewerItemClickData_Allfilters_aux.add(new app.SdtDashboardViewerItemClickData_Filter(gxTv_SdtDashboardViewerItemClickData_Allfilters_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtDashboardViewerItemClickData_Allfilters(gxTv_SdtDashboardViewerItemClickData_Allfilters_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtDashboardViewerItemClickData getStruct( )
   {
      app.StructSdtDashboardViewerItemClickData struct = new app.StructSdtDashboardViewerItemClickData ();
      struct.setObject(getgxTv_SdtDashboardViewerItemClickData_Object());
      struct.setElement(getgxTv_SdtDashboardViewerItemClickData_Element());
      struct.setValue(getgxTv_SdtDashboardViewerItemClickData_Value());
      struct.setContext(getgxTv_SdtDashboardViewerItemClickData_Context().getStruct());
      struct.setAllfilters(getgxTv_SdtDashboardViewerItemClickData_Allfilters().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtDashboardViewerItemClickData_N ;
   protected byte gxTv_SdtDashboardViewerItemClickData_Context_N ;
   protected byte gxTv_SdtDashboardViewerItemClickData_Allfilters_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtDashboardViewerItemClickData_Object ;
   protected String gxTv_SdtDashboardViewerItemClickData_Element ;
   protected String gxTv_SdtDashboardViewerItemClickData_Value ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtDashboardViewerItemClickData_Element> gxTv_SdtDashboardViewerItemClickData_Context_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter> gxTv_SdtDashboardViewerItemClickData_Allfilters_aux ;
   protected GXBaseCollection<app.SdtDashboardViewerItemClickData_Element> gxTv_SdtDashboardViewerItemClickData_Context=null ;
   protected GXBaseCollection<app.SdtDashboardViewerItemClickData_Filter> gxTv_SdtDashboardViewerItemClickData_Allfilters=null ;
}

