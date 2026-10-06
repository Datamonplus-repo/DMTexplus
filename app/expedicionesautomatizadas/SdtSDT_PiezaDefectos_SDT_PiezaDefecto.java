package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_PiezaDefectos_SDT_PiezaDefecto extends GxUserType
{
   public SdtSDT_PiezaDefectos_SDT_PiezaDefecto( )
   {
      this(  new ModelContext(SdtSDT_PiezaDefectos_SDT_PiezaDefecto.class));
   }

   public SdtSDT_PiezaDefectos_SDT_PiezaDefecto( ModelContext context )
   {
      super( context, "SdtSDT_PiezaDefectos_SDT_PiezaDefecto");
   }

   public SdtSDT_PiezaDefectos_SDT_PiezaDefecto( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_PiezaDefectos_SDT_PiezaDefecto");
   }

   public SdtSDT_PiezaDefectos_SDT_PiezaDefecto( StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefCod") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefdsc") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetPieMetIni") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetPieMetFin") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetPieEst") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetPieOb") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Trozos") )
            {
               gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos = oReader.getValue() ;
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
         sName = "SDT_PiezaDefectos.SDT_PiezaDefecto" ;
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
      oWriter.writeElement("TipDefCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefdsc", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetPieMetIni", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetPieMetFin", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetPieEst", GXutil.trim( GXutil.str( gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetPieOb", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Trozos", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos);
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
      AddObjectProperty("TipDefCod", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod, false, false);
      AddObjectProperty("TipDefdsc", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc, false, false);
      AddObjectProperty("MetPieMetIni", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini, false, false);
      AddObjectProperty("MetPieMetFin", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin, false, false);
      AddObjectProperty("MetPieEst", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest, false, false);
      AddObjectProperty("MetPieOb", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob, false, false);
      AddObjectProperty("Trozos", gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos, false, false);
   }

   public short getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod( short value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin = value ;
   }

   public byte getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest( byte value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest = value ;
   }

   public String getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob = value ;
   }

   public String getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos ;
   }

   public void setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(1) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini = DecimalUtil.ZERO ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin = DecimalUtil.ZERO ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob = "" ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N ;
   }

   public app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto Clone( )
   {
      return (app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto)(clone()) ;
   }

   public void setStruct( app.expedicionesautomatizadas.StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto struct )
   {
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini(struct.getMetpiemetini());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin(struct.getMetpiemetfin());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest(struct.getMetpieest());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob(struct.getMetpieob());
      setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos(struct.getTrozos());
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto getStruct( )
   {
      app.expedicionesautomatizadas.StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto struct = new app.expedicionesautomatizadas.StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto ();
      struct.setTipdefcod(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc());
      struct.setMetpiemetini(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini());
      struct.setMetpiemetfin(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin());
      struct.setMetpieest(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest());
      struct.setMetpieob(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob());
      struct.setTrozos(getgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos());
      return struct ;
   }

   protected byte gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N ;
   protected byte gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest ;
   protected short gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini ;
   protected java.math.BigDecimal gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

