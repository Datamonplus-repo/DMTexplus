package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtPCO0005 extends GxUserType
{
   public SdtSdtPCO0005( )
   {
      this(  new ModelContext(SdtSdtPCO0005.class));
   }

   public SdtSdtPCO0005( ModelContext context )
   {
      super( context, "SdtSdtPCO0005");
   }

   public SdtSdtPCO0005( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtPCO0005");
   }

   public SdtSdtPCO0005( StructSdtSdtPCO0005 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Proveedor") )
            {
               gxTv_SdtSdtPCO0005_Proveedor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Enero") )
            {
               gxTv_SdtSdtPCO0005_Enero = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Febrero") )
            {
               gxTv_SdtSdtPCO0005_Febrero = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Marzo") )
            {
               gxTv_SdtSdtPCO0005_Marzo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Abril") )
            {
               gxTv_SdtSdtPCO0005_Abril = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mayo") )
            {
               gxTv_SdtSdtPCO0005_Mayo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Junio") )
            {
               gxTv_SdtSdtPCO0005_Junio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Julio") )
            {
               gxTv_SdtSdtPCO0005_Julio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Agosto") )
            {
               gxTv_SdtSdtPCO0005_Agosto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Septiembre") )
            {
               gxTv_SdtSdtPCO0005_Septiembre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Octubre") )
            {
               gxTv_SdtSdtPCO0005_Octubre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Noviembre") )
            {
               gxTv_SdtSdtPCO0005_Noviembre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Diciembre") )
            {
               gxTv_SdtSdtPCO0005_Diciembre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Total") )
            {
               gxTv_SdtSdtPCO0005_Total = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SdtPCO0005" ;
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
      oWriter.writeElement("Proveedor", gxTv_SdtSdtPCO0005_Proveedor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Enero", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Enero, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Febrero", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Febrero, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Marzo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Marzo, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Abril", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Abril, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mayo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Mayo, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Junio", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Junio, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Julio", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Julio, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Agosto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Agosto, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Septiembre", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Septiembre, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Octubre", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Octubre, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Noviembre", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Noviembre, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Diciembre", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Diciembre, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Total", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Total, 18, 2)));
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
      AddObjectProperty("Proveedor", gxTv_SdtSdtPCO0005_Proveedor, false, false);
      AddObjectProperty("Enero", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Enero, 18, 2)), false, false);
      AddObjectProperty("Febrero", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Febrero, 18, 2)), false, false);
      AddObjectProperty("Marzo", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Marzo, 18, 2)), false, false);
      AddObjectProperty("Abril", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Abril, 18, 2)), false, false);
      AddObjectProperty("Mayo", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Mayo, 18, 2)), false, false);
      AddObjectProperty("Junio", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Junio, 18, 2)), false, false);
      AddObjectProperty("Julio", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Julio, 18, 2)), false, false);
      AddObjectProperty("Agosto", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Agosto, 18, 2)), false, false);
      AddObjectProperty("Septiembre", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Septiembre, 18, 2)), false, false);
      AddObjectProperty("Octubre", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Octubre, 18, 2)), false, false);
      AddObjectProperty("Noviembre", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Noviembre, 18, 2)), false, false);
      AddObjectProperty("Diciembre", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Diciembre, 18, 2)), false, false);
      AddObjectProperty("Total", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSdtPCO0005_Total, 18, 2)), false, false);
   }

   public String getgxTv_SdtSdtPCO0005_Proveedor( )
   {
      return gxTv_SdtSdtPCO0005_Proveedor ;
   }

   public void setgxTv_SdtSdtPCO0005_Proveedor( String value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Proveedor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Enero( )
   {
      return gxTv_SdtSdtPCO0005_Enero ;
   }

   public void setgxTv_SdtSdtPCO0005_Enero( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Enero = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Febrero( )
   {
      return gxTv_SdtSdtPCO0005_Febrero ;
   }

   public void setgxTv_SdtSdtPCO0005_Febrero( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Febrero = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Marzo( )
   {
      return gxTv_SdtSdtPCO0005_Marzo ;
   }

   public void setgxTv_SdtSdtPCO0005_Marzo( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Marzo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Abril( )
   {
      return gxTv_SdtSdtPCO0005_Abril ;
   }

   public void setgxTv_SdtSdtPCO0005_Abril( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Abril = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Mayo( )
   {
      return gxTv_SdtSdtPCO0005_Mayo ;
   }

   public void setgxTv_SdtSdtPCO0005_Mayo( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Mayo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Junio( )
   {
      return gxTv_SdtSdtPCO0005_Junio ;
   }

   public void setgxTv_SdtSdtPCO0005_Junio( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Junio = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Julio( )
   {
      return gxTv_SdtSdtPCO0005_Julio ;
   }

   public void setgxTv_SdtSdtPCO0005_Julio( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Julio = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Agosto( )
   {
      return gxTv_SdtSdtPCO0005_Agosto ;
   }

   public void setgxTv_SdtSdtPCO0005_Agosto( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Agosto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Septiembre( )
   {
      return gxTv_SdtSdtPCO0005_Septiembre ;
   }

   public void setgxTv_SdtSdtPCO0005_Septiembre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Septiembre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Octubre( )
   {
      return gxTv_SdtSdtPCO0005_Octubre ;
   }

   public void setgxTv_SdtSdtPCO0005_Octubre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Octubre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Noviembre( )
   {
      return gxTv_SdtSdtPCO0005_Noviembre ;
   }

   public void setgxTv_SdtSdtPCO0005_Noviembre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Noviembre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Diciembre( )
   {
      return gxTv_SdtSdtPCO0005_Diciembre ;
   }

   public void setgxTv_SdtSdtPCO0005_Diciembre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Diciembre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtPCO0005_Total( )
   {
      return gxTv_SdtSdtPCO0005_Total ;
   }

   public void setgxTv_SdtSdtPCO0005_Total( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPCO0005_N = (byte)(0) ;
      gxTv_SdtSdtPCO0005_Total = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtPCO0005_Proveedor = "" ;
      gxTv_SdtSdtPCO0005_N = (byte)(1) ;
      gxTv_SdtSdtPCO0005_Enero = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Febrero = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Marzo = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Abril = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Mayo = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Junio = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Julio = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Agosto = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Septiembre = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Octubre = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Noviembre = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Diciembre = DecimalUtil.ZERO ;
      gxTv_SdtSdtPCO0005_Total = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtPCO0005_N ;
   }

   public app.SdtSdtPCO0005 Clone( )
   {
      return (app.SdtSdtPCO0005)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtPCO0005 struct )
   {
      setgxTv_SdtSdtPCO0005_Proveedor(struct.getProveedor());
      setgxTv_SdtSdtPCO0005_Enero(struct.getEnero());
      setgxTv_SdtSdtPCO0005_Febrero(struct.getFebrero());
      setgxTv_SdtSdtPCO0005_Marzo(struct.getMarzo());
      setgxTv_SdtSdtPCO0005_Abril(struct.getAbril());
      setgxTv_SdtSdtPCO0005_Mayo(struct.getMayo());
      setgxTv_SdtSdtPCO0005_Junio(struct.getJunio());
      setgxTv_SdtSdtPCO0005_Julio(struct.getJulio());
      setgxTv_SdtSdtPCO0005_Agosto(struct.getAgosto());
      setgxTv_SdtSdtPCO0005_Septiembre(struct.getSeptiembre());
      setgxTv_SdtSdtPCO0005_Octubre(struct.getOctubre());
      setgxTv_SdtSdtPCO0005_Noviembre(struct.getNoviembre());
      setgxTv_SdtSdtPCO0005_Diciembre(struct.getDiciembre());
      setgxTv_SdtSdtPCO0005_Total(struct.getTotal());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtPCO0005 getStruct( )
   {
      app.StructSdtSdtPCO0005 struct = new app.StructSdtSdtPCO0005 ();
      struct.setProveedor(getgxTv_SdtSdtPCO0005_Proveedor());
      struct.setEnero(getgxTv_SdtSdtPCO0005_Enero());
      struct.setFebrero(getgxTv_SdtSdtPCO0005_Febrero());
      struct.setMarzo(getgxTv_SdtSdtPCO0005_Marzo());
      struct.setAbril(getgxTv_SdtSdtPCO0005_Abril());
      struct.setMayo(getgxTv_SdtSdtPCO0005_Mayo());
      struct.setJunio(getgxTv_SdtSdtPCO0005_Junio());
      struct.setJulio(getgxTv_SdtSdtPCO0005_Julio());
      struct.setAgosto(getgxTv_SdtSdtPCO0005_Agosto());
      struct.setSeptiembre(getgxTv_SdtSdtPCO0005_Septiembre());
      struct.setOctubre(getgxTv_SdtSdtPCO0005_Octubre());
      struct.setNoviembre(getgxTv_SdtSdtPCO0005_Noviembre());
      struct.setDiciembre(getgxTv_SdtSdtPCO0005_Diciembre());
      struct.setTotal(getgxTv_SdtSdtPCO0005_Total());
      return struct ;
   }

   protected byte gxTv_SdtSdtPCO0005_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Enero ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Febrero ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Marzo ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Abril ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Mayo ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Junio ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Julio ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Agosto ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Septiembre ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Octubre ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Noviembre ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Diciembre ;
   protected java.math.BigDecimal gxTv_SdtSdtPCO0005_Total ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtPCO0005_Proveedor ;
}

