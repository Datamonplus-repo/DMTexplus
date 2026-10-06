package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGoogleChart extends GxUserType
{
   public SdtGoogleChart( )
   {
      this(  new ModelContext(SdtGoogleChart.class));
   }

   public SdtGoogleChart( ModelContext context )
   {
      super( context, "SdtGoogleChart");
   }

   public SdtGoogleChart( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtGoogleChart");
   }

   public SdtGoogleChart( StructSdtGoogleChart struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Categories") )
            {
               if ( gxTv_SdtGoogleChart_Categories == null )
               {
                  gxTv_SdtGoogleChart_Categories = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGoogleChart_Categories.readxmlcollection(oReader, "Categories", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Categories") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Series") )
            {
               if ( gxTv_SdtGoogleChart_Series == null )
               {
                  gxTv_SdtGoogleChart_Series = new GXBaseCollection<app.SdtGoogleChart_Series>(app.SdtGoogleChart_Series.class, "GoogleChart.Series", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGoogleChart_Series.readxmlcollection(oReader, "Series", "Series") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Series") )
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
         sName = "GoogleChart" ;
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
      if ( gxTv_SdtGoogleChart_Categories != null )
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
         gxTv_SdtGoogleChart_Categories.writexmlcollection(oWriter, "Categories", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtGoogleChart_Series != null )
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
         gxTv_SdtGoogleChart_Series.writexmlcollection(oWriter, "Series", sNameSpace1, "Series", sNameSpace1);
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
      if ( gxTv_SdtGoogleChart_Categories != null )
      {
         AddObjectProperty("Categories", gxTv_SdtGoogleChart_Categories, false, false);
      }
      if ( gxTv_SdtGoogleChart_Series != null )
      {
         AddObjectProperty("Series", gxTv_SdtGoogleChart_Series, false, false);
      }
   }

   public GXSimpleCollection<String> getgxTv_SdtGoogleChart_Categories( )
   {
      if ( gxTv_SdtGoogleChart_Categories == null )
      {
         gxTv_SdtGoogleChart_Categories = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtGoogleChart_Categories_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      return gxTv_SdtGoogleChart_Categories ;
   }

   public void setgxTv_SdtGoogleChart_Categories( GXSimpleCollection<String> value )
   {
      gxTv_SdtGoogleChart_Categories_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Categories = value ;
   }

   public void setgxTv_SdtGoogleChart_Categories_SetNull( )
   {
      gxTv_SdtGoogleChart_Categories_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Categories = null ;
   }

   public boolean getgxTv_SdtGoogleChart_Categories_IsNull( )
   {
      if ( gxTv_SdtGoogleChart_Categories == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGoogleChart_Categories_N( )
   {
      return gxTv_SdtGoogleChart_Categories_N ;
   }

   public GXBaseCollection<app.SdtGoogleChart_Series> getgxTv_SdtGoogleChart_Series( )
   {
      if ( gxTv_SdtGoogleChart_Series == null )
      {
         gxTv_SdtGoogleChart_Series = new GXBaseCollection<app.SdtGoogleChart_Series>(app.SdtGoogleChart_Series.class, "GoogleChart.Series", "TexplusNET", remoteHandle);
      }
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      return gxTv_SdtGoogleChart_Series ;
   }

   public void setgxTv_SdtGoogleChart_Series( GXBaseCollection<app.SdtGoogleChart_Series> value )
   {
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series = value ;
   }

   public void setgxTv_SdtGoogleChart_Series_SetNull( )
   {
      gxTv_SdtGoogleChart_Series_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Series = null ;
   }

   public boolean getgxTv_SdtGoogleChart_Series_IsNull( )
   {
      if ( gxTv_SdtGoogleChart_Series == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGoogleChart_Series_N( )
   {
      return gxTv_SdtGoogleChart_Series_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGoogleChart_Categories_N = (byte)(1) ;
      gxTv_SdtGoogleChart_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Series_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGoogleChart_N ;
   }

   public app.SdtGoogleChart Clone( )
   {
      return (app.SdtGoogleChart)(clone()) ;
   }

   public void setStruct( app.StructSdtGoogleChart struct )
   {
      setgxTv_SdtGoogleChart_Categories(new GXSimpleCollection<String>(String.class, "internal", "", struct.getCategories()));
      GXBaseCollection<app.SdtGoogleChart_Series> gxTv_SdtGoogleChart_Series_aux = new GXBaseCollection<app.SdtGoogleChart_Series>(app.SdtGoogleChart_Series.class, "GoogleChart.Series", "TexplusNET", remoteHandle);
      Vector<app.StructSdtGoogleChart_Series> gxTv_SdtGoogleChart_Series_aux1 = struct.getSeries();
      if (gxTv_SdtGoogleChart_Series_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtGoogleChart_Series_aux1.size(); i++)
         {
            gxTv_SdtGoogleChart_Series_aux.add(new app.SdtGoogleChart_Series(gxTv_SdtGoogleChart_Series_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtGoogleChart_Series(gxTv_SdtGoogleChart_Series_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtGoogleChart getStruct( )
   {
      app.StructSdtGoogleChart struct = new app.StructSdtGoogleChart ();
      struct.setCategories(getgxTv_SdtGoogleChart_Categories().getStruct());
      struct.setSeries(getgxTv_SdtGoogleChart_Series().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtGoogleChart_Categories_N ;
   protected byte gxTv_SdtGoogleChart_N ;
   protected byte gxTv_SdtGoogleChart_Series_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtGoogleChart_Series> gxTv_SdtGoogleChart_Series_aux ;
   protected GXSimpleCollection<String> gxTv_SdtGoogleChart_Categories=null ;
   protected GXBaseCollection<app.SdtGoogleChart_Series> gxTv_SdtGoogleChart_Series=null ;
}

