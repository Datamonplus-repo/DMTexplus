package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_PROCES_PROCESSO extends GxUserType
{
   public SdtSDT_PROCES_PROCESSO( )
   {
      this(  new ModelContext(SdtSDT_PROCES_PROCESSO.class));
   }

   public SdtSDT_PROCES_PROCESSO( ModelContext context )
   {
      super( context, "SdtSDT_PROCES_PROCESSO");
   }

   public SdtSDT_PROCES_PROCESSO( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_PROCES_PROCESSO");
   }

   public SdtSDT_PROCES_PROCESSO( StructSdtSDT_PROCES_PROCESSO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Selected") )
            {
               gxTv_SdtSDT_PROCES_PROCESSO_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod") )
            {
               gxTv_SdtSDT_PROCES_PROCESSO_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProDsc") )
            {
               gxTv_SdtSDT_PROCES_PROCESSO_Prodsc = oReader.getValue() ;
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
         sName = "SDT_PROCES.PROCESSO" ;
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
      oWriter.writeElement("Selected", GXutil.booltostr( gxTv_SdtSDT_PROCES_PROCESSO_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProCod", gxTv_SdtSDT_PROCES_PROCESSO_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProDsc", gxTv_SdtSDT_PROCES_PROCESSO_Prodsc);
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
      AddObjectProperty("Selected", gxTv_SdtSDT_PROCES_PROCESSO_Selected, false, false);
      AddObjectProperty("ProCod", gxTv_SdtSDT_PROCES_PROCESSO_Procod, false, false);
      AddObjectProperty("ProDsc", gxTv_SdtSDT_PROCES_PROCESSO_Prodsc, false, false);
   }

   public boolean getgxTv_SdtSDT_PROCES_PROCESSO_Selected( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Selected ;
   }

   public void setgxTv_SdtSDT_PROCES_PROCESSO_Selected( boolean value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Selected = value ;
   }

   public String getgxTv_SdtSDT_PROCES_PROCESSO_Procod( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Procod ;
   }

   public void setgxTv_SdtSDT_PROCES_PROCESSO_Procod( String value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Procod = value ;
   }

   public String getgxTv_SdtSDT_PROCES_PROCESSO_Prodsc( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_Prodsc ;
   }

   public void setgxTv_SdtSDT_PROCES_PROCESSO_Prodsc( String value )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(0) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Prodsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_PROCES_PROCESSO_N = (byte)(1) ;
      gxTv_SdtSDT_PROCES_PROCESSO_Procod = "" ;
      gxTv_SdtSDT_PROCES_PROCESSO_Prodsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_PROCES_PROCESSO_N ;
   }

   public app.SdtSDT_PROCES_PROCESSO Clone( )
   {
      return (app.SdtSDT_PROCES_PROCESSO)(clone()) ;
   }

   public void setStruct( app.StructSdtSDT_PROCES_PROCESSO struct )
   {
      setgxTv_SdtSDT_PROCES_PROCESSO_Selected(struct.getSelected());
      setgxTv_SdtSDT_PROCES_PROCESSO_Procod(struct.getProcod());
      setgxTv_SdtSDT_PROCES_PROCESSO_Prodsc(struct.getProdsc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDT_PROCES_PROCESSO getStruct( )
   {
      app.StructSdtSDT_PROCES_PROCESSO struct = new app.StructSdtSDT_PROCES_PROCESSO ();
      struct.setSelected(getgxTv_SdtSDT_PROCES_PROCESSO_Selected());
      struct.setProcod(getgxTv_SdtSDT_PROCES_PROCESSO_Procod());
      struct.setProdsc(getgxTv_SdtSDT_PROCES_PROCESSO_Prodsc());
      return struct ;
   }

   protected byte gxTv_SdtSDT_PROCES_PROCESSO_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDT_PROCES_PROCESSO_Procod ;
   protected String gxTv_SdtSDT_PROCES_PROCESSO_Prodsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_PROCES_PROCESSO_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

