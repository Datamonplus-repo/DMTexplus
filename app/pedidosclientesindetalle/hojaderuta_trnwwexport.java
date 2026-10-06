package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta_trnwwexport extends GXProcedure
{
   public hojaderuta_trnwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_trnwwexport.class ), "" );
   }

   public hojaderuta_trnwwexport( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             byte aP6 ,
                             byte aP7 ,
                             String[] aP8 )
   {
      hojaderuta_trnwwexport.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        byte aP6 ,
                        byte aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             byte aP6 ,
                             byte aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      hojaderuta_trnwwexport.this.AV93Emprcod = aP0;
      hojaderuta_trnwwexport.this.AV86BarCodIN = aP1;
      hojaderuta_trnwwexport.this.AV87BarCodreoIN = aP2;
      hojaderuta_trnwwexport.this.AV88BarCodparIN = aP3;
      hojaderuta_trnwwexport.this.AV89BarFecGenfrom = aP4;
      hojaderuta_trnwwexport.this.AV90BarFecGento = aP5;
      hojaderuta_trnwwexport.this.AV91BarSitfrom = aP6;
      hojaderuta_trnwwexport.this.AV92BarSitto = aP7;
      hojaderuta_trnwwexport.this.aP8 = aP8;
      hojaderuta_trnwwexport.this.aP9 = aP9;
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
      AV11Filename = "./PrivateTempStorage/" + "HojadeRuta_TRNWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV17FilterFullText, GXv_char5) ;
      hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV45TFCliCod) && (0==AV46TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCliNom_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFCliNom, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPedidoCliente_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPedidoCliente_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPedidoCliente)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPedidoCliente, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFBarTipDis_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFBarTipDis_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFBarTipDis)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFBarTipDis, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarSer_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarSer, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarSerDsc_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarSerDsc, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarColNom_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFBarColNom, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFBarColNum) && (0==AV56TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV68TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFBarNomCli_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFBarNomCli, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV69TFBarNumCli) && (0==AV70TFBarNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFBarNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFBarNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFBarMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFBarMaqCod_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFBarMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFBarMaqCod, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV73TFBarPie) && (0==AV74TFBarPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pzas.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFBarPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFBarPie_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "KIlos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75TFBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFBarMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFBarMtr_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV80TFBarAcaQui_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFBarAcaQui_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFBarAcaQui)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFBarAcaQui, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFBarAgrEst_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFBarAgrEst_Sel, GXv_char5) ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFBarAgrEst)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFBarAgrEst, GXv_char5) ;
            hojaderuta_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV96TFBarHayAlb_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         hojaderuta_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV96TFBarHayAlb_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV96TFBarHayAlb_Sel == 2 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV99GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV45TFCliCod) ,
                                           Integer.valueOf(AV46TFCliCod_To) ,
                                           AV48TFCliNom_Sel ,
                                           AV47TFCliNom ,
                                           AV66TFBarTipDis_Sel ,
                                           AV65TFBarTipDis ,
                                           AV50TFBarSer_Sel ,
                                           AV49TFBarSer ,
                                           AV52TFBarSerDsc_Sel ,
                                           AV51TFBarSerDsc ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV68TFBarNomCli_Sel ,
                                           AV67TFBarNomCli ,
                                           Integer.valueOf(AV69TFBarNumCli) ,
                                           Integer.valueOf(AV70TFBarNumCli_To) ,
                                           AV72TFBarMaqCod_Sel ,
                                           AV71TFBarMaqCod ,
                                           AV75TFBarKgm ,
                                           AV76TFBarKgm_To ,
                                           AV77TFBarMtr ,
                                           AV78TFBarMtr_To ,
                                           AV80TFBarAcaQui_Sel ,
                                           AV79TFBarAcaQui ,
                                           AV85TFBarAgrEst_Sel ,
                                           AV84TFBarAgrEst ,
                                           AV89BarFecGenfrom ,
                                           AV90BarFecGento ,
                                           Byte.valueOf(AV91BarSitfrom) ,
                                           Byte.valueOf(AV92BarSitto) ,
                                           Integer.valueOf(AV86BarCodIN) ,
                                           Byte.valueOf(AV87BarCodreoIN) ,
                                           AV88BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV17FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV42TFPedidoCliente_Sel ,
                                           AV41TFPedidoCliente ,
                                           Integer.valueOf(AV73TFBarPie) ,
                                           Integer.valueOf(AV74TFBarPie_To) ,
                                           Byte.valueOf(AV96TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV47TFCliNom = GXutil.padr( GXutil.rtrim( AV47TFCliNom), 30, "%") ;
      lV65TFBarTipDis = GXutil.padr( GXutil.rtrim( AV65TFBarTipDis), 1, "%") ;
      lV49TFBarSer = GXutil.padr( GXutil.rtrim( AV49TFBarSer), 16, "%") ;
      lV51TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV51TFBarSerDsc), 26, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV67TFBarNomCli = GXutil.padr( GXutil.rtrim( AV67TFBarNomCli), 13, "%") ;
      lV71TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV71TFBarMaqCod), 6, "%") ;
      lV79TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV79TFBarAcaQui), 6, "%") ;
      lV84TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV84TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KF3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV45TFCliCod), Integer.valueOf(AV46TFCliCod_To), lV47TFCliNom, AV48TFCliNom_Sel, lV65TFBarTipDis, AV66TFBarTipDis_Sel, lV49TFBarSer, AV50TFBarSer_Sel, lV51TFBarSerDsc, AV52TFBarSerDsc_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV67TFBarNomCli, AV68TFBarNomCli_Sel, Integer.valueOf(AV69TFBarNumCli), Integer.valueOf(AV70TFBarNumCli_To), lV71TFBarMaqCod, AV72TFBarMaqCod_Sel, AV75TFBarKgm, AV76TFBarKgm_To, AV77TFBarMtr, AV78TFBarMtr_To, lV79TFBarAcaQui, AV80TFBarAcaQui_Sel, lV84TFBarAgrEst, AV85TFBarAgrEst_Sel, AV89BarFecGenfrom, AV90BarFecGento, Byte.valueOf(AV91BarSitfrom), Byte.valueOf(AV92BarSitto), Integer.valueOf(AV86BarCodIN), Byte.valueOf(AV87BarCodreoIN), AV88BarCodparIN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P09KF3_A159BarFecGen[0] ;
         A120BarAgrEst = P09KF3_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KF3_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KF3_A180BarMaqCod[0] ;
         A213BarSit = P09KF3_A213BarSit[0] ;
         A1235BarNumCli = P09KF3_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KF3_A1234BarNomCli[0] ;
         A136BarColNum = P09KF3_A136BarColNum[0] ;
         A135BarColNom = P09KF3_A135BarColNom[0] ;
         A1652BarSerDsc = P09KF3_A1652BarSerDsc[0] ;
         A212BarSer = P09KF3_A212BarSer[0] ;
         A2010BarTipDis = P09KF3_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KF3_A13696BarNHdr[0] ;
         A279CliNom = P09KF3_A279CliNom[0] ;
         A252CliCod = P09KF3_A252CliCod[0] ;
         n252CliCod = P09KF3_n252CliCod[0] ;
         A184BarMtr = P09KF3_A184BarMtr[0] ;
         A166BarKgm = P09KF3_A166BarKgm[0] ;
         A143BarDisNum = P09KF3_A143BarDisNum[0] ;
         A4812BarEncCli = P09KF3_A4812BarEncCli[0] ;
         A199BarPie1 = P09KF3_A199BarPie1[0] ;
         A365DisDes = P09KF3_A365DisDes[0] ;
         A898BarPieNDes = P09KF3_A898BarPieNDes[0] ;
         A130BarCodPar = P09KF3_A130BarCodPar[0] ;
         A132BarCodReo = P09KF3_A132BarCodReo[0] ;
         A129BarCod = P09KF3_A129BarCod[0] ;
         A396EmprCod = P09KF3_A396EmprCod[0] ;
         A279CliNom = P09KF3_A279CliNom[0] ;
         A184BarMtr = P09KF3_A184BarMtr[0] ;
         A166BarKgm = P09KF3_A166BarKgm[0] ;
         A199BarPie1 = P09KF3_A199BarPie1[0] ;
         A898BarPieNDes = P09KF3_A898BarPieNDes[0] ;
         GXt_char4 = A13878PedidoClie ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char6[0] = A4812BarEncCli ;
         GXv_char7[0] = A143BarDisNum ;
         GXv_char8[0] = GXt_char4 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_char7, GXv_char8) ;
         hojaderuta_trnwwexport.this.A396EmprCod = GXv_char5[0] ;
         hojaderuta_trnwwexport.this.A4812BarEncCli = GXv_char6[0] ;
         hojaderuta_trnwwexport.this.A143BarDisNum = GXv_char7[0] ;
         hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
         A13878PedidoClie = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV42TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV41TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV42TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV42TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int9 = A14502BarHayAlb ;
               GXv_int10[0] = GXt_int9 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
               hojaderuta_trnwwexport.this.GXt_int9 = GXv_int10[0] ;
               A14502BarHayAlb = GXt_int9 ;
               if ( ( AV96TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV96TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV17FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV17FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV17FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV73TFBarPie) || ( ( A198BarPie >= AV73TFBarPie ) ) )
                        {
                           if ( (0==AV74TFBarPie_To) || ( ( A198BarPie <= AV74TFBarPie_To ) ) )
                           {
                              AV13CellRow = (int)(AV13CellRow+1) ;
                              /* Execute user subroutine: 'BEFOREWRITELINE' */
                              S172 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 returnInSub = true;
                                 if (true) return;
                              }
                              AV30VisibleColumnCount = 0 ;
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13878PedidoClie, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2010BarTipDis, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_dtime11 = GXutil.resetTime( A159BarFecGen );
                                 AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime11 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1235BarNumCli );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A180BarMaqCod, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A198BarPie );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A118BarAcaQui, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char8[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A120BarAgrEst, GXv_char8) ;
                                 hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A14502BarHayAlb );
                                 AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                              }
                              /* Execute user subroutine: 'AFTERWRITELINE' */
                              S182 ();
                              if ( returnInSub )
                              {
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
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliNom", "", "Nombre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNHdr", "", "N° Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTipDis", "", "Tipo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSer", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSerDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNomCli", "", "Color Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNumCli", "", "Numero ", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSit", "", "St", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarMaqCod", "", "Maquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarPie", "", "Pzas.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarKgm", "", "KIlos", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarMtr", "", "Metros", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarAcaQui", "", "Acs", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarAgrEst", "", "A?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarHayAlb", "", "Albaran?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char8[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector", GXv_char8) ;
      hojaderuta_trnwwexport.this.GXt_char4 = GXv_char8[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      AV38OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV16OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV101GXV2 = 1 ;
      while ( AV101GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV17FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV45TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV41TFPedidoCliente = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV42TFPedidoCliente_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS") == 0 )
         {
            AV65TFBarTipDis = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS_SEL") == 0 )
         {
            AV66TFBarTipDis_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV49TFBarSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV50TFBarSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV51TFBarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV52TFBarSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV53TFBarColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV54TFBarColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV55TFBarColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFBarColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV67TFBarNomCli = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV68TFBarNomCli_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV69TFBarNumCli = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFBarNumCli_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV71TFBarMaqCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV72TFBarMaqCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV73TFBarPie = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFBarPie_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV75TFBarKgm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFBarKgm_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV77TFBarMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV78TFBarMtr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV79TFBarAcaQui = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV80TFBarAcaQui_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV84TFBarAgrEst = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV85TFBarAgrEst_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARHAYALB_SEL") == 0 )
         {
            AV96TFBarHayAlb_Sel = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV101GXV2 = (int)(AV101GXV2+1) ;
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
      this.aP8[0] = hojaderuta_trnwwexport.this.AV11Filename;
      this.aP9[0] = hojaderuta_trnwwexport.this.AV12ErrorMessage;
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
      AV17FilterFullText = "" ;
      AV48TFCliNom_Sel = "" ;
      AV47TFCliNom = "" ;
      AV42TFPedidoCliente_Sel = "" ;
      AV41TFPedidoCliente = "" ;
      AV66TFBarTipDis_Sel = "" ;
      AV65TFBarTipDis = "" ;
      AV50TFBarSer_Sel = "" ;
      AV49TFBarSer = "" ;
      AV52TFBarSerDsc_Sel = "" ;
      AV51TFBarSerDsc = "" ;
      AV54TFBarColNom_Sel = "" ;
      AV53TFBarColNom = "" ;
      AV68TFBarNomCli_Sel = "" ;
      AV67TFBarNomCli = "" ;
      AV72TFBarMaqCod_Sel = "" ;
      AV71TFBarMaqCod = "" ;
      AV75TFBarKgm = DecimalUtil.ZERO ;
      AV76TFBarKgm_To = DecimalUtil.ZERO ;
      AV77TFBarMtr = DecimalUtil.ZERO ;
      AV78TFBarMtr_To = DecimalUtil.ZERO ;
      AV80TFBarAcaQui_Sel = "" ;
      AV79TFBarAcaQui = "" ;
      AV85TFBarAgrEst_Sel = "" ;
      AV84TFBarAgrEst = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      lV17FilterFullText = "" ;
      scmdbuf = "" ;
      lV47TFCliNom = "" ;
      lV65TFBarTipDis = "" ;
      lV49TFBarSer = "" ;
      lV51TFBarSerDsc = "" ;
      lV53TFBarColNom = "" ;
      lV67TFBarNomCli = "" ;
      lV71TFBarMaqCod = "" ;
      lV79TFBarAcaQui = "" ;
      lV84TFBarAgrEst = "" ;
      A279CliNom = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A120BarAgrEst = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      P09KF3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KF3_A120BarAgrEst = new String[] {""} ;
      P09KF3_A118BarAcaQui = new String[] {""} ;
      P09KF3_A180BarMaqCod = new String[] {""} ;
      P09KF3_A213BarSit = new byte[1] ;
      P09KF3_A1235BarNumCli = new int[1] ;
      P09KF3_A1234BarNomCli = new String[] {""} ;
      P09KF3_A136BarColNum = new int[1] ;
      P09KF3_A135BarColNom = new String[] {""} ;
      P09KF3_A1652BarSerDsc = new String[] {""} ;
      P09KF3_A212BarSer = new String[] {""} ;
      P09KF3_A2010BarTipDis = new String[] {""} ;
      P09KF3_A13696BarNHdr = new String[] {""} ;
      P09KF3_A279CliNom = new String[] {""} ;
      P09KF3_A252CliCod = new int[1] ;
      P09KF3_n252CliCod = new boolean[] {false} ;
      P09KF3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KF3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KF3_A143BarDisNum = new String[] {""} ;
      P09KF3_A4812BarEncCli = new String[] {""} ;
      P09KF3_A199BarPie1 = new short[1] ;
      P09KF3_A365DisDes = new String[] {""} ;
      P09KF3_A898BarPieNDes = new int[1] ;
      P09KF3_A130BarCodPar = new String[] {""} ;
      P09KF3_A132BarCodReo = new byte[1] ;
      P09KF3_A129BarCod = new int[1] ;
      P09KF3_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int10 = new byte[1] ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char8 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnwwexport__default(),
         new Object[] {
             new Object[] {
            P09KF3_A159BarFecGen, P09KF3_A120BarAgrEst, P09KF3_A118BarAcaQui, P09KF3_A180BarMaqCod, P09KF3_A213BarSit, P09KF3_A1235BarNumCli, P09KF3_A1234BarNomCli, P09KF3_A136BarColNum, P09KF3_A135BarColNom, P09KF3_A1652BarSerDsc,
            P09KF3_A212BarSer, P09KF3_A2010BarTipDis, P09KF3_A13696BarNHdr, P09KF3_A279CliNom, P09KF3_A252CliCod, P09KF3_n252CliCod, P09KF3_A184BarMtr, P09KF3_A166BarKgm, P09KF3_A143BarDisNum, P09KF3_A4812BarEncCli,
            P09KF3_A199BarPie1, P09KF3_A365DisDes, P09KF3_A898BarPieNDes, P09KF3_A130BarCodPar, P09KF3_A132BarCodReo, P09KF3_A129BarCod, P09KF3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV87BarCodreoIN ;
   private byte AV91BarSitfrom ;
   private byte AV92BarSitto ;
   private byte AV96TFBarHayAlb_Sel ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A14502BarHayAlb ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private short GXv_int3[] ;
   private short AV38OrderedBy ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV86BarCodIN ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45TFCliCod ;
   private int AV46TFCliCod_To ;
   private int AV55TFBarColNum ;
   private int AV56TFBarColNum_To ;
   private int AV69TFBarNumCli ;
   private int AV70TFBarNumCli_To ;
   private int AV73TFBarPie ;
   private int AV74TFBarPie_To ;
   private int AV99GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A898BarPieNDes ;
   private int AV101GXV2 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV75TFBarKgm ;
   private java.math.BigDecimal AV76TFBarKgm_To ;
   private java.math.BigDecimal AV77TFBarMtr ;
   private java.math.BigDecimal AV78TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV93Emprcod ;
   private String AV88BarCodparIN ;
   private String AV48TFCliNom_Sel ;
   private String AV47TFCliNom ;
   private String AV42TFPedidoCliente_Sel ;
   private String AV41TFPedidoCliente ;
   private String AV66TFBarTipDis_Sel ;
   private String AV65TFBarTipDis ;
   private String AV50TFBarSer_Sel ;
   private String AV49TFBarSer ;
   private String AV52TFBarSerDsc_Sel ;
   private String AV51TFBarSerDsc ;
   private String AV54TFBarColNom_Sel ;
   private String AV53TFBarColNom ;
   private String AV68TFBarNomCli_Sel ;
   private String AV67TFBarNomCli ;
   private String AV72TFBarMaqCod_Sel ;
   private String AV71TFBarMaqCod ;
   private String AV80TFBarAcaQui_Sel ;
   private String AV79TFBarAcaQui ;
   private String AV85TFBarAgrEst_Sel ;
   private String AV84TFBarAgrEst ;
   private String scmdbuf ;
   private String lV47TFCliNom ;
   private String lV65TFBarTipDis ;
   private String lV49TFBarSer ;
   private String lV51TFBarSerDsc ;
   private String lV53TFBarColNom ;
   private String lV67TFBarNomCli ;
   private String lV71TFBarMaqCod ;
   private String lV79TFBarAcaQui ;
   private String lV84TFBarAgrEst ;
   private String A279CliNom ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A118BarAcaQui ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXt_char4 ;
   private String GXv_char8[] ;
   private java.util.Date GXt_dtime11 ;
   private java.util.Date AV89BarFecGenfrom ;
   private java.util.Date AV90BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean AV16OrderedDsc ;
   private boolean n252CliCod ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV17FilterFullText ;
   private String lV17FilterFullText ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09KF3_A159BarFecGen ;
   private String[] P09KF3_A120BarAgrEst ;
   private String[] P09KF3_A118BarAcaQui ;
   private String[] P09KF3_A180BarMaqCod ;
   private byte[] P09KF3_A213BarSit ;
   private int[] P09KF3_A1235BarNumCli ;
   private String[] P09KF3_A1234BarNomCli ;
   private int[] P09KF3_A136BarColNum ;
   private String[] P09KF3_A135BarColNom ;
   private String[] P09KF3_A1652BarSerDsc ;
   private String[] P09KF3_A212BarSer ;
   private String[] P09KF3_A2010BarTipDis ;
   private String[] P09KF3_A13696BarNHdr ;
   private String[] P09KF3_A279CliNom ;
   private int[] P09KF3_A252CliCod ;
   private boolean[] P09KF3_n252CliCod ;
   private java.math.BigDecimal[] P09KF3_A184BarMtr ;
   private java.math.BigDecimal[] P09KF3_A166BarKgm ;
   private String[] P09KF3_A143BarDisNum ;
   private String[] P09KF3_A4812BarEncCli ;
   private short[] P09KF3_A199BarPie1 ;
   private String[] P09KF3_A365DisDes ;
   private int[] P09KF3_A898BarPieNDes ;
   private String[] P09KF3_A130BarCodPar ;
   private byte[] P09KF3_A132BarCodReo ;
   private int[] P09KF3_A129BarCod ;
   private String[] P09KF3_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class hojaderuta_trnwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09KF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV45TFCliCod ,
                                          int AV46TFCliCod_To ,
                                          String AV48TFCliNom_Sel ,
                                          String AV47TFCliNom ,
                                          String AV66TFBarTipDis_Sel ,
                                          String AV65TFBarTipDis ,
                                          String AV50TFBarSer_Sel ,
                                          String AV49TFBarSer ,
                                          String AV52TFBarSerDsc_Sel ,
                                          String AV51TFBarSerDsc ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV68TFBarNomCli_Sel ,
                                          String AV67TFBarNomCli ,
                                          int AV69TFBarNumCli ,
                                          int AV70TFBarNumCli_To ,
                                          String AV72TFBarMaqCod_Sel ,
                                          String AV71TFBarMaqCod ,
                                          java.math.BigDecimal AV75TFBarKgm ,
                                          java.math.BigDecimal AV76TFBarKgm_To ,
                                          java.math.BigDecimal AV77TFBarMtr ,
                                          java.math.BigDecimal AV78TFBarMtr_To ,
                                          String AV80TFBarAcaQui_Sel ,
                                          String AV79TFBarAcaQui ,
                                          String AV85TFBarAgrEst_Sel ,
                                          String AV84TFBarAgrEst ,
                                          java.util.Date AV89BarFecGenfrom ,
                                          java.util.Date AV90BarFecGento ,
                                          byte AV91BarSitfrom ,
                                          byte AV92BarSitto ,
                                          int AV86BarCodIN ,
                                          byte AV87BarCodreoIN ,
                                          String AV88BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV38OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV17FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV42TFPedidoCliente_Sel ,
                                          String AV41TFPedidoCliente ,
                                          int AV73TFBarPie ,
                                          int AV74TFBarPie_To ,
                                          byte AV96TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[35];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV45TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV46TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV67TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV70TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV71TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV79TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV84TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV91BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV92BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV86BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV87BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV38OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P09KF3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Boolean) dynConstraints[55]).booleanValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

