package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHdrsporMaquina extends GxUserType
{
   public SdtSDTHdrsporMaquina( )
   {
      this(  new ModelContext(SdtSDTHdrsporMaquina.class));
   }

   public SdtSDTHdrsporMaquina( ModelContext context )
   {
      super( context, "SdtSDTHdrsporMaquina");
   }

   public SdtSDTHdrsporMaquina( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHdrsporMaquina");
   }

   public SdtSDTHdrsporMaquina( StructSdtSDTHdrsporMaquina struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNom") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomcli") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarKgs") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTHdrsporMaquina_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTHdrsporMaquina_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarRgb") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barrgb = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerDsc") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrest") )
            {
               gxTv_SdtSDTHdrsporMaquina_Baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarHdr") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrHdr") )
            {
               gxTv_SdtSDTHdrsporMaquina_Baragrhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFasest") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barfasest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPriTin") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barpritin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarEncCli") )
            {
               gxTv_SdtSDTHdrsporMaquina_Barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrTotKgr") )
            {
               gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNotDsc") )
            {
               if ( gxTv_SdtSDTHdrsporMaquina_Barnotdsc == null )
               {
                  gxTv_SdtSDTHdrsporMaquina_Barnotdsc = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHdrsporMaquina_Barnotdsc.readxmlcollection(oReader, "BarNotDsc", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "BarNotDsc") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgr") )
            {
               if ( gxTv_SdtSDTHdrsporMaquina_Baragr == null )
               {
                  gxTv_SdtSDTHdrsporMaquina_Baragr = new GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr>(app.SdtSDTHdrsporMaquina_Agr.class, "SDTHdrsporMaquina.Agr", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHdrsporMaquina_Baragr.readxmlcollection(oReader, "BarAgr", "Agr") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgr") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SDTHdrsporMaquina" ;
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
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtSDTHdrsporMaquina_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNom", gxTv_SdtSDTHdrsporMaquina_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomcli", gxTv_SdtSDTHdrsporMaquina_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsporMaquina_Barkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTHdrsporMaquina_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarRgb", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Barrgb, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtSDTHdrsporMaquina_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerDsc", gxTv_SdtSDTHdrsporMaquina_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrest", gxTv_SdtSDTHdrsporMaquina_Baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarHdr", gxTv_SdtSDTHdrsporMaquina_Barhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrHdr", gxTv_SdtSDTHdrsporMaquina_Baragrhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarFasest", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Barfasest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPriTin", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsporMaquina_Barpritin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarEncCli", gxTv_SdtSDTHdrsporMaquina_Barenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrTotKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHdrsporMaquina_Barnotdsc != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTHdrsporMaquina_Barnotdsc.writexmlcollection(oWriter, "BarNotDsc", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtSDTHdrsporMaquina_Baragr != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTHdrsporMaquina_Baragr.writexmlcollection(oWriter, "BarAgr", sNameSpace1, "Agr", sNameSpace1);
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
      AddObjectProperty("Barcod", gxTv_SdtSDTHdrsporMaquina_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtSDTHdrsporMaquina_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtSDTHdrsporMaquina_Barcodpar, false, false);
      AddObjectProperty("BarColNom", gxTv_SdtSDTHdrsporMaquina_Barcolnom, false, false);
      AddObjectProperty("BarNomcli", gxTv_SdtSDTHdrsporMaquina_Barnomcli, false, false);
      AddObjectProperty("BarKgs", gxTv_SdtSDTHdrsporMaquina_Barkgs, false, false);
      AddObjectProperty("Clicod", gxTv_SdtSDTHdrsporMaquina_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTHdrsporMaquina_Clinom, false, false);
      AddObjectProperty("BarRgb", gxTv_SdtSDTHdrsporMaquina_Barrgb, false, false);
      AddObjectProperty("BarSer", gxTv_SdtSDTHdrsporMaquina_Barser, false, false);
      AddObjectProperty("BarSerDsc", gxTv_SdtSDTHdrsporMaquina_Barserdsc, false, false);
      AddObjectProperty("BarAgrest", gxTv_SdtSDTHdrsporMaquina_Baragrest, false, false);
      AddObjectProperty("BarHdr", gxTv_SdtSDTHdrsporMaquina_Barhdr, false, false);
      AddObjectProperty("BarAgrHdr", gxTv_SdtSDTHdrsporMaquina_Baragrhdr, false, false);
      AddObjectProperty("BarFasest", gxTv_SdtSDTHdrsporMaquina_Barfasest, false, false);
      AddObjectProperty("BarPriTin", gxTv_SdtSDTHdrsporMaquina_Barpritin, false, false);
      AddObjectProperty("BarEncCli", gxTv_SdtSDTHdrsporMaquina_Barenccli, false, false);
      AddObjectProperty("BarAgrTotKgr", gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr, false, false);
      if ( gxTv_SdtSDTHdrsporMaquina_Barnotdsc != null )
      {
         AddObjectProperty("BarNotDsc", gxTv_SdtSDTHdrsporMaquina_Barnotdsc, false, false);
      }
      if ( gxTv_SdtSDTHdrsporMaquina_Baragr != null )
      {
         AddObjectProperty("BarAgr", gxTv_SdtSDTHdrsporMaquina_Baragr, false, false);
      }
   }

   public int getgxTv_SdtSDTHdrsporMaquina_Barcod( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcod ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barcod( int value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcod = value ;
   }

   public byte getgxTv_SdtSDTHdrsporMaquina_Barcodreo( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcodreo ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barcodreo( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcodreo = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barcodpar( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcodpar ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barcodpar( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcodpar = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barcolnom( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barcolnom ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barcolnom( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barcolnom = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barnomcli( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barnomcli ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barnomcli( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barnomcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsporMaquina_Barkgs( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barkgs ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barkgs = value ;
   }

   public int getgxTv_SdtSDTHdrsporMaquina_Clicod( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Clicod ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Clicod( int value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Clicod = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Clinom( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Clinom ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Clinom( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Clinom = value ;
   }

   public long getgxTv_SdtSDTHdrsporMaquina_Barrgb( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barrgb ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barrgb( long value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barrgb = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barser( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barser ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barser( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barser = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barserdsc( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barserdsc ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barserdsc( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barserdsc = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Baragrest( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrest ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Baragrest( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrest = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barhdr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barhdr = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Baragrhdr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrhdr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Baragrhdr( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrhdr = value ;
   }

   public byte getgxTv_SdtSDTHdrsporMaquina_Barfasest( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barfasest ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barfasest( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barfasest = value ;
   }

   public byte getgxTv_SdtSDTHdrsporMaquina_Barpritin( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barpritin ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barpritin( byte value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barpritin = value ;
   }

   public String getgxTv_SdtSDTHdrsporMaquina_Barenccli( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barenccli ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barenccli( String value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barenccli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr = value ;
   }

   public GXSimpleCollection<String> getgxTv_SdtSDTHdrsporMaquina_Barnotdsc( )
   {
      if ( gxTv_SdtSDTHdrsporMaquina_Barnotdsc == null )
      {
         gxTv_SdtSDTHdrsporMaquina_Barnotdsc = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTHdrsporMaquina_Barnotdsc ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barnotdsc( GXSimpleCollection<String> value )
   {
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc = value ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Barnotdsc_SetNull( )
   {
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc = null ;
   }

   public boolean getgxTv_SdtSDTHdrsporMaquina_Barnotdsc_IsNull( )
   {
      if ( gxTv_SdtSDTHdrsporMaquina_Barnotdsc == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHdrsporMaquina_Barnotdsc_N( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N ;
   }

   public GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr> getgxTv_SdtSDTHdrsporMaquina_Baragr( )
   {
      if ( gxTv_SdtSDTHdrsporMaquina_Baragr == null )
      {
         gxTv_SdtSDTHdrsporMaquina_Baragr = new GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr>(app.SdtSDTHdrsporMaquina_Agr.class, "SDTHdrsporMaquina.Agr", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTHdrsporMaquina_Baragr ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Baragr( GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr> value )
   {
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHdrsporMaquina_Baragr = value ;
   }

   public void setgxTv_SdtSDTHdrsporMaquina_Baragr_SetNull( )
   {
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Baragr = null ;
   }

   public boolean getgxTv_SdtSDTHdrsporMaquina_Baragr_IsNull( )
   {
      if ( gxTv_SdtSDTHdrsporMaquina_Baragr == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHdrsporMaquina_Baragr_N( )
   {
      return gxTv_SdtSDTHdrsporMaquina_Baragr_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHdrsporMaquina_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Barcodpar = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barcolnom = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barnomcli = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barkgs = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsporMaquina_Clinom = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barser = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barserdsc = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrest = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrhdr = "" ;
      gxTv_SdtSDTHdrsporMaquina_Barenccli = "" ;
      gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N = (byte)(1) ;
      gxTv_SdtSDTHdrsporMaquina_Baragr_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHdrsporMaquina_N ;
   }

   public app.SdtSDTHdrsporMaquina Clone( )
   {
      return (app.SdtSDTHdrsporMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHdrsporMaquina struct )
   {
      setgxTv_SdtSDTHdrsporMaquina_Barcod(struct.getBarcod());
      setgxTv_SdtSDTHdrsporMaquina_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSDTHdrsporMaquina_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSDTHdrsporMaquina_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTHdrsporMaquina_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtSDTHdrsporMaquina_Barkgs(struct.getBarkgs());
      setgxTv_SdtSDTHdrsporMaquina_Clicod(struct.getClicod());
      setgxTv_SdtSDTHdrsporMaquina_Clinom(struct.getClinom());
      setgxTv_SdtSDTHdrsporMaquina_Barrgb(struct.getBarrgb());
      setgxTv_SdtSDTHdrsporMaquina_Barser(struct.getBarser());
      setgxTv_SdtSDTHdrsporMaquina_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDTHdrsporMaquina_Baragrest(struct.getBaragrest());
      setgxTv_SdtSDTHdrsporMaquina_Barhdr(struct.getBarhdr());
      setgxTv_SdtSDTHdrsporMaquina_Baragrhdr(struct.getBaragrhdr());
      setgxTv_SdtSDTHdrsporMaquina_Barfasest(struct.getBarfasest());
      setgxTv_SdtSDTHdrsporMaquina_Barpritin(struct.getBarpritin());
      setgxTv_SdtSDTHdrsporMaquina_Barenccli(struct.getBarenccli());
      setgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr(struct.getBaragrtotkgr());
      setgxTv_SdtSDTHdrsporMaquina_Barnotdsc(new GXSimpleCollection<String>(String.class, "internal", "", struct.getBarnotdsc()));
      GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr> gxTv_SdtSDTHdrsporMaquina_Baragr_aux = new GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr>(app.SdtSDTHdrsporMaquina_Agr.class, "SDTHdrsporMaquina.Agr", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHdrsporMaquina_Agr> gxTv_SdtSDTHdrsporMaquina_Baragr_aux1 = struct.getBaragr();
      if (gxTv_SdtSDTHdrsporMaquina_Baragr_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHdrsporMaquina_Baragr_aux1.size(); i++)
         {
            gxTv_SdtSDTHdrsporMaquina_Baragr_aux.add(new app.SdtSDTHdrsporMaquina_Agr(gxTv_SdtSDTHdrsporMaquina_Baragr_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHdrsporMaquina_Baragr(gxTv_SdtSDTHdrsporMaquina_Baragr_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHdrsporMaquina getStruct( )
   {
      app.StructSdtSDTHdrsporMaquina struct = new app.StructSdtSDTHdrsporMaquina ();
      struct.setBarcod(getgxTv_SdtSDTHdrsporMaquina_Barcod());
      struct.setBarcodreo(getgxTv_SdtSDTHdrsporMaquina_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSDTHdrsporMaquina_Barcodpar());
      struct.setBarcolnom(getgxTv_SdtSDTHdrsporMaquina_Barcolnom());
      struct.setBarnomcli(getgxTv_SdtSDTHdrsporMaquina_Barnomcli());
      struct.setBarkgs(getgxTv_SdtSDTHdrsporMaquina_Barkgs());
      struct.setClicod(getgxTv_SdtSDTHdrsporMaquina_Clicod());
      struct.setClinom(getgxTv_SdtSDTHdrsporMaquina_Clinom());
      struct.setBarrgb(getgxTv_SdtSDTHdrsporMaquina_Barrgb());
      struct.setBarser(getgxTv_SdtSDTHdrsporMaquina_Barser());
      struct.setBarserdsc(getgxTv_SdtSDTHdrsporMaquina_Barserdsc());
      struct.setBaragrest(getgxTv_SdtSDTHdrsporMaquina_Baragrest());
      struct.setBarhdr(getgxTv_SdtSDTHdrsporMaquina_Barhdr());
      struct.setBaragrhdr(getgxTv_SdtSDTHdrsporMaquina_Baragrhdr());
      struct.setBarfasest(getgxTv_SdtSDTHdrsporMaquina_Barfasest());
      struct.setBarpritin(getgxTv_SdtSDTHdrsporMaquina_Barpritin());
      struct.setBarenccli(getgxTv_SdtSDTHdrsporMaquina_Barenccli());
      struct.setBaragrtotkgr(getgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr());
      struct.setBarnotdsc(getgxTv_SdtSDTHdrsporMaquina_Barnotdsc().getStruct());
      struct.setBaragr(getgxTv_SdtSDTHdrsporMaquina_Baragr().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHdrsporMaquina_N ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barcodreo ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barfasest ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barpritin ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Barnotdsc_N ;
   protected byte gxTv_SdtSDTHdrsporMaquina_Baragr_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTHdrsporMaquina_Barcod ;
   protected int gxTv_SdtSDTHdrsporMaquina_Clicod ;
   protected long gxTv_SdtSDTHdrsporMaquina_Barrgb ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Barkgs ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsporMaquina_Baragrtotkgr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barcodpar ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barcolnom ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barnomcli ;
   protected String gxTv_SdtSDTHdrsporMaquina_Clinom ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barser ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barserdsc ;
   protected String gxTv_SdtSDTHdrsporMaquina_Baragrest ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Baragrhdr ;
   protected String gxTv_SdtSDTHdrsporMaquina_Barenccli ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr> gxTv_SdtSDTHdrsporMaquina_Baragr_aux ;
   protected GXSimpleCollection<String> gxTv_SdtSDTHdrsporMaquina_Barnotdsc=null ;
   protected GXBaseCollection<app.SdtSDTHdrsporMaquina_Agr> gxTv_SdtSDTHdrsporMaquina_Baragr=null ;
}

