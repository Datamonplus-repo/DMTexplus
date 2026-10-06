package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class reclamacionesynoconformidadeswc_loteexport extends GXProcedure
{
   public reclamacionesynoconformidadeswc_loteexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reclamacionesynoconformidadeswc_loteexport.class ), "" );
   }

   public reclamacionesynoconformidadeswc_loteexport( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             String[] aP6 )
   {
      reclamacionesynoconformidadeswc_loteexport.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      reclamacionesynoconformidadeswc_loteexport.this.AV48Emprcod = aP0;
      reclamacionesynoconformidadeswc_loteexport.this.AV49Clicod = aP1;
      reclamacionesynoconformidadeswc_loteexport.this.AV53Clicod_to = aP2;
      reclamacionesynoconformidadeswc_loteexport.this.AV39HisReoFec = aP3;
      reclamacionesynoconformidadeswc_loteexport.this.AV54HisReoFec_to = aP4;
      reclamacionesynoconformidadeswc_loteexport.this.AV50HisEstReo = aP5;
      reclamacionesynoconformidadeswc_loteexport.this.aP6 = aP6;
      reclamacionesynoconformidadeswc_loteexport.this.aP7 = aP7;
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S171 ();
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
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "ReclamacionesyNoConformidadesWC_loteExport-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".xlsx" ;
      AV57ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV57ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      while ( AV58col <= 16 )
      {
         AV57ExcelDocument.Cells(1, AV58col, 1, 1).setBold( (short)(1) );
         AV57ExcelDocument.Cells(1, AV58col, 1, 1).setColor( 11 );
         AV58col = (short)(AV58col+1) ;
      }
      AV58col = (short)(1) ;
      AV57ExcelDocument.Cells(AV58col, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV57ExcelDocument.Cells(AV58col, 2, 1, 1).setText( httpContext.getMessage( "N OS", "") );
      AV57ExcelDocument.Cells(AV58col, 3, 1, 1).setText( httpContext.getMessage( "Quilos", "") );
      AV57ExcelDocument.Cells(AV58col, 4, 1, 1).setText( httpContext.getMessage( "Custo", "") );
      AV57ExcelDocument.Cells(AV58col, 5, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV57ExcelDocument.Cells(AV58col, 6, 1, 1).setText( httpContext.getMessage( "Artigo", "") );
      AV57ExcelDocument.Cells(AV58col, 7, 1, 1).setText( httpContext.getMessage( "Descriçao", "") );
      AV57ExcelDocument.Cells(AV58col, 8, 1, 1).setText( httpContext.getMessage( "Cor", "") );
      AV57ExcelDocument.Cells(AV58col, 9, 1, 1).setText( httpContext.getMessage( "Cor Cliente", "") );
      AV57ExcelDocument.Cells(AV58col, 10, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV57ExcelDocument.Cells(AV58col, 11, 1, 1).setText( httpContext.getMessage( "Data", "") );
      AV57ExcelDocument.Cells(AV58col, 12, 1, 1).setText( httpContext.getMessage( "Turno", "") );
      AV57ExcelDocument.Cells(AV58col, 13, 1, 1).setText( httpContext.getMessage( "Defeito", "") );
      AV57ExcelDocument.Cells(AV58col, 14, 1, 1).setText( httpContext.getMessage( "Causa", "") );
      AV57ExcelDocument.Cells(AV58col, 15, 1, 1).setText( httpContext.getMessage( "Responsabilidade", "") );
      AV57ExcelDocument.Cells(AV58col, 16, 1, 1).setText( httpContext.getMessage( "Os(s)", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55LastLote = "" ;
      AV56LastHdr = "" ;
      AV31KilosLote = DecimalUtil.doubleToDec(0) ;
      AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
      AV44Hdrs = "" ;
      AV58col = (short)(2) ;
      /* Using cursor P08YT2 */
      pr_default.execute(0, new Object[] {AV48Emprcod, Integer.valueOf(AV49Clicod), Integer.valueOf(AV53Clicod_to), AV39HisReoFec, AV54HisReoFec_to, Byte.valueOf(AV50HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = P08YT2_A833TipDefCod[0] ;
         A5085CodCausa = P08YT2_A5085CodCausa[0] ;
         n5085CodCausa = P08YT2_n5085CodCausa[0] ;
         A7000Rps_Cod = P08YT2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P08YT2_n7000Rps_Cod[0] ;
         A396EmprCod = P08YT2_A396EmprCod[0] ;
         A548HisEstReo = P08YT2_A548HisEstReo[0] ;
         n548HisEstReo = P08YT2_n548HisEstReo[0] ;
         A569HisReoFec = P08YT2_A569HisReoFec[0] ;
         n569HisReoFec = P08YT2_n569HisReoFec[0] ;
         A252CliCod = P08YT2_A252CliCod[0] ;
         n252CliCod = P08YT2_n252CliCod[0] ;
         A279CliNom = P08YT2_A279CliNom[0] ;
         A540HisBarKgm = P08YT2_A540HisBarKgm[0] ;
         n540HisBarKgm = P08YT2_n540HisBarKgm[0] ;
         A13699CostCausa = P08YT2_A13699CostCausa[0] ;
         n13699CostCausa = P08YT2_n13699CostCausa[0] ;
         A542HisBarSer = P08YT2_A542HisBarSer[0] ;
         n542HisBarSer = P08YT2_n542HisBarSer[0] ;
         A2299HisReoDsc = P08YT2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P08YT2_n2299HisReoDsc[0] ;
         A546HisColNom = P08YT2_A546HisColNom[0] ;
         n546HisColNom = P08YT2_n546HisColNom[0] ;
         A8889HisNomCli = P08YT2_A8889HisNomCli[0] ;
         n8889HisNomCli = P08YT2_n8889HisNomCli[0] ;
         A12950HisOpeTur = P08YT2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P08YT2_n12950HisOpeTur[0] ;
         A602MaqCod = P08YT2_A602MaqCod[0] ;
         n602MaqCod = P08YT2_n602MaqCod[0] ;
         A12949HisOpecod = P08YT2_A12949HisOpecod[0] ;
         n12949HisOpecod = P08YT2_n12949HisOpecod[0] ;
         A834TipDefDsc = P08YT2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YT2_n834TipDefDsc[0] ;
         A5086DscCausa = P08YT2_A5086DscCausa[0] ;
         n5086DscCausa = P08YT2_n5086DscCausa[0] ;
         A7001Rps_Dsc = P08YT2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YT2_n7001Rps_Dsc[0] ;
         A544HisCodPar = P08YT2_A544HisCodPar[0] ;
         A545HisCodReo = P08YT2_A545HisCodReo[0] ;
         A539HisBarCod = P08YT2_A539HisBarCod[0] ;
         A13698HisreoLote = P08YT2_A13698HisreoLote[0] ;
         n13698HisreoLote = P08YT2_n13698HisreoLote[0] ;
         A834TipDefDsc = P08YT2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YT2_n834TipDefDsc[0] ;
         A13699CostCausa = P08YT2_A13699CostCausa[0] ;
         n13699CostCausa = P08YT2_n13699CostCausa[0] ;
         A5086DscCausa = P08YT2_A5086DscCausa[0] ;
         n5086DscCausa = P08YT2_n5086DscCausa[0] ;
         A7001Rps_Dsc = P08YT2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YT2_n7001Rps_Dsc[0] ;
         A279CliNom = P08YT2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A13698HisreoLote, AV55LastLote) == 0 ) && ( GXutil.strcmp(AV55LastLote, " ") != 0 ) )
         {
            if ( AV51lastHisBarcod == A539HisBarCod )
            {
               /* Execute user subroutine: 'WRITELINE' */
               S152 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV31KilosLote = DecimalUtil.doubleToDec(0) ;
               AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
               AV44Hdrs = "" ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV55LastLote, " ") != 0 )
            {
               /* Execute user subroutine: 'WRITELINE' */
               S152 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV31KilosLote = DecimalUtil.doubleToDec(0) ;
               AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
               AV44Hdrs = "" ;
            }
         }
         AV30BarNHdr = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV29CliNom = A279CliNom ;
         AV33HisreoLote = A13698HisreoLote ;
         if ( GXutil.strcmp(AV44Hdrs, "") == 0 )
         {
            AV44Hdrs = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         }
         else
         {
            AV44Hdrs += "/" + GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         }
         AV31KilosLote = AV31KilosLote.add(A540HisBarKgm) ;
         AV32Valcostelote = AV32Valcostelote.add((GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2))) ;
         AV34HisBarSer = A542HisBarSer ;
         AV35HisReoDsc = A2299HisReoDsc ;
         AV36HisColNom = A546HisColNom ;
         AV37HisNomCli = A8889HisNomCli ;
         AV40HisOpeTur = A12950HisOpeTur ;
         AV38MaqCod = A602MaqCod ;
         AV39HisReoFec = A569HisReoFec ;
         AV52HisOpecod = A12949HisOpecod ;
         AV41TipDefDsc = A834TipDefDsc ;
         AV42DscCausa = A5086DscCausa ;
         AV43Rps_Dsc = A7001Rps_Dsc ;
         AV55LastLote = A13698HisreoLote ;
         AV56LastHdr = GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV51lastHisBarcod = A539HisBarCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'WRITELINE' */
      S152 ();
      if (returnInSub) return;
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV57ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV57ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV57ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV57ExcelDocument.getErrDescription() ;
         AV57ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S171( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ReclamacionesyNoConformidadesWC_loteGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV28FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV49Clicod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV53Clicod_to = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC") == 0 )
         {
            AV39HisReoFec = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC_TO") == 0 )
         {
            AV54HisReoFec_to = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV50HisEstReo = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'WRITELINE' Routine */
      returnInSub = false ;
      AV57ExcelDocument.Cells(AV58col, 1, 1, 1).setText( AV29CliNom );
      AV57ExcelDocument.Cells(AV58col, 2, 1, 1).setText( AV30BarNHdr );
      AV57ExcelDocument.Cells(AV58col, 3, 1, 1).setText( GXutil.str( AV31KilosLote, 9, 2) );
      AV57ExcelDocument.Cells(AV58col, 4, 1, 1).setText( GXutil.str( AV32Valcostelote, 11, 3) );
      AV57ExcelDocument.Cells(AV58col, 5, 1, 1).setText( AV33HisreoLote );
      AV57ExcelDocument.Cells(AV58col, 6, 1, 1).setText( AV34HisBarSer );
      AV57ExcelDocument.Cells(AV58col, 7, 1, 1).setText( AV35HisReoDsc );
      AV57ExcelDocument.Cells(AV58col, 8, 1, 1).setText( AV36HisColNom );
      AV57ExcelDocument.Cells(AV58col, 9, 1, 1).setText( AV37HisNomCli );
      AV57ExcelDocument.Cells(AV58col, 10, 1, 1).setText( AV38MaqCod );
      AV57ExcelDocument.Cells(AV58col, 11, 1, 1).setText( localUtil.dtoc( AV39HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
      AV57ExcelDocument.Cells(AV58col, 12, 1, 1).setText( GXutil.str( AV40HisOpeTur, 1, 0) );
      AV57ExcelDocument.Cells(AV58col, 13, 1, 1).setText( AV41TipDefDsc );
      AV57ExcelDocument.Cells(AV58col, 14, 1, 1).setText( AV42DscCausa );
      AV57ExcelDocument.Cells(AV58col, 15, 1, 1).setText( AV43Rps_Dsc );
      AV57ExcelDocument.Cells(AV58col, 16, 1, 1).setText( AV44Hdrs );
      AV58col = (short)(AV58col+1) ;
   }

   protected void cleanup( )
   {
      this.aP6[0] = reclamacionesynoconformidadeswc_loteexport.this.AV11Filename;
      this.aP7[0] = reclamacionesynoconformidadeswc_loteexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV57ExcelDocument.cleanup();
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
      AV57ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV55LastLote = "" ;
      AV56LastHdr = "" ;
      AV31KilosLote = DecimalUtil.ZERO ;
      AV32Valcostelote = DecimalUtil.ZERO ;
      AV44Hdrs = "" ;
      scmdbuf = "" ;
      P08YT2_A833TipDefCod = new short[1] ;
      P08YT2_A5085CodCausa = new short[1] ;
      P08YT2_n5085CodCausa = new boolean[] {false} ;
      P08YT2_A7000Rps_Cod = new short[1] ;
      P08YT2_n7000Rps_Cod = new boolean[] {false} ;
      P08YT2_A396EmprCod = new String[] {""} ;
      P08YT2_A548HisEstReo = new byte[1] ;
      P08YT2_n548HisEstReo = new boolean[] {false} ;
      P08YT2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08YT2_n569HisReoFec = new boolean[] {false} ;
      P08YT2_A252CliCod = new int[1] ;
      P08YT2_n252CliCod = new boolean[] {false} ;
      P08YT2_A279CliNom = new String[] {""} ;
      P08YT2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YT2_n540HisBarKgm = new boolean[] {false} ;
      P08YT2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YT2_n13699CostCausa = new boolean[] {false} ;
      P08YT2_A542HisBarSer = new String[] {""} ;
      P08YT2_n542HisBarSer = new boolean[] {false} ;
      P08YT2_A2299HisReoDsc = new String[] {""} ;
      P08YT2_n2299HisReoDsc = new boolean[] {false} ;
      P08YT2_A546HisColNom = new String[] {""} ;
      P08YT2_n546HisColNom = new boolean[] {false} ;
      P08YT2_A8889HisNomCli = new String[] {""} ;
      P08YT2_n8889HisNomCli = new boolean[] {false} ;
      P08YT2_A12950HisOpeTur = new byte[1] ;
      P08YT2_n12950HisOpeTur = new boolean[] {false} ;
      P08YT2_A602MaqCod = new String[] {""} ;
      P08YT2_n602MaqCod = new boolean[] {false} ;
      P08YT2_A12949HisOpecod = new int[1] ;
      P08YT2_n12949HisOpecod = new boolean[] {false} ;
      P08YT2_A834TipDefDsc = new String[] {""} ;
      P08YT2_n834TipDefDsc = new boolean[] {false} ;
      P08YT2_A5086DscCausa = new String[] {""} ;
      P08YT2_n5086DscCausa = new boolean[] {false} ;
      P08YT2_A7001Rps_Dsc = new String[] {""} ;
      P08YT2_n7001Rps_Dsc = new boolean[] {false} ;
      P08YT2_A544HisCodPar = new String[] {""} ;
      P08YT2_A545HisCodReo = new byte[1] ;
      P08YT2_A539HisBarCod = new int[1] ;
      P08YT2_A13698HisreoLote = new String[] {""} ;
      P08YT2_n13698HisreoLote = new boolean[] {false} ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A544HisCodPar = "" ;
      A13698HisreoLote = "" ;
      AV30BarNHdr = "" ;
      AV29CliNom = "" ;
      AV33HisreoLote = "" ;
      AV34HisBarSer = "" ;
      AV35HisReoDsc = "" ;
      AV36HisColNom = "" ;
      AV37HisNomCli = "" ;
      AV38MaqCod = "" ;
      AV41TipDefDsc = "" ;
      AV42DscCausa = "" ;
      AV43Rps_Dsc = "" ;
      AV19Session = httpContext.getWebSession();
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV28FilterFullText = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reclamacionesynoconformidadeswc_loteexport__default(),
         new Object[] {
             new Object[] {
            P08YT2_A833TipDefCod, P08YT2_A5085CodCausa, P08YT2_n5085CodCausa, P08YT2_A7000Rps_Cod, P08YT2_n7000Rps_Cod, P08YT2_A396EmprCod, P08YT2_A548HisEstReo, P08YT2_n548HisEstReo, P08YT2_A569HisReoFec, P08YT2_n569HisReoFec,
            P08YT2_A252CliCod, P08YT2_n252CliCod, P08YT2_A279CliNom, P08YT2_A540HisBarKgm, P08YT2_n540HisBarKgm, P08YT2_A13699CostCausa, P08YT2_n13699CostCausa, P08YT2_A542HisBarSer, P08YT2_n542HisBarSer, P08YT2_A2299HisReoDsc,
            P08YT2_n2299HisReoDsc, P08YT2_A546HisColNom, P08YT2_n546HisColNom, P08YT2_A8889HisNomCli, P08YT2_n8889HisNomCli, P08YT2_A12950HisOpeTur, P08YT2_n12950HisOpeTur, P08YT2_A602MaqCod, P08YT2_n602MaqCod, P08YT2_A12949HisOpecod,
            P08YT2_n12949HisOpecod, P08YT2_A834TipDefDsc, P08YT2_n834TipDefDsc, P08YT2_A5086DscCausa, P08YT2_n5086DscCausa, P08YT2_A7001Rps_Dsc, P08YT2_n7001Rps_Dsc, P08YT2_A544HisCodPar, P08YT2_A545HisCodReo, P08YT2_A539HisBarCod,
            P08YT2_A13698HisreoLote, P08YT2_n13698HisreoLote
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50HisEstReo ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte A545HisCodReo ;
   private byte AV40HisOpeTur ;
   private short AV58col ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV49Clicod ;
   private int AV53Clicod_to ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A12949HisOpecod ;
   private int A539HisBarCod ;
   private int AV51lastHisBarcod ;
   private int AV52HisOpecod ;
   private int AV62GXV1 ;
   private java.math.BigDecimal AV31KilosLote ;
   private java.math.BigDecimal AV32Valcostelote ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A13699CostCausa ;
   private String AV48Emprcod ;
   private String AV55LastLote ;
   private String AV56LastHdr ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A544HisCodPar ;
   private String A13698HisreoLote ;
   private String AV30BarNHdr ;
   private String AV29CliNom ;
   private String AV33HisreoLote ;
   private String AV34HisBarSer ;
   private String AV35HisReoDsc ;
   private String AV36HisColNom ;
   private String AV37HisNomCli ;
   private String AV38MaqCod ;
   private String AV41TipDefDsc ;
   private String AV42DscCausa ;
   private String AV43Rps_Dsc ;
   private java.util.Date AV39HisReoFec ;
   private java.util.Date AV54HisReoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean returnInSub ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n540HisBarKgm ;
   private boolean n13699CostCausa ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n8889HisNomCli ;
   private boolean n12950HisOpeTur ;
   private boolean n602MaqCod ;
   private boolean n12949HisOpecod ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean n13698HisreoLote ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV44Hdrs ;
   private String AV28FilterFullText ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P08YT2_A833TipDefCod ;
   private short[] P08YT2_A5085CodCausa ;
   private boolean[] P08YT2_n5085CodCausa ;
   private short[] P08YT2_A7000Rps_Cod ;
   private boolean[] P08YT2_n7000Rps_Cod ;
   private String[] P08YT2_A396EmprCod ;
   private byte[] P08YT2_A548HisEstReo ;
   private boolean[] P08YT2_n548HisEstReo ;
   private java.util.Date[] P08YT2_A569HisReoFec ;
   private boolean[] P08YT2_n569HisReoFec ;
   private int[] P08YT2_A252CliCod ;
   private boolean[] P08YT2_n252CliCod ;
   private String[] P08YT2_A279CliNom ;
   private java.math.BigDecimal[] P08YT2_A540HisBarKgm ;
   private boolean[] P08YT2_n540HisBarKgm ;
   private java.math.BigDecimal[] P08YT2_A13699CostCausa ;
   private boolean[] P08YT2_n13699CostCausa ;
   private String[] P08YT2_A542HisBarSer ;
   private boolean[] P08YT2_n542HisBarSer ;
   private String[] P08YT2_A2299HisReoDsc ;
   private boolean[] P08YT2_n2299HisReoDsc ;
   private String[] P08YT2_A546HisColNom ;
   private boolean[] P08YT2_n546HisColNom ;
   private String[] P08YT2_A8889HisNomCli ;
   private boolean[] P08YT2_n8889HisNomCli ;
   private byte[] P08YT2_A12950HisOpeTur ;
   private boolean[] P08YT2_n12950HisOpeTur ;
   private String[] P08YT2_A602MaqCod ;
   private boolean[] P08YT2_n602MaqCod ;
   private int[] P08YT2_A12949HisOpecod ;
   private boolean[] P08YT2_n12949HisOpecod ;
   private String[] P08YT2_A834TipDefDsc ;
   private boolean[] P08YT2_n834TipDefDsc ;
   private String[] P08YT2_A5086DscCausa ;
   private boolean[] P08YT2_n5086DscCausa ;
   private String[] P08YT2_A7001Rps_Dsc ;
   private boolean[] P08YT2_n7001Rps_Dsc ;
   private String[] P08YT2_A544HisCodPar ;
   private byte[] P08YT2_A545HisCodReo ;
   private int[] P08YT2_A539HisBarCod ;
   private String[] P08YT2_A13698HisreoLote ;
   private boolean[] P08YT2_n13698HisreoLote ;
   private com.genexus.gxoffice.ExcelDoc AV57ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class reclamacionesynoconformidadeswc_loteexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YT2", "SELECT T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.EmprCod, T1.HisEstReo, T1.HisReoFec, T1.CliCod, T5.CliNom, T1.HisBarKgm, T3.CostCausa, T1.HisBarSer, T1.HisReoDsc, T1.HisColNom, T1.HisNomCli, T1.HisOpeTur, T1.MaqCod, T1.HisOpecod, T2.TipDefDsc, T3.DscCausa, T4.Rps_Dsc, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisreoLote FROM ((((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T4 ON T4.EmprCod = T1.EmprCod AND T4.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) ORDER BY T1.EmprCod, T1.HisreoLote, T1.HisBarCod DESC, T1.HisCodReo DESC, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 60);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((String[]) buf[40])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

