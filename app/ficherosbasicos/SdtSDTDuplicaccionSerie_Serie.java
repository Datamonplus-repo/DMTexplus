package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDuplicaccionSerie_Serie extends GxUserType
{
   public SdtSDTDuplicaccionSerie_Serie( )
   {
      this(  new ModelContext(SdtSDTDuplicaccionSerie_Serie.class));
   }

   public SdtSDTDuplicaccionSerie_Serie( ModelContext context )
   {
      super( context, "SdtSDTDuplicaccionSerie_Serie");
   }

   public SdtSDTDuplicaccionSerie_Serie( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDuplicaccionSerie_Serie");
   }

   public SdtSDTDuplicaccionSerie_Serie( StructSdtSDTDuplicaccionSerie_Serie struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "selected") )
            {
               gxTv_SdtSDTDuplicaccionSerie_Serie_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCodOri") )
            {
               gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDscDes") )
            {
               gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod = oReader.getValue() ;
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
         sName = "SDTDuplicaccionSerie.Serie" ;
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
      oWriter.writeElement("selected", GXutil.booltostr( gxTv_SdtSDTDuplicaccionSerie_Serie_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCodOri", gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDscDes", gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod);
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
      AddObjectProperty("selected", gxTv_SdtSDTDuplicaccionSerie_Serie_Selected, false, false);
      AddObjectProperty("ArtCodOri", gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori, false, false);
      AddObjectProperty("ArtDscDes", gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod, false, false);
   }

   public boolean getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Selected ;
   }

   public void setgxTv_SdtSDTDuplicaccionSerie_Serie_Selected( boolean value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Selected = value ;
   }

   public String getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori ;
   }

   public void setgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori = value ;
   }

   public String getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes ;
   }

   public void setgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes = value ;
   }

   public String getgxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod ;
   }

   public void setgxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(1) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori = "" ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes = "" ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_N ;
   }

   public app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie Clone( )
   {
      return (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)(clone()) ;
   }

   public void setStruct( app.ficherosbasicos.StructSdtSDTDuplicaccionSerie_Serie struct )
   {
      setgxTv_SdtSDTDuplicaccionSerie_Serie_Selected(struct.getSelected());
      setgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(struct.getArtcodori());
      setgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes(struct.getArtdscdes());
      setgxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod(struct.getEmprcod());
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.StructSdtSDTDuplicaccionSerie_Serie getStruct( )
   {
      app.ficherosbasicos.StructSdtSDTDuplicaccionSerie_Serie struct = new app.ficherosbasicos.StructSdtSDTDuplicaccionSerie_Serie ();
      struct.setSelected(getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected());
      struct.setArtcodori(getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori());
      struct.setArtdscdes(getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes());
      struct.setEmprcod(getgxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod());
      return struct ;
   }

   protected byte gxTv_SdtSDTDuplicaccionSerie_Serie_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTDuplicaccionSerie_Serie_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

