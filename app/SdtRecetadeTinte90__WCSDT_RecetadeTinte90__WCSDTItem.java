package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem extends GxUserType
{
   public SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem( )
   {
      this(  new ModelContext(SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem.class));
   }

   public SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem( ModelContext context )
   {
      super( context, "SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem");
   }

   public SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem");
   }

   public SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem( StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLinMaq") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLinPro") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForCod") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForDsc") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLin") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecPrdNum") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecPrdDsc") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdUMe") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacCon") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCant") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdDsc") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecForNro") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecPrdTnq") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLote") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecManAut") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRGB") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "R") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "G") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "B") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "R2") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "G2") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "B2") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForFab") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecMar") )
            {
               gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "RecetadeTinte90__WCSDT.RecetadeTinte90__WCSDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLinMaq", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLinPro", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProForCod", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProForDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLin", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecPrdNum", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecPrdDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdUMe", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacCon", GXutil.trim( GXutil.strNoRound( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCant", GXutil.trim( GXutil.strNoRound( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecForNro", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecPrdTnq", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLote", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecManAut", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRGB", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("R", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("G", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("B", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("R2", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("G2", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("B2", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProForFab", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecMar", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar, false, false);
      AddObjectProperty("RecLinMaq", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq, false, false);
      AddObjectProperty("RecLinPro", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro, false, false);
      AddObjectProperty("ProForCod", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod, false, false);
      AddObjectProperty("ProForDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc, false, false);
      AddObjectProperty("RecLin", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin, false, false);
      AddObjectProperty("RecPrdNum", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum, false, false);
      AddObjectProperty("RecPrdDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc, false, false);
      AddObjectProperty("PrdNum", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum, false, false);
      AddObjectProperty("ForPrdUMe", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume, false, false);
      AddObjectProperty("FacCon", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon, false, false);
      AddObjectProperty("PrdCant", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant, false, false);
      AddObjectProperty("ForPrdDsc", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc, false, false);
      AddObjectProperty("RecForNro", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro, false, false);
      AddObjectProperty("RecPrdTnq", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq, false, false);
      AddObjectProperty("RecLote", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote, false, false);
      AddObjectProperty("RecManAut", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut, false, false);
      AddObjectProperty("PrdRGB", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb, false, false);
      AddObjectProperty("R", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R, false, false);
      AddObjectProperty("G", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G, false, false);
      AddObjectProperty("B", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B, false, false);
      AddObjectProperty("R2", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2, false, false);
      AddObjectProperty("G2", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2, false, false);
      AddObjectProperty("B2", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2, false, false);
      AddObjectProperty("ProForFab", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab, false, false);
      AddObjectProperty("RecMar", gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar, false, false);
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod = value ;
   }

   public int getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod( int value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon( java.math.BigDecimal value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant( java.math.BigDecimal value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut = value ;
   }

   public long getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb( long value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2 ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2 = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2 ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2 = value ;
   }

   public short getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2 ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2( short value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2 = value ;
   }

   public String getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab( String value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab = value ;
   }

   public byte getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar ;
   }

   public void setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar( byte value )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N = (byte)(1) ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon = DecimalUtil.ZERO ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant = DecimalUtil.ZERO ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut = "" ;
      gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N ;
   }

   public app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem Clone( )
   {
      return (app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem struct )
   {
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq(struct.getReclinmaq());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro(struct.getReclinpro());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod(struct.getProforcod());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc(struct.getProfordsc());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin(struct.getReclin());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum(struct.getRecprdnum());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc(struct.getRecprddsc());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum(struct.getPrdnum());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume(struct.getForprdume());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon(struct.getFaccon());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant(struct.getPrdcant());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc(struct.getForprddsc());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro(struct.getRecfornro());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq(struct.getRecprdtnq());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote(struct.getReclote());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut(struct.getRecmanaut());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb(struct.getPrdrgb());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R(struct.getR());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G(struct.getG());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B(struct.getB());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2(struct.getR2());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2(struct.getG2());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2(struct.getB2());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab(struct.getProforfab());
      setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar(struct.getRecmar());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem getStruct( )
   {
      app.StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem struct = new app.StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem ();
      struct.setEmprcod(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod());
      struct.setBarcod(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar());
      struct.setReclinmaq(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq());
      struct.setReclinpro(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro());
      struct.setProforcod(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod());
      struct.setProfordsc(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc());
      struct.setReclin(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin());
      struct.setRecprdnum(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum());
      struct.setRecprddsc(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc());
      struct.setPrdnum(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum());
      struct.setForprdume(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume());
      struct.setFaccon(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon());
      struct.setPrdcant(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant());
      struct.setForprddsc(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc());
      struct.setRecfornro(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro());
      struct.setRecprdtnq(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq());
      struct.setReclote(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote());
      struct.setRecmanaut(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut());
      struct.setPrdrgb(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb());
      struct.setR(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R());
      struct.setG(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G());
      struct.setB(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B());
      struct.setR2(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2());
      struct.setG2(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2());
      struct.setB2(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2());
      struct.setProforfab(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab());
      struct.setRecmar(getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar());
      return struct ;
   }

   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_N ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq ;
   protected byte gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2 ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2 ;
   protected short gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod ;
   protected long gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb ;
   protected java.math.BigDecimal gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon ;
   protected java.math.BigDecimal gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut ;
   protected String gxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

