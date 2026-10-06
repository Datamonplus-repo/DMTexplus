package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem extends GxUserType
{
   public SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( )
   {
      this(  new ModelContext(SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class));
   }

   public SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( ModelContext context )
   {
      super( context, "SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem");
   }

   public SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem");
   }

   public SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artcod") )
            {
               gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc = oReader.getValue() ;
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
         sName = "DuplicarArticulos_SDT.DuplicarArticulos_SDTItem" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Artcod", gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc);
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
      AddObjectProperty("Seleccionar", gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar, false, false);
      AddObjectProperty("Artcod", gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc, false, false);
   }

   public boolean getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar ;
   }

   public void setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar( boolean value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar = value ;
   }

   public String getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod ;
   }

   public void setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod( String value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod = value ;
   }

   public String getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc ;
   }

   public void setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc( String value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(1) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod = "" ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N ;
   }

   public app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem Clone( )
   {
      return (app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)(clone()) ;
   }

   public void setStruct( app.ficherosbasicos.StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem struct )
   {
      setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod(struct.getArtcod());
      setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc(struct.getArtdsc());
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem getStruct( )
   {
      app.ficherosbasicos.StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem struct = new app.ficherosbasicos.StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem ();
      struct.setSeleccionar(getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar());
      struct.setArtcod(getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod());
      struct.setArtdsc(getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc());
      return struct ;
   }

   protected byte gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod ;
   protected String gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

