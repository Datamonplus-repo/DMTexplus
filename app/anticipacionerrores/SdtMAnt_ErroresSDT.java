package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMAnt_ErroresSDT extends GxUserType
{
   public SdtMAnt_ErroresSDT( )
   {
      this(  new ModelContext(SdtMAnt_ErroresSDT.class));
   }

   public SdtMAnt_ErroresSDT( ModelContext context )
   {
      super( context, "SdtMAnt_ErroresSDT");
   }

   public SdtMAnt_ErroresSDT( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtMAnt_ErroresSDT");
   }

   public SdtMAnt_ErroresSDT( StructSdtMAnt_ErroresSDT struct )
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
               gxTv_SdtMAnt_ErroresSDT_Mantemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliCod") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantclicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliNom") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantclinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtCod") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntArtDsc") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntColNum") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntTipMCod") )
            {
               gxTv_SdtMAnt_ErroresSDT_Manttipmcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntTipMDsc") )
            {
               gxTv_SdtMAnt_ErroresSDT_Manttipmdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntMaqCod") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantmaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntMaqDsc") )
            {
               gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc = oReader.getValue() ;
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
         sName = "MAnt_ErroresSDT" ;
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
      oWriter.writeElement("MAntEmprCod", gxTv_SdtMAnt_ErroresSDT_Mantemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliCod", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresSDT_Mantclicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliNom", gxTv_SdtMAnt_ErroresSDT_Mantclinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtCod", gxTv_SdtMAnt_ErroresSDT_Mantartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntArtDsc", gxTv_SdtMAnt_ErroresSDT_Mantartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntColNum", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresSDT_Mantcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntTipMCod", gxTv_SdtMAnt_ErroresSDT_Manttipmcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntTipMDsc", gxTv_SdtMAnt_ErroresSDT_Manttipmdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntMaqCod", gxTv_SdtMAnt_ErroresSDT_Mantmaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntMaqDsc", gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc);
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
      AddObjectProperty("MAntEmprCod", gxTv_SdtMAnt_ErroresSDT_Mantemprcod, false, false);
      AddObjectProperty("MAntCliCod", gxTv_SdtMAnt_ErroresSDT_Mantclicod, false, false);
      AddObjectProperty("MAntCliNom", gxTv_SdtMAnt_ErroresSDT_Mantclinom, false, false);
      AddObjectProperty("MAntArtCod", gxTv_SdtMAnt_ErroresSDT_Mantartcod, false, false);
      AddObjectProperty("MAntArtDsc", gxTv_SdtMAnt_ErroresSDT_Mantartdsc, false, false);
      AddObjectProperty("MAntColNum", gxTv_SdtMAnt_ErroresSDT_Mantcolnum, false, false);
      AddObjectProperty("MAntTipMCod", gxTv_SdtMAnt_ErroresSDT_Manttipmcod, false, false);
      AddObjectProperty("MAntTipMDsc", gxTv_SdtMAnt_ErroresSDT_Manttipmdsc, false, false);
      AddObjectProperty("MAntMaqCod", gxTv_SdtMAnt_ErroresSDT_Mantmaqcod, false, false);
      AddObjectProperty("MAntMaqDsc", gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc, false, false);
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantemprcod ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantemprcod = value ;
   }

   public int getgxTv_SdtMAnt_ErroresSDT_Mantclicod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantclicod ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantclicod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantclinom( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantclinom ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantclinom = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantartcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantartcod ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantartcod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantartdsc ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantartdsc = value ;
   }

   public int getgxTv_SdtMAnt_ErroresSDT_Mantcolnum( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantcolnum ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantcolnum( int value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantcolnum = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Manttipmcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Manttipmcod ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Manttipmcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmcod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Manttipmdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Manttipmdsc ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Manttipmdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmdsc = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantmaqcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantmaqcod ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantmaqcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqcod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresSDT_Mantmaqdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc ;
   }

   public void setgxTv_SdtMAnt_ErroresSDT_Mantmaqdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMAnt_ErroresSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(1) ;
      gxTv_SdtMAnt_ErroresSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantartdsc = "" ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmdsc = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMAnt_ErroresSDT_N ;
   }

   public app.anticipacionerrores.SdtMAnt_ErroresSDT Clone( )
   {
      return (app.anticipacionerrores.SdtMAnt_ErroresSDT)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtMAnt_ErroresSDT struct )
   {
      setgxTv_SdtMAnt_ErroresSDT_Mantemprcod(struct.getMantemprcod());
      setgxTv_SdtMAnt_ErroresSDT_Mantclicod(struct.getMantclicod());
      setgxTv_SdtMAnt_ErroresSDT_Mantclinom(struct.getMantclinom());
      setgxTv_SdtMAnt_ErroresSDT_Mantartcod(struct.getMantartcod());
      setgxTv_SdtMAnt_ErroresSDT_Mantartdsc(struct.getMantartdsc());
      setgxTv_SdtMAnt_ErroresSDT_Mantcolnum(struct.getMantcolnum());
      setgxTv_SdtMAnt_ErroresSDT_Manttipmcod(struct.getManttipmcod());
      setgxTv_SdtMAnt_ErroresSDT_Manttipmdsc(struct.getManttipmdsc());
      setgxTv_SdtMAnt_ErroresSDT_Mantmaqcod(struct.getMantmaqcod());
      setgxTv_SdtMAnt_ErroresSDT_Mantmaqdsc(struct.getMantmaqdsc());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtMAnt_ErroresSDT getStruct( )
   {
      app.anticipacionerrores.StructSdtMAnt_ErroresSDT struct = new app.anticipacionerrores.StructSdtMAnt_ErroresSDT ();
      struct.setMantemprcod(getgxTv_SdtMAnt_ErroresSDT_Mantemprcod());
      struct.setMantclicod(getgxTv_SdtMAnt_ErroresSDT_Mantclicod());
      struct.setMantclinom(getgxTv_SdtMAnt_ErroresSDT_Mantclinom());
      struct.setMantartcod(getgxTv_SdtMAnt_ErroresSDT_Mantartcod());
      struct.setMantartdsc(getgxTv_SdtMAnt_ErroresSDT_Mantartdsc());
      struct.setMantcolnum(getgxTv_SdtMAnt_ErroresSDT_Mantcolnum());
      struct.setManttipmcod(getgxTv_SdtMAnt_ErroresSDT_Manttipmcod());
      struct.setManttipmdsc(getgxTv_SdtMAnt_ErroresSDT_Manttipmdsc());
      struct.setMantmaqcod(getgxTv_SdtMAnt_ErroresSDT_Mantmaqcod());
      struct.setMantmaqdsc(getgxTv_SdtMAnt_ErroresSDT_Mantmaqdsc());
      return struct ;
   }

   protected byte gxTv_SdtMAnt_ErroresSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMAnt_ErroresSDT_Mantclicod ;
   protected int gxTv_SdtMAnt_ErroresSDT_Mantcolnum ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantartcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Manttipmcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantmaqcod ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantartdsc ;
   protected String gxTv_SdtMAnt_ErroresSDT_Manttipmdsc ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc ;
}

