package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_Operario extends GxUserType
{
   public SdtSDT_Operario( )
   {
      this(  new ModelContext(SdtSDT_Operario.class));
   }

   public SdtSDT_Operario( ModelContext context )
   {
      super( context, "SdtSDT_Operario");
   }

   public SdtSDT_Operario( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_Operario");
   }

   public SdtSDT_Operario( StructSdtSDT_Operario struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSDT_Operario_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeCod") )
            {
               gxTv_SdtSDT_Operario_Opecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom") )
            {
               gxTv_SdtSDT_Operario_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom2") )
            {
               gxTv_SdtSDT_Operario_Openom2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtSDT_Operario_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpePreHor") )
            {
               gxTv_SdtSDT_Operario_Opeprehor = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeTurno") )
            {
               gxTv_SdtSDT_Operario_Opeturno = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeCedula") )
            {
               gxTv_SdtSDT_Operario_Opecedula = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeSecc") )
            {
               gxTv_SdtSDT_Operario_Opesecc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeAct") )
            {
               gxTv_SdtSDT_Operario_Opeact = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpePass") )
            {
               gxTv_SdtSDT_Operario_Opepass = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeMSol") )
            {
               gxTv_SdtSDT_Operario_Opemsol = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeMUsu") )
            {
               gxTv_SdtSDT_Operario_Opemusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeCNom") )
            {
               gxTv_SdtSDT_Operario_Opecnom = oReader.getValue() ;
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
         sName = "SDT_Operario" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDT_Operario_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_Operario_Opecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom", gxTv_SdtSDT_Operario_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom2", gxTv_SdtSDT_Operario_Openom2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtSDT_Operario_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpePreHor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Operario_Opeprehor, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeTurno", GXutil.trim( GXutil.str( gxTv_SdtSDT_Operario_Opeturno, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeCedula", GXutil.trim( GXutil.str( gxTv_SdtSDT_Operario_Opecedula, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeSecc", gxTv_SdtSDT_Operario_Opesecc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeAct", gxTv_SdtSDT_Operario_Opeact);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpePass", gxTv_SdtSDT_Operario_Opepass);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeMSol", gxTv_SdtSDT_Operario_Opemsol);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeMUsu", gxTv_SdtSDT_Operario_Opemusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeCNom", gxTv_SdtSDT_Operario_Opecnom);
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
      AddObjectProperty("EmprCod", gxTv_SdtSDT_Operario_Emprcod, false, false);
      AddObjectProperty("OpeCod", gxTv_SdtSDT_Operario_Opecod, false, false);
      AddObjectProperty("OpeNom", gxTv_SdtSDT_Operario_Openom, false, false);
      AddObjectProperty("OpeNom2", gxTv_SdtSDT_Operario_Openom2, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtSDT_Operario_Emprnom, false, false);
      AddObjectProperty("OpePreHor", gxTv_SdtSDT_Operario_Opeprehor, false, false);
      AddObjectProperty("OpeTurno", gxTv_SdtSDT_Operario_Opeturno, false, false);
      AddObjectProperty("OpeCedula", GXutil.ltrim( GXutil.str( gxTv_SdtSDT_Operario_Opecedula, 18, 0)), false, false);
      AddObjectProperty("OpeSecc", gxTv_SdtSDT_Operario_Opesecc, false, false);
      AddObjectProperty("OpeAct", gxTv_SdtSDT_Operario_Opeact, false, false);
      AddObjectProperty("OpePass", gxTv_SdtSDT_Operario_Opepass, false, false);
      AddObjectProperty("OpeMSol", gxTv_SdtSDT_Operario_Opemsol, false, false);
      AddObjectProperty("OpeMUsu", gxTv_SdtSDT_Operario_Opemusu, false, false);
      AddObjectProperty("OpeCNom", gxTv_SdtSDT_Operario_Opecnom, false, false);
   }

   public String getgxTv_SdtSDT_Operario_Emprcod( )
   {
      return gxTv_SdtSDT_Operario_Emprcod ;
   }

   public void setgxTv_SdtSDT_Operario_Emprcod( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Emprcod = value ;
   }

   public int getgxTv_SdtSDT_Operario_Opecod( )
   {
      return gxTv_SdtSDT_Operario_Opecod ;
   }

   public void setgxTv_SdtSDT_Operario_Opecod( int value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecod = value ;
   }

   public String getgxTv_SdtSDT_Operario_Openom( )
   {
      return gxTv_SdtSDT_Operario_Openom ;
   }

   public void setgxTv_SdtSDT_Operario_Openom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Openom = value ;
   }

   public String getgxTv_SdtSDT_Operario_Openom2( )
   {
      return gxTv_SdtSDT_Operario_Openom2 ;
   }

   public void setgxTv_SdtSDT_Operario_Openom2( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Openom2 = value ;
   }

   public String getgxTv_SdtSDT_Operario_Emprnom( )
   {
      return gxTv_SdtSDT_Operario_Emprnom ;
   }

   public void setgxTv_SdtSDT_Operario_Emprnom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Emprnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Operario_Opeprehor( )
   {
      return gxTv_SdtSDT_Operario_Opeprehor ;
   }

   public void setgxTv_SdtSDT_Operario_Opeprehor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeprehor = value ;
   }

   public byte getgxTv_SdtSDT_Operario_Opeturno( )
   {
      return gxTv_SdtSDT_Operario_Opeturno ;
   }

   public void setgxTv_SdtSDT_Operario_Opeturno( byte value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeturno = value ;
   }

   public long getgxTv_SdtSDT_Operario_Opecedula( )
   {
      return gxTv_SdtSDT_Operario_Opecedula ;
   }

   public void setgxTv_SdtSDT_Operario_Opecedula( long value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecedula = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opesecc( )
   {
      return gxTv_SdtSDT_Operario_Opesecc ;
   }

   public void setgxTv_SdtSDT_Operario_Opesecc( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opesecc = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opeact( )
   {
      return gxTv_SdtSDT_Operario_Opeact ;
   }

   public void setgxTv_SdtSDT_Operario_Opeact( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opeact = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opepass( )
   {
      return gxTv_SdtSDT_Operario_Opepass ;
   }

   public void setgxTv_SdtSDT_Operario_Opepass( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opepass = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opemsol( )
   {
      return gxTv_SdtSDT_Operario_Opemsol ;
   }

   public void setgxTv_SdtSDT_Operario_Opemsol( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opemsol = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opemusu( )
   {
      return gxTv_SdtSDT_Operario_Opemusu ;
   }

   public void setgxTv_SdtSDT_Operario_Opemusu( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opemusu = value ;
   }

   public String getgxTv_SdtSDT_Operario_Opecnom( )
   {
      return gxTv_SdtSDT_Operario_Opecnom ;
   }

   public void setgxTv_SdtSDT_Operario_Opecnom( String value )
   {
      gxTv_SdtSDT_Operario_N = (byte)(0) ;
      gxTv_SdtSDT_Operario_Opecnom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_Operario_Emprcod = "" ;
      gxTv_SdtSDT_Operario_N = (byte)(1) ;
      gxTv_SdtSDT_Operario_Openom = "" ;
      gxTv_SdtSDT_Operario_Openom2 = "" ;
      gxTv_SdtSDT_Operario_Emprnom = "" ;
      gxTv_SdtSDT_Operario_Opeprehor = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Operario_Opesecc = "" ;
      gxTv_SdtSDT_Operario_Opeact = "" ;
      gxTv_SdtSDT_Operario_Opepass = "" ;
      gxTv_SdtSDT_Operario_Opemsol = "" ;
      gxTv_SdtSDT_Operario_Opemusu = "" ;
      gxTv_SdtSDT_Operario_Opecnom = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_Operario_N ;
   }

   public app.expedicionesautomatizadas.SdtSDT_Operario Clone( )
   {
      return (app.expedicionesautomatizadas.SdtSDT_Operario)(clone()) ;
   }

   public void setStruct( app.expedicionesautomatizadas.StructSdtSDT_Operario struct )
   {
      setgxTv_SdtSDT_Operario_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDT_Operario_Opecod(struct.getOpecod());
      setgxTv_SdtSDT_Operario_Openom(struct.getOpenom());
      setgxTv_SdtSDT_Operario_Openom2(struct.getOpenom2());
      setgxTv_SdtSDT_Operario_Emprnom(struct.getEmprnom());
      setgxTv_SdtSDT_Operario_Opeprehor(struct.getOpeprehor());
      setgxTv_SdtSDT_Operario_Opeturno(struct.getOpeturno());
      setgxTv_SdtSDT_Operario_Opecedula(struct.getOpecedula());
      setgxTv_SdtSDT_Operario_Opesecc(struct.getOpesecc());
      setgxTv_SdtSDT_Operario_Opeact(struct.getOpeact());
      setgxTv_SdtSDT_Operario_Opepass(struct.getOpepass());
      setgxTv_SdtSDT_Operario_Opemsol(struct.getOpemsol());
      setgxTv_SdtSDT_Operario_Opemusu(struct.getOpemusu());
      setgxTv_SdtSDT_Operario_Opecnom(struct.getOpecnom());
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.StructSdtSDT_Operario getStruct( )
   {
      app.expedicionesautomatizadas.StructSdtSDT_Operario struct = new app.expedicionesautomatizadas.StructSdtSDT_Operario ();
      struct.setEmprcod(getgxTv_SdtSDT_Operario_Emprcod());
      struct.setOpecod(getgxTv_SdtSDT_Operario_Opecod());
      struct.setOpenom(getgxTv_SdtSDT_Operario_Openom());
      struct.setOpenom2(getgxTv_SdtSDT_Operario_Openom2());
      struct.setEmprnom(getgxTv_SdtSDT_Operario_Emprnom());
      struct.setOpeprehor(getgxTv_SdtSDT_Operario_Opeprehor());
      struct.setOpeturno(getgxTv_SdtSDT_Operario_Opeturno());
      struct.setOpecedula(getgxTv_SdtSDT_Operario_Opecedula());
      struct.setOpesecc(getgxTv_SdtSDT_Operario_Opesecc());
      struct.setOpeact(getgxTv_SdtSDT_Operario_Opeact());
      struct.setOpepass(getgxTv_SdtSDT_Operario_Opepass());
      struct.setOpemsol(getgxTv_SdtSDT_Operario_Opemsol());
      struct.setOpemusu(getgxTv_SdtSDT_Operario_Opemusu());
      struct.setOpecnom(getgxTv_SdtSDT_Operario_Opecnom());
      return struct ;
   }

   protected byte gxTv_SdtSDT_Operario_N ;
   protected byte gxTv_SdtSDT_Operario_Opeturno ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_Operario_Opecod ;
   protected long gxTv_SdtSDT_Operario_Opecedula ;
   protected java.math.BigDecimal gxTv_SdtSDT_Operario_Opeprehor ;
   protected String gxTv_SdtSDT_Operario_Emprcod ;
   protected String gxTv_SdtSDT_Operario_Openom ;
   protected String gxTv_SdtSDT_Operario_Openom2 ;
   protected String gxTv_SdtSDT_Operario_Emprnom ;
   protected String gxTv_SdtSDT_Operario_Opesecc ;
   protected String gxTv_SdtSDT_Operario_Opeact ;
   protected String gxTv_SdtSDT_Operario_Opepass ;
   protected String gxTv_SdtSDT_Operario_Opemsol ;
   protected String gxTv_SdtSDT_Operario_Opemusu ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDT_Operario_Opecnom ;
}

