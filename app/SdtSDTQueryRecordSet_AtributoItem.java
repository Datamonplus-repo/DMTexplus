package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTQueryRecordSet_AtributoItem extends GxUserType
{
   public SdtSDTQueryRecordSet_AtributoItem( )
   {
      this(  new ModelContext(SdtSDTQueryRecordSet_AtributoItem.class));
   }

   public SdtSDTQueryRecordSet_AtributoItem( ModelContext context )
   {
      super( context, "SdtSDTQueryRecordSet_AtributoItem");
   }

   public SdtSDTQueryRecordSet_AtributoItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTQueryRecordSet_AtributoItem");
   }

   public SdtSDTQueryRecordSet_AtributoItem( StructSdtSDTQueryRecordSet_AtributoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AtributoDS") )
            {
               gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AtributoTipoIC") )
            {
               gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTQueryRecordSet.AtributoItem" ;
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
      oWriter.writeElement("AtributoDS", gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AtributoTipoIC", GXutil.trim( GXutil.str( gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic, 4, 0)));
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
      AddObjectProperty("AtributoDS", gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods, false, false);
      AddObjectProperty("AtributoTipoIC", gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic, false, false);
   }

   public String getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods( )
   {
      return gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods( String value )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods = value ;
   }

   public short getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( )
   {
      return gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( short value )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods = "" ;
      gxTv_SdtSDTQueryRecordSet_AtributoItem_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTQueryRecordSet_AtributoItem_N ;
   }

   public app.SdtSDTQueryRecordSet_AtributoItem Clone( )
   {
      return (app.SdtSDTQueryRecordSet_AtributoItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTQueryRecordSet_AtributoItem struct )
   {
      setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods(struct.getAtributods());
      setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic(struct.getAtributotipoic());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTQueryRecordSet_AtributoItem getStruct( )
   {
      app.StructSdtSDTQueryRecordSet_AtributoItem struct = new app.StructSdtSDTQueryRecordSet_AtributoItem ();
      struct.setAtributods(getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods());
      struct.setAtributotipoic(getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic());
      return struct ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_AtributoItem_N ;
   protected short gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods ;
}

