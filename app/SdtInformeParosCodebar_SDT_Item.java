package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeParosCodebar_SDT_Item extends GxUserType
{
   public SdtInformeParosCodebar_SDT_Item( )
   {
      this(  new ModelContext(SdtInformeParosCodebar_SDT_Item.class));
   }

   public SdtInformeParosCodebar_SDT_Item( ModelContext context )
   {
      super( context, "SdtInformeParosCodebar_SDT_Item");
   }

   public SdtInformeParosCodebar_SDT_Item( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeParosCodebar_SDT_Item");
   }

   public SdtInformeParosCodebar_SDT_Item( StructSdtInformeParosCodebar_SDT_Item struct )
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
               gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtInformeParosCodebar_SDT_Item_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcodnom") )
            {
               gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCodEst") )
            {
               gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest = oReader.getValue() ;
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
         sName = "InformeParosCodebar_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtInformeParosCodebar_SDT_Item_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcodnom", gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParCodEst", gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest);
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
      AddObjectProperty("Seleccionar", gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Parcod", gxTv_SdtInformeParosCodebar_SDT_Item_Parcod, false, false);
      AddObjectProperty("Parcodnom", gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom, false, false);
      AddObjectProperty("ParCodEst", gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest, false, false);
   }

   public boolean getgxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar = value ;
   }

   public short getgxTv_SdtInformeParosCodebar_SDT_Item_Parcod( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcod ;
   }

   public void setgxTv_SdtInformeParosCodebar_SDT_Item_Parcod( short value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcod = value ;
   }

   public String getgxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom ;
   }

   public void setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom( String value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom = value ;
   }

   public String getgxTv_SdtInformeParosCodebar_SDT_Item_Parcodest( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest ;
   }

   public void setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodest( String value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(1) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom = "" ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_N ;
   }

   public app.SdtInformeParosCodebar_SDT_Item Clone( )
   {
      return (app.SdtInformeParosCodebar_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtInformeParosCodebar_SDT_Item struct )
   {
      setgxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtInformeParosCodebar_SDT_Item_Parcod(struct.getParcod());
      setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom(struct.getParcodnom());
      setgxTv_SdtInformeParosCodebar_SDT_Item_Parcodest(struct.getParcodest());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtInformeParosCodebar_SDT_Item getStruct( )
   {
      app.StructSdtInformeParosCodebar_SDT_Item struct = new app.StructSdtInformeParosCodebar_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar());
      struct.setParcod(getgxTv_SdtInformeParosCodebar_SDT_Item_Parcod());
      struct.setParcodnom(getgxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom());
      struct.setParcodest(getgxTv_SdtInformeParosCodebar_SDT_Item_Parcodest());
      return struct ;
   }

   protected byte gxTv_SdtInformeParosCodebar_SDT_Item_N ;
   protected short gxTv_SdtInformeParosCodebar_SDT_Item_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom ;
   protected String gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest ;
   protected String sTagName ;
   protected boolean gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

