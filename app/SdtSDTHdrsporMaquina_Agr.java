package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHdrsporMaquina_Agr extends GxUserType
{
   public SdtSDTHdrsporMaquina_Agr( )
   {
      this(  new ModelContext(SdtSDTHdrsporMaquina_Agr.class));
   }

   public SdtSDTHdrsporMaquina_Agr( ModelContext context )
   {
      super( context, "SdtSDTHdrsporMaquina_Agr");
   }

   public SdtSDTHdrsporMaquina_Agr( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHdrsporMaquina_Agr");
   }

   public SdtSDTHdrsporMaquina_Agr( StructSdtSDTHdrsporMaquina_Agr struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrHDR") )
            {
               gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrDsc") )
            {
               gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrDNu") )
            {
               gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KgmAgr") )
            {
               gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTHdrsporMaquina.Agr" ;
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
      oWriter.writeElement("BarAgrHDR", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrDsc", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrDNu", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KgmAgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr, 9, 2)));
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
      AddObjectProperty("BarAgrHDR", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr, false, false);
      AddObjectProperty("BarAgrDsc", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc, false, false);
      AddObjectProperty("BarAgrDNu", gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu, false, false);
      AddObjectProperty("KgmAgr", gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr, false, false);
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu = "" ;
      gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Agr_N ;
   }

   public app.SdtSDTHdrsporMaquina_Agr Clone( )
   {
      return (app.SdtSDTHdrsporMaquina_Agr)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHdrsporMaquina_Agr struct )
   {
      setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr(struct.getBaragrhdr());
      setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc(struct.getBaragrdsc());
      setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu(struct.getBaragrdnu());
      setgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr(struct.getKgmagr());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHdrsporMaquina_Agr getStruct( )
   {
      app.StructSdtSDTHdrsporMaquina_Agr struct = new app.StructSdtSDTHdrsporMaquina_Agr ();
      struct.setBaragrhdr(getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr());
      struct.setBaragrdsc(getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc());
      struct.setBaragrdnu(getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu());
      struct.setKgmagr(getgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr());
      return struct ;
   }

   protected byte gxTv_SdtSDTHdrsporMaquina_Agr_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc ;
   protected String gxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

