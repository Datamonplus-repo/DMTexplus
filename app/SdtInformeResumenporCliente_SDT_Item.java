package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeResumenporCliente_SDT_Item extends GxUserType
{
   public SdtInformeResumenporCliente_SDT_Item( )
   {
      this(  new ModelContext(SdtInformeResumenporCliente_SDT_Item.class));
   }

   public SdtInformeResumenporCliente_SDT_Item( ModelContext context )
   {
      super( context, "SdtInformeResumenporCliente_SDT_Item");
   }

   public SdtInformeResumenporCliente_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeResumenporCliente_SDT_Item");
   }

   public SdtInformeResumenporCliente_SDT_Item( StructSdtInformeResumenporCliente_SDT_Item struct )
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
               gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotKilC") )
            {
               gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotMetC") )
            {
               gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotPieC") )
            {
               gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "InformeResumenporCliente_SDT.Item" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotKilC", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotMetC", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotPieC", GXutil.trim( GXutil.str( gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec, 10, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom, false, false);
      AddObjectProperty("TotKilC", gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc, false, false);
      AddObjectProperty("TotMetC", gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc, false, false);
      AddObjectProperty("TotPieC", gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec, false, false);
   }

   public int getgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod( int value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom( String value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc ;
   }

   public void setgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc( java.math.BigDecimal value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc ;
   }

   public void setgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc( java.math.BigDecimal value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc = value ;
   }

   public long getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec ;
   }

   public void setgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec( long value )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeResumenporCliente_SDT_Item_N = (byte)(1) ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom = "" ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc = DecimalUtil.ZERO ;
      gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeResumenporCliente_SDT_Item_N ;
   }

   public app.SdtInformeResumenporCliente_SDT_Item Clone( )
   {
      return (app.SdtInformeResumenporCliente_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtInformeResumenporCliente_SDT_Item struct )
   {
      setgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc(struct.getTotkilc());
      setgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc(struct.getTotmetc());
      setgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec(struct.getTotpiec());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtInformeResumenporCliente_SDT_Item getStruct( )
   {
      app.StructSdtInformeResumenporCliente_SDT_Item struct = new app.StructSdtInformeResumenporCliente_SDT_Item ();
      struct.setClicod(getgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom());
      struct.setTotkilc(getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc());
      struct.setTotmetc(getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc());
      struct.setTotpiec(getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec());
      return struct ;
   }

   protected byte gxTv_SdtInformeResumenporCliente_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtInformeResumenporCliente_SDT_Item_Clicod ;
   protected long gxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec ;
   protected java.math.BigDecimal gxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc ;
   protected java.math.BigDecimal gxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc ;
   protected String gxTv_SdtInformeResumenporCliente_SDT_Item_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

