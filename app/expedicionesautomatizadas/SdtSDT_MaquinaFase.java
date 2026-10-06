package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_MaquinaFase extends GxUserType
{
   public SdtSDT_MaquinaFase( )
   {
      this(  new ModelContext(SdtSDT_MaquinaFase.class));
   }

   public SdtSDT_MaquinaFase( ModelContext context )
   {
      super( context, "SdtSDT_MaquinaFase");
   }

   public SdtSDT_MaquinaFase( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_MaquinaFase");
   }

   public SdtSDT_MaquinaFase( StructSdtSDT_MaquinaFase struct )
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
               gxTv_SdtSDT_MaquinaFase_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFasUni") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqfasuni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFFind") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqffind = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFDsc") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqfdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFCod") )
            {
               gxTv_SdtSDT_MaquinaFase_Maqfcod = oReader.getValue() ;
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
         sName = "SDT_MaquinaFase" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDT_MaquinaFase_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDT_MaquinaFase_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDT_MaquinaFase_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFasUni", gxTv_SdtSDT_MaquinaFase_Maqfasuni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFFind", gxTv_SdtSDT_MaquinaFase_Maqffind);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFDsc", gxTv_SdtSDT_MaquinaFase_Maqfdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFCod", gxTv_SdtSDT_MaquinaFase_Maqfcod);
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
      AddObjectProperty("EmprCod", gxTv_SdtSDT_MaquinaFase_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDT_MaquinaFase_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDT_MaquinaFase_Maqdsc, false, false);
      AddObjectProperty("MaqFasUni", gxTv_SdtSDT_MaquinaFase_Maqfasuni, false, false);
      AddObjectProperty("MaqFFind", gxTv_SdtSDT_MaquinaFase_Maqffind, false, false);
      AddObjectProperty("MaqFDsc", gxTv_SdtSDT_MaquinaFase_Maqfdsc, false, false);
      AddObjectProperty("MaqFCod", gxTv_SdtSDT_MaquinaFase_Maqfcod, false, false);
   }

   public String getgxTv_SdtSDT_MaquinaFase_Emprcod( )
   {
      return gxTv_SdtSDT_MaquinaFase_Emprcod ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Emprcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Emprcod = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqcod( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqcod ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqcod = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqdsc( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqdsc ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqdsc( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqdsc = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqfasuni( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfasuni ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqfasuni( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfasuni = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqffind( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqffind ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqffind( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqffind = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqfdsc( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfdsc ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqfdsc( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfdsc = value ;
   }

   public String getgxTv_SdtSDT_MaquinaFase_Maqfcod( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfcod ;
   }

   public void setgxTv_SdtSDT_MaquinaFase_Maqfcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_MaquinaFase_Emprcod = "" ;
      gxTv_SdtSDT_MaquinaFase_N = (byte)(1) ;
      gxTv_SdtSDT_MaquinaFase_Maqcod = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqdsc = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfasuni = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqffind = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfdsc = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfcod = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_MaquinaFase_N ;
   }

   public app.expedicionesautomatizadas.SdtSDT_MaquinaFase Clone( )
   {
      return (app.expedicionesautomatizadas.SdtSDT_MaquinaFase)(clone()) ;
   }

   public void setStruct( app.expedicionesautomatizadas.StructSdtSDT_MaquinaFase struct )
   {
      setgxTv_SdtSDT_MaquinaFase_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDT_MaquinaFase_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDT_MaquinaFase_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDT_MaquinaFase_Maqfasuni(struct.getMaqfasuni());
      setgxTv_SdtSDT_MaquinaFase_Maqffind(struct.getMaqffind());
      setgxTv_SdtSDT_MaquinaFase_Maqfdsc(struct.getMaqfdsc());
      setgxTv_SdtSDT_MaquinaFase_Maqfcod(struct.getMaqfcod());
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.StructSdtSDT_MaquinaFase getStruct( )
   {
      app.expedicionesautomatizadas.StructSdtSDT_MaquinaFase struct = new app.expedicionesautomatizadas.StructSdtSDT_MaquinaFase ();
      struct.setEmprcod(getgxTv_SdtSDT_MaquinaFase_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDT_MaquinaFase_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDT_MaquinaFase_Maqdsc());
      struct.setMaqfasuni(getgxTv_SdtSDT_MaquinaFase_Maqfasuni());
      struct.setMaqffind(getgxTv_SdtSDT_MaquinaFase_Maqffind());
      struct.setMaqfdsc(getgxTv_SdtSDT_MaquinaFase_Maqfdsc());
      struct.setMaqfcod(getgxTv_SdtSDT_MaquinaFase_Maqfcod());
      return struct ;
   }

   protected byte gxTv_SdtSDT_MaquinaFase_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDT_MaquinaFase_Emprcod ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqcod ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqdsc ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfasuni ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqffind ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfdsc ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfcod ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

