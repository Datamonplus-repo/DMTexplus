package app.ponteway ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtListValues_Item extends GxUserType
{
   public SdtListValues_Item( )
   {
      this(  new ModelContext(SdtListValues_Item.class));
   }

   public SdtListValues_Item( ModelContext context )
   {
      super( context, "SdtListValues_Item");
   }

   public SdtListValues_Item( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtListValues_Item");
   }

   public SdtListValues_Item( StructSdtListValues_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "key") )
            {
               gxTv_SdtListValues_Item_Key = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "value") )
            {
               gxTv_SdtListValues_Item_Value = oReader.getValue() ;
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
         sName = "ListValues.Item" ;
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
      oWriter.writeElement("key", gxTv_SdtListValues_Item_Key);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("value", gxTv_SdtListValues_Item_Value);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("key", gxTv_SdtListValues_Item_Key, false, false);
      AddObjectProperty("value", gxTv_SdtListValues_Item_Value, false, false);
   }

   public String getgxTv_SdtListValues_Item_Key( )
   {
      return gxTv_SdtListValues_Item_Key ;
   }

   public void setgxTv_SdtListValues_Item_Key( String value )
   {
      gxTv_SdtListValues_Item_N = (byte)(0) ;
      gxTv_SdtListValues_Item_Key = value ;
   }

   public String getgxTv_SdtListValues_Item_Value( )
   {
      return gxTv_SdtListValues_Item_Value ;
   }

   public void setgxTv_SdtListValues_Item_Value( String value )
   {
      gxTv_SdtListValues_Item_N = (byte)(0) ;
      gxTv_SdtListValues_Item_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtListValues_Item_Key = "" ;
      gxTv_SdtListValues_Item_N = (byte)(1) ;
      gxTv_SdtListValues_Item_Value = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtListValues_Item_N ;
   }

   public app.ponteway.SdtListValues_Item Clone( )
   {
      return (app.ponteway.SdtListValues_Item)(clone()) ;
   }

   public void setStruct( app.ponteway.StructSdtListValues_Item struct )
   {
      setgxTv_SdtListValues_Item_Key(struct.getKey());
      setgxTv_SdtListValues_Item_Value(struct.getValue());
   }

   @SuppressWarnings("unchecked")
   public app.ponteway.StructSdtListValues_Item getStruct( )
   {
      app.ponteway.StructSdtListValues_Item struct = new app.ponteway.StructSdtListValues_Item ();
      struct.setKey(getgxTv_SdtListValues_Item_Key());
      struct.setValue(getgxTv_SdtListValues_Item_Value());
      return struct ;
   }

   protected byte gxTv_SdtListValues_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtListValues_Item_Key ;
   protected String gxTv_SdtListValues_Item_Value ;
}

