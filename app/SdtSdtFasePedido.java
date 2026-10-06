package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtFasePedido extends GxUserType
{
   public SdtSdtFasePedido( )
   {
      this(  new ModelContext(SdtSdtFasePedido.class));
   }

   public SdtSdtFasePedido( ModelContext context )
   {
      super( context, "SdtSdtFasePedido");
   }

   public SdtSdtFasePedido( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtFasePedido");
   }

   public SdtSdtFasePedido( StructSdtSdtFasePedido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasLin") )
            {
               gxTv_SdtSdtFasePedido_Disfaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtSdtFasePedido_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSdtFasePedido_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasApr") )
            {
               gxTv_SdtSdtFasePedido_Fasapr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMaqPru") )
            {
               gxTv_SdtSdtFasePedido_Dismaqpru = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisQuiUl") )
            {
               gxTv_SdtSdtFasePedido_Disquiul = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasPre") )
            {
               gxTv_SdtSdtFasePedido_Disfaspre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasUni") )
            {
               gxTv_SdtSdtFasePedido_Disfasuni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasDto") )
            {
               gxTv_SdtSdtFasePedido_Disfasdto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasRec") )
            {
               gxTv_SdtSdtFasePedido_Disfasrec = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasAut") )
            {
               gxTv_SdtSdtFasePedido_Disfasaut = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disfastpp") )
            {
               gxTv_SdtSdtFasePedido_Disfastpp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasUpL") )
            {
               gxTv_SdtSdtFasePedido_Disfasupl = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisfasRb") )
            {
               gxTv_SdtSdtFasePedido_Disfasrb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dta_UOrd") )
            {
               gxTv_SdtSdtFasePedido_Dta_uord = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasObs") )
            {
               gxTv_SdtSdtFasePedido_Disfasobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPreSal") )
            {
               gxTv_SdtSdtFasePedido_Dispresal = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPrePie") )
            {
               gxTv_SdtSdtFasePedido_Disprepie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisVelPro") )
            {
               gxTv_SdtSdtFasePedido_Disvelpro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumPas") )
            {
               gxTv_SdtSdtFasePedido_Disnumpas = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasPreObl") )
            {
               gxTv_SdtSdtFasePedido_Faspreobl = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SdtFasePedido" ;
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
      oWriter.writeElement("DisFasLin", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Disfaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtSdtFasePedido_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSdtFasePedido_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasApr", gxTv_SdtSdtFasePedido_Fasapr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMaqPru", gxTv_SdtSdtFasePedido_Dismaqpru);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisQuiUl", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Disquiul, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasPre", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfaspre, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasUni", gxTv_SdtSdtFasePedido_Disfasuni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasDto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfasdto, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasRec", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfasrec, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasAut", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Disfasaut, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Disfastpp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfastpp, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasUpL", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfasupl, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisfasRb", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disfasrb, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Dta_UOrd", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Dta_uord, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasObs", gxTv_SdtSdtFasePedido_Disfasobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPreSal", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Dispresal, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPrePie", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Disprepie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisVelPro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtFasePedido_Disvelpro, 5, 1)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumPas", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Disnumpas, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasPreObl", GXutil.trim( GXutil.str( gxTv_SdtSdtFasePedido_Faspreobl, 1, 0)));
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
      AddObjectProperty("DisFasLin", gxTv_SdtSdtFasePedido_Disfaslin, false, false);
      AddObjectProperty("FasCod", gxTv_SdtSdtFasePedido_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSdtFasePedido_Fasdsc, false, false);
      AddObjectProperty("FasApr", gxTv_SdtSdtFasePedido_Fasapr, false, false);
      AddObjectProperty("DisMaqPru", gxTv_SdtSdtFasePedido_Dismaqpru, false, false);
      AddObjectProperty("DisQuiUl", gxTv_SdtSdtFasePedido_Disquiul, false, false);
      AddObjectProperty("DisFasPre", gxTv_SdtSdtFasePedido_Disfaspre, false, false);
      AddObjectProperty("DisFasUni", gxTv_SdtSdtFasePedido_Disfasuni, false, false);
      AddObjectProperty("DisFasDto", gxTv_SdtSdtFasePedido_Disfasdto, false, false);
      AddObjectProperty("DisFasRec", gxTv_SdtSdtFasePedido_Disfasrec, false, false);
      AddObjectProperty("DisFasAut", gxTv_SdtSdtFasePedido_Disfasaut, false, false);
      AddObjectProperty("Disfastpp", gxTv_SdtSdtFasePedido_Disfastpp, false, false);
      AddObjectProperty("DisFasUpL", gxTv_SdtSdtFasePedido_Disfasupl, false, false);
      AddObjectProperty("DisfasRb", gxTv_SdtSdtFasePedido_Disfasrb, false, false);
      AddObjectProperty("Dta_UOrd", gxTv_SdtSdtFasePedido_Dta_uord, false, false);
      AddObjectProperty("DisFasObs", gxTv_SdtSdtFasePedido_Disfasobs, false, false);
      AddObjectProperty("DisPreSal", gxTv_SdtSdtFasePedido_Dispresal, false, false);
      AddObjectProperty("DisPrePie", gxTv_SdtSdtFasePedido_Disprepie, false, false);
      AddObjectProperty("DisVelPro", gxTv_SdtSdtFasePedido_Disvelpro, false, false);
      AddObjectProperty("DisNumPas", gxTv_SdtSdtFasePedido_Disnumpas, false, false);
      AddObjectProperty("FasPreObl", gxTv_SdtSdtFasePedido_Faspreobl, false, false);
   }

   public short getgxTv_SdtSdtFasePedido_Disfaslin( )
   {
      return gxTv_SdtSdtFasePedido_Disfaslin ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfaslin( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfaslin = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Fascod( )
   {
      return gxTv_SdtSdtFasePedido_Fascod ;
   }

   public void setgxTv_SdtSdtFasePedido_Fascod( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fascod = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Fasdsc( )
   {
      return gxTv_SdtSdtFasePedido_Fasdsc ;
   }

   public void setgxTv_SdtSdtFasePedido_Fasdsc( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fasdsc = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Fasapr( )
   {
      return gxTv_SdtSdtFasePedido_Fasapr ;
   }

   public void setgxTv_SdtSdtFasePedido_Fasapr( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fasapr = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Dismaqpru( )
   {
      return gxTv_SdtSdtFasePedido_Dismaqpru ;
   }

   public void setgxTv_SdtSdtFasePedido_Dismaqpru( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dismaqpru = value ;
   }

   public short getgxTv_SdtSdtFasePedido_Disquiul( )
   {
      return gxTv_SdtSdtFasePedido_Disquiul ;
   }

   public void setgxTv_SdtSdtFasePedido_Disquiul( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disquiul = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfaspre( )
   {
      return gxTv_SdtSdtFasePedido_Disfaspre ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfaspre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfaspre = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Disfasuni( )
   {
      return gxTv_SdtSdtFasePedido_Disfasuni ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasuni( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasuni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfasdto( )
   {
      return gxTv_SdtSdtFasePedido_Disfasdto ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasdto( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasdto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfasrec( )
   {
      return gxTv_SdtSdtFasePedido_Disfasrec ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasrec( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasrec = value ;
   }

   public byte getgxTv_SdtSdtFasePedido_Disfasaut( )
   {
      return gxTv_SdtSdtFasePedido_Disfasaut ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasaut( byte value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasaut = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfastpp( )
   {
      return gxTv_SdtSdtFasePedido_Disfastpp ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfastpp( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfastpp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfasupl( )
   {
      return gxTv_SdtSdtFasePedido_Disfasupl ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasupl( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasupl = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disfasrb( )
   {
      return gxTv_SdtSdtFasePedido_Disfasrb ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasrb( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasrb = value ;
   }

   public short getgxTv_SdtSdtFasePedido_Dta_uord( )
   {
      return gxTv_SdtSdtFasePedido_Dta_uord ;
   }

   public void setgxTv_SdtSdtFasePedido_Dta_uord( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dta_uord = value ;
   }

   public String getgxTv_SdtSdtFasePedido_Disfasobs( )
   {
      return gxTv_SdtSdtFasePedido_Disfasobs ;
   }

   public void setgxTv_SdtSdtFasePedido_Disfasobs( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasobs = value ;
   }

   public short getgxTv_SdtSdtFasePedido_Dispresal( )
   {
      return gxTv_SdtSdtFasePedido_Dispresal ;
   }

   public void setgxTv_SdtSdtFasePedido_Dispresal( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dispresal = value ;
   }

   public short getgxTv_SdtSdtFasePedido_Disprepie( )
   {
      return gxTv_SdtSdtFasePedido_Disprepie ;
   }

   public void setgxTv_SdtSdtFasePedido_Disprepie( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disprepie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtFasePedido_Disvelpro( )
   {
      return gxTv_SdtSdtFasePedido_Disvelpro ;
   }

   public void setgxTv_SdtSdtFasePedido_Disvelpro( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disvelpro = value ;
   }

   public short getgxTv_SdtSdtFasePedido_Disnumpas( )
   {
      return gxTv_SdtSdtFasePedido_Disnumpas ;
   }

   public void setgxTv_SdtSdtFasePedido_Disnumpas( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disnumpas = value ;
   }

   public byte getgxTv_SdtSdtFasePedido_Faspreobl( )
   {
      return gxTv_SdtSdtFasePedido_Faspreobl ;
   }

   public void setgxTv_SdtSdtFasePedido_Faspreobl( byte value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Faspreobl = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(1) ;
      gxTv_SdtSdtFasePedido_Fascod = "" ;
      gxTv_SdtSdtFasePedido_Fasdsc = "" ;
      gxTv_SdtSdtFasePedido_Fasapr = "" ;
      gxTv_SdtSdtFasePedido_Dismaqpru = "" ;
      gxTv_SdtSdtFasePedido_Disfaspre = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfasuni = "" ;
      gxTv_SdtSdtFasePedido_Disfasdto = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfasrec = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfastpp = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfasupl = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfasrb = DecimalUtil.ZERO ;
      gxTv_SdtSdtFasePedido_Disfasobs = "" ;
      gxTv_SdtSdtFasePedido_Disvelpro = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtFasePedido_N ;
   }

   public app.SdtSdtFasePedido Clone( )
   {
      return (app.SdtSdtFasePedido)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtFasePedido struct )
   {
      setgxTv_SdtSdtFasePedido_Disfaslin(struct.getDisfaslin());
      setgxTv_SdtSdtFasePedido_Fascod(struct.getFascod());
      setgxTv_SdtSdtFasePedido_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSdtFasePedido_Fasapr(struct.getFasapr());
      setgxTv_SdtSdtFasePedido_Dismaqpru(struct.getDismaqpru());
      setgxTv_SdtSdtFasePedido_Disquiul(struct.getDisquiul());
      setgxTv_SdtSdtFasePedido_Disfaspre(struct.getDisfaspre());
      setgxTv_SdtSdtFasePedido_Disfasuni(struct.getDisfasuni());
      setgxTv_SdtSdtFasePedido_Disfasdto(struct.getDisfasdto());
      setgxTv_SdtSdtFasePedido_Disfasrec(struct.getDisfasrec());
      setgxTv_SdtSdtFasePedido_Disfasaut(struct.getDisfasaut());
      setgxTv_SdtSdtFasePedido_Disfastpp(struct.getDisfastpp());
      setgxTv_SdtSdtFasePedido_Disfasupl(struct.getDisfasupl());
      setgxTv_SdtSdtFasePedido_Disfasrb(struct.getDisfasrb());
      setgxTv_SdtSdtFasePedido_Dta_uord(struct.getDta_uord());
      setgxTv_SdtSdtFasePedido_Disfasobs(struct.getDisfasobs());
      setgxTv_SdtSdtFasePedido_Dispresal(struct.getDispresal());
      setgxTv_SdtSdtFasePedido_Disprepie(struct.getDisprepie());
      setgxTv_SdtSdtFasePedido_Disvelpro(struct.getDisvelpro());
      setgxTv_SdtSdtFasePedido_Disnumpas(struct.getDisnumpas());
      setgxTv_SdtSdtFasePedido_Faspreobl(struct.getFaspreobl());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtFasePedido getStruct( )
   {
      app.StructSdtSdtFasePedido struct = new app.StructSdtSdtFasePedido ();
      struct.setDisfaslin(getgxTv_SdtSdtFasePedido_Disfaslin());
      struct.setFascod(getgxTv_SdtSdtFasePedido_Fascod());
      struct.setFasdsc(getgxTv_SdtSdtFasePedido_Fasdsc());
      struct.setFasapr(getgxTv_SdtSdtFasePedido_Fasapr());
      struct.setDismaqpru(getgxTv_SdtSdtFasePedido_Dismaqpru());
      struct.setDisquiul(getgxTv_SdtSdtFasePedido_Disquiul());
      struct.setDisfaspre(getgxTv_SdtSdtFasePedido_Disfaspre());
      struct.setDisfasuni(getgxTv_SdtSdtFasePedido_Disfasuni());
      struct.setDisfasdto(getgxTv_SdtSdtFasePedido_Disfasdto());
      struct.setDisfasrec(getgxTv_SdtSdtFasePedido_Disfasrec());
      struct.setDisfasaut(getgxTv_SdtSdtFasePedido_Disfasaut());
      struct.setDisfastpp(getgxTv_SdtSdtFasePedido_Disfastpp());
      struct.setDisfasupl(getgxTv_SdtSdtFasePedido_Disfasupl());
      struct.setDisfasrb(getgxTv_SdtSdtFasePedido_Disfasrb());
      struct.setDta_uord(getgxTv_SdtSdtFasePedido_Dta_uord());
      struct.setDisfasobs(getgxTv_SdtSdtFasePedido_Disfasobs());
      struct.setDispresal(getgxTv_SdtSdtFasePedido_Dispresal());
      struct.setDisprepie(getgxTv_SdtSdtFasePedido_Disprepie());
      struct.setDisvelpro(getgxTv_SdtSdtFasePedido_Disvelpro());
      struct.setDisnumpas(getgxTv_SdtSdtFasePedido_Disnumpas());
      struct.setFaspreobl(getgxTv_SdtSdtFasePedido_Faspreobl());
      return struct ;
   }

   protected byte gxTv_SdtSdtFasePedido_N ;
   protected byte gxTv_SdtSdtFasePedido_Disfasaut ;
   protected byte gxTv_SdtSdtFasePedido_Faspreobl ;
   protected short gxTv_SdtSdtFasePedido_Disfaslin ;
   protected short gxTv_SdtSdtFasePedido_Disquiul ;
   protected short gxTv_SdtSdtFasePedido_Dta_uord ;
   protected short gxTv_SdtSdtFasePedido_Dispresal ;
   protected short gxTv_SdtSdtFasePedido_Disprepie ;
   protected short gxTv_SdtSdtFasePedido_Disnumpas ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfaspre ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasdto ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasrec ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfastpp ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasupl ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasrb ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disvelpro ;
   protected String gxTv_SdtSdtFasePedido_Fascod ;
   protected String gxTv_SdtSdtFasePedido_Fasdsc ;
   protected String gxTv_SdtSdtFasePedido_Fasapr ;
   protected String gxTv_SdtSdtFasePedido_Dismaqpru ;
   protected String gxTv_SdtSdtFasePedido_Disfasuni ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtFasePedido_Disfasobs ;
}

