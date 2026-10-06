package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wciformedetalladohdrsproduccionexport extends GXProcedure
{
   public wciformedetalladohdrsproduccionexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wciformedetalladohdrsproduccionexport.class ), "" );
   }

   public wciformedetalladohdrsproduccionexport( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wciformedetalladohdrsproduccionexport.this.aP1 = new String[] {""};
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
      wciformedetalladohdrsproduccionexport.this.aP0 = aP0;
      wciformedetalladohdrsproduccionexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "WCIformedetalladoHdrsProduccionExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80FilterFullText, GXv_char5) ;
      wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV34TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFMaqCod_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV33TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFMaqCod, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMaqDsc_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMaqDsc, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV36TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarNHdr_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV79TFHisProLot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFHisProLot_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV78TFHisProLot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFHisProLot, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFCliCod) && (0==AV56TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFCliNom_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFCliNom, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV96TFPedidoCliente_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFPedidoCliente_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV95TFPedidoCliente)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95TFPedidoCliente, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFBarFecGen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV59TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV62TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFBarSer_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFBarSer, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV64TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFBarSerDsc_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFBarSerDsc, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV92TFBarTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFBarTipArtDsc_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV91TFBarTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFBarTipArtDsc, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV94TFBarTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV94TFBarTipColDsc_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV93TFBarTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFBarTipColDsc, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV38TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFase_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFFase, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV100TFFaseDescripcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFFaseDescripcion_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV99TFFaseDescripcion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFFaseDescripcion, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV39TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV39TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV41TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV41TFHisProDTF );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFHisProMtr_To)) );
      }
      if ( ! ( (0==AV71TFParCod) && (0==AV72TFParCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV71TFParCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV72TFParCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV77TFParCodNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFParCodNom_Sel, GXv_char5) ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV76TFParCodNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFParCodNom, GXv_char5) ;
            wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV73TFHisProTur) && (0==AV74TFHisProTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFHisProTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFHisProTur_To );
      }
      if ( ! ( (0==AV83TFHisProReo) && (0==AV84TFHisProReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Reoperado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV83TFHisProReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wciformedetalladohdrsproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV84TFHisProReo_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV104GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV106Wciformedetalladohdrsproduccionds_1_filterfulltext = AV80FilterFullText ;
      AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV33TFMaqCod ;
      AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV34TFMaqCod_Sel ;
      AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV53TFMaqDsc ;
      AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV54TFMaqDsc_Sel ;
      AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV35TFBarNHdr ;
      AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV36TFBarNHdr_Sel ;
      AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV78TFHisProLot ;
      AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV79TFHisProLot_Sel ;
      AV115Wciformedetalladohdrsproduccionds_10_tfclicod = AV55TFCliCod ;
      AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV56TFCliCod_To ;
      AV117Wciformedetalladohdrsproduccionds_12_tfclinom = AV57TFCliNom ;
      AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV58TFCliNom_Sel ;
      AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV95TFPedidoCliente ;
      AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV96TFPedidoCliente_Sel ;
      AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV59TFBarFecGen ;
      AV122Wciformedetalladohdrsproduccionds_17_tfbarser = AV61TFBarSer ;
      AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV62TFBarSer_Sel ;
      AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV63TFBarSerDsc ;
      AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV64TFBarSerDsc_Sel ;
      AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV91TFBarTipArtDsc ;
      AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV92TFBarTipArtDsc_Sel ;
      AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV93TFBarTipColDsc ;
      AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV94TFBarTipColDsc_Sel ;
      AV130Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV131Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV99TFFaseDescripcion ;
      AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV100TFFaseDescripcion_Sel ;
      AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV39TFHisProDTI ;
      AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV41TFHisProDTF ;
      AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV65TFHisProKgr ;
      AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV66TFHisProKgr_To ;
      AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV67TFHisProMtr ;
      AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV68TFHisProMtr_To ;
      AV140Wciformedetalladohdrsproduccionds_35_tfparcod = AV71TFParCod ;
      AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV72TFParCod_To ;
      AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV76TFParCodNom ;
      AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV77TFParCodNom_Sel ;
      AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV73TFHisProTur ;
      AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV74TFHisProTur_To ;
      AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV83TFHisProReo ;
      AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV84TFHisProReo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV115Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV122Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV131Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV130Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV140Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV45MaqCodInicial ,
                                           AV46MaqCodFinal ,
                                           AV47Hisprodti ,
                                           AV48Hisprodtf ,
                                           Byte.valueOf(AV81HisProReo) ,
                                           Short.valueOf(AV82ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV106Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV44Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV107Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV113Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV117Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV122Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV122Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV130Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV130Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV142Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LV2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, lV107Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV113Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV115Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV117Wciformedetalladohdrsproduccionds_12_tfclinom, AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV122Wciformedetalladohdrsproduccionds_17_tfbarser, AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV130Wciformedetalladohdrsproduccionds_25_tffase, AV131Wciformedetalladohdrsproduccionds_26_tffase_sel, AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV140Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV142Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV45MaqCodInicial, AV46MaqCodFinal, AV47Hisprodti, AV48Hisprodtf, Byte.valueOf(AV81HisProReo), Short.valueOf(AV82ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P08LV2_A217BarTipArt[0] ;
         n217BarTipArt = P08LV2_n217BarTipArt[0] ;
         A3612HisProReo = P08LV2_A3612HisProReo[0] ;
         A566HisProTur = P08LV2_A566HisProTur[0] ;
         A867ParCodNom = P08LV2_A867ParCodNom[0] ;
         n867ParCodNom = P08LV2_n867ParCodNom[0] ;
         A656ParCod = P08LV2_A656ParCod[0] ;
         n656ParCod = P08LV2_n656ParCod[0] ;
         A1526HisProMtr = P08LV2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LV2_A1525HisProKgr[0] ;
         A13711BarTipArtD = P08LV2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LV2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LV2_A1652BarSerDsc[0] ;
         A212BarSer = P08LV2_A212BarSer[0] ;
         A159BarFecGen = P08LV2_A159BarFecGen[0] ;
         A279CliNom = P08LV2_A279CliNom[0] ;
         A252CliCod = P08LV2_A252CliCod[0] ;
         n252CliCod = P08LV2_n252CliCod[0] ;
         A3610HisProLot = P08LV2_A3610HisProLot[0] ;
         A13696BarNHdr = P08LV2_A13696BarNHdr[0] ;
         A606MaqDsc = P08LV2_A606MaqDsc[0] ;
         n606MaqDsc = P08LV2_n606MaqDsc[0] ;
         A602MaqCod = P08LV2_A602MaqCod[0] ;
         A129BarCod = P08LV2_A129BarCod[0] ;
         A132BarCodReo = P08LV2_A132BarCodReo[0] ;
         A130BarCodPar = P08LV2_A130BarCodPar[0] ;
         A4440HisProDTI = P08LV2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LV2_n4440HisProDTI[0] ;
         A4441HisProDTF = P08LV2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LV2_n4441HisProDTF[0] ;
         A143BarDisNum = P08LV2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LV2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LV2_A218BarTipCol[0] ;
         A461Fase = P08LV2_A461Fase[0] ;
         A396EmprCod = P08LV2_A396EmprCod[0] ;
         A558HisProFec = P08LV2_A558HisProFec[0] ;
         A561HisProLin = P08LV2_A561HisProLin[0] ;
         A606MaqDsc = P08LV2_A606MaqDsc[0] ;
         n606MaqDsc = P08LV2_n606MaqDsc[0] ;
         A217BarTipArt = P08LV2_A217BarTipArt[0] ;
         n217BarTipArt = P08LV2_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LV2_A1652BarSerDsc[0] ;
         A212BarSer = P08LV2_A212BarSer[0] ;
         A159BarFecGen = P08LV2_A159BarFecGen[0] ;
         A252CliCod = P08LV2_A252CliCod[0] ;
         n252CliCod = P08LV2_n252CliCod[0] ;
         A13696BarNHdr = P08LV2_A13696BarNHdr[0] ;
         A143BarDisNum = P08LV2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LV2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LV2_A218BarTipCol[0] ;
         A279CliNom = P08LV2_A279CliNom[0] ;
         A13711BarTipArtD = P08LV2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LV2_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LV2_A867ParCodNom[0] ;
         n867ParCodNom = P08LV2_n867ParCodNom[0] ;
         GXt_char4 = A13878PedidoClie ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char7[0] = A4812BarEncCli ;
         GXv_char8[0] = A143BarDisNum ;
         GXv_char9[0] = GXt_char4 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_char8, GXv_char9) ;
         wciformedetalladohdrsproduccionexport.this.A396EmprCod = GXv_char5[0] ;
         wciformedetalladohdrsproduccionexport.this.A4812BarEncCli = GXv_char7[0] ;
         wciformedetalladohdrsproduccionexport.this.A143BarDisNum = GXv_char8[0] ;
         wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
         A13878PedidoClie = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char4 = A13868BarTipColD ;
               GXv_char9[0] = A396EmprCod ;
               GXv_int10[0] = A218BarTipCol ;
               GXv_char8[0] = GXt_char4 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_char8) ;
               wciformedetalladohdrsproduccionexport.this.A396EmprCod = GXv_char9[0] ;
               wciformedetalladohdrsproduccionexport.this.A218BarTipCol = GXv_int10[0] ;
               wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char8[0] ;
               A13868BarTipColD = GXt_char4 ;
               if ( ! ( (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char4 = A13893FaseDescri ;
                     GXv_char9[0] = GXt_char4 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char9) ;
                     wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                     A13893FaseDescri = GXt_char4 ;
                     if ( (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV106Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                              {
                                 A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                              }
                              else
                              {
                                 A5605HisProTr2 = (short)(0) ;
                              }
                              AV13CellRow = (int)(AV13CellRow+1) ;
                              /* Execute user subroutine: 'BEFOREWRITELINE' */
                              S172 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 returnInSub = true;
                                 if (true) return;
                              }
                              AV30VisibleColumnCount = 0 ;
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3610HisProLot, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13878PedidoClie, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
                                 AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13868BarTipColD, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13893FaseDescri, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A656ParCod );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char9[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A867ParCodNom, GXv_char9) ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A566HisProTur );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_int11 = AV75Tiempom ;
                                 GXv_char9[0] = A461Fase ;
                                 GXv_char8[0] = A3610HisProLot ;
                                 GXv_int12[0] = A129BarCod ;
                                 GXv_int10[0] = A132BarCodReo ;
                                 GXv_char7[0] = A130BarCodPar ;
                                 GXv_int3[0] = A5605HisProTr2 ;
                                 GXv_int13[0] = GXt_int11 ;
                                 new app.tiemporeallector(remoteHandle, context).execute( GXv_char9, GXv_char8, GXv_int12, GXv_int10, GXv_char7, GXv_int3, GXv_int13) ;
                                 wciformedetalladohdrsproduccionexport.this.A461Fase = GXv_char9[0] ;
                                 wciformedetalladohdrsproduccionexport.this.A3610HisProLot = GXv_char8[0] ;
                                 wciformedetalladohdrsproduccionexport.this.A129BarCod = GXv_int12[0] ;
                                 wciformedetalladohdrsproduccionexport.this.A132BarCodReo = GXv_int10[0] ;
                                 wciformedetalladohdrsproduccionexport.this.A130BarCodPar = GXv_char7[0] ;
                                 wciformedetalladohdrsproduccionexport.this.A5605HisProTr2 = GXv_int3[0] ;
                                 wciformedetalladohdrsproduccionexport.this.GXt_int11 = GXv_int13[0] ;
                                 AV75Tiempom = GXt_int11 ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV75Tiempom );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A3612HisProReo );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              /* Execute user subroutine: 'AFTERWRITELINE' */
                              S182 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 returnInSub = true;
                                 if (true) return;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
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

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MaqCod", "", "Código Máquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProLot", "", "Lote", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", false, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Serie", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Tipo Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipColDsc", "", "TC", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "Fase", "", "Codigo Fase", false, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "FaseDescripcion", "", "Fase", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProDTI", "", "Inicio", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProDTF", "", "Fin", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProKgr", "", "Kilos", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProMtr", "", "Metros", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ParCod", "", "Paro", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ParCodNom", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProTur", "", "T", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Tiempom", "", "TReal", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProReo", "", "Tipo Reoperado", false, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char9[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionColumnsSelector", GXv_char9) ;
      wciformedetalladohdrsproduccionexport.this.GXt_char4 = GXv_char9[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("WCIformedetalladoHdrsProduccionGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV148GXV2 = 1 ;
      while ( AV148GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV80FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV33TFMaqCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV34TFMaqCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV53TFMaqDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV54TFMaqDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV35TFBarNHdr = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV36TFBarNHdr_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV78TFHisProLot = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV79TFHisProLot_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV55TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV57TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV58TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV95TFPedidoCliente = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV96TFPedidoCliente_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV59TFBarFecGen = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV61TFBarSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV62TFBarSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV63TFBarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV64TFBarSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV91TFBarTipArtDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV92TFBarTipArtDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC") == 0 )
         {
            AV93TFBarTipColDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC_SEL") == 0 )
         {
            AV94TFBarTipColDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV37TFFase = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV38TFFase_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV99TFFaseDescripcion = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV100TFFaseDescripcion_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV39TFHisProDTI = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV41TFHisProDTF = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV65TFHisProKgr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFHisProKgr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV67TFHisProMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFHisProMtr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV71TFParCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFParCod_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV76TFParCodNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV77TFParCodNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV73TFHisProTur = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFHisProTur_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROREO") == 0 )
         {
            AV83TFHisProReo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFHisProReo_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODINICIAL") == 0 )
         {
            AV45MaqCodInicial = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODFINAL") == 0 )
         {
            AV46MaqCodFinal = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTI") == 0 )
         {
            AV47Hisprodti = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTF") == 0 )
         {
            AV48Hisprodtf = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROREO") == 0 )
         {
            AV81HisProReo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PARCOD") == 0 )
         {
            AV82ParCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV148GXV2 = (int)(AV148GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = wciformedetalladohdrsproduccionexport.this.AV11Filename;
      this.aP1[0] = wciformedetalladohdrsproduccionexport.this.AV12ErrorMessage;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV80FilterFullText = "" ;
      AV34TFMaqCod_Sel = "" ;
      AV33TFMaqCod = "" ;
      AV54TFMaqDsc_Sel = "" ;
      AV53TFMaqDsc = "" ;
      AV36TFBarNHdr_Sel = "" ;
      AV35TFBarNHdr = "" ;
      AV79TFHisProLot_Sel = "" ;
      AV78TFHisProLot = "" ;
      AV58TFCliNom_Sel = "" ;
      AV57TFCliNom = "" ;
      AV96TFPedidoCliente_Sel = "" ;
      AV95TFPedidoCliente = "" ;
      AV59TFBarFecGen = GXutil.nullDate() ;
      AV62TFBarSer_Sel = "" ;
      AV61TFBarSer = "" ;
      AV64TFBarSerDsc_Sel = "" ;
      AV63TFBarSerDsc = "" ;
      AV92TFBarTipArtDsc_Sel = "" ;
      AV91TFBarTipArtDsc = "" ;
      AV94TFBarTipColDsc_Sel = "" ;
      AV93TFBarTipColDsc = "" ;
      AV38TFFase_Sel = "" ;
      AV37TFFase = "" ;
      AV100TFFaseDescripcion_Sel = "" ;
      AV99TFFaseDescripcion = "" ;
      AV39TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV41TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV65TFHisProKgr = DecimalUtil.ZERO ;
      AV66TFHisProKgr_To = DecimalUtil.ZERO ;
      AV67TFHisProMtr = DecimalUtil.ZERO ;
      AV68TFHisProMtr_To = DecimalUtil.ZERO ;
      AV77TFParCodNom_Sel = "" ;
      AV76TFParCodNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A13696BarNHdr = "" ;
      A3610HisProLot = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A13868BarTipColD = "" ;
      A461Fase = "" ;
      A13893FaseDescri = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      AV106Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = "" ;
      AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = "" ;
      AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = "" ;
      AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = "" ;
      AV117Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel = "" ;
      AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente = "" ;
      AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = "" ;
      AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen = GXutil.nullDate() ;
      AV122Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel = "" ;
      AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = "" ;
      AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = "" ;
      AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = "" ;
      AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = "" ;
      AV130Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      AV131Wciformedetalladohdrsproduccionds_26_tffase_sel = "" ;
      AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion = "" ;
      AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = "" ;
      AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr = DecimalUtil.ZERO ;
      AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr = DecimalUtil.ZERO ;
      AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = DecimalUtil.ZERO ;
      AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = "" ;
      lV106Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV107Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      lV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      lV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      lV113Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      lV117Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      lV122Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      lV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      lV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      lV130Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      lV142Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV45MaqCodInicial = "" ;
      AV46MaqCodFinal = "" ;
      AV47Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV48Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV44Emprcod = "" ;
      A396EmprCod = "" ;
      P08LV2_A217BarTipArt = new short[1] ;
      P08LV2_n217BarTipArt = new boolean[] {false} ;
      P08LV2_A3612HisProReo = new byte[1] ;
      P08LV2_A566HisProTur = new byte[1] ;
      P08LV2_A867ParCodNom = new String[] {""} ;
      P08LV2_n867ParCodNom = new boolean[] {false} ;
      P08LV2_A656ParCod = new short[1] ;
      P08LV2_n656ParCod = new boolean[] {false} ;
      P08LV2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LV2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LV2_A13711BarTipArtD = new String[] {""} ;
      P08LV2_n13711BarTipArtD = new boolean[] {false} ;
      P08LV2_A1652BarSerDsc = new String[] {""} ;
      P08LV2_A212BarSer = new String[] {""} ;
      P08LV2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LV2_A279CliNom = new String[] {""} ;
      P08LV2_A252CliCod = new int[1] ;
      P08LV2_n252CliCod = new boolean[] {false} ;
      P08LV2_A3610HisProLot = new String[] {""} ;
      P08LV2_A13696BarNHdr = new String[] {""} ;
      P08LV2_A606MaqDsc = new String[] {""} ;
      P08LV2_n606MaqDsc = new boolean[] {false} ;
      P08LV2_A602MaqCod = new String[] {""} ;
      P08LV2_A129BarCod = new int[1] ;
      P08LV2_A132BarCodReo = new byte[1] ;
      P08LV2_A130BarCodPar = new String[] {""} ;
      P08LV2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LV2_n4440HisProDTI = new boolean[] {false} ;
      P08LV2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LV2_n4441HisProDTF = new boolean[] {false} ;
      P08LV2_A143BarDisNum = new String[] {""} ;
      P08LV2_A4812BarEncCli = new String[] {""} ;
      P08LV2_A218BarTipCol = new byte[1] ;
      P08LV2_A461Fase = new String[] {""} ;
      P08LV2_A396EmprCod = new String[] {""} ;
      P08LV2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LV2_A561HisProLin = new int[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A558HisProFec = GXutil.nullDate() ;
      GXv_char5 = new String[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char8 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int13 = new short[1] ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wciformedetalladohdrsproduccionexport__default(),
         new Object[] {
             new Object[] {
            P08LV2_A217BarTipArt, P08LV2_n217BarTipArt, P08LV2_A3612HisProReo, P08LV2_A566HisProTur, P08LV2_A867ParCodNom, P08LV2_n867ParCodNom, P08LV2_A656ParCod, P08LV2_n656ParCod, P08LV2_A1526HisProMtr, P08LV2_A1525HisProKgr,
            P08LV2_A13711BarTipArtD, P08LV2_n13711BarTipArtD, P08LV2_A1652BarSerDsc, P08LV2_A212BarSer, P08LV2_A159BarFecGen, P08LV2_A279CliNom, P08LV2_A252CliCod, P08LV2_n252CliCod, P08LV2_A3610HisProLot, P08LV2_A13696BarNHdr,
            P08LV2_A606MaqDsc, P08LV2_n606MaqDsc, P08LV2_A602MaqCod, P08LV2_A129BarCod, P08LV2_A132BarCodReo, P08LV2_A130BarCodPar, P08LV2_A4440HisProDTI, P08LV2_n4440HisProDTI, P08LV2_A4441HisProDTF, P08LV2_n4441HisProDTF,
            P08LV2_A143BarDisNum, P08LV2_A4812BarEncCli, P08LV2_A218BarTipCol, P08LV2_A461Fase, P08LV2_A396EmprCod, P08LV2_A558HisProFec, P08LV2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV73TFHisProTur ;
   private byte AV74TFHisProTur_To ;
   private byte AV83TFHisProReo ;
   private byte AV84TFHisProReo_To ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur ;
   private byte AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ;
   private byte AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo ;
   private byte AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ;
   private byte AV81HisProReo ;
   private byte A218BarTipCol ;
   private byte GXv_int10[] ;
   private short AV71TFParCod ;
   private short AV72TFParCod_To ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV140Wciformedetalladohdrsproduccionds_35_tfparcod ;
   private short AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to ;
   private short AV82ParCod ;
   private short AV16OrderedBy ;
   private short A217BarTipArt ;
   private short AV75Tiempom ;
   private short GXt_int11 ;
   private short GXv_int3[] ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55TFCliCod ;
   private int AV56TFCliCod_To ;
   private int AV104GXV1 ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV115Wciformedetalladohdrsproduccionds_10_tfclicod ;
   private int AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to ;
   private int A561HisProLin ;
   private int GXv_int12[] ;
   private int AV148GXV2 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV65TFHisProKgr ;
   private java.math.BigDecimal AV66TFHisProKgr_To ;
   private java.math.BigDecimal AV67TFHisProMtr ;
   private java.math.BigDecimal AV68TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr ;
   private java.math.BigDecimal AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ;
   private java.math.BigDecimal AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr ;
   private java.math.BigDecimal AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ;
   private String AV34TFMaqCod_Sel ;
   private String AV33TFMaqCod ;
   private String AV54TFMaqDsc_Sel ;
   private String AV53TFMaqDsc ;
   private String AV36TFBarNHdr_Sel ;
   private String AV35TFBarNHdr ;
   private String AV79TFHisProLot_Sel ;
   private String AV78TFHisProLot ;
   private String AV58TFCliNom_Sel ;
   private String AV57TFCliNom ;
   private String AV96TFPedidoCliente_Sel ;
   private String AV95TFPedidoCliente ;
   private String AV62TFBarSer_Sel ;
   private String AV61TFBarSer ;
   private String AV64TFBarSerDsc_Sel ;
   private String AV63TFBarSerDsc ;
   private String AV92TFBarTipArtDsc_Sel ;
   private String AV91TFBarTipArtDsc ;
   private String AV94TFBarTipColDsc_Sel ;
   private String AV93TFBarTipColDsc ;
   private String AV38TFFase_Sel ;
   private String AV37TFFase ;
   private String AV100TFFaseDescripcion_Sel ;
   private String AV99TFFaseDescripcion ;
   private String AV77TFParCodNom_Sel ;
   private String AV76TFParCodNom ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A13696BarNHdr ;
   private String A3610HisProLot ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A13868BarTipColD ;
   private String A461Fase ;
   private String A13893FaseDescri ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ;
   private String AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ;
   private String AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ;
   private String AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ;
   private String AV117Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel ;
   private String AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente ;
   private String AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ;
   private String AV122Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel ;
   private String AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ;
   private String AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ;
   private String AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ;
   private String AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ;
   private String AV130Wciformedetalladohdrsproduccionds_25_tffase ;
   private String AV131Wciformedetalladohdrsproduccionds_26_tffase_sel ;
   private String AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion ;
   private String AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ;
   private String AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV107Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String lV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String lV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String lV113Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String lV117Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String lV122Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String lV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String lV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String lV130Wciformedetalladohdrsproduccionds_25_tffase ;
   private String lV142Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV45MaqCodInicial ;
   private String AV46MaqCodFinal ;
   private String AV44Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private java.util.Date AV39TFHisProDTI ;
   private java.util.Date AV41TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti ;
   private java.util.Date AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf ;
   private java.util.Date AV47Hisprodti ;
   private java.util.Date AV48Hisprodtf ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV59TFBarFecGen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n13711BarTipArtD ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV80FilterFullText ;
   private String AV106Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String lV106Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08LV2_A217BarTipArt ;
   private boolean[] P08LV2_n217BarTipArt ;
   private byte[] P08LV2_A3612HisProReo ;
   private byte[] P08LV2_A566HisProTur ;
   private String[] P08LV2_A867ParCodNom ;
   private boolean[] P08LV2_n867ParCodNom ;
   private short[] P08LV2_A656ParCod ;
   private boolean[] P08LV2_n656ParCod ;
   private java.math.BigDecimal[] P08LV2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LV2_A1525HisProKgr ;
   private String[] P08LV2_A13711BarTipArtD ;
   private boolean[] P08LV2_n13711BarTipArtD ;
   private String[] P08LV2_A1652BarSerDsc ;
   private String[] P08LV2_A212BarSer ;
   private java.util.Date[] P08LV2_A159BarFecGen ;
   private String[] P08LV2_A279CliNom ;
   private int[] P08LV2_A252CliCod ;
   private boolean[] P08LV2_n252CliCod ;
   private String[] P08LV2_A3610HisProLot ;
   private String[] P08LV2_A13696BarNHdr ;
   private String[] P08LV2_A606MaqDsc ;
   private boolean[] P08LV2_n606MaqDsc ;
   private String[] P08LV2_A602MaqCod ;
   private int[] P08LV2_A129BarCod ;
   private byte[] P08LV2_A132BarCodReo ;
   private String[] P08LV2_A130BarCodPar ;
   private java.util.Date[] P08LV2_A4440HisProDTI ;
   private boolean[] P08LV2_n4440HisProDTI ;
   private java.util.Date[] P08LV2_A4441HisProDTF ;
   private boolean[] P08LV2_n4441HisProDTF ;
   private String[] P08LV2_A143BarDisNum ;
   private String[] P08LV2_A4812BarEncCli ;
   private byte[] P08LV2_A218BarTipCol ;
   private String[] P08LV2_A461Fase ;
   private String[] P08LV2_A396EmprCod ;
   private java.util.Date[] P08LV2_A558HisProFec ;
   private int[] P08LV2_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class wciformedetalladohdrsproduccionexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV115Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV122Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV131Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV130Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV140Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV45MaqCodInicial ,
                                          String AV46MaqCodFinal ,
                                          java.util.Date AV47Hisprodti ,
                                          java.util.Date AV48Hisprodtf ,
                                          byte AV81HisProReo ,
                                          short AV82ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV106Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV120Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV129Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV128Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV133Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV132Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV44Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[42];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T5.TipArtDsc AS BarTipArtD, T3.BarSerDsc, T3.BarSer," ;
      scmdbuf += " T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI, T1.HisProDTF, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol," ;
      scmdbuf += " T1.Fase, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN" ;
      scmdbuf += " TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV115Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV116Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV122Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV126Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV134Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV140Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV141Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV144Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV145Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV146Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV147Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! ( AV81HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( AV82ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ParCodNom" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ParCodNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProReo" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProReo DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08LV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 10);
               ((String[]) buf[19])[0] = rslt.getString(15, 11);
               ((String[]) buf[20])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 6);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((byte[]) buf[24])[0] = rslt.getByte(19);
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
      }
   }

}

