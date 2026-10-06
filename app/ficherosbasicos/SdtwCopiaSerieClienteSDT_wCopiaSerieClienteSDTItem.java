package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem extends GxUserType
{
   public SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( )
   {
      this(  new ModelContext(SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem.class));
   }

   public SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( ModelContext context )
   {
      super( context, "SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem");
   }

   public SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem");
   }

   public SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCodExt") )
            {
               gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext = oReader.getValue() ;
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
         sName = "wCopiaSerieClienteSDT.wCopiaSerieClienteSDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCod", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCodExt", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      AddObjectProperty("EmprCod", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom, false, false);
      AddObjectProperty("CliCod", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom, false, false);
      AddObjectProperty("ArtCod", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc, false, false);
      AddObjectProperty("ArtCodExt", gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext, false, false);
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod = value ;
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom = value ;
   }

   public int getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod( int value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod = value ;
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom = value ;
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod = value ;
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc = value ;
   }

   public String getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext ;
   }

   public void setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(1) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N ;
   }

   public app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem Clone( )
   {
      return (app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem)(clone()) ;
   }

   public void setStruct( app.ficherosbasicos.StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem struct )
   {
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom(struct.getEmprnom());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod(struct.getClicod());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom(struct.getClinom());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod(struct.getArtcod());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc(struct.getArtdsc());
      setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext(struct.getArtcodext());
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem getStruct( )
   {
      app.ficherosbasicos.StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem struct = new app.ficherosbasicos.StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem ();
      struct.setEmprcod(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod());
      struct.setEmprnom(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom());
      struct.setClicod(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod());
      struct.setClinom(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom());
      struct.setArtcod(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod());
      struct.setArtdsc(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc());
      struct.setArtcodext(getgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext());
      return struct ;
   }

   protected byte gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

