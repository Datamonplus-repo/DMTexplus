package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTPCO0002 extends GxUserType
{
   public SdtSDTPCO0002( )
   {
      this(  new ModelContext(SdtSDTPCO0002.class));
   }

   public SdtSDTPCO0002( ModelContext context )
   {
      super( context, "SdtSDTPCO0002");
   }

   public SdtSDTPCO0002( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPCO0002");
   }

   public SdtSDTPCO0002( StructSdtSDTPCO0002 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Codigo") )
            {
               gxTv_SdtSDTPCO0002_Codigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTPCO0002_Descripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Periodo") )
            {
               gxTv_SdtSDTPCO0002_Periodo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Acumulado") )
            {
               gxTv_SdtSDTPCO0002_Acumulado = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Total") )
            {
               gxTv_SdtSDTPCO0002_Total = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTPCO0002" ;
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
      oWriter.writeElement("Codigo", gxTv_SdtSDTPCO0002_Codigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSDTPCO0002_Descripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Periodo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Periodo, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Acumulado", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Acumulado, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Total", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Total, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("Codigo", gxTv_SdtSDTPCO0002_Codigo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTPCO0002_Descripcion, false, false);
      AddObjectProperty("Periodo", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Periodo, 18, 2)), false, false);
      AddObjectProperty("Acumulado", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Acumulado, 18, 2)), false, false);
      AddObjectProperty("Total", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTPCO0002_Total, 18, 2)), false, false);
   }

   public String getgxTv_SdtSDTPCO0002_Codigo( )
   {
      return gxTv_SdtSDTPCO0002_Codigo ;
   }

   public void setgxTv_SdtSDTPCO0002_Codigo( String value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Codigo = value ;
   }

   public String getgxTv_SdtSDTPCO0002_Descripcion( )
   {
      return gxTv_SdtSDTPCO0002_Descripcion ;
   }

   public void setgxTv_SdtSDTPCO0002_Descripcion( String value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Descripcion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPCO0002_Periodo( )
   {
      return gxTv_SdtSDTPCO0002_Periodo ;
   }

   public void setgxTv_SdtSDTPCO0002_Periodo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Periodo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPCO0002_Acumulado( )
   {
      return gxTv_SdtSDTPCO0002_Acumulado ;
   }

   public void setgxTv_SdtSDTPCO0002_Acumulado( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Acumulado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPCO0002_Total( )
   {
      return gxTv_SdtSDTPCO0002_Total ;
   }

   public void setgxTv_SdtSDTPCO0002_Total( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Total = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPCO0002_Codigo = "" ;
      gxTv_SdtSDTPCO0002_N = (byte)(1) ;
      gxTv_SdtSDTPCO0002_Descripcion = "" ;
      gxTv_SdtSDTPCO0002_Periodo = DecimalUtil.ZERO ;
      gxTv_SdtSDTPCO0002_Acumulado = DecimalUtil.ZERO ;
      gxTv_SdtSDTPCO0002_Total = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTPCO0002_N ;
   }

   public app.SdtSDTPCO0002 Clone( )
   {
      return (app.SdtSDTPCO0002)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTPCO0002 struct )
   {
      setgxTv_SdtSDTPCO0002_Codigo(struct.getCodigo());
      setgxTv_SdtSDTPCO0002_Descripcion(struct.getDescripcion());
      setgxTv_SdtSDTPCO0002_Periodo(struct.getPeriodo());
      setgxTv_SdtSDTPCO0002_Acumulado(struct.getAcumulado());
      setgxTv_SdtSDTPCO0002_Total(struct.getTotal());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTPCO0002 getStruct( )
   {
      app.StructSdtSDTPCO0002 struct = new app.StructSdtSDTPCO0002 ();
      struct.setCodigo(getgxTv_SdtSDTPCO0002_Codigo());
      struct.setDescripcion(getgxTv_SdtSDTPCO0002_Descripcion());
      struct.setPeriodo(getgxTv_SdtSDTPCO0002_Periodo());
      struct.setAcumulado(getgxTv_SdtSDTPCO0002_Acumulado());
      struct.setTotal(getgxTv_SdtSDTPCO0002_Total());
      return struct ;
   }

   protected byte gxTv_SdtSDTPCO0002_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Periodo ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Acumulado ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Total ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTPCO0002_Codigo ;
   protected String gxTv_SdtSDTPCO0002_Descripcion ;
}

