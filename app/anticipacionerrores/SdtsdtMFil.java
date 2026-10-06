package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtMFil extends GxUserType
{
   public SdtsdtMFil( )
   {
      this(  new ModelContext(SdtsdtMFil.class));
   }

   public SdtsdtMFil( ModelContext context )
   {
      super( context, "SdtsdtMFil");
   }

   public SdtsdtMFil( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtMFil");
   }

   public SdtsdtMFil( StructSdtsdtMFil struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilId") )
            {
               gxTv_SdtsdtMFil_Mfilid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilTxt") )
            {
               gxTv_SdtsdtMFil_Mfiltxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilObj") )
            {
               gxTv_SdtsdtMFil_Mfilobj = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilFec01") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtMFil_Mfilfec01 = GXutil.nullDate() ;
                  gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(0) ;
                  gxTv_SdtsdtMFil_Mfilfec01 = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilFec02") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtMFil_Mfilfec02 = GXutil.nullDate() ;
                  gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(0) ;
                  gxTv_SdtsdtMFil_Mfilfec02 = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilNum01") )
            {
               gxTv_SdtsdtMFil_Mfilnum01 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MFilNum02") )
            {
               gxTv_SdtsdtMFil_Mfilnum02 = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "sdtMFil" ;
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
      oWriter.writeElement("MFilId", GXutil.trim( GXutil.str( gxTv_SdtsdtMFil_Mfilid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MFilTxt", gxTv_SdtsdtMFil_Mfiltxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MFilObj", gxTv_SdtsdtMFil_Mfilobj);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtMFil_Mfilfec01)) && ( gxTv_SdtsdtMFil_Mfilfec01_N == 1 ) )
      {
         oWriter.writeElement("MFilFec01", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MFilFec01", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtMFil_Mfilfec02)) && ( gxTv_SdtsdtMFil_Mfilfec02_N == 1 ) )
      {
         oWriter.writeElement("MFilFec02", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MFilFec02", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MFilNum01", GXutil.trim( GXutil.str( gxTv_SdtsdtMFil_Mfilnum01, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MFilNum02", GXutil.trim( GXutil.str( gxTv_SdtsdtMFil_Mfilnum02, 10, 0)));
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
      AddObjectProperty("MFilId", gxTv_SdtsdtMFil_Mfilid, false, false);
      AddObjectProperty("MFilTxt", gxTv_SdtsdtMFil_Mfiltxt, false, false);
      AddObjectProperty("MFilObj", gxTv_SdtsdtMFil_Mfilobj, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMFil_Mfilfec01), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("MFilFec01", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMFil_Mfilfec02), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("MFilFec02", sDateCnv, false, false);
      AddObjectProperty("MFilNum01", gxTv_SdtsdtMFil_Mfilnum01, false, false);
      AddObjectProperty("MFilNum02", gxTv_SdtsdtMFil_Mfilnum02, false, false);
   }

   public long getgxTv_SdtsdtMFil_Mfilid( )
   {
      return gxTv_SdtsdtMFil_Mfilid ;
   }

   public void setgxTv_SdtsdtMFil_Mfilid( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilid = value ;
   }

   public String getgxTv_SdtsdtMFil_Mfiltxt( )
   {
      return gxTv_SdtsdtMFil_Mfiltxt ;
   }

   public void setgxTv_SdtsdtMFil_Mfiltxt( String value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfiltxt = value ;
   }

   public String getgxTv_SdtsdtMFil_Mfilobj( )
   {
      return gxTv_SdtsdtMFil_Mfilobj ;
   }

   public void setgxTv_SdtsdtMFil_Mfilobj( String value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilobj = value ;
   }

   public java.util.Date getgxTv_SdtsdtMFil_Mfilfec01( )
   {
      return gxTv_SdtsdtMFil_Mfilfec01 ;
   }

   public void setgxTv_SdtsdtMFil_Mfilfec01( java.util.Date value )
   {
      gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(0) ;
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilfec01 = value ;
   }

   public java.util.Date getgxTv_SdtsdtMFil_Mfilfec02( )
   {
      return gxTv_SdtsdtMFil_Mfilfec02 ;
   }

   public void setgxTv_SdtsdtMFil_Mfilfec02( java.util.Date value )
   {
      gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(0) ;
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilfec02 = value ;
   }

   public long getgxTv_SdtsdtMFil_Mfilnum01( )
   {
      return gxTv_SdtsdtMFil_Mfilnum01 ;
   }

   public void setgxTv_SdtsdtMFil_Mfilnum01( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilnum01 = value ;
   }

   public long getgxTv_SdtsdtMFil_Mfilnum02( )
   {
      return gxTv_SdtsdtMFil_Mfilnum02 ;
   }

   public void setgxTv_SdtsdtMFil_Mfilnum02( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilnum02 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtMFil_N = (byte)(1) ;
      gxTv_SdtsdtMFil_Mfiltxt = "" ;
      gxTv_SdtsdtMFil_Mfilobj = "" ;
      gxTv_SdtsdtMFil_Mfilfec01 = GXutil.nullDate() ;
      gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(1) ;
      gxTv_SdtsdtMFil_Mfilfec02 = GXutil.nullDate() ;
      gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtMFil_N ;
   }

   public app.anticipacionerrores.SdtsdtMFil Clone( )
   {
      return (app.anticipacionerrores.SdtsdtMFil)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtsdtMFil struct )
   {
      setgxTv_SdtsdtMFil_Mfilid(struct.getMfilid());
      setgxTv_SdtsdtMFil_Mfiltxt(struct.getMfiltxt());
      setgxTv_SdtsdtMFil_Mfilobj(struct.getMfilobj());
      if ( struct.gxTv_SdtsdtMFil_Mfilfec01_N == 0 )
      {
         setgxTv_SdtsdtMFil_Mfilfec01(struct.getMfilfec01());
      }
      if ( struct.gxTv_SdtsdtMFil_Mfilfec02_N == 0 )
      {
         setgxTv_SdtsdtMFil_Mfilfec02(struct.getMfilfec02());
      }
      setgxTv_SdtsdtMFil_Mfilnum01(struct.getMfilnum01());
      setgxTv_SdtsdtMFil_Mfilnum02(struct.getMfilnum02());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtsdtMFil getStruct( )
   {
      app.anticipacionerrores.StructSdtsdtMFil struct = new app.anticipacionerrores.StructSdtsdtMFil ();
      struct.setMfilid(getgxTv_SdtsdtMFil_Mfilid());
      struct.setMfiltxt(getgxTv_SdtsdtMFil_Mfiltxt());
      struct.setMfilobj(getgxTv_SdtsdtMFil_Mfilobj());
      if ( gxTv_SdtsdtMFil_Mfilfec01_N == 0 )
      {
         struct.setMfilfec01(getgxTv_SdtsdtMFil_Mfilfec01());
      }
      if ( gxTv_SdtsdtMFil_Mfilfec02_N == 0 )
      {
         struct.setMfilfec02(getgxTv_SdtsdtMFil_Mfilfec02());
      }
      struct.setMfilnum01(getgxTv_SdtsdtMFil_Mfilnum01());
      struct.setMfilnum02(getgxTv_SdtsdtMFil_Mfilnum02());
      return struct ;
   }

   protected byte gxTv_SdtsdtMFil_N ;
   protected byte gxTv_SdtsdtMFil_Mfilfec01_N ;
   protected byte gxTv_SdtsdtMFil_Mfilfec02_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtsdtMFil_Mfilid ;
   protected long gxTv_SdtsdtMFil_Mfilnum01 ;
   protected long gxTv_SdtsdtMFil_Mfilnum02 ;
   protected String gxTv_SdtsdtMFil_Mfiltxt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtMFil_Mfilfec01 ;
   protected java.util.Date gxTv_SdtsdtMFil_Mfilfec02 ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtMFil_Mfilobj ;
}

