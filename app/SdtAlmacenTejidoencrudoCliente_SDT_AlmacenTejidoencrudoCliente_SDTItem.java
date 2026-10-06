package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem extends GxUserType
{
   public SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem( )
   {
      this(  new ModelContext(SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem.class));
   }

   public SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem( ModelContext context )
   {
      super( context, "SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem");
   }

   public SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem( int remoteHandle ,
                                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem");
   }

   public SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem( StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem struct )
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
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotEnt") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPe") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotUti") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPu") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SaldoU") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SaldoP") )
            {
               gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "AlmacenTejidoencrudoCliente_SDT.AlmacenTejidoencrudoCliente_SDTItem" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPe", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPu", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SaldoU", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SaldoP", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom, false, false);
      AddObjectProperty("TotEnt", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent, false, false);
      AddObjectProperty("TotPe", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe, false, false);
      AddObjectProperty("TotUti", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti, false, false);
      AddObjectProperty("TotPu", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu, false, false);
      AddObjectProperty("SaldoU", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou, false, false);
      AddObjectProperty("SaldoP", gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop, false, false);
   }

   public int getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom = "" ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N ;
   }

   public app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem Clone( )
   {
      return (app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem struct )
   {
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent(struct.getTotent());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe(struct.getTotpe());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti(struct.getTotuti());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu(struct.getTotpu());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou(struct.getSaldou());
      setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop(struct.getSaldop());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem getStruct( )
   {
      app.StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem struct = new app.StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem ();
      struct.setClicod(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom());
      struct.setTotent(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent());
      struct.setTotpe(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe());
      struct.setTotuti(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti());
      struct.setTotpu(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu());
      struct.setSaldou(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou());
      struct.setSaldop(getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop());
      return struct ;
   }

   protected byte gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod ;
   protected int gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe ;
   protected int gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu ;
   protected int gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou ;
   protected String gxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

