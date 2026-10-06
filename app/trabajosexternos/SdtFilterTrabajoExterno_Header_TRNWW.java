package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterTrabajoExterno_Header_TRNWW extends GxUserType
{
   public SdtFilterTrabajoExterno_Header_TRNWW( )
   {
      this(  new ModelContext(SdtFilterTrabajoExterno_Header_TRNWW.class));
   }

   public SdtFilterTrabajoExterno_Header_TRNWW( ModelContext context )
   {
      super( context, "SdtFilterTrabajoExterno_Header_TRNWW");
   }

   public SdtFilterTrabajoExterno_Header_TRNWW( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterTrabajoExterno_Header_TRNWW");
   }

   public SdtFilterTrabajoExterno_Header_TRNWW( StructSdtFilterTrabajoExterno_Header_TRNWW struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtAlb") )
            {
               gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalSts") )
            {
               gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ManCod") )
            {
               gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = GXutil.nullDate() ;
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(0) ;
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtFecto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = GXutil.nullDate() ;
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(0) ;
                  gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "FilterTrabajoExterno_Header_TRNWW" ;
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
      oWriter.writeElement("SalExtAlb", GXutil.trim( GXutil.str( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalSts", gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ManCod", GXutil.trim( GXutil.str( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec)) && ( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N == 1 ) )
      {
         oWriter.writeElement("SalExtFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SalExtFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto)) && ( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N == 1 ) )
      {
         oWriter.writeElement("SalExtFecto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SalExtFecto", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("SalExtAlb", gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb, false, false);
      AddObjectProperty("SalSts", gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts, false, false);
      AddObjectProperty("ManCod", gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SalExtFec", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SalExtFecto", sDateCnv, false, false);
   }

   public int getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb ;
   }

   public void setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb( int value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb = value ;
   }

   public String getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts ;
   }

   public void setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts( String value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts = value ;
   }

   public short getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod ;
   }

   public void setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod( short value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod = value ;
   }

   public java.util.Date getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec ;
   }

   public void setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec( java.util.Date value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = value ;
   }

   public java.util.Date getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto ;
   }

   public void setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto( java.util.Date value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(1) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts = "" ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = GXutil.nullDate() ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(1) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = GXutil.nullDate() ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N ;
   }

   public app.trabajosexternos.SdtFilterTrabajoExterno_Header_TRNWW Clone( )
   {
      return (app.trabajosexternos.SdtFilterTrabajoExterno_Header_TRNWW)(clone()) ;
   }

   public void setStruct( app.trabajosexternos.StructSdtFilterTrabajoExterno_Header_TRNWW struct )
   {
      setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb(struct.getSalextalb());
      setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts(struct.getSalsts());
      setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod(struct.getMancod());
      if ( struct.gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N == 0 )
      {
         setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec(struct.getSalextfec());
      }
      if ( struct.gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N == 0 )
      {
         setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto(struct.getSalextfecto());
      }
   }

   @SuppressWarnings("unchecked")
   public app.trabajosexternos.StructSdtFilterTrabajoExterno_Header_TRNWW getStruct( )
   {
      app.trabajosexternos.StructSdtFilterTrabajoExterno_Header_TRNWW struct = new app.trabajosexternos.StructSdtFilterTrabajoExterno_Header_TRNWW ();
      struct.setSalextalb(getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb());
      struct.setSalsts(getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts());
      struct.setMancod(getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod());
      if ( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N == 0 )
      {
         struct.setSalextfec(getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec());
      }
      if ( gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N == 0 )
      {
         struct.setSalextfecto(getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto());
      }
      return struct ;
   }

   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N ;
   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N ;
   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N ;
   protected short gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb ;
   protected String gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec ;
   protected java.util.Date gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

