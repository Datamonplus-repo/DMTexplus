package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtProduccionMaquina extends GxUserType
{
   public SdtsdtProduccionMaquina( )
   {
      this(  new ModelContext(SdtsdtProduccionMaquina.class));
   }

   public SdtsdtProduccionMaquina( ModelContext context )
   {
      super( context, "SdtsdtProduccionMaquina");
   }

   public SdtsdtProduccionMaquina( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtProduccionMaquina");
   }

   public SdtsdtProduccionMaquina( StructSdtsdtProduccionMaquina struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtsdtProduccionMaquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtsdtProduccionMaquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtsdtProduccionMaquina_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtsdtProduccionMaquina_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "sdtProduccionMaquina" ;
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
      oWriter.writeElement("MaqCod", gxTv_SdtsdtProduccionMaquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtsdtProduccionMaquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtProduccionMaquina_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtProduccionMaquina_Metros, 9, 2)));
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
      AddObjectProperty("MaqCod", gxTv_SdtsdtProduccionMaquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtsdtProduccionMaquina_Maqdsc, false, false);
      AddObjectProperty("Kilos", gxTv_SdtsdtProduccionMaquina_Kilos, false, false);
      AddObjectProperty("Metros", gxTv_SdtsdtProduccionMaquina_Metros, false, false);
   }

   public String getgxTv_SdtsdtProduccionMaquina_Maqcod( )
   {
      return gxTv_SdtsdtProduccionMaquina_Maqcod ;
   }

   public void setgxTv_SdtsdtProduccionMaquina_Maqcod( String value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Maqcod = value ;
   }

   public String getgxTv_SdtsdtProduccionMaquina_Maqdsc( )
   {
      return gxTv_SdtsdtProduccionMaquina_Maqdsc ;
   }

   public void setgxTv_SdtsdtProduccionMaquina_Maqdsc( String value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtProduccionMaquina_Kilos( )
   {
      return gxTv_SdtsdtProduccionMaquina_Kilos ;
   }

   public void setgxTv_SdtsdtProduccionMaquina_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtProduccionMaquina_Metros( )
   {
      return gxTv_SdtsdtProduccionMaquina_Metros ;
   }

   public void setgxTv_SdtsdtProduccionMaquina_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquina_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquina_Metros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtProduccionMaquina_Maqcod = "" ;
      gxTv_SdtsdtProduccionMaquina_N = (byte)(1) ;
      gxTv_SdtsdtProduccionMaquina_Maqdsc = "" ;
      gxTv_SdtsdtProduccionMaquina_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtsdtProduccionMaquina_Metros = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtProduccionMaquina_N ;
   }

   public app.SdtsdtProduccionMaquina Clone( )
   {
      return (app.SdtsdtProduccionMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtsdtProduccionMaquina struct )
   {
      setgxTv_SdtsdtProduccionMaquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtsdtProduccionMaquina_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtsdtProduccionMaquina_Kilos(struct.getKilos());
      setgxTv_SdtsdtProduccionMaquina_Metros(struct.getMetros());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtsdtProduccionMaquina getStruct( )
   {
      app.StructSdtsdtProduccionMaquina struct = new app.StructSdtsdtProduccionMaquina ();
      struct.setMaqcod(getgxTv_SdtsdtProduccionMaquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtsdtProduccionMaquina_Maqdsc());
      struct.setKilos(getgxTv_SdtsdtProduccionMaquina_Kilos());
      struct.setMetros(getgxTv_SdtsdtProduccionMaquina_Metros());
      return struct ;
   }

   protected byte gxTv_SdtsdtProduccionMaquina_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquina_Kilos ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquina_Metros ;
   protected String gxTv_SdtsdtProduccionMaquina_Maqcod ;
   protected String gxTv_SdtsdtProduccionMaquina_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

