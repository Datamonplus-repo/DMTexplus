package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRMOD008_SDT_Item extends GxUserType
{
   public SdtRMOD008_SDT_Item( )
   {
      this(  new ModelContext(SdtRMOD008_SDT_Item.class));
   }

   public SdtRMOD008_SDT_Item( ModelContext context )
   {
      super( context, "SdtRMOD008_SDT_Item");
   }

   public SdtRMOD008_SDT_Item( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtRMOD008_SDT_Item");
   }

   public SdtRMOD008_SDT_Item( StructSdtRMOD008_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtRMOD008_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtRMOD008_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Saldo_k") )
            {
               gxTv_SdtRMOD008_SDT_Item_Saldo_k = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Saldo_m") )
            {
               gxTv_SdtRMOD008_SDT_Item_Saldo_m = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tot_p") )
            {
               gxTv_SdtRMOD008_SDT_Item_Tot_p = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tot_t") )
            {
               gxTv_SdtRMOD008_SDT_Item_Tot_t = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tot_a") )
            {
               gxTv_SdtRMOD008_SDT_Item_Tot_a = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tot_l") )
            {
               gxTv_SdtRMOD008_SDT_Item_Tot_l = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "RMOD008_SDT.Item" ;
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
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtRMOD008_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtRMOD008_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Saldo_k", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Saldo_k, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Saldo_m", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Saldo_m, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tot_p", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Tot_p, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tot_t", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Tot_t, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tot_a", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Tot_a, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tot_l", GXutil.trim( GXutil.strNoRound( gxTv_SdtRMOD008_SDT_Item_Tot_l, 13, 2)));
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
      AddObjectProperty("CliCod", gxTv_SdtRMOD008_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtRMOD008_SDT_Item_Clinom, false, false);
      AddObjectProperty("Saldo_k", gxTv_SdtRMOD008_SDT_Item_Saldo_k, false, false);
      AddObjectProperty("Saldo_m", gxTv_SdtRMOD008_SDT_Item_Saldo_m, false, false);
      AddObjectProperty("Tot_p", gxTv_SdtRMOD008_SDT_Item_Tot_p, false, false);
      AddObjectProperty("Tot_t", gxTv_SdtRMOD008_SDT_Item_Tot_t, false, false);
      AddObjectProperty("Tot_a", gxTv_SdtRMOD008_SDT_Item_Tot_a, false, false);
      AddObjectProperty("Tot_l", gxTv_SdtRMOD008_SDT_Item_Tot_l, false, false);
   }

   public int getgxTv_SdtRMOD008_SDT_Item_Clicod( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Clicod( int value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtRMOD008_SDT_Item_Clinom( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Clinom( String value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Saldo_k( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Saldo_k ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Saldo_k( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_k = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Saldo_m( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Saldo_m ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Saldo_m( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_m = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Tot_p( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_p ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Tot_p( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_p = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Tot_t( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_t ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Tot_t( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_t = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Tot_a( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_a ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Tot_a( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_a = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRMOD008_SDT_Item_Tot_l( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_l ;
   }

   public void setgxTv_SdtRMOD008_SDT_Item_Tot_l( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_l = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(1) ;
      gxTv_SdtRMOD008_SDT_Item_Clinom = "" ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_k = DecimalUtil.ZERO ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_m = DecimalUtil.ZERO ;
      gxTv_SdtRMOD008_SDT_Item_Tot_p = DecimalUtil.ZERO ;
      gxTv_SdtRMOD008_SDT_Item_Tot_t = DecimalUtil.ZERO ;
      gxTv_SdtRMOD008_SDT_Item_Tot_a = DecimalUtil.ZERO ;
      gxTv_SdtRMOD008_SDT_Item_Tot_l = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRMOD008_SDT_Item_N ;
   }

   public app.pedidosclientesindetalle.SdtRMOD008_SDT_Item Clone( )
   {
      return (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtRMOD008_SDT_Item struct )
   {
      setgxTv_SdtRMOD008_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtRMOD008_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtRMOD008_SDT_Item_Saldo_k(struct.getSaldo_k());
      setgxTv_SdtRMOD008_SDT_Item_Saldo_m(struct.getSaldo_m());
      setgxTv_SdtRMOD008_SDT_Item_Tot_p(struct.getTot_p());
      setgxTv_SdtRMOD008_SDT_Item_Tot_t(struct.getTot_t());
      setgxTv_SdtRMOD008_SDT_Item_Tot_a(struct.getTot_a());
      setgxTv_SdtRMOD008_SDT_Item_Tot_l(struct.getTot_l());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtRMOD008_SDT_Item getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtRMOD008_SDT_Item struct = new app.pedidosclientesindetalle.StructSdtRMOD008_SDT_Item ();
      struct.setClicod(getgxTv_SdtRMOD008_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtRMOD008_SDT_Item_Clinom());
      struct.setSaldo_k(getgxTv_SdtRMOD008_SDT_Item_Saldo_k());
      struct.setSaldo_m(getgxTv_SdtRMOD008_SDT_Item_Saldo_m());
      struct.setTot_p(getgxTv_SdtRMOD008_SDT_Item_Tot_p());
      struct.setTot_t(getgxTv_SdtRMOD008_SDT_Item_Tot_t());
      struct.setTot_a(getgxTv_SdtRMOD008_SDT_Item_Tot_a());
      struct.setTot_l(getgxTv_SdtRMOD008_SDT_Item_Tot_l());
      return struct ;
   }

   protected byte gxTv_SdtRMOD008_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtRMOD008_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Saldo_k ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Saldo_m ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_p ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_t ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_a ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_l ;
   protected String gxTv_SdtRMOD008_SDT_Item_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

