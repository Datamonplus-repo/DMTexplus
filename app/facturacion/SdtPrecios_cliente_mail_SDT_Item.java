package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPrecios_cliente_mail_SDT_Item extends GxUserType
{
   public SdtPrecios_cliente_mail_SDT_Item( )
   {
      this(  new ModelContext(SdtPrecios_cliente_mail_SDT_Item.class));
   }

   public SdtPrecios_cliente_mail_SDT_Item( ModelContext context )
   {
      super( context, "SdtPrecios_cliente_mail_SDT_Item");
   }

   public SdtPrecios_cliente_mail_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtPrecios_cliente_mail_SDT_Item");
   }

   public SdtPrecios_cliente_mail_SDT_Item( StructSdtPrecios_cliente_mail_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fortonal") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fornomcli") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnom") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnum") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPreKgm") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "Precios_cliente_mail_SDT.Item" ;
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
      oWriter.writeElement("Fortonal", gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fornomcli", gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnom", gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnum", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar));
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
      AddObjectProperty("Fortonal", gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc, false, false);
      AddObjectProperty("Fornomcli", gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli, false, false);
      AddObjectProperty("Forcolnom", gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom, false, false);
      AddObjectProperty("Forcolnum", gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum, false, false);
      AddObjectProperty("ForPreKgm", gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm, false, false);
      AddObjectProperty("Obs", gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs, false, false);
      AddObjectProperty("Seleccionar", gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar, false, false);
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom = value ;
   }

   public int getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum( int value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mail_SDT_Item_Obs( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Obs( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs = value ;
   }

   public boolean getgxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_N ;
   }

   public app.facturacion.SdtPrecios_cliente_mail_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPrecios_cliente_mail_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPrecios_cliente_mail_SDT_Item struct )
   {
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal(struct.getFortonal());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc(struct.getArtdsc());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli(struct.getFornomcli());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom(struct.getForcolnom());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum(struct.getForcolnum());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm(struct.getForprekgm());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Obs(struct.getObs());
      setgxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar(struct.getSeleccionar());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPrecios_cliente_mail_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPrecios_cliente_mail_SDT_Item struct = new app.facturacion.StructSdtPrecios_cliente_mail_SDT_Item ();
      struct.setFortonal(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal());
      struct.setArtdsc(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc());
      struct.setTipartdsc(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc());
      struct.setFornomcli(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli());
      struct.setForcolnom(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom());
      struct.setForcolnum(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum());
      struct.setForprekgm(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm());
      struct.setObs(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Obs());
      struct.setSeleccionar(getgxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar());
      return struct ;
   }

   protected byte gxTv_SdtPrecios_cliente_mail_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs ;
   protected String sTagName ;
   protected boolean gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

