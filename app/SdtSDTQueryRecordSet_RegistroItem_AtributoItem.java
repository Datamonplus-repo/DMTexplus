package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTQueryRecordSet_RegistroItem_AtributoItem extends GxUserType
{
   public SdtSDTQueryRecordSet_RegistroItem_AtributoItem( )
   {
      this(  new ModelContext(SdtSDTQueryRecordSet_RegistroItem_AtributoItem.class));
   }

   public SdtSDTQueryRecordSet_RegistroItem_AtributoItem( ModelContext context )
   {
      super( context, "SdtSDTQueryRecordSet_RegistroItem_AtributoItem");
   }

   public SdtSDTQueryRecordSet_RegistroItem_AtributoItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTQueryRecordSet_RegistroItem_AtributoItem");
   }

   public SdtSDTQueryRecordSet_RegistroItem_AtributoItem( StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N = (byte)(0) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Numero") )
            {
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero = (long)(getnumericvalue(oReader.getValue())) ;
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N = (byte)(0) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "String") )
            {
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String = oReader.getValue() ;
               gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N = (byte)(0) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Data") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = GXutil.nullDate() ;
                  gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(0) ;
                  gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
         sName = "SDTQueryRecordSet.RegistroItem.AtributoItem" ;
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
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor)==0) || ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N != 1 ) )
      {
         oWriter.writeElement("Valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor, 15, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( ! (0==gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero) || ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N != 1 ) )
      {
         oWriter.writeElement("Numero", GXutil.trim( GXutil.str( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero, 12, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( ! (GXutil.strcmp("", gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String)==0) || ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N != 1 ) )
      {
         oWriter.writeElement("String", gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data)) || ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N != 1 ) )
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Data", sDateCnv);
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
      AddObjectProperty("Valor", gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor, false, false);
      AddObjectProperty("Numero", gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero, false, false);
      AddObjectProperty("String", gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Data", sDateCnv, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor = value ;
   }

   public long getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero( long value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero = value ;
   }

   public String getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String( String value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String = value ;
   }

   public java.util.Date getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data( java.util.Date value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor = DecimalUtil.ZERO ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String = "" ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data = GXutil.nullDate() ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N ;
   }

   public app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem Clone( )
   {
      return (app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem struct )
   {
      if ( struct.gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N == 0 )
      {
         setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor(struct.getValor());
      }
      if ( struct.gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N == 0 )
      {
         setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero(struct.getNumero());
      }
      if ( struct.gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N == 0 )
      {
         setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String(struct.getString());
      }
      if ( struct.gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N == 0 )
      {
         setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data(struct.getData());
      }
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem getStruct( )
   {
      app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem struct = new app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem ();
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N == 0 )
      {
         struct.setValor(getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor());
      }
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N == 0 )
      {
         struct.setNumero(getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero());
      }
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N == 0 )
      {
         struct.setString(getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String());
      }
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N == 0 )
      {
         struct.setData(getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data());
      }
      return struct ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero ;
   protected java.math.BigDecimal gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String ;
}

