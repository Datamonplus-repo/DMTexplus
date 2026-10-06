package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMAnt_ErroresClienteArticuloColorSDT extends GxUserType
{
   public SdtMAnt_ErroresClienteArticuloColorSDT( )
   {
      this(  new ModelContext(SdtMAnt_ErroresClienteArticuloColorSDT.class));
   }

   public SdtMAnt_ErroresClienteArticuloColorSDT( ModelContext context )
   {
      super( context, "SdtMAnt_ErroresClienteArticuloColorSDT");
   }

   public SdtMAnt_ErroresClienteArticuloColorSDT( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtMAnt_ErroresClienteArticuloColorSDT");
   }

   public SdtMAnt_ErroresClienteArticuloColorSDT( StructSdtMAnt_ErroresClienteArticuloColorSDT struct )
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
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliCod") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliNom") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtCod") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtDsc") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntColNum") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntColNom") )
            {
               gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom = oReader.getValue() ;
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
         sName = "MAnt_ErroresClienteArticuloColorSDT" ;
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
      oWriter.writeElement("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliCod", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliNom", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtCod", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtDsc", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntColNum", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntColNom", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom);
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
      AddObjectProperty("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod, false, false);
      AddObjectProperty("MAntCliCod", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod, false, false);
      AddObjectProperty("MAntCliNom", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom, false, false);
      AddObjectProperty("MAntArtCod", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod, false, false);
      AddObjectProperty("MAntArtDsc", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc, false, false);
      AddObjectProperty("MAntColNum", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum, false, false);
      AddObjectProperty("MAntColNom", gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom, false, false);
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod = value ;
   }

   public int getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc = value ;
   }

   public int getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(1) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N ;
   }

   public app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT Clone( )
   {
      return (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloColorSDT struct )
   {
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod(struct.getMantemprcod());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod(struct.getMantclicod());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom(struct.getMantclinom());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod(struct.getMantartcod());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc(struct.getMantartdsc());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum(struct.getMantcolnum());
      setgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom(struct.getMantcolnom());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloColorSDT getStruct( )
   {
      app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloColorSDT struct = new app.anticipacionerrores.StructSdtMAnt_ErroresClienteArticuloColorSDT ();
      struct.setMantemprcod(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod());
      struct.setMantclicod(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod());
      struct.setMantclinom(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom());
      struct.setMantartcod(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod());
      struct.setMantartdsc(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc());
      struct.setMantcolnum(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum());
      struct.setMantcolnom(getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom());
      return struct ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc ;
}

