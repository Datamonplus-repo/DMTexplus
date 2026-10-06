package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEnviodeEnsayo_SDT extends GxUserType
{
   public SdtEnviodeEnsayo_SDT( )
   {
      this(  new ModelContext(SdtEnviodeEnsayo_SDT.class));
   }

   public SdtEnviodeEnsayo_SDT( ModelContext context )
   {
      super( context, "SdtEnviodeEnsayo_SDT");
   }

   public SdtEnviodeEnsayo_SDT( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtEnviodeEnsayo_SDT");
   }

   public SdtEnviodeEnsayo_SDT( StructSdtEnviodeEnsayo_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numero") )
            {
               gxTv_SdtEnviodeEnsayo_SDT_Lb_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_opcion") )
            {
               gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_cartaz") )
            {
               gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste") )
            {
               gxTv_SdtEnviodeEnsayo_SDT_Coste = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "EnviodeEnsayo_SDT" ;
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
      oWriter.writeElement("Lb_numero", GXutil.trim( GXutil.str( gxTv_SdtEnviodeEnsayo_SDT_Lb_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_opcion", gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_cartaz", gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste", GXutil.trim( GXutil.strNoRound( gxTv_SdtEnviodeEnsayo_SDT_Coste, 11, 5)));
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
      AddObjectProperty("Lb_numero", gxTv_SdtEnviodeEnsayo_SDT_Lb_numero, false, false);
      AddObjectProperty("Lb_opcion", gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion, false, false);
      AddObjectProperty("Lb_cartaz", gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz, false, false);
      AddObjectProperty("Coste", gxTv_SdtEnviodeEnsayo_SDT_Coste, false, false);
   }

   public int getgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_numero ;
   }

   public void setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( int value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_numero = value ;
   }

   public String getgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion ;
   }

   public void setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( String value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion = value ;
   }

   public String getgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz ;
   }

   public void setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( String value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEnviodeEnsayo_SDT_Coste( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_Coste ;
   }

   public void setgxTv_SdtEnviodeEnsayo_SDT_Coste( java.math.BigDecimal value )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(0) ;
      gxTv_SdtEnviodeEnsayo_SDT_Coste = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEnviodeEnsayo_SDT_N = (byte)(1) ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion = "" ;
      gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz = "" ;
      gxTv_SdtEnviodeEnsayo_SDT_Coste = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEnviodeEnsayo_SDT_N ;
   }

   public app.gestionlaboratorio.SdtEnviodeEnsayo_SDT Clone( )
   {
      return (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtEnviodeEnsayo_SDT struct )
   {
      setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero(struct.getLb_numero());
      setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion(struct.getLb_opcion());
      setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz(struct.getLb_cartaz());
      setgxTv_SdtEnviodeEnsayo_SDT_Coste(struct.getCoste());
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtEnviodeEnsayo_SDT getStruct( )
   {
      app.gestionlaboratorio.StructSdtEnviodeEnsayo_SDT struct = new app.gestionlaboratorio.StructSdtEnviodeEnsayo_SDT ();
      struct.setLb_numero(getgxTv_SdtEnviodeEnsayo_SDT_Lb_numero());
      struct.setLb_opcion(getgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion());
      struct.setLb_cartaz(getgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz());
      struct.setCoste(getgxTv_SdtEnviodeEnsayo_SDT_Coste());
      return struct ;
   }

   protected byte gxTv_SdtEnviodeEnsayo_SDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtEnviodeEnsayo_SDT_Lb_numero ;
   protected java.math.BigDecimal gxTv_SdtEnviodeEnsayo_SDT_Coste ;
   protected String gxTv_SdtEnviodeEnsayo_SDT_Lb_opcion ;
   protected String gxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

