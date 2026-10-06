package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInputMask_Item extends GxUserType
{
   public SdtSDTInputMask_Item( )
   {
      this(  new ModelContext(SdtSDTInputMask_Item.class));
   }

   public SdtSDTInputMask_Item( ModelContext context )
   {
      super( context, "SdtSDTInputMask_Item");
   }

   public SdtSDTInputMask_Item( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInputMask_Item");
   }

   public SdtSDTInputMask_Item( StructSdtSDTInputMask_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Value") )
            {
               gxTv_SdtSDTInputMask_Item_Value = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Description") )
            {
               gxTv_SdtSDTInputMask_Item_Description = oReader.getValue() ;
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
         sName = "SDTInputMask.Item" ;
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
      oWriter.writeElement("Value", gxTv_SdtSDTInputMask_Item_Value);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Description", gxTv_SdtSDTInputMask_Item_Description);
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
      AddObjectProperty("Value", gxTv_SdtSDTInputMask_Item_Value, false, false);
      AddObjectProperty("Description", gxTv_SdtSDTInputMask_Item_Description, false, false);
   }

   public String getgxTv_SdtSDTInputMask_Item_Value( )
   {
      return gxTv_SdtSDTInputMask_Item_Value ;
   }

   public void setgxTv_SdtSDTInputMask_Item_Value( String value )
   {
      gxTv_SdtSDTInputMask_Item_N = (byte)(0) ;
      gxTv_SdtSDTInputMask_Item_Value = value ;
   }

   public String getgxTv_SdtSDTInputMask_Item_Description( )
   {
      return gxTv_SdtSDTInputMask_Item_Description ;
   }

   public void setgxTv_SdtSDTInputMask_Item_Description( String value )
   {
      gxTv_SdtSDTInputMask_Item_N = (byte)(0) ;
      gxTv_SdtSDTInputMask_Item_Description = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInputMask_Item_Value = "" ;
      gxTv_SdtSDTInputMask_Item_N = (byte)(1) ;
      gxTv_SdtSDTInputMask_Item_Description = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInputMask_Item_N ;
   }

   public app.SdtSDTInputMask_Item Clone( )
   {
      return (app.SdtSDTInputMask_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInputMask_Item struct )
   {
      setgxTv_SdtSDTInputMask_Item_Value(struct.getValue());
      setgxTv_SdtSDTInputMask_Item_Description(struct.getDescription());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInputMask_Item getStruct( )
   {
      app.StructSdtSDTInputMask_Item struct = new app.StructSdtSDTInputMask_Item ();
      struct.setValue(getgxTv_SdtSDTInputMask_Item_Value());
      struct.setDescription(getgxTv_SdtSDTInputMask_Item_Description());
      return struct ;
   }

   protected byte gxTv_SdtSDTInputMask_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTInputMask_Item_Value ;
   protected String gxTv_SdtSDTInputMask_Item_Description ;
}

