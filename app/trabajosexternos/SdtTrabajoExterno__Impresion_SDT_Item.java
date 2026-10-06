package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTrabajoExterno__Impresion_SDT_Item extends GxUserType
{
   public SdtTrabajoExterno__Impresion_SDT_Item( )
   {
      this(  new ModelContext(SdtTrabajoExterno__Impresion_SDT_Item.class));
   }

   public SdtTrabajoExterno__Impresion_SDT_Item( ModelContext context )
   {
      super( context, "SdtTrabajoExterno__Impresion_SDT_Item");
   }

   public SdtTrabajoExterno__Impresion_SDT_Item( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtTrabajoExterno__Impresion_SDT_Item");
   }

   public SdtTrabajoExterno__Impresion_SDT_Item( StructSdtTrabajoExterno__Impresion_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtAlb") )
            {
               gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb = (int)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec = GXutil.nullDate() ;
                  gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N = (byte)(0) ;
                  gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mancod") )
            {
               gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ManNom") )
            {
               gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtLis") )
            {
               gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TrabajoExterno__Impresion_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalExtAlb", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec)) && ( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SalExtFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Mancod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ManNom", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalExtLis", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis, 1, 0)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("SalExtAlb", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SalExtFec", sDateCnv, false, false);
      AddObjectProperty("Mancod", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod, false, false);
      AddObjectProperty("ManNom", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom, false, false);
      AddObjectProperty("SalExtLis", gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis, false, false);
   }

   public boolean getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb( int value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb = value ;
   }

   public java.util.Date getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec = value ;
   }

   public short getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod( short value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod = value ;
   }

   public String getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom( String value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom = value ;
   }

   public byte getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis ;
   }

   public void setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis( byte value )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec = GXutil.nullDate() ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N ;
   }

   public app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item Clone( )
   {
      return (app.trabajosexternos.SdtTrabajoExterno__Impresion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.trabajosexternos.StructSdtTrabajoExterno__Impresion_SDT_Item struct )
   {
      setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb(struct.getSalextalb());
      if ( struct.gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N == 0 )
      {
         setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec(struct.getSalextfec());
      }
      setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod(struct.getMancod());
      setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom(struct.getMannom());
      setgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis(struct.getSalextlis());
   }

   @SuppressWarnings("unchecked")
   public app.trabajosexternos.StructSdtTrabajoExterno__Impresion_SDT_Item getStruct( )
   {
      app.trabajosexternos.StructSdtTrabajoExterno__Impresion_SDT_Item struct = new app.trabajosexternos.StructSdtTrabajoExterno__Impresion_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar());
      struct.setSalextalb(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb());
      if ( gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N == 0 )
      {
         struct.setSalextfec(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec());
      }
      struct.setMancod(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod());
      struct.setMannom(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom());
      struct.setSalextlis(getgxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis());
      return struct ;
   }

   protected byte gxTv_SdtTrabajoExterno__Impresion_SDT_Item_N ;
   protected byte gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec_N ;
   protected byte gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextlis ;
   protected short gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mancod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextalb ;
   protected String gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Mannom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Salextfec ;
   protected boolean gxTv_SdtTrabajoExterno__Impresion_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

