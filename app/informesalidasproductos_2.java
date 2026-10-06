package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informesalidasproductos_2 extends GXProcedure
{
   public informesalidasproductos_2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informesalidasproductos_2.class ), "" );
   }

   public informesalidasproductos_2( int remoteHandle ,
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
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 )
   {
      informesalidasproductos_2.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      informesalidasproductos_2.this.AV32Emprcod = aP0;
      informesalidasproductos_2.this.AV58PrvNumfrom = aP1;
      informesalidasproductos_2.this.AV48PrvNum_to = aP2;
      informesalidasproductos_2.this.AV49CCStkFecfrom = aP3;
      informesalidasproductos_2.this.AV50CCStkFecto = aP4;
      informesalidasproductos_2.this.AV59PrdNumfrom = aP5;
      informesalidasproductos_2.this.AV46PrdNum_to = aP6;
      informesalidasproductos_2.this.AV44Producto = aP7;
      informesalidasproductos_2.this.aP8 = aP8;
      informesalidasproductos_2.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S171 ();
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
      AV76ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV76ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV76ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV76ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV76ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV76ProgressIndicator.show();
      AV72CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P09V32 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV58PrvNumfrom), Integer.valueOf(AV48PrvNum_to), AV59PrdNumfrom, AV46PrdNum_to, AV49CCStkFecfrom, AV50CCStkFecto});
      cV72CantidadRegistrosAProcesar = P09V32_AV72CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV72CantidadRegistrosAProcesar = (short)(AV72CantidadRegistrosAProcesar+cV72CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV72CantidadRegistrosAProcesar == 0 )
      {
         AV72CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV10CellRow = 2 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10CellRow = 1 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV12ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Proveedor", "") );
      AV12ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV12ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV12ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV12ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Volumen", "") );
      AV12ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Unidad", "") );
      AV12ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Precio", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60LastProv = 0 ;
      AV61lastProd = " " ;
      AV73CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor P09V33 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV58PrvNumfrom), Integer.valueOf(AV48PrvNum_to), AV59PrdNumfrom, AV46PrdNum_to, AV49CCStkFecfrom, AV50CCStkFecto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4495HreNumCie = P09V33_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09V33_A4545HreLinMaq[0] ;
         A4563HrePrdCant = P09V33_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09V33_n4563HrePrdCant[0] ;
         A12453HreFecAct = P09V33_A12453HreFecAct[0] ;
         n12453HreFecAct = P09V33_n12453HreFecAct[0] ;
         A4558HrePrdNum = P09V33_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09V33_n4558HrePrdNum[0] ;
         A11707HreProv = P09V33_A11707HreProv[0] ;
         n11707HreProv = P09V33_n11707HreProv[0] ;
         A4565HreCanAny = P09V33_A4565HreCanAny[0] ;
         n4565HreCanAny = P09V33_n4565HreCanAny[0] ;
         A4542HreTotKgm = P09V33_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P09V33_n4542HreTotKgm[0] ;
         A4547HreVolPrd = P09V33_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09V33_n4547HreVolPrd[0] ;
         A4559HrePrdDsc = P09V33_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09V33_n4559HrePrdDsc[0] ;
         A4967HrePrePrd = P09V33_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09V33_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P09V33_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09V33_n4561HrePrdUDs[0] ;
         A4494HreBarPar = P09V33_A4494HreBarPar[0] ;
         A4493HreBarReo = P09V33_A4493HreBarReo[0] ;
         A4492HreBarCod = P09V33_A4492HreBarCod[0] ;
         A396EmprCod = P09V33_A396EmprCod[0] ;
         A4550HreLinPro = P09V33_A4550HreLinPro[0] ;
         A4557HreRecLin = P09V33_A4557HreRecLin[0] ;
         A4542HreTotKgm = P09V33_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P09V33_n4542HreTotKgm[0] ;
         A4547HreVolPrd = P09V33_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09V33_n4547HreVolPrd[0] ;
         if ( ( AV60LastProv != A11707HreProv ) && ( AV60LastProv > 0 ) )
         {
            /* Execute user subroutine: 'CAMBIOPRODUCTO' */
            S133 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'CAMBIOPROVEEDOR' */
            S143 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            AV61lastProd = " " ;
            AV53TotCant = DecimalUtil.doubleToDec(0) ;
            AV56TotPrd = DecimalUtil.doubleToDec(0) ;
            AV67TotKg = DecimalUtil.doubleToDec(0) ;
            AV66TotVol = 0 ;
            AV68Totkgp = DecimalUtil.doubleToDec(0) ;
            AV71Totvolg = 0 ;
         }
         if ( ( GXutil.strcmp(AV61lastProd, A4558HrePrdNum) != 0 ) && ( GXutil.strcmp(AV61lastProd, " ") != 0 ) )
         {
            /* Execute user subroutine: 'CAMBIOPRODUCTO' */
            S133 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            AV56TotPrd = DecimalUtil.doubleToDec(0) ;
            AV67TotKg = DecimalUtil.doubleToDec(0) ;
            AV66TotVol = 0 ;
         }
         AV56TotPrd = AV56TotPrd.add(((A4563HrePrdCant.add(A4565HreCanAny)))) ;
         AV67TotKg = AV67TotKg.add(A4542HreTotKgm) ;
         AV66TotVol = (int)(AV66TotVol+A4547HreVolPrd) ;
         AV60LastProv = A11707HreProv ;
         AV61lastProd = A4558HrePrdNum ;
         AV63lastDsc = A4559HrePrdDsc ;
         AV64LastPrecio = A4967HrePrePrd ;
         AV65LasUnd = A4561HrePrdUDs ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A11707HreProv ;
         GXv_char3[0] = AV75PrvNom_ ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
         informesalidasproductos_2.this.A396EmprCod = GXv_char1[0] ;
         informesalidasproductos_2.this.A11707HreProv = GXv_int2[0] ;
         informesalidasproductos_2.this.AV75PrvNom_ = GXv_char3[0] ;
         AV73CantidadRegistrosProcesados = (short)(AV73CantidadRegistrosProcesados+1) ;
         AV80Porcentaje = (short)((AV73CantidadRegistrosProcesados/ (double) (AV72CantidadRegistrosAProcesar))*100) ;
         AV76ProgressIndicator.setgxTv_SdtProgress_Value( AV80Porcentaje );
         AV76ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV73CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV72CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A11707HreProv, 6, 0)), GXutil.trim( AV75PrvNom_), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV56TotPrd.doubleValue() > 0 )
      {
         /* Execute user subroutine: 'CAMBIOPRODUCTO' */
         S133 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'CAMBIOPROVEEDOR' */
         S143 ();
         if (returnInSub) return;
      }
      if ( AV57TotG.doubleValue() > 0 )
      {
         AV10CellRow = (int)(AV10CellRow+1) ;
         AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TotG)) );
         AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70Totkgg)) );
         AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( AV71Totvolg );
      }
      AV76ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV76ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV76ProgressIndicator.hide();
   }

   public void S143( )
   {
      /* 'CAMBIOPROVEEDOR' Routine */
      returnInSub = false ;
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TotCant)) );
      AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68Totkgp)) );
      AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( AV69Totvolp );
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV53TotCant = DecimalUtil.doubleToDec(0) ;
   }

   public void S133( )
   {
      /* 'CAMBIOPRODUCTO' Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int2[0] = AV60LastProv ;
      GXv_char1[0] = AV54PrvNom ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
      informesalidasproductos_2.this.A396EmprCod = GXv_char3[0] ;
      informesalidasproductos_2.this.AV60LastProv = GXv_int2[0] ;
      informesalidasproductos_2.this.AV54PrvNom = GXv_char1[0] ;
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setNumber( AV60LastProv );
      AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( AV54PrvNom );
      AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setText( AV61lastProd );
      AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setText( AV63lastDsc );
      AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TotPrd)) );
      AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TotKg)) );
      AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( AV66TotVol );
      AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setText( AV65LasUnd );
      AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64LastPrecio)) );
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV53TotCant = AV53TotCant.add(AV56TotPrd) ;
      AV57TotG = AV57TotG.add(AV56TotPrd) ;
      AV68Totkgp = AV68Totkgp.add(AV67TotKg) ;
      AV70Totkgg = AV70Totkgg.add(AV67TotKg) ;
      AV69Totvolp = (int)(AV69Totvolp+AV66TotVol) ;
      AV71Totvolg = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV71Totvolg).add(AV67TotKg))) ;
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S171( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV13Filename = "InformeSalidasProductosOpcion_2_Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if (returnInSub) return;
      AV12ExcelDocument.Clear();
   }

   public void S161( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV12ExcelDocument.getErrCode() != 0 )
      {
         AV13Filename = "" ;
         AV11ErrorMessage = AV12ExcelDocument.getErrDescription() ;
         AV12ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = informesalidasproductos_2.this.AV13Filename;
      this.aP9[0] = informesalidasproductos_2.this.AV11ErrorMessage;
      CloseOpenCursors();
      AV12ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Filename = "" ;
      AV11ErrorMessage = "" ;
      AV76ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P09V32_AV72CantidadRegistrosAProcesar = new short[1] ;
      AV12ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV61lastProd = "" ;
      P09V33_A4495HreNumCie = new byte[1] ;
      P09V33_A4545HreLinMaq = new short[1] ;
      P09V33_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V33_n4563HrePrdCant = new boolean[] {false} ;
      P09V33_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P09V33_n12453HreFecAct = new boolean[] {false} ;
      P09V33_A4558HrePrdNum = new String[] {""} ;
      P09V33_n4558HrePrdNum = new boolean[] {false} ;
      P09V33_A11707HreProv = new int[1] ;
      P09V33_n11707HreProv = new boolean[] {false} ;
      P09V33_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V33_n4565HreCanAny = new boolean[] {false} ;
      P09V33_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V33_n4542HreTotKgm = new boolean[] {false} ;
      P09V33_A4547HreVolPrd = new int[1] ;
      P09V33_n4547HreVolPrd = new boolean[] {false} ;
      P09V33_A4559HrePrdDsc = new String[] {""} ;
      P09V33_n4559HrePrdDsc = new boolean[] {false} ;
      P09V33_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V33_n4967HrePrePrd = new boolean[] {false} ;
      P09V33_A4561HrePrdUDs = new String[] {""} ;
      P09V33_n4561HrePrdUDs = new boolean[] {false} ;
      P09V33_A4494HreBarPar = new String[] {""} ;
      P09V33_A4493HreBarReo = new byte[1] ;
      P09V33_A4492HreBarCod = new int[1] ;
      P09V33_A396EmprCod = new String[] {""} ;
      P09V33_A4550HreLinPro = new byte[1] ;
      P09V33_A4557HreRecLin = new short[1] ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A12453HreFecAct = GXutil.nullDate() ;
      A4558HrePrdNum = "" ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4559HrePrdDsc = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      AV53TotCant = DecimalUtil.ZERO ;
      AV56TotPrd = DecimalUtil.ZERO ;
      AV67TotKg = DecimalUtil.ZERO ;
      AV68Totkgp = DecimalUtil.ZERO ;
      AV63lastDsc = "" ;
      AV64LastPrecio = DecimalUtil.ZERO ;
      AV65LasUnd = "" ;
      AV75PrvNom_ = "" ;
      AV57TotG = DecimalUtil.ZERO ;
      AV70Totkgg = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      AV54PrvNom = "" ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informesalidasproductos_2__default(),
         new Object[] {
             new Object[] {
            P09V32_AV72CantidadRegistrosAProcesar
            }
            , new Object[] {
            P09V33_A4495HreNumCie, P09V33_A4545HreLinMaq, P09V33_A4563HrePrdCant, P09V33_n4563HrePrdCant, P09V33_A12453HreFecAct, P09V33_n12453HreFecAct, P09V33_A4558HrePrdNum, P09V33_n4558HrePrdNum, P09V33_A11707HreProv, P09V33_n11707HreProv,
            P09V33_A4565HreCanAny, P09V33_n4565HreCanAny, P09V33_A4542HreTotKgm, P09V33_n4542HreTotKgm, P09V33_A4547HreVolPrd, P09V33_n4547HreVolPrd, P09V33_A4559HrePrdDsc, P09V33_n4559HrePrdDsc, P09V33_A4967HrePrePrd, P09V33_n4967HrePrePrd,
            P09V33_A4561HrePrdUDs, P09V33_n4561HrePrdUDs, P09V33_A4494HreBarPar, P09V33_A4493HreBarReo, P09V33_A4492HreBarCod, P09V33_A396EmprCod, P09V33_A4550HreLinPro, P09V33_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4550HreLinPro ;
   private short AV72CantidadRegistrosAProcesar ;
   private short cV72CantidadRegistrosAProcesar ;
   private short AV73CantidadRegistrosProcesados ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short AV80Porcentaje ;
   private short Gx_err ;
   private int AV58PrvNumfrom ;
   private int AV48PrvNum_to ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int AV60LastProv ;
   private int A11707HreProv ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private int AV66TotVol ;
   private int AV71Totvolg ;
   private int AV69Totvolp ;
   private int GXv_int2[] ;
   private int AV15Random ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal AV53TotCant ;
   private java.math.BigDecimal AV56TotPrd ;
   private java.math.BigDecimal AV67TotKg ;
   private java.math.BigDecimal AV68Totkgp ;
   private java.math.BigDecimal AV64LastPrecio ;
   private java.math.BigDecimal AV57TotG ;
   private java.math.BigDecimal AV70Totkgg ;
   private String AV32Emprcod ;
   private String AV59PrdNumfrom ;
   private String AV46PrdNum_to ;
   private String AV44Producto ;
   private String scmdbuf ;
   private String AV61lastProd ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private String AV63lastDsc ;
   private String AV65LasUnd ;
   private String AV75PrvNom_ ;
   private String GXv_char3[] ;
   private String AV54PrvNom ;
   private String GXv_char1[] ;
   private java.util.Date AV49CCStkFecfrom ;
   private java.util.Date AV50CCStkFecto ;
   private java.util.Date A12453HreFecAct ;
   private boolean returnInSub ;
   private boolean n4563HrePrdCant ;
   private boolean n12453HreFecAct ;
   private boolean n4558HrePrdNum ;
   private boolean n11707HreProv ;
   private boolean n4565HreCanAny ;
   private boolean n4542HreTotKgm ;
   private boolean n4547HreVolPrd ;
   private boolean n4559HrePrdDsc ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV76ProgressIndicator ;
   private String[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P09V32_AV72CantidadRegistrosAProcesar ;
   private byte[] P09V33_A4495HreNumCie ;
   private short[] P09V33_A4545HreLinMaq ;
   private java.math.BigDecimal[] P09V33_A4563HrePrdCant ;
   private boolean[] P09V33_n4563HrePrdCant ;
   private java.util.Date[] P09V33_A12453HreFecAct ;
   private boolean[] P09V33_n12453HreFecAct ;
   private String[] P09V33_A4558HrePrdNum ;
   private boolean[] P09V33_n4558HrePrdNum ;
   private int[] P09V33_A11707HreProv ;
   private boolean[] P09V33_n11707HreProv ;
   private java.math.BigDecimal[] P09V33_A4565HreCanAny ;
   private boolean[] P09V33_n4565HreCanAny ;
   private java.math.BigDecimal[] P09V33_A4542HreTotKgm ;
   private boolean[] P09V33_n4542HreTotKgm ;
   private int[] P09V33_A4547HreVolPrd ;
   private boolean[] P09V33_n4547HreVolPrd ;
   private String[] P09V33_A4559HrePrdDsc ;
   private boolean[] P09V33_n4559HrePrdDsc ;
   private java.math.BigDecimal[] P09V33_A4967HrePrePrd ;
   private boolean[] P09V33_n4967HrePrePrd ;
   private String[] P09V33_A4561HrePrdUDs ;
   private boolean[] P09V33_n4561HrePrdUDs ;
   private String[] P09V33_A4494HreBarPar ;
   private byte[] P09V33_A4493HreBarReo ;
   private int[] P09V33_A4492HreBarCod ;
   private String[] P09V33_A396EmprCod ;
   private byte[] P09V33_A4550HreLinPro ;
   private short[] P09V33_A4557HreRecLin ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
}

final  class informesalidasproductos_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V32", "SELECT COUNT(*) FROM TXPHISLRE WHERE (HreProv >= ?) AND (HreProv <= ?) AND (HrePrdNum >= ?) AND (HrePrdNum <= ?) AND (HreFecAct >= ?) AND (HreFecAct <= ?) AND (HrePrdCant > 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V33", "SELECT T1.HreNumCie, T1.HreLinMaq, T1.HrePrdCant, T1.HreFecAct, T1.HrePrdNum, T1.HreProv, T1.HreCanAny, T2.HreTotKgm, T3.HreVolPrd, T1.HrePrdDsc, T1.HrePrePrd, T1.HrePrdUDs, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreLinPro, T1.HreRecLin FROM ((TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) INNER JOIN TXPHISREM T3 ON T3.EmprCod = T1.EmprCod AND T3.HreBarCod = T1.HreBarCod AND T3.HreBarReo = T1.HreBarReo AND T3.HreBarPar = T1.HreBarPar AND T3.HreNumCie = T1.HreNumCie AND T3.HreLinMaq = T1.HreLinMaq) WHERE (T1.HreProv >= ?) AND (T1.HreProv <= ?) AND (T1.HrePrdNum >= ?) AND (T1.HrePrdNum <= ?) AND (T1.HreFecAct >= ?) AND (T1.HreFecAct <= ?) AND (T1.HrePrdCant > 0) ORDER BY T1.EmprCod, T1.HreProv, T1.HrePrdNum, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(14);
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((String[]) buf[25])[0] = rslt.getString(16, 3);
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((short[]) buf[27])[0] = rslt.getShort(18);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

