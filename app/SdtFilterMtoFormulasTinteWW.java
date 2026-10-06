package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterMtoFormulasTinteWW extends GxUserType
{
   public SdtFilterMtoFormulasTinteWW( )
   {
      this(  new ModelContext(SdtFilterMtoFormulasTinteWW.class));
   }

   public SdtFilterMtoFormulasTinteWW( ModelContext context )
   {
      super( context, "SdtFilterMtoFormulasTinteWW");
   }

   public SdtFilterMtoFormulasTinteWW( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterMtoFormulasTinteWW");
   }

   public SdtFilterMtoFormulasTinteWW( StructSdtFilterMtoFormulasTinteWW struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCodto") )
            {
               gxTv_SdtFilterMtoFormulasTinteWW_Clicodto = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCodform") )
            {
               gxTv_SdtFilterMtoFormulasTinteWW_Clicodform = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec = GXutil.nullDate() ;
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(0) ;
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForFec_To") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = GXutil.nullDate() ;
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(0) ;
                  gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForColNum") )
            {
               gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForColNom") )
            {
               gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom = oReader.getValue() ;
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
         sName = "FilterMtoFormulasTinteWW" ;
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
      oWriter.writeElement("CliCodto", GXutil.trim( GXutil.str( gxTv_SdtFilterMtoFormulasTinteWW_Clicodto, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCodform", GXutil.trim( GXutil.str( gxTv_SdtFilterMtoFormulasTinteWW_Clicodform, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterMtoFormulasTinteWW_Forfec)) && ( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N == 1 ) )
      {
         oWriter.writeElement("ForFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to)) && ( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N == 1 ) )
      {
         oWriter.writeElement("ForFec_To", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForFec_To", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ForColNum", GXutil.trim( GXutil.str( gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForColNom", gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom);
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
      AddObjectProperty("CliCodto", gxTv_SdtFilterMtoFormulasTinteWW_Clicodto, false, false);
      AddObjectProperty("CliCodform", gxTv_SdtFilterMtoFormulasTinteWW_Clicodform, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMtoFormulasTinteWW_Forfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForFec", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForFec_To", sDateCnv, false, false);
      AddObjectProperty("ForColNum", gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum, false, false);
      AddObjectProperty("ForColNom", gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom, false, false);
   }

   public int getgxTv_SdtFilterMtoFormulasTinteWW_Clicodto( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Clicodto ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Clicodto( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Clicodto = value ;
   }

   public int getgxTv_SdtFilterMtoFormulasTinteWW_Clicodform( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Clicodform ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Clicodform( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Clicodform = value ;
   }

   public java.util.Date getgxTv_SdtFilterMtoFormulasTinteWW_Forfec( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forfec ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Forfec( java.util.Date value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec = value ;
   }

   public java.util.Date getgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to( java.util.Date value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = value ;
   }

   public int getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum = value ;
   }

   public String getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom ;
   }

   public void setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom( String value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(1) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec = GXutil.nullDate() ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(1) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = GXutil.nullDate() ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(1) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_N ;
   }

   public app.SdtFilterMtoFormulasTinteWW Clone( )
   {
      return (app.SdtFilterMtoFormulasTinteWW)(clone()) ;
   }

   public void setStruct( app.StructSdtFilterMtoFormulasTinteWW struct )
   {
      setgxTv_SdtFilterMtoFormulasTinteWW_Clicodto(struct.getClicodto());
      setgxTv_SdtFilterMtoFormulasTinteWW_Clicodform(struct.getClicodform());
      if ( struct.gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N == 0 )
      {
         setgxTv_SdtFilterMtoFormulasTinteWW_Forfec(struct.getForfec());
      }
      if ( struct.gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N == 0 )
      {
         setgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to(struct.getForfec_to());
      }
      setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum(struct.getForcolnum());
      setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom(struct.getForcolnom());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtFilterMtoFormulasTinteWW getStruct( )
   {
      app.StructSdtFilterMtoFormulasTinteWW struct = new app.StructSdtFilterMtoFormulasTinteWW ();
      struct.setClicodto(getgxTv_SdtFilterMtoFormulasTinteWW_Clicodto());
      struct.setClicodform(getgxTv_SdtFilterMtoFormulasTinteWW_Clicodform());
      if ( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N == 0 )
      {
         struct.setForfec(getgxTv_SdtFilterMtoFormulasTinteWW_Forfec());
      }
      if ( gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N == 0 )
      {
         struct.setForfec_to(getgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to());
      }
      struct.setForcolnum(getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum());
      struct.setForcolnom(getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom());
      return struct ;
   }

   protected byte gxTv_SdtFilterMtoFormulasTinteWW_N ;
   protected byte gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N ;
   protected byte gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Clicodto ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Clicodform ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum ;
   protected String gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterMtoFormulasTinteWW_Forfec ;
   protected java.util.Date gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to ;
   protected boolean readElement ;
   protected boolean formatError ;
}

