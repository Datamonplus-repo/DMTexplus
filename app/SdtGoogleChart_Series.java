package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGoogleChart_Series extends GxUserType
{
   public SdtGoogleChart_Series( )
   {
      this(  new ModelContext(SdtGoogleChart_Series.class));
   }

   public SdtGoogleChart_Series( ModelContext context )
   {
      super( context, "SdtGoogleChart_Series");
   }

   public SdtGoogleChart_Series( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtGoogleChart_Series");
   }

   public SdtGoogleChart_Series( StructSdtGoogleChart_Series struct )
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
               gxTv_SdtGoogleChart_Series_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Values") )
            {
               if ( gxTv_SdtGoogleChart_Series_Values == null )
               {
                  gxTv_SdtGoogleChart_Series_Values = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGoogleChart_Series_Values.readxmlcollection(oReader, "Values", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Values") )
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
         sName = "GoogleChart.Series" ;
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
      oWriter.writeElement("Name", gxTv_SdtGoogleChart_Series_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtGoogleChart_Series_Values != null )
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
         gxTv_SdtGoogleChart_Series_Values.writexmlcollection(oWriter, "Values", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("Name", gxTv_SdtGoogleChart_Series_Name, false, false);
      if ( gxTv_SdtGoogleChart_Series_Values != null )
      {
         AddObjectProperty("Values", gxTv_SdtGoogleChart_Series_Values, false, false);
      }
   }

   public String getgxTv_SdtGoogleChart_Series_Name( )
   {
      return gxTv_SdtGoogleChart_Series_Name ;
   }

   public void setgxTv_SdtGoogleChart_Series_Name( String value )
   {
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_Name = value ;
   }

   public GXSimpleCollection<java.math.BigDecimal> getgxTv_SdtGoogleChart_Series_Values( )
   {
      if ( gxTv_SdtGoogleChart_Series_Values == null )
      {
         gxTv_SdtGoogleChart_Series_Values = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
      }
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      return gxTv_SdtGoogleChart_Series_Values ;
   }

   public void setgxTv_SdtGoogleChart_Series_Values( GXSimpleCollection<java.math.BigDecimal> value )
   {
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_N = (byte)(0) ;
      gxTv_SdtGoogleChart_Series_Values = value ;
   }

   public void setgxTv_SdtGoogleChart_Series_Values_SetNull( )
   {
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Series_Values = null ;
   }

   public boolean getgxTv_SdtGoogleChart_Series_Values_IsNull( )
   {
      if ( gxTv_SdtGoogleChart_Series_Values == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGoogleChart_Series_Values_N( )
   {
      return gxTv_SdtGoogleChart_Series_Values_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGoogleChart_Series_Name = "" ;
      gxTv_SdtGoogleChart_Series_N = (byte)(1) ;
      gxTv_SdtGoogleChart_Series_Values_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGoogleChart_Series_N ;
   }

   public app.SdtGoogleChart_Series Clone( )
   {
      return (app.SdtGoogleChart_Series)(clone()) ;
   }

   public void setStruct( app.StructSdtGoogleChart_Series struct )
   {
      setgxTv_SdtGoogleChart_Series_Name(struct.getName());
      setgxTv_SdtGoogleChart_Series_Values(new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "", struct.getValues()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtGoogleChart_Series getStruct( )
   {
      app.StructSdtGoogleChart_Series struct = new app.StructSdtGoogleChart_Series ();
      struct.setName(getgxTv_SdtGoogleChart_Series_Name());
      struct.setValues(getgxTv_SdtGoogleChart_Series_Values().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtGoogleChart_Series_N ;
   protected byte gxTv_SdtGoogleChart_Series_Values_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtGoogleChart_Series_Name ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXSimpleCollection<java.math.BigDecimal> gxTv_SdtGoogleChart_Series_Values=null ;
}

