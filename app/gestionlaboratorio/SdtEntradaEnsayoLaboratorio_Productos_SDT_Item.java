package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEntradaEnsayoLaboratorio_Productos_SDT_Item extends GxUserType
{
   public SdtEntradaEnsayoLaboratorio_Productos_SDT_Item( )
   {
      this(  new ModelContext(SdtEntradaEnsayoLaboratorio_Productos_SDT_Item.class));
   }

   public SdtEntradaEnsayoLaboratorio_Productos_SDT_Item( ModelContext context )
   {
      super( context, "SdtEntradaEnsayoLaboratorio_Productos_SDT_Item");
   }

   public SdtEntradaEnsayoLaboratorio_Productos_SDT_Item( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtEntradaEnsayoLaboratorio_Productos_SDT_Item");
   }

   public SdtEntradaEnsayoLaboratorio_Productos_SDT_Item( StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_LinGru") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valcod") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valdsc") )
            {
               gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc = oReader.getValue() ;
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
         sName = "EntradaEnsayoLaboratorio_Productos_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_LinGru", GXutil.trim( GXutil.str( gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valcod", GXutil.trim( GXutil.str( gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valdsc", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc);
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
      AddObjectProperty("Seleccionar", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Lb_LinGru", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru, false, false);
      AddObjectProperty("PrdNum", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum, false, false);
      AddObjectProperty("PrdNom", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom, false, false);
      AddObjectProperty("Valcod", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod, false, false);
      AddObjectProperty("Valdsc", gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc, false, false);
   }

   public boolean getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar = value ;
   }

   public short getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru( short value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru = value ;
   }

   public String getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum = value ;
   }

   public String getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom = value ;
   }

   public byte getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod( byte value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod = value ;
   }

   public String getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc ;
   }

   public void setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc( String value )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N = (byte)(1) ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum = "" ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom = "" ;
      gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N ;
   }

   public app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item Clone( )
   {
      return (app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item struct )
   {
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru(struct.getLb_lingru());
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum(struct.getPrdnum());
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom(struct.getPrdnom());
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod(struct.getValcod());
      setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc(struct.getValdsc());
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item getStruct( )
   {
      app.gestionlaboratorio.StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item struct = new app.gestionlaboratorio.StructSdtEntradaEnsayoLaboratorio_Productos_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar());
      struct.setLb_lingru(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru());
      struct.setPrdnum(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum());
      struct.setPrdnom(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom());
      struct.setValcod(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod());
      struct.setValdsc(getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc());
      return struct ;
   }

   protected byte gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_N ;
   protected byte gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod ;
   protected short gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom ;
   protected String gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

