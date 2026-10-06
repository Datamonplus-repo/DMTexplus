package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rmod008_consultaexport extends GXProcedure
{
   public rmod008_consultaexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmod008_consultaexport.class ), "" );
   }

   public rmod008_consultaexport( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      rmod008_consultaexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      rmod008_consultaexport.this.aP0 = aP0;
      rmod008_consultaexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Data_json = AV23WebSession.getValue(httpContext.getMessage( "&Data_json", "")) ;
      AV21RMOD008_SDT.fromJSonString(AV22Data_json, null);
      AV29BarFecClifrom = localUtil.ctod( AV23WebSession.getValue("&BarFecClifrom"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV30BarFecClito = localUtil.ctod( AV23WebSession.getValue("&BarFecClito"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV23WebSession.remove("&BarFecClifrom");
      AV23WebSession.remove("&BarFecClito");
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV15Random = (int)(GXutil.random( )*10000) ;
         AV11Filename = "./PrivateTempStorage/" + "RMOD008_ConsultaExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
         AV10ExcelDocument.Open(AV11Filename);
         /* Execute user subroutine: 'CHECKSTATUS' */
         S121 ();
         if (returnInSub) return;
         AV10ExcelDocument.Clear();
      }
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "ProduccionenCursoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Periodo", "") );
      GXt_dtime2 = GXutil.resetTime( AV29BarFecClifrom );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      GXt_dtime2 = GXutil.resetTime( AV30BarFecClito );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      AV13CellRow = 2 ;
      AV14FirstColumn = 1 ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Almacen", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Preparado", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Tinte", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Acabados", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Total", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV24Tot_A_k = DecimalUtil.ZERO ;
      AV25Tot_a_a = DecimalUtil.ZERO ;
      AV26Tot_a_p = DecimalUtil.ZERO ;
      AV27Tot_a_t = DecimalUtil.ZERO ;
      AV28Tot_l = DecimalUtil.ZERO ;
      if ( 1 == 0 )
      {
         AV33GXV1 = 1 ;
         while ( AV33GXV1 <= AV21RMOD008_SDT.size() )
         {
            AV16RMOD008_SDTItem = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV21RMOD008_SDT.elementAt(-1+AV33GXV1));
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S151 ();
            if (returnInSub) return;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clicod() );
            GXt_char3 = "" ;
            GXv_char4[0] = GXt_char3 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clinom(), GXv_char4) ;
            rmod008_consultaexport.this.GXt_char3 = GXv_char4[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char3 );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_l())) );
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S161 ();
            if (returnInSub) return;
            AV33GXV1 = (int)(AV33GXV1+1) ;
         }
      }
      AV34GXV2 = 1 ;
      while ( AV34GXV2 <= AV21RMOD008_SDT.size() )
      {
         AV16RMOD008_SDTItem = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV21RMOD008_SDT.elementAt(-1+AV34GXV2));
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S151 ();
         if (returnInSub) return;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clicod() );
         GXt_char3 = "" ;
         GXv_char4[0] = GXt_char3 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Clinom(), GXv_char4) ;
         rmod008_consultaexport.this.GXt_char3 = GXv_char4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char3 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_l())) );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S161 ();
         if (returnInSub) return;
         AV24Tot_A_k = AV24Tot_A_k.add((AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) ;
         AV25Tot_a_a = AV25Tot_a_a.add((AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) ;
         AV26Tot_a_p = AV26Tot_a_p.add((AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) ;
         AV27Tot_a_t = AV27Tot_a_t.add((AV16RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) ;
         AV34GXV2 = (int)(AV34GXV2+1) ;
      }
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV28Tot_l = AV25Tot_a_a.add(AV26Tot_a_p).add(AV27Tot_a_t).add(AV24Tot_A_k) ;
      AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24Tot_A_k)) );
      AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26Tot_a_p)) );
      AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27Tot_a_t)) );
      AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25Tot_a_a)) );
      AV10ExcelDocument.Cells(AV13CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28Tot_l)) );
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("PedidosClienteSinDetalle.RMOD008_ConsultaGridState"), null, null);
      }
   }

   public void S151( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S161( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = rmod008_consultaexport.this.AV11Filename;
      this.aP1[0] = rmod008_consultaexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV22Data_json = "" ;
      AV23WebSession = httpContext.getWebSession();
      AV21RMOD008_SDT = new GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item>(app.pedidosclientesindetalle.SdtRMOD008_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV29BarFecClifrom = GXutil.nullDate() ;
      AV30BarFecClito = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV24Tot_A_k = DecimalUtil.ZERO ;
      AV25Tot_a_a = DecimalUtil.ZERO ;
      AV26Tot_a_p = DecimalUtil.ZERO ;
      AV27Tot_a_t = DecimalUtil.ZERO ;
      AV28Tot_l = DecimalUtil.ZERO ;
      AV16RMOD008_SDTItem = new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV17Session = httpContext.getWebSession();
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV33GXV1 ;
   private int AV34GXV2 ;
   private java.math.BigDecimal AV24Tot_A_k ;
   private java.math.BigDecimal AV25Tot_a_a ;
   private java.math.BigDecimal AV26Tot_a_p ;
   private java.math.BigDecimal AV27Tot_a_t ;
   private java.math.BigDecimal AV28Tot_l ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV29BarFecClifrom ;
   private java.util.Date AV30BarFecClito ;
   private boolean returnInSub ;
   private String AV22Data_json ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV21RMOD008_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.pedidosclientesindetalle.SdtRMOD008_SDT_Item AV16RMOD008_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
}

