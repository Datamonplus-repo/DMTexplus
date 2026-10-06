package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtPiezasPedido extends GxUserType
{
   public SdtSdtPiezasPedido( )
   {
      this(  new ModelContext(SdtSdtPiezasPedido.class));
   }

   public SdtSdtPiezasPedido( ModelContext context )
   {
      super( context, "SdtSdtPiezasPedido");
   }

   public SdtSdtPiezasPedido( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtPiezasPedido");
   }

   public SdtSdtPiezasPedido( StructSdtSdtPiezasPedido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieCod") )
            {
               gxTv_SdtSdtPiezasPedido_Dispiecod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieKil") )
            {
               gxTv_SdtSdtPiezasPedido_Dispiekil = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieMet") )
            {
               gxTv_SdtSdtPiezasPedido_Dispiemet = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieLoc") )
            {
               gxTv_SdtSdtPiezasPedido_Dispieloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieAnc") )
            {
               gxTv_SdtSdtPiezasPedido_Dispieanc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieEst") )
            {
               gxTv_SdtSdtPiezasPedido_Dispieest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieIdPz") )
            {
               gxTv_SdtSdtPiezasPedido_Dispieidpz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieCodB") )
            {
               gxTv_SdtSdtPiezasPedido_Dispiecodb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieAncc") )
            {
               gxTv_SdtSdtPiezasPedido_Dispieancc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPiePda") )
            {
               gxTv_SdtSdtPiezasPedido_Dispiepda = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SdtPiezasPedido" ;
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
      oWriter.writeElement("DisPieCod", gxTv_SdtSdtPiezasPedido_Dispiecod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieKil", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPiezasPedido_Dispiekil, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieMet", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPiezasPedido_Dispiemet, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieLoc", gxTv_SdtSdtPiezasPedido_Dispieloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieAnc", GXutil.trim( GXutil.str( gxTv_SdtSdtPiezasPedido_Dispieanc, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieEst", GXutil.trim( GXutil.str( gxTv_SdtSdtPiezasPedido_Dispieest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieIdPz", gxTv_SdtSdtPiezasPedido_Dispieidpz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieCodB", gxTv_SdtSdtPiezasPedido_Dispiecodb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieAncc", GXutil.trim( GXutil.str( gxTv_SdtSdtPiezasPedido_Dispieancc, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPiePda", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPiezasPedido_Dispiepda, 6, 2)));
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
      AddObjectProperty("DisPieCod", gxTv_SdtSdtPiezasPedido_Dispiecod, false, false);
      AddObjectProperty("DisPieKil", gxTv_SdtSdtPiezasPedido_Dispiekil, false, false);
      AddObjectProperty("DisPieMet", gxTv_SdtSdtPiezasPedido_Dispiemet, false, false);
      AddObjectProperty("DisPieLoc", gxTv_SdtSdtPiezasPedido_Dispieloc, false, false);
      AddObjectProperty("DisPieAnc", gxTv_SdtSdtPiezasPedido_Dispieanc, false, false);
      AddObjectProperty("DisPieEst", gxTv_SdtSdtPiezasPedido_Dispieest, false, false);
      AddObjectProperty("DisPieIdPz", gxTv_SdtSdtPiezasPedido_Dispieidpz, false, false);
      AddObjectProperty("DisPieCodB", gxTv_SdtSdtPiezasPedido_Dispiecodb, false, false);
      AddObjectProperty("DisPieAncc", gxTv_SdtSdtPiezasPedido_Dispieancc, false, false);
      AddObjectProperty("DisPiePda", gxTv_SdtSdtPiezasPedido_Dispiepda, false, false);
   }

   public String getgxTv_SdtSdtPiezasPedido_Dispiecod( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiecod ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispiecod( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiecod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPiezasPedido_Dispiekil( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiekil ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispiekil( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiekil = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPiezasPedido_Dispiemet( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiemet ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispiemet( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiemet = value ;
   }

   public String getgxTv_SdtSdtPiezasPedido_Dispieloc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieloc ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispieloc( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieloc = value ;
   }

   public short getgxTv_SdtSdtPiezasPedido_Dispieanc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieanc ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispieanc( short value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieanc = value ;
   }

   public byte getgxTv_SdtSdtPiezasPedido_Dispieest( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieest ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispieest( byte value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieest = value ;
   }

   public String getgxTv_SdtSdtPiezasPedido_Dispieidpz( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieidpz ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispieidpz( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieidpz = value ;
   }

   public String getgxTv_SdtSdtPiezasPedido_Dispiecodb( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiecodb ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispiecodb( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiecodb = value ;
   }

   public short getgxTv_SdtSdtPiezasPedido_Dispieancc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieancc ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispieancc( short value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieancc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPiezasPedido_Dispiepda( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiepda ;
   }

   public void setgxTv_SdtSdtPiezasPedido_Dispiepda( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiepda = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtPiezasPedido_Dispiecod = "" ;
      gxTv_SdtSdtPiezasPedido_N = (byte)(1) ;
      gxTv_SdtSdtPiezasPedido_Dispiekil = DecimalUtil.ZERO ;
      gxTv_SdtSdtPiezasPedido_Dispiemet = DecimalUtil.ZERO ;
      gxTv_SdtSdtPiezasPedido_Dispieloc = "" ;
      gxTv_SdtSdtPiezasPedido_Dispieidpz = "" ;
      gxTv_SdtSdtPiezasPedido_Dispiecodb = "" ;
      gxTv_SdtSdtPiezasPedido_Dispiepda = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtPiezasPedido_N ;
   }

   public app.SdtSdtPiezasPedido Clone( )
   {
      return (app.SdtSdtPiezasPedido)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtPiezasPedido struct )
   {
      setgxTv_SdtSdtPiezasPedido_Dispiecod(struct.getDispiecod());
      setgxTv_SdtSdtPiezasPedido_Dispiekil(struct.getDispiekil());
      setgxTv_SdtSdtPiezasPedido_Dispiemet(struct.getDispiemet());
      setgxTv_SdtSdtPiezasPedido_Dispieloc(struct.getDispieloc());
      setgxTv_SdtSdtPiezasPedido_Dispieanc(struct.getDispieanc());
      setgxTv_SdtSdtPiezasPedido_Dispieest(struct.getDispieest());
      setgxTv_SdtSdtPiezasPedido_Dispieidpz(struct.getDispieidpz());
      setgxTv_SdtSdtPiezasPedido_Dispiecodb(struct.getDispiecodb());
      setgxTv_SdtSdtPiezasPedido_Dispieancc(struct.getDispieancc());
      setgxTv_SdtSdtPiezasPedido_Dispiepda(struct.getDispiepda());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtPiezasPedido getStruct( )
   {
      app.StructSdtSdtPiezasPedido struct = new app.StructSdtSdtPiezasPedido ();
      struct.setDispiecod(getgxTv_SdtSdtPiezasPedido_Dispiecod());
      struct.setDispiekil(getgxTv_SdtSdtPiezasPedido_Dispiekil());
      struct.setDispiemet(getgxTv_SdtSdtPiezasPedido_Dispiemet());
      struct.setDispieloc(getgxTv_SdtSdtPiezasPedido_Dispieloc());
      struct.setDispieanc(getgxTv_SdtSdtPiezasPedido_Dispieanc());
      struct.setDispieest(getgxTv_SdtSdtPiezasPedido_Dispieest());
      struct.setDispieidpz(getgxTv_SdtSdtPiezasPedido_Dispieidpz());
      struct.setDispiecodb(getgxTv_SdtSdtPiezasPedido_Dispiecodb());
      struct.setDispieancc(getgxTv_SdtSdtPiezasPedido_Dispieancc());
      struct.setDispiepda(getgxTv_SdtSdtPiezasPedido_Dispiepda());
      return struct ;
   }

   protected byte gxTv_SdtSdtPiezasPedido_N ;
   protected byte gxTv_SdtSdtPiezasPedido_Dispieest ;
   protected short gxTv_SdtSdtPiezasPedido_Dispieanc ;
   protected short gxTv_SdtSdtPiezasPedido_Dispieancc ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiekil ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiemet ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiepda ;
   protected String gxTv_SdtSdtPiezasPedido_Dispiecod ;
   protected String gxTv_SdtSdtPiezasPedido_Dispieloc ;
   protected String gxTv_SdtSdtPiezasPedido_Dispieidpz ;
   protected String gxTv_SdtSdtPiezasPedido_Dispiecodb ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

