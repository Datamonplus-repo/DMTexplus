package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeOperariosCodebar_SDT_Item extends GxUserType
{
   public SdtInformeOperariosCodebar_SDT_Item( )
   {
      this(  new ModelContext(SdtInformeOperariosCodebar_SDT_Item.class));
   }

   public SdtInformeOperariosCodebar_SDT_Item( ModelContext context )
   {
      super( context, "SdtInformeOperariosCodebar_SDT_Item");
   }

   public SdtInformeOperariosCodebar_SDT_Item( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeOperariosCodebar_SDT_Item");
   }

   public SdtInformeOperariosCodebar_SDT_Item( StructSdtInformeOperariosCodebar_SDT_Item struct )
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
               gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Opecod") )
            {
               gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Openom") )
            {
               gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Openom2") )
            {
               gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Opeact") )
            {
               gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact = oReader.getValue() ;
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
         sName = "InformeOperariosCodebar_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Opecod", GXutil.trim( GXutil.str( gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Openom", gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Openom2", gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Opeact", gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact);
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
      AddObjectProperty("Seleccionar", gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Opecod", gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod, false, false);
      AddObjectProperty("Openom", gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom, false, false);
      AddObjectProperty("Openom2", gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2, false, false);
      AddObjectProperty("Opeact", gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact, false, false);
   }

   public boolean getgxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod ;
   }

   public void setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod( int value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod = value ;
   }

   public String getgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom ;
   }

   public void setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom = value ;
   }

   public String getgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 ;
   }

   public void setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 = value ;
   }

   public String getgxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact ;
   }

   public void setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(1) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom = "" ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 = "" ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_N ;
   }

   public app.SdtInformeOperariosCodebar_SDT_Item Clone( )
   {
      return (app.SdtInformeOperariosCodebar_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtInformeOperariosCodebar_SDT_Item struct )
   {
      setgxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod(struct.getOpecod());
      setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom(struct.getOpenom());
      setgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2(struct.getOpenom2());
      setgxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact(struct.getOpeact());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtInformeOperariosCodebar_SDT_Item getStruct( )
   {
      app.StructSdtInformeOperariosCodebar_SDT_Item struct = new app.StructSdtInformeOperariosCodebar_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar());
      struct.setOpecod(getgxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod());
      struct.setOpenom(getgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom());
      struct.setOpenom2(getgxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2());
      struct.setOpeact(getgxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact());
      return struct ;
   }

   protected byte gxTv_SdtInformeOperariosCodebar_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact ;
   protected String sTagName ;
   protected boolean gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

