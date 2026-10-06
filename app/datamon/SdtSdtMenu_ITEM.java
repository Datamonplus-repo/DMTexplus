package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtMenu_ITEM extends GxUserType
{
   public SdtSdtMenu_ITEM( )
   {
      this(  new ModelContext(SdtSdtMenu_ITEM.class));
   }

   public SdtSdtMenu_ITEM( ModelContext context )
   {
      super( context, "SdtSdtMenu_ITEM");
   }

   public SdtSdtMenu_ITEM( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtMenu_ITEM");
   }

   public SdtSdtMenu_ITEM( StructSdtSdtMenu_ITEM struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID") )
            {
               gxTv_SdtSdtMenu_ITEM_Id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URL") )
            {
               gxTv_SdtSdtMenu_ITEM_Url = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TITLE") )
            {
               gxTv_SdtSdtMenu_ITEM_Title = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DESCRIPTION") )
            {
               gxTv_SdtSdtMenu_ITEM_Description = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONTAWSOME") )
            {
               gxTv_SdtSdtMenu_ITEM_Fontawsome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BADGE") )
            {
               gxTv_SdtSdtMenu_ITEM_Badge = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COLOR") )
            {
               gxTv_SdtSdtMenu_ITEM_Color = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE") )
            {
               gxTv_SdtSdtMenu_ITEM_Image = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE_GXI") )
            {
               gxTv_SdtSdtMenu_ITEM_Image_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FAVORITO") )
            {
               gxTv_SdtSdtMenu_ITEM_Favorito = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "WINDOW") )
            {
               gxTv_SdtSdtMenu_ITEM_Window = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXIBIR_FAVORITO") )
            {
               gxTv_SdtSdtMenu_ITEM_Exibir_favorito = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INFO") )
            {
               gxTv_SdtSdtMenu_ITEM_Info = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INFO_TEXT") )
            {
               gxTv_SdtSdtMenu_ITEM_Info_text = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_DISPLAY") )
            {
               gxTv_SdtSdtMenu_ITEM_Mnu_display = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_UPDATE") )
            {
               gxTv_SdtSdtMenu_ITEM_Mnu_update = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_INSERT") )
            {
               gxTv_SdtSdtMenu_ITEM_Mnu_insert = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MNU_DELETE") )
            {
               gxTv_SdtSdtMenu_ITEM_Mnu_delete = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ITEMS") )
            {
               if ( gxTv_SdtSdtMenu_ITEM_Items == null )
               {
                  gxTv_SdtSdtMenu_ITEM_Items = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSdtMenu_ITEM_Items.readxmlcollection(oReader, "ITEMS", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "ITEMS") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SdtMenu.ITEM" ;
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
      oWriter.writeElement("ID", GXutil.trim( GXutil.str( gxTv_SdtSdtMenu_ITEM_Id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("URL", gxTv_SdtSdtMenu_ITEM_Url);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TITLE", gxTv_SdtSdtMenu_ITEM_Title);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DESCRIPTION", gxTv_SdtSdtMenu_ITEM_Description);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FONTAWSOME", gxTv_SdtSdtMenu_ITEM_Fontawsome);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BADGE", GXutil.trim( GXutil.str( gxTv_SdtSdtMenu_ITEM_Badge, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("COLOR", gxTv_SdtSdtMenu_ITEM_Color);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IMAGE", gxTv_SdtSdtMenu_ITEM_Image);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IMAGE_GXI", gxTv_SdtSdtMenu_ITEM_Image_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FAVORITO", GXutil.booltostr( gxTv_SdtSdtMenu_ITEM_Favorito));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("WINDOW", GXutil.booltostr( gxTv_SdtSdtMenu_ITEM_Window));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EXIBIR_FAVORITO", GXutil.booltostr( gxTv_SdtSdtMenu_ITEM_Exibir_favorito));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("INFO", GXutil.booltostr( gxTv_SdtSdtMenu_ITEM_Info));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("INFO_TEXT", gxTv_SdtSdtMenu_ITEM_Info_text);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_DISPLAY", gxTv_SdtSdtMenu_ITEM_Mnu_display);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_UPDATE", gxTv_SdtSdtMenu_ITEM_Mnu_update);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_INSERT", gxTv_SdtSdtMenu_ITEM_Mnu_insert);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MNU_DELETE", gxTv_SdtSdtMenu_ITEM_Mnu_delete);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSdtMenu_ITEM_Items != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSdtMenu_ITEM_Items.writexmlcollection(oWriter, "ITEMS", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("ID", gxTv_SdtSdtMenu_ITEM_Id, false, false);
      AddObjectProperty("URL", gxTv_SdtSdtMenu_ITEM_Url, false, false);
      AddObjectProperty("TITLE", gxTv_SdtSdtMenu_ITEM_Title, false, false);
      AddObjectProperty("DESCRIPTION", gxTv_SdtSdtMenu_ITEM_Description, false, false);
      AddObjectProperty("FONTAWSOME", gxTv_SdtSdtMenu_ITEM_Fontawsome, false, false);
      AddObjectProperty("BADGE", gxTv_SdtSdtMenu_ITEM_Badge, false, false);
      AddObjectProperty("COLOR", gxTv_SdtSdtMenu_ITEM_Color, false, false);
      AddObjectProperty("IMAGE", gxTv_SdtSdtMenu_ITEM_Image, false, false);
      AddObjectProperty("IMAGE_GXI", gxTv_SdtSdtMenu_ITEM_Image_gxi, false, false);
      AddObjectProperty("FAVORITO", gxTv_SdtSdtMenu_ITEM_Favorito, false, false);
      AddObjectProperty("WINDOW", gxTv_SdtSdtMenu_ITEM_Window, false, false);
      AddObjectProperty("EXIBIR_FAVORITO", gxTv_SdtSdtMenu_ITEM_Exibir_favorito, false, false);
      AddObjectProperty("INFO", gxTv_SdtSdtMenu_ITEM_Info, false, false);
      AddObjectProperty("INFO_TEXT", gxTv_SdtSdtMenu_ITEM_Info_text, false, false);
      AddObjectProperty("MNU_DISPLAY", gxTv_SdtSdtMenu_ITEM_Mnu_display, false, false);
      AddObjectProperty("MNU_UPDATE", gxTv_SdtSdtMenu_ITEM_Mnu_update, false, false);
      AddObjectProperty("MNU_INSERT", gxTv_SdtSdtMenu_ITEM_Mnu_insert, false, false);
      AddObjectProperty("MNU_DELETE", gxTv_SdtSdtMenu_ITEM_Mnu_delete, false, false);
      if ( gxTv_SdtSdtMenu_ITEM_Items != null )
      {
         AddObjectProperty("ITEMS", gxTv_SdtSdtMenu_ITEM_Items, false, false);
      }
   }

   public short getgxTv_SdtSdtMenu_ITEM_Id( )
   {
      return gxTv_SdtSdtMenu_ITEM_Id ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Id( short value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Id = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Url( )
   {
      return gxTv_SdtSdtMenu_ITEM_Url ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Url( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Url = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Title( )
   {
      return gxTv_SdtSdtMenu_ITEM_Title ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Title( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Title = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Description( )
   {
      return gxTv_SdtSdtMenu_ITEM_Description ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Description( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Description = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Fontawsome( )
   {
      return gxTv_SdtSdtMenu_ITEM_Fontawsome ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Fontawsome( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Fontawsome = value ;
   }

   public short getgxTv_SdtSdtMenu_ITEM_Badge( )
   {
      return gxTv_SdtSdtMenu_ITEM_Badge ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Badge( short value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Badge = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Color( )
   {
      return gxTv_SdtSdtMenu_ITEM_Color ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Color( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Color = value ;
   }

   @GxUpload
   public String getgxTv_SdtSdtMenu_ITEM_Image( )
   {
      return gxTv_SdtSdtMenu_ITEM_Image ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Image( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Image = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Image_gxi( )
   {
      return gxTv_SdtSdtMenu_ITEM_Image_gxi ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Image_gxi( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Image_gxi = value ;
   }

   public boolean getgxTv_SdtSdtMenu_ITEM_Favorito( )
   {
      return gxTv_SdtSdtMenu_ITEM_Favorito ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Favorito( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Favorito = value ;
   }

   public boolean getgxTv_SdtSdtMenu_ITEM_Window( )
   {
      return gxTv_SdtSdtMenu_ITEM_Window ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Window( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Window = value ;
   }

   public boolean getgxTv_SdtSdtMenu_ITEM_Exibir_favorito( )
   {
      return gxTv_SdtSdtMenu_ITEM_Exibir_favorito ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Exibir_favorito( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Exibir_favorito = value ;
   }

   public boolean getgxTv_SdtSdtMenu_ITEM_Info( )
   {
      return gxTv_SdtSdtMenu_ITEM_Info ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Info( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Info = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Info_text( )
   {
      return gxTv_SdtSdtMenu_ITEM_Info_text ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Info_text( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Info_text = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Mnu_display( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_display ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Mnu_display( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_display = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Mnu_update( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_update ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Mnu_update( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_update = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Mnu_insert( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_insert ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Mnu_insert( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_insert = value ;
   }

   public String getgxTv_SdtSdtMenu_ITEM_Mnu_delete( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_delete ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Mnu_delete( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_delete = value ;
   }

   public GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> getgxTv_SdtSdtMenu_ITEM_Items( )
   {
      if ( gxTv_SdtSdtMenu_ITEM_Items == null )
      {
         gxTv_SdtSdtMenu_ITEM_Items = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      return gxTv_SdtSdtMenu_ITEM_Items ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Items( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> value )
   {
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Items = value ;
   }

   public void setgxTv_SdtSdtMenu_ITEM_Items_SetNull( )
   {
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(1) ;
      gxTv_SdtSdtMenu_ITEM_Items = null ;
   }

   public boolean getgxTv_SdtSdtMenu_ITEM_Items_IsNull( )
   {
      if ( gxTv_SdtSdtMenu_ITEM_Items == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtMenu_ITEM_Items_N( )
   {
      return gxTv_SdtSdtMenu_ITEM_Items_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(1) ;
      gxTv_SdtSdtMenu_ITEM_Url = "" ;
      gxTv_SdtSdtMenu_ITEM_Title = "" ;
      gxTv_SdtSdtMenu_ITEM_Description = "" ;
      gxTv_SdtSdtMenu_ITEM_Fontawsome = "" ;
      gxTv_SdtSdtMenu_ITEM_Color = "" ;
      gxTv_SdtSdtMenu_ITEM_Image = "" ;
      gxTv_SdtSdtMenu_ITEM_Image_gxi = "" ;
      gxTv_SdtSdtMenu_ITEM_Info_text = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_display = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_update = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_insert = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_delete = "" ;
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtMenu_ITEM_N ;
   }

   public app.datamon.SdtSdtMenu_ITEM Clone( )
   {
      return (app.datamon.SdtSdtMenu_ITEM)(clone()) ;
   }

   public void setStruct( app.datamon.StructSdtSdtMenu_ITEM struct )
   {
      setgxTv_SdtSdtMenu_ITEM_Id(struct.getId());
      setgxTv_SdtSdtMenu_ITEM_Url(struct.getUrl());
      setgxTv_SdtSdtMenu_ITEM_Title(struct.getTitle());
      setgxTv_SdtSdtMenu_ITEM_Description(struct.getDescription());
      setgxTv_SdtSdtMenu_ITEM_Fontawsome(struct.getFontawsome());
      setgxTv_SdtSdtMenu_ITEM_Badge(struct.getBadge());
      setgxTv_SdtSdtMenu_ITEM_Color(struct.getColor());
      setgxTv_SdtSdtMenu_ITEM_Image(struct.getImage());
      setgxTv_SdtSdtMenu_ITEM_Image_gxi(struct.getImage_gxi());
      setgxTv_SdtSdtMenu_ITEM_Favorito(struct.getFavorito());
      setgxTv_SdtSdtMenu_ITEM_Window(struct.getWindow());
      setgxTv_SdtSdtMenu_ITEM_Exibir_favorito(struct.getExibir_favorito());
      setgxTv_SdtSdtMenu_ITEM_Info(struct.getInfo());
      setgxTv_SdtSdtMenu_ITEM_Info_text(struct.getInfo_text());
      setgxTv_SdtSdtMenu_ITEM_Mnu_display(struct.getMnu_display());
      setgxTv_SdtSdtMenu_ITEM_Mnu_update(struct.getMnu_update());
      setgxTv_SdtSdtMenu_ITEM_Mnu_insert(struct.getMnu_insert());
      setgxTv_SdtSdtMenu_ITEM_Mnu_delete(struct.getMnu_delete());
      GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> gxTv_SdtSdtMenu_ITEM_Items_aux = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      Vector<app.datamon.StructSdtSdtMenu_ITEM> gxTv_SdtSdtMenu_ITEM_Items_aux1 = struct.getItems();
      if (gxTv_SdtSdtMenu_ITEM_Items_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSdtMenu_ITEM_Items_aux1.size(); i++)
         {
            gxTv_SdtSdtMenu_ITEM_Items_aux.add(new app.datamon.SdtSdtMenu_ITEM(gxTv_SdtSdtMenu_ITEM_Items_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSdtMenu_ITEM_Items(gxTv_SdtSdtMenu_ITEM_Items_aux);
   }

   @SuppressWarnings("unchecked")
   public app.datamon.StructSdtSdtMenu_ITEM getStruct( )
   {
      app.datamon.StructSdtSdtMenu_ITEM struct = new app.datamon.StructSdtSdtMenu_ITEM ();
      struct.setId(getgxTv_SdtSdtMenu_ITEM_Id());
      struct.setUrl(getgxTv_SdtSdtMenu_ITEM_Url());
      struct.setTitle(getgxTv_SdtSdtMenu_ITEM_Title());
      struct.setDescription(getgxTv_SdtSdtMenu_ITEM_Description());
      struct.setFontawsome(getgxTv_SdtSdtMenu_ITEM_Fontawsome());
      struct.setBadge(getgxTv_SdtSdtMenu_ITEM_Badge());
      struct.setColor(getgxTv_SdtSdtMenu_ITEM_Color());
      struct.setImage(getgxTv_SdtSdtMenu_ITEM_Image());
      struct.setImage_gxi(getgxTv_SdtSdtMenu_ITEM_Image_gxi());
      struct.setFavorito(getgxTv_SdtSdtMenu_ITEM_Favorito());
      struct.setWindow(getgxTv_SdtSdtMenu_ITEM_Window());
      struct.setExibir_favorito(getgxTv_SdtSdtMenu_ITEM_Exibir_favorito());
      struct.setInfo(getgxTv_SdtSdtMenu_ITEM_Info());
      struct.setInfo_text(getgxTv_SdtSdtMenu_ITEM_Info_text());
      struct.setMnu_display(getgxTv_SdtSdtMenu_ITEM_Mnu_display());
      struct.setMnu_update(getgxTv_SdtSdtMenu_ITEM_Mnu_update());
      struct.setMnu_insert(getgxTv_SdtSdtMenu_ITEM_Mnu_insert());
      struct.setMnu_delete(getgxTv_SdtSdtMenu_ITEM_Mnu_delete());
      struct.setItems(getgxTv_SdtSdtMenu_ITEM_Items().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtMenu_ITEM_N ;
   protected byte gxTv_SdtSdtMenu_ITEM_Items_N ;
   protected short gxTv_SdtSdtMenu_ITEM_Id ;
   protected short gxTv_SdtSdtMenu_ITEM_Badge ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_display ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_update ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_insert ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_delete ;
   protected String sTagName ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Favorito ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Window ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Exibir_favorito ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Info ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtMenu_ITEM_Url ;
   protected String gxTv_SdtSdtMenu_ITEM_Title ;
   protected String gxTv_SdtSdtMenu_ITEM_Description ;
   protected String gxTv_SdtSdtMenu_ITEM_Fontawsome ;
   protected String gxTv_SdtSdtMenu_ITEM_Color ;
   protected String gxTv_SdtSdtMenu_ITEM_Image_gxi ;
   protected String gxTv_SdtSdtMenu_ITEM_Info_text ;
   protected String gxTv_SdtSdtMenu_ITEM_Image ;
   protected GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> gxTv_SdtSdtMenu_ITEM_Items_aux ;
   protected GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> gxTv_SdtSdtMenu_ITEM_Items=null ;
}

