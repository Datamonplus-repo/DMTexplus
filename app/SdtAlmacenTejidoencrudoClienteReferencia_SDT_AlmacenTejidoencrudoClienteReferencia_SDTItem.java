package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem extends GxUserType
{
   public SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem( )
   {
      this(  new ModelContext(SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem.class));
   }

   public SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem( ModelContext context )
   {
      super( context, "SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem");
   }

   public SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem( int remoteHandle ,
                                                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem");
   }

   public SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem( StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albref") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrefdsc") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbUni") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotUniE") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPzE") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotUniS") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPzU") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotUniSal") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPzSal") )
            {
               gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "AlmacenTejidoencrudoClienteReferencia_SDT.AlmacenTejidoencrudoClienteReferencia_SDTItem" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albref", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albrefdsc", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbUni", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotUniE", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPzE", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotUniS", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPzU", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotUniSal", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPzSal", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom, false, false);
      AddObjectProperty("Albref", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref, false, false);
      AddObjectProperty("Albrefdsc", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc, false, false);
      AddObjectProperty("AlbUni", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni, false, false);
      AddObjectProperty("TotUniE", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie, false, false);
      AddObjectProperty("TotPzE", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze, false, false);
      AddObjectProperty("TotUniS", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis, false, false);
      AddObjectProperty("TotPzU", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu, false, false);
      AddObjectProperty("TotUniSal", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal, false, false);
      AddObjectProperty("TotPzSal", gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal, false, false);
   }

   public int getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom = "" ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref = "" ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc = "" ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni = "" ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N ;
   }

   public app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem Clone( )
   {
      return (app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem struct )
   {
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref(struct.getAlbref());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni(struct.getAlbuni());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie(struct.getTotunie());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze(struct.getTotpze());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis(struct.getTotunis());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu(struct.getTotpzu());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal(struct.getTotunisal());
      setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal(struct.getTotpzsal());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem getStruct( )
   {
      app.StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem struct = new app.StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem ();
      struct.setClicod(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom());
      struct.setAlbref(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref());
      struct.setAlbrefdsc(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc());
      struct.setAlbuni(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni());
      struct.setTotunie(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie());
      struct.setTotpze(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze());
      struct.setTotunis(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis());
      struct.setTotpzu(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu());
      struct.setTotunisal(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal());
      struct.setTotpzsal(getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal());
      return struct ;
   }

   protected byte gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod ;
   protected int gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze ;
   protected int gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu ;
   protected int gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal ;
   protected String gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom ;
   protected String gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref ;
   protected String gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc ;
   protected String gxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

