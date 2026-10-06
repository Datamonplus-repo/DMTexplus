package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLANYAD_SDT_LANYAD_SDTItem extends GxUserType
{
   public SdtLANYAD_SDT_LANYAD_SDTItem( )
   {
      this(  new ModelContext(SdtLANYAD_SDT_LANYAD_SDTItem.class));
   }

   public SdtLANYAD_SDT_LANYAD_SDTItem( ModelContext context )
   {
      super( context, "SdtLANYAD_SDT_LANYAD_SDTItem");
   }

   public SdtLANYAD_SDT_LANYAD_SDTItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtLANYAD_SDT_LANYAD_SDTItem");
   }

   public SdtLANYAD_SDT_LANYAD_SDTItem( StructSdtLANYAD_SDT_LANYAD_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdnum") )
            {
               gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdcfin") )
            {
               gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lote") )
            {
               gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote = oReader.getValue() ;
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
         sName = "LANYAD_SDT.LANYAD_SDTItem" ;
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
      oWriter.writeElement("Prdnum", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prdcfin", GXutil.trim( GXutil.strNoRound( gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lote", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote);
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
      AddObjectProperty("Prdnum", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum, false, false);
      AddObjectProperty("PrdNom", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom, false, false);
      AddObjectProperty("Prdcfin", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin, false, false);
      AddObjectProperty("Lote", gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote, false, false);
   }

   public String getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum ;
   }

   public void setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum = value ;
   }

   public String getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom ;
   }

   public void setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin ;
   }

   public void setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin( java.math.BigDecimal value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin = value ;
   }

   public String getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote ;
   }

   public void setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum = "" ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(1) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom = "" ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin = DecimalUtil.ZERO ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N ;
   }

   public app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem Clone( )
   {
      return (app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem)(clone()) ;
   }

   public void setStruct( app.formulaciontinte.StructSdtLANYAD_SDT_LANYAD_SDTItem struct )
   {
      setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum(struct.getPrdnum());
      setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom(struct.getPrdnom());
      setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin(struct.getPrdcfin());
      setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote(struct.getLote());
   }

   @SuppressWarnings("unchecked")
   public app.formulaciontinte.StructSdtLANYAD_SDT_LANYAD_SDTItem getStruct( )
   {
      app.formulaciontinte.StructSdtLANYAD_SDT_LANYAD_SDTItem struct = new app.formulaciontinte.StructSdtLANYAD_SDT_LANYAD_SDTItem ();
      struct.setPrdnum(getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum());
      struct.setPrdnom(getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom());
      struct.setPrdcfin(getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin());
      struct.setLote(getgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote());
      return struct ;
   }

   protected byte gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

