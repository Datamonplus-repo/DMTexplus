package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMAnt_ErroresClienteArticuloSDT extends GxUserType
{
   public SdtMAnt_ErroresClienteArticuloSDT( )
   {
      this(  new ModelContext(SdtMAnt_ErroresClienteArticuloSDT.class));
   }

   public SdtMAnt_ErroresClienteArticuloSDT( ModelContext context )
   {
      super( context, "SdtMAnt_ErroresClienteArticuloSDT");
   }

   public SdtMAnt_ErroresClienteArticuloSDT( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtMAnt_ErroresClienteArticuloSDT");
   }

   public SdtMAnt_ErroresClienteArticuloSDT( StructSdtMAnt_ErroresClienteArticuloSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntEmprCod") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliCod") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliNom") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtCod") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtDsc") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc = oReader.getValue() ;
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
         sName = "MAnt_ErroresClienteArticuloSDT" ;
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
      oWriter.writeElement("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliCod", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliNom", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtCod", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtDsc", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc);
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
      AddObjectProperty("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod, false, false);
      AddObjectProperty("MAntCliCod", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod, false, false);
      AddObjectProperty("MAntCliNom", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom, false, false);
      AddObjectProperty("MAntArtCod", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod, false, false);
      AddObjectProperty("MAntArtDsc", gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc, false, false);
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod = value ;
   }

   public int getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_N = (byte)(1) ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloSDT_N ;
   }

   public app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT Clone( )
   {
      return (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloSDT struct )
   {
      setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod(struct.getMantemprcod());
      setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod(struct.getMantclicod());
      setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom(struct.getMantclinom());
      setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod(struct.getMantartcod());
      setgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc(struct.getMantartdsc());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloSDT getStruct( )
   {
      app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloSDT struct = new app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloSDT ();
      struct.setMantemprcod(getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod());
      struct.setMantclicod(getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod());
      struct.setMantclinom(getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom());
      struct.setMantartcod(getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod());
      struct.setMantartdsc(getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc());
      return struct ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteArticuloSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclicod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc ;
}

