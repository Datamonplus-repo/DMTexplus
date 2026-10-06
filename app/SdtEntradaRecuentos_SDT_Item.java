package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEntradaRecuentos_SDT_Item extends GxUserType
{
   public SdtEntradaRecuentos_SDT_Item( )
   {
      this(  new ModelContext(SdtEntradaRecuentos_SDT_Item.class));
   }

   public SdtEntradaRecuentos_SDT_Item( ModelContext context )
   {
      super( context, "SdtEntradaRecuentos_SDT_Item");
   }

   public SdtEntradaRecuentos_SDT_Item( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtEntradaRecuentos_SDT_Item");
   }

   public SdtEntradaRecuentos_SDT_Item( StructSdtEntradaRecuentos_SDT_Item struct )
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
               gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdnom") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecExiteo") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecExiRea") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Difer") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Difer = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLot") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Reclot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRec") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecEstInv") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "EntradaRecuentos_SDT.Item" ;
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
      oWriter.writeElement("Prdnum", gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prdnom", gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecExiteo", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecExiRea", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Difer", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradaRecuentos_SDT_Item_Difer, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLot", gxTv_SdtEntradaRecuentos_SDT_Item_Reclot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRec", gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecEstInv", GXutil.trim( GXutil.str( gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact, 14, 5)));
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
      AddObjectProperty("Prdnum", gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum, false, false);
      AddObjectProperty("Prdnom", gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom, false, false);
      AddObjectProperty("RecExiteo", gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo, false, false);
      AddObjectProperty("RecExiRea", gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea, false, false);
      AddObjectProperty("Difer", gxTv_SdtEntradaRecuentos_SDT_Item_Difer, false, false);
      AddObjectProperty("RecLot", gxTv_SdtEntradaRecuentos_SDT_Item_Reclot, false, false);
      AddObjectProperty("PrdRec", gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec, false, false);
      AddObjectProperty("RecEstInv", gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv, false, false);
      AddObjectProperty("PrdPreMed", gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed, false, false);
      AddObjectProperty("PrdPreAct", gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact, false, false);
   }

   public String getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum = value ;
   }

   public String getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradaRecuentos_SDT_Item_Difer( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Difer ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Difer( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Difer = value ;
   }

   public String getgxTv_SdtEntradaRecuentos_SDT_Item_Reclot( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Reclot ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Reclot( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Reclot = value ;
   }

   public String getgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec = value ;
   }

   public byte getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv( byte value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact ;
   }

   public void setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(1) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo = DecimalUtil.ZERO ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea = DecimalUtil.ZERO ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Difer = DecimalUtil.ZERO ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Reclot = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed = DecimalUtil.ZERO ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_N ;
   }

   public app.SdtEntradaRecuentos_SDT_Item Clone( )
   {
      return (app.SdtEntradaRecuentos_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtEntradaRecuentos_SDT_Item struct )
   {
      setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum(struct.getPrdnum());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom(struct.getPrdnom());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo(struct.getRecexiteo());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea(struct.getRecexirea());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Difer(struct.getDifer());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Reclot(struct.getReclot());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec(struct.getPrdrec());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv(struct.getRecestinv());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed(struct.getPrdpremed());
      setgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact(struct.getPrdpreact());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtEntradaRecuentos_SDT_Item getStruct( )
   {
      app.StructSdtEntradaRecuentos_SDT_Item struct = new app.StructSdtEntradaRecuentos_SDT_Item ();
      struct.setPrdnum(getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum());
      struct.setPrdnom(getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom());
      struct.setRecexiteo(getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo());
      struct.setRecexirea(getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea());
      struct.setDifer(getgxTv_SdtEntradaRecuentos_SDT_Item_Difer());
      struct.setReclot(getgxTv_SdtEntradaRecuentos_SDT_Item_Reclot());
      struct.setPrdrec(getgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec());
      struct.setRecestinv(getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv());
      struct.setPrdpremed(getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed());
      struct.setPrdpreact(getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact());
      return struct ;
   }

   protected byte gxTv_SdtEntradaRecuentos_SDT_Item_N ;
   protected byte gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Difer ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Reclot ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

