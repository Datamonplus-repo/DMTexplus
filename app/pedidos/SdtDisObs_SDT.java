package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDisObs_SDT extends GxUserType
{
   public SdtDisObs_SDT( )
   {
      this(  new ModelContext(SdtDisObs_SDT.class));
   }

   public SdtDisObs_SDT( ModelContext context )
   {
      super( context, "SdtDisObs_SDT");
   }

   public SdtDisObs_SDT( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtDisObs_SDT");
   }

   public SdtDisObs_SDT( StructSdtDisObs_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Eliminar") )
            {
               gxTv_SdtDisObs_SDT_Eliminar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtDisObs_SDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtDisObs_SDT_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsLin") )
            {
               gxTv_SdtDisObs_SDT_Disobslin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsTxt") )
            {
               gxTv_SdtDisObs_SDT_Disobstxt = oReader.getValue() ;
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
         sName = "DisObs_SDT" ;
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
      oWriter.writeElement("Eliminar", GXutil.booltostr( gxTv_SdtDisObs_SDT_Eliminar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtDisObs_SDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtDisObs_SDT_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsLin", GXutil.trim( GXutil.str( gxTv_SdtDisObs_SDT_Disobslin, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsTxt", gxTv_SdtDisObs_SDT_Disobstxt);
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
      AddObjectProperty("Eliminar", gxTv_SdtDisObs_SDT_Eliminar, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtDisObs_SDT_Emprcod, false, false);
      AddObjectProperty("DisCod", gxTv_SdtDisObs_SDT_Discod, false, false);
      AddObjectProperty("DisObsLin", gxTv_SdtDisObs_SDT_Disobslin, false, false);
      AddObjectProperty("DisObsTxt", gxTv_SdtDisObs_SDT_Disobstxt, false, false);
   }

   public boolean getgxTv_SdtDisObs_SDT_Eliminar( )
   {
      return gxTv_SdtDisObs_SDT_Eliminar ;
   }

   public void setgxTv_SdtDisObs_SDT_Eliminar( boolean value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Eliminar = value ;
   }

   public String getgxTv_SdtDisObs_SDT_Emprcod( )
   {
      return gxTv_SdtDisObs_SDT_Emprcod ;
   }

   public void setgxTv_SdtDisObs_SDT_Emprcod( String value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Emprcod = value ;
   }

   public int getgxTv_SdtDisObs_SDT_Discod( )
   {
      return gxTv_SdtDisObs_SDT_Discod ;
   }

   public void setgxTv_SdtDisObs_SDT_Discod( int value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Discod = value ;
   }

   public byte getgxTv_SdtDisObs_SDT_Disobslin( )
   {
      return gxTv_SdtDisObs_SDT_Disobslin ;
   }

   public void setgxTv_SdtDisObs_SDT_Disobslin( byte value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Disobslin = value ;
   }

   public String getgxTv_SdtDisObs_SDT_Disobstxt( )
   {
      return gxTv_SdtDisObs_SDT_Disobstxt ;
   }

   public void setgxTv_SdtDisObs_SDT_Disobstxt( String value )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(0) ;
      gxTv_SdtDisObs_SDT_Disobstxt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDisObs_SDT_N = (byte)(1) ;
      gxTv_SdtDisObs_SDT_Emprcod = "" ;
      gxTv_SdtDisObs_SDT_Disobstxt = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDisObs_SDT_N ;
   }

   public app.pedidos.SdtDisObs_SDT Clone( )
   {
      return (app.pedidos.SdtDisObs_SDT)(clone()) ;
   }

   public void setStruct( app.pedidos.StructSdtDisObs_SDT struct )
   {
      setgxTv_SdtDisObs_SDT_Eliminar(struct.getEliminar());
      setgxTv_SdtDisObs_SDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtDisObs_SDT_Discod(struct.getDiscod());
      setgxTv_SdtDisObs_SDT_Disobslin(struct.getDisobslin());
      setgxTv_SdtDisObs_SDT_Disobstxt(struct.getDisobstxt());
   }

   @SuppressWarnings("unchecked")
   public app.pedidos.StructSdtDisObs_SDT getStruct( )
   {
      app.pedidos.StructSdtDisObs_SDT struct = new app.pedidos.StructSdtDisObs_SDT ();
      struct.setEliminar(getgxTv_SdtDisObs_SDT_Eliminar());
      struct.setEmprcod(getgxTv_SdtDisObs_SDT_Emprcod());
      struct.setDiscod(getgxTv_SdtDisObs_SDT_Discod());
      struct.setDisobslin(getgxTv_SdtDisObs_SDT_Disobslin());
      struct.setDisobstxt(getgxTv_SdtDisObs_SDT_Disobstxt());
      return struct ;
   }

   protected byte gxTv_SdtDisObs_SDT_N ;
   protected byte gxTv_SdtDisObs_SDT_Disobslin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtDisObs_SDT_Discod ;
   protected String gxTv_SdtDisObs_SDT_Emprcod ;
   protected String gxTv_SdtDisObs_SDT_Disobstxt ;
   protected String sTagName ;
   protected boolean gxTv_SdtDisObs_SDT_Eliminar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

