package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtImpresionHdrCv_SDT_Numero extends GxUserType
{
   public SdtImpresionHdrCv_SDT_Numero( )
   {
      this(  new ModelContext(SdtImpresionHdrCv_SDT_Numero.class));
   }

   public SdtImpresionHdrCv_SDT_Numero( ModelContext context )
   {
      super( context, "SdtImpresionHdrCv_SDT_Numero");
   }

   public SdtImpresionHdrCv_SDT_Numero( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtImpresionHdrCv_SDT_Numero");
   }

   public SdtImpresionHdrCv_SDT_Numero( StructSdtImpresionHdrCv_SDT_Numero struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroHdrs") )
            {
               gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RelacionHdrs") )
            {
               gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs = oReader.getValue() ;
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
         sName = "ImpresionHdrCv_SDT.Numero" ;
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
      oWriter.writeElement("NumeroHdrs", GXutil.trim( GXutil.str( gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RelacionHdrs", gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs);
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
      AddObjectProperty("NumeroHdrs", gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs, false, false);
      AddObjectProperty("RelacionHdrs", gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs, false, false);
   }

   public short getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs( short value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs = value ;
   }

   public String getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(1) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   }

   public app.SdtImpresionHdrCv_SDT_Numero Clone( )
   {
      return (app.SdtImpresionHdrCv_SDT_Numero)(clone()) ;
   }

   public void setStruct( app.StructSdtImpresionHdrCv_SDT_Numero struct )
   {
      setgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs(struct.getNumerohdrs());
      setgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs(struct.getRelacionhdrs());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtImpresionHdrCv_SDT_Numero getStruct( )
   {
      app.StructSdtImpresionHdrCv_SDT_Numero struct = new app.StructSdtImpresionHdrCv_SDT_Numero ();
      struct.setNumerohdrs(getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs());
      struct.setRelacionhdrs(getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs());
      return struct ;
   }

   protected byte gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   protected short gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs ;
}

