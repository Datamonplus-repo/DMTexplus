package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtParametroCalls extends GxUserType
{
   public SdtSdtParametroCalls( )
   {
      this(  new ModelContext(SdtSdtParametroCalls.class));
   }

   public SdtSdtParametroCalls( ModelContext context )
   {
      super( context, "SdtSdtParametroCalls");
   }

   public SdtSdtParametroCalls( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtParametroCalls");
   }

   public SdtSdtParametroCalls( StructSdtSdtParametroCalls struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NombreParametro") )
            {
               gxTv_SdtSdtParametroCalls_Nombreparametro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValorParametro") )
            {
               gxTv_SdtSdtParametroCalls_Valorparametro = oReader.getValue() ;
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
         sName = "SdtParametroCalls" ;
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
      oWriter.writeElement("NombreParametro", gxTv_SdtSdtParametroCalls_Nombreparametro);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValorParametro", gxTv_SdtSdtParametroCalls_Valorparametro);
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
      AddObjectProperty("NombreParametro", gxTv_SdtSdtParametroCalls_Nombreparametro, false, false);
      AddObjectProperty("ValorParametro", gxTv_SdtSdtParametroCalls_Valorparametro, false, false);
   }

   public String getgxTv_SdtSdtParametroCalls_Nombreparametro( )
   {
      return gxTv_SdtSdtParametroCalls_Nombreparametro ;
   }

   public void setgxTv_SdtSdtParametroCalls_Nombreparametro( String value )
   {
      gxTv_SdtSdtParametroCalls_N = (byte)(0) ;
      gxTv_SdtSdtParametroCalls_Nombreparametro = value ;
   }

   public String getgxTv_SdtSdtParametroCalls_Valorparametro( )
   {
      return gxTv_SdtSdtParametroCalls_Valorparametro ;
   }

   public void setgxTv_SdtSdtParametroCalls_Valorparametro( String value )
   {
      gxTv_SdtSdtParametroCalls_N = (byte)(0) ;
      gxTv_SdtSdtParametroCalls_Valorparametro = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtParametroCalls_Nombreparametro = "" ;
      gxTv_SdtSdtParametroCalls_N = (byte)(1) ;
      gxTv_SdtSdtParametroCalls_Valorparametro = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtParametroCalls_N ;
   }

   public app.SdtSdtParametroCalls Clone( )
   {
      return (app.SdtSdtParametroCalls)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtParametroCalls struct )
   {
      setgxTv_SdtSdtParametroCalls_Nombreparametro(struct.getNombreparametro());
      setgxTv_SdtSdtParametroCalls_Valorparametro(struct.getValorparametro());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtParametroCalls getStruct( )
   {
      app.StructSdtSdtParametroCalls struct = new app.StructSdtSdtParametroCalls ();
      struct.setNombreparametro(getgxTv_SdtSdtParametroCalls_Nombreparametro());
      struct.setValorparametro(getgxTv_SdtSdtParametroCalls_Valorparametro());
      return struct ;
   }

   protected byte gxTv_SdtSdtParametroCalls_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtParametroCalls_Nombreparametro ;
   protected String gxTv_SdtSdtParametroCalls_Valorparametro ;
}

