package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inventarioat_txt extends GXProcedure
{
   public inventarioat_txt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inventarioat_txt.class ), "" );
   }

   public inventarioat_txt( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        String aP1 ,
                                                                        String aP2 ,
                                                                        java.util.Date aP3 )
   {
      inventarioat_txt.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      inventarioat_txt.this.AV15Emprcod = aP0;
      inventarioat_txt.this.AV19prdnum1 = aP1;
      inventarioat_txt.this.AV16Prdnum2 = aP2;
      inventarioat_txt.this.AV17RecFec = aP3;
      inventarioat_txt.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23messages.clear();
      GXt_char1 = AV20PATHPDF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV15Emprcod, httpContext.getMessage( "INVAT", ""), GXv_char2) ;
      inventarioat_txt.this.GXt_char1 = GXv_char2[0] ;
      AV20PATHPDF = GXt_char1 ;
      AV26len = (short)(GXutil.len( GXutil.trim( AV20PATHPDF))) ;
      AV20PATHPDF = ((GXutil.strcmp(GXutil.substring( AV20PATHPDF, AV26len, 1), "\\")==0) ? AV20PATHPDF : AV20PATHPDF+"\\") ;
      GXt_int3 = AV25Opcion ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char4[0] = httpContext.getMessage( "INVAT", "") ;
      GXv_int5[0] = GXt_int3 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char2, GXv_char4, GXv_int5) ;
      inventarioat_txt.this.AV15Emprcod = GXv_char2[0] ;
      inventarioat_txt.this.GXt_int3 = GXv_int5[0] ;
      AV25Opcion = (short)(GXt_int3) ;
      AV21nombrefile = GXutil.format( "%1%2.csv", AV20PATHPDF, httpContext.getMessage( "INVENTARIO", ""), "", "", "", "", "", "", "") ;
      GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 = AV14InventarioAT_SDT ;
      GXv_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem7[0] = GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 ;
      new app.stocksquimicos.inventarioat_dp(remoteHandle, context).execute( AV15Emprcod, AV19prdnum1, AV16Prdnum2, AV17RecFec, GXv_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem7) ;
      GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 = GXv_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem7[0] ;
      AV14InventarioAT_SDT = GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV13TextFileLine = "" ;
      AV13TextFileLine += ";" + httpContext.getMessage( "ProductCategory", "") ;
      AV13TextFileLine += ";" + httpContext.getMessage( "ProductCode", "") ;
      AV13TextFileLine += ";" + httpContext.getMessage( "ProductDescription", "") ;
      AV13TextFileLine += ";" + httpContext.getMessage( "ProductNumberCode", "") ;
      AV13TextFileLine += ";" + httpContext.getMessage( "ClosingStockQuantity", "") ;
      AV13TextFileLine += ";" + httpContext.getMessage( "UnitOfMeasure", "") ;
      if ( AV25Opcion == 1 )
      {
         AV13TextFileLine += ";" + httpContext.getMessage( "ClosingStockValue", "") ;
      }
      if ( GXutil.len( AV13TextFileLine) > 0 )
      {
         AV22file.writeLine(GXutil.substring( AV13TextFileLine, 2, -1));
      }
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV29GXV1 = 1 ;
      while ( AV29GXV1 <= AV14InventarioAT_SDT.size() )
      {
         AV18InventarioAT_SDT_item = (app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem)((app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem)AV14InventarioAT_SDT.elementAt(-1+AV29GXV1));
         AV13TextFileLine = "" ;
         AV13TextFileLine += ";" + AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory() ;
         AV13TextFileLine += ";" + AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode() ;
         AV13TextFileLine += ";" + AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription() ;
         AV13TextFileLine += ";" + AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode() ;
         AV13TextFileLine += ";" + localUtil.format( AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity(), "ZZZZZZ9.9999") ;
         AV13TextFileLine += ";" + AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure() ;
         if ( AV25Opcion == 1 )
         {
            AV13TextFileLine += ";" + localUtil.format( AV18InventarioAT_SDT_item.getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue(), "ZZZZZZ9.99999") ;
         }
         if ( GXutil.len( AV13TextFileLine) > 0 )
         {
            AV22file.writeLine(GXutil.substring( AV13TextFileLine, 2, -1));
         }
         AV29GXV1 = (int)(AV29GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV22file.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      if ( AV22file.getErrCode() == 0 )
      {
         AV24message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV24message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV22file.getErrCode(), 10, 2) );
         AV24message.setgxTv_SdtMessages_Message_Description( AV21nombrefile );
         AV23messages.add(AV24message, 0);
      }
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV22file.setSource( AV21nombrefile );
      if ( AV22file.exists() )
      {
         AV22file.delete();
      }
      AV22file.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV22file.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV22file.getErrCode() != 0 )
      {
         AV9Filename = "" ;
         AV12ErrorMessage = AV22file.getErrDescription() ;
         AV22file.close();
         AV24message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV24message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV22file.getErrCode(), 10, 2) );
         AV24message.setgxTv_SdtMessages_Message_Description( AV12ErrorMessage );
         AV23messages.add(AV24message, 0);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = inventarioat_txt.this.AV23messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV20PATHPDF = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new long[1] ;
      AV21nombrefile = "" ;
      AV14InventarioAT_SDT = new GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>(app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem.class, "InventarioAT_SDTItem", "TexplusNET", remoteHandle);
      GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 = new GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem>(app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem.class, "InventarioAT_SDTItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem7 = new GXBaseCollection[1] ;
      AV13TextFileLine = "" ;
      AV22file = new com.genexus.util.GXFile();
      AV18InventarioAT_SDT_item = new app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem(remoteHandle, context);
      AV24message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV9Filename = "" ;
      AV12ErrorMessage = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV26len ;
   private short AV25Opcion ;
   private short Gx_err ;
   private int AV29GXV1 ;
   private long GXt_int3 ;
   private long GXv_int5[] ;
   private String AV15Emprcod ;
   private String AV19prdnum1 ;
   private String AV16Prdnum2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private java.util.Date AV17RecFec ;
   private boolean returnInSub ;
   private String AV13TextFileLine ;
   private String AV20PATHPDF ;
   private String AV21nombrefile ;
   private String AV9Filename ;
   private String AV12ErrorMessage ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.genexus.util.GXFile AV22file ;
   private GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem> AV14InventarioAT_SDT ;
   private GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem> GXt_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem6 ;
   private GXBaseCollection<app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem> GXv_objcol_SdtInventarioAT_SDT_InventarioAT_SDTItem7[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV23messages ;
   private com.genexus.SdtMessages_Message AV24message ;
   private app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem AV18InventarioAT_SDT_item ;
}

