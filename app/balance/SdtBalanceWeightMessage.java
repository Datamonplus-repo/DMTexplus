package app.balance ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtBalanceWeightMessage extends GxUserType
{
   public SdtBalanceWeightMessage( )
   {
      this(  new ModelContext(SdtBalanceWeightMessage.class));
   }

   public SdtBalanceWeightMessage( ModelContext context )
   {
      super( context, "SdtBalanceWeightMessage");
   }

   public SdtBalanceWeightMessage( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtBalanceWeightMessage");
   }

   public SdtBalanceWeightMessage( StructSdtBalanceWeightMessage struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "type") )
            {
               gxTv_SdtBalanceWeightMessage_Type = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "device_id") )
            {
               gxTv_SdtBalanceWeightMessage_Device_id = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "weight") )
            {
               gxTv_SdtBalanceWeightMessage_Weight = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unit") )
            {
               gxTv_SdtBalanceWeightMessage_Unit = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "stable") )
            {
               gxTv_SdtBalanceWeightMessage_Stable = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "raw") )
            {
               gxTv_SdtBalanceWeightMessage_Raw = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "timestamp") )
            {
               gxTv_SdtBalanceWeightMessage_Timestamp = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "BalanceWeightMessage" ;
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
      oWriter.writeElement("type", gxTv_SdtBalanceWeightMessage_Type);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("device_id", gxTv_SdtBalanceWeightMessage_Device_id);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("weight", GXutil.trim( GXutil.strNoRound( gxTv_SdtBalanceWeightMessage_Weight, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("unit", gxTv_SdtBalanceWeightMessage_Unit);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("stable", GXutil.booltostr( gxTv_SdtBalanceWeightMessage_Stable));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("raw", gxTv_SdtBalanceWeightMessage_Raw);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("timestamp", GXutil.trim( GXutil.strNoRound( gxTv_SdtBalanceWeightMessage_Timestamp, 10, 5)));
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
      AddObjectProperty("type", gxTv_SdtBalanceWeightMessage_Type, false, false);
      AddObjectProperty("device_id", gxTv_SdtBalanceWeightMessage_Device_id, false, false);
      AddObjectProperty("weight", gxTv_SdtBalanceWeightMessage_Weight, false, false);
      AddObjectProperty("unit", gxTv_SdtBalanceWeightMessage_Unit, false, false);
      AddObjectProperty("stable", gxTv_SdtBalanceWeightMessage_Stable, false, false);
      AddObjectProperty("raw", gxTv_SdtBalanceWeightMessage_Raw, false, false);
      AddObjectProperty("timestamp", gxTv_SdtBalanceWeightMessage_Timestamp, false, false);
   }

   public String getgxTv_SdtBalanceWeightMessage_Type( )
   {
      return gxTv_SdtBalanceWeightMessage_Type ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Type( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Type = value ;
   }

   public String getgxTv_SdtBalanceWeightMessage_Device_id( )
   {
      return gxTv_SdtBalanceWeightMessage_Device_id ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Device_id( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Device_id = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBalanceWeightMessage_Weight( )
   {
      return gxTv_SdtBalanceWeightMessage_Weight ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Weight( java.math.BigDecimal value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Weight = value ;
   }

   public String getgxTv_SdtBalanceWeightMessage_Unit( )
   {
      return gxTv_SdtBalanceWeightMessage_Unit ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Unit( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Unit = value ;
   }

   public boolean getgxTv_SdtBalanceWeightMessage_Stable( )
   {
      return gxTv_SdtBalanceWeightMessage_Stable ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Stable( boolean value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Stable = value ;
   }

   public String getgxTv_SdtBalanceWeightMessage_Raw( )
   {
      return gxTv_SdtBalanceWeightMessage_Raw ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Raw( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Raw = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBalanceWeightMessage_Timestamp( )
   {
      return gxTv_SdtBalanceWeightMessage_Timestamp ;
   }

   public void setgxTv_SdtBalanceWeightMessage_Timestamp( java.math.BigDecimal value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Timestamp = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtBalanceWeightMessage_Type = "" ;
      gxTv_SdtBalanceWeightMessage_N = (byte)(1) ;
      gxTv_SdtBalanceWeightMessage_Device_id = "" ;
      gxTv_SdtBalanceWeightMessage_Weight = DecimalUtil.ZERO ;
      gxTv_SdtBalanceWeightMessage_Unit = "" ;
      gxTv_SdtBalanceWeightMessage_Raw = "" ;
      gxTv_SdtBalanceWeightMessage_Timestamp = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtBalanceWeightMessage_N ;
   }

   public app.balance.SdtBalanceWeightMessage Clone( )
   {
      return (app.balance.SdtBalanceWeightMessage)(clone()) ;
   }

   public void setStruct( app.balance.StructSdtBalanceWeightMessage struct )
   {
      setgxTv_SdtBalanceWeightMessage_Type(struct.getType());
      setgxTv_SdtBalanceWeightMessage_Device_id(struct.getDevice_id());
      setgxTv_SdtBalanceWeightMessage_Weight(struct.getWeight());
      setgxTv_SdtBalanceWeightMessage_Unit(struct.getUnit());
      setgxTv_SdtBalanceWeightMessage_Stable(struct.getStable());
      setgxTv_SdtBalanceWeightMessage_Raw(struct.getRaw());
      setgxTv_SdtBalanceWeightMessage_Timestamp(struct.getTimestamp());
   }

   @SuppressWarnings("unchecked")
   public app.balance.StructSdtBalanceWeightMessage getStruct( )
   {
      app.balance.StructSdtBalanceWeightMessage struct = new app.balance.StructSdtBalanceWeightMessage ();
      struct.setType(getgxTv_SdtBalanceWeightMessage_Type());
      struct.setDevice_id(getgxTv_SdtBalanceWeightMessage_Device_id());
      struct.setWeight(getgxTv_SdtBalanceWeightMessage_Weight());
      struct.setUnit(getgxTv_SdtBalanceWeightMessage_Unit());
      struct.setStable(getgxTv_SdtBalanceWeightMessage_Stable());
      struct.setRaw(getgxTv_SdtBalanceWeightMessage_Raw());
      struct.setTimestamp(getgxTv_SdtBalanceWeightMessage_Timestamp());
      return struct ;
   }

   protected byte gxTv_SdtBalanceWeightMessage_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtBalanceWeightMessage_Weight ;
   protected java.math.BigDecimal gxTv_SdtBalanceWeightMessage_Timestamp ;
   protected String sTagName ;
   protected boolean gxTv_SdtBalanceWeightMessage_Stable ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtBalanceWeightMessage_Type ;
   protected String gxTv_SdtBalanceWeightMessage_Device_id ;
   protected String gxTv_SdtBalanceWeightMessage_Unit ;
   protected String gxTv_SdtBalanceWeightMessage_Raw ;
}

