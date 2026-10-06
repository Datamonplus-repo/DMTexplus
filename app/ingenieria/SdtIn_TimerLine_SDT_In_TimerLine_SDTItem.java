package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtIn_TimerLine_SDT_In_TimerLine_SDTItem extends GxUserType
{
   public SdtIn_TimerLine_SDT_In_TimerLine_SDTItem( )
   {
      this(  new ModelContext(SdtIn_TimerLine_SDT_In_TimerLine_SDTItem.class));
   }

   public SdtIn_TimerLine_SDT_In_TimerLine_SDTItem( ModelContext context )
   {
      super( context, "SdtIn_TimerLine_SDT_In_TimerLine_SDTItem");
   }

   public SdtIn_TimerLine_SDT_In_TimerLine_SDTItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtIn_TimerLine_SDT_In_TimerLine_SDTItem");
   }

   public SdtIn_TimerLine_SDT_In_TimerLine_SDTItem( StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "xValue") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = GXutil.nullDate() ;
                  gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(0) ;
                  gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "yValue") )
            {
               gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Title") )
            {
               gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title = oReader.getValue() ;
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
         sName = "In_TimerLine_SDT.In_TimerLine_SDTItem" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue)) && ( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N == 1 ) )
      {
         oWriter.writeElement("xValue", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("xValue", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("yValue", GXutil.trim( GXutil.str( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Title", gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title);
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
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("xValue", sDateCnv, false, false);
      AddObjectProperty("yValue", gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue, false, false);
      AddObjectProperty("Title", gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title, false, false);
   }

   public java.util.Date getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue ;
   }

   public void setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue( java.util.Date value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = value ;
   }

   public short getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue ;
   }

   public void setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue( short value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue = value ;
   }

   public String getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title ;
   }

   public void setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title( String value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = GXutil.nullDate() ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(1) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(1) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N ;
   }

   public app.ingenieria.SdtIn_TimerLine_SDT_In_TimerLine_SDTItem Clone( )
   {
      return (app.ingenieria.SdtIn_TimerLine_SDT_In_TimerLine_SDTItem)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem struct )
   {
      if ( struct.gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N == 0 )
      {
         setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue(struct.getXvalue());
      }
      setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue(struct.getYvalue());
      setgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title(struct.getTitle());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem getStruct( )
   {
      app.ingenieria.StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem struct = new app.ingenieria.StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem ();
      if ( gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N == 0 )
      {
         struct.setXvalue(getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue());
      }
      struct.setYvalue(getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue());
      struct.setTitle(getgxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title());
      return struct ;
   }

   protected byte gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N ;
   protected byte gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N ;
   protected short gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title ;
}

