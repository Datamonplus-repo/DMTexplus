package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMAnt_ErroresClienteSDT extends GxUserType
{
   public SdtMAnt_ErroresClienteSDT( )
   {
      this(  new ModelContext(SdtMAnt_ErroresClienteSDT.class));
   }

   public SdtMAnt_ErroresClienteSDT( ModelContext context )
   {
      super( context, "SdtMAnt_ErroresClienteSDT");
   }

   public SdtMAnt_ErroresClienteSDT( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtMAnt_ErroresClienteSDT");
   }

   public SdtMAnt_ErroresClienteSDT( StructSdtMAnt_ErroresClienteSDT struct )
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
               gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliCod") )
            {
               gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAntCliNom") )
            {
               gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom = oReader.getValue() ;
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
         sName = "MAnt_ErroresClienteSDT" ;
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
      oWriter.writeElement("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliCod", GXutil.trim( GXutil.str( gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MAntCliNom", gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom);
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
      AddObjectProperty("MAntEmprCod", gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod, false, false);
      AddObjectProperty("MAntCliCod", gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod, false, false);
      AddObjectProperty("MAntCliNom", gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom, false, false);
   }

   public String getgxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod = value ;
   }

   public int getgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod = value ;
   }

   public String getgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom ;
   }

   public void setgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteSDT_N = (byte)(1) ;
      gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMAnt_ErroresClienteSDT_N ;
   }

   public app.anticipacionerrores.SdtMAnt_ErroresClienteSDT Clone( )
   {
      return (app.anticipacionerrores.SdtMAnt_ErroresClienteSDT)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtMAnt_ErroresClienteSDT struct )
   {
      setgxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod(struct.getMantemprcod());
      setgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod(struct.getMantclicod());
      setgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom(struct.getMantclinom());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtMAnt_ErroresClienteSDT getStruct( )
   {
      app.anticipacionerrores.StructSdtMAnt_ErroresClienteSDT struct = new app.anticipacionerrores.StructSdtMAnt_ErroresClienteSDT ();
      struct.setMantemprcod(getgxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod());
      struct.setMantclicod(getgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod());
      struct.setMantclinom(getgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom());
      return struct ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMAnt_ErroresClienteSDT_Mantclicod ;
   protected String gxTv_SdtMAnt_ErroresClienteSDT_Mantemprcod ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMAnt_ErroresClienteSDT_Mantclinom ;
}

