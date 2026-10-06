package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiempomedioentrega_lab_export extends GXProcedure
{
   public tiempomedioentrega_lab_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiempomedioentrega_lab_export.class ), "" );
   }

   public tiempomedioentrega_lab_export( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             String[] aP11 )
   {
      tiempomedioentrega_lab_export.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        java.util.Date[] aP8 ,
                        java.util.Date[] aP9 ,
                        java.util.Date[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      tiempomedioentrega_lab_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      tiempomedioentrega_lab_export.this.AV51PCliCod = aP1[0];
      this.aP1 = aP1;
      tiempomedioentrega_lab_export.this.AV53UCliCod = aP2[0];
      this.aP2 = aP2;
      tiempomedioentrega_lab_export.this.AV18Cartazi = aP3[0];
      this.aP3 = aP3;
      tiempomedioentrega_lab_export.this.AV17Cartazf = aP4[0];
      this.aP4 = aP4;
      tiempomedioentrega_lab_export.this.AV16ArtCodi = aP5[0];
      this.aP5 = aP5;
      tiempomedioentrega_lab_export.this.AV15ArtCodf = aP6[0];
      this.aP6 = aP6;
      tiempomedioentrega_lab_export.this.AV26Fechaei = aP7[0];
      this.aP7 = aP7;
      tiempomedioentrega_lab_export.this.AV25Fechaef = aP8[0];
      this.aP8 = aP8;
      tiempomedioentrega_lab_export.this.AV28Fechaeni = aP9[0];
      this.aP9 = aP9;
      tiempomedioentrega_lab_export.this.AV27Fechaenf = aP10[0];
      this.aP10 = aP10;
      tiempomedioentrega_lab_export.this.aP11 = aP11;
      tiempomedioentrega_lab_export.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9CellRow = 1 ;
      AV8CellCol = 1 ;
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
      S151 ();
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
      AV12Filename = "TiempoMedioEntrega_LABExport-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      while ( AV8CellCol <= 100 )
      {
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setBold( (short)(1) );
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setColor( 11 );
         AV8CellCol = (int)(AV8CellCol+1) ;
      }
      AV11ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV11ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV11ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Nº Ensayo", "") );
      AV11ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV11ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Color Cliente", "") );
      AV11ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Coleccion", "") );
      AV11ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Fecha Lab.", "") );
      AV11ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Fecha Envio", "") );
      AV11ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Dias", "") );
      AV11ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Fecha Rechazo", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV48Num_rat = 0 ;
      AV50Num_ret = 0 ;
      AV42Num_dat = 0 ;
      AV44Num_det = 0 ;
      AV9CellRow = 2 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51PCliCod) ,
                                           Integer.valueOf(AV53UCliCod) ,
                                           AV16ArtCodi ,
                                           AV15ArtCodf ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09PL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV51PCliCod), Integer.valueOf(AV53UCliCod), AV16ArtCodi, AV15ArtCodf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PL2 = false ;
         A5533Lb_ArtCod = P09PL2_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09PL2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09PL2_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P09PL2_A5538Lb_ColNomC[0] ;
         A5536Lb_ColNom = P09PL2_A5536Lb_ColNom[0] ;
         A252CliCod = P09PL2_A252CliCod[0] ;
         A279CliNom = P09PL2_A279CliNom[0] ;
         A5532Lb_numero = P09PL2_A5532Lb_numero[0] ;
         A279CliNom = P09PL2_A279CliNom[0] ;
         AV47Num_ra = 0 ;
         AV49Num_re = 0 ;
         AV41Num_da = 0 ;
         AV43Num_de = 0 ;
         AV32Imp_l = (byte)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PL2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09PL2_A252CliCod[0] == A252CliCod ) )
         {
            brk9PL2 = false ;
            A5533Lb_ArtCod = P09PL2_A5533Lb_ArtCod[0] ;
            A5541Lb_FechaE = P09PL2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = P09PL2_A5540Lb_Cartaz[0] ;
            A5538Lb_ColNomC = P09PL2_A5538Lb_ColNomC[0] ;
            A5536Lb_ColNom = P09PL2_A5536Lb_ColNom[0] ;
            A279CliNom = P09PL2_A279CliNom[0] ;
            A5532Lb_numero = P09PL2_A5532Lb_numero[0] ;
            A279CliNom = P09PL2_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV18Cartazi)==0) || ( ( GXutil.strcmp(A5540Lb_Cartaz, AV18Cartazi) >= 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV17Cartazf)==0) || ( ( GXutil.strcmp(A5540Lb_Cartaz, AV17Cartazf) <= 0 ) ) )
               {
                  if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26Fechaei)) || ( (( GXutil.resetTime(A5541Lb_FechaE).after( GXutil.resetTime( AV26Fechaei )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV26Fechaei)) )) ) )
                  {
                     if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25Fechaef)) || ( (( GXutil.resetTime(A5541Lb_FechaE).before( GXutil.resetTime( AV25Fechaef )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV25Fechaef)) )) ) )
                     {
                        AV45Num_op = 0 ;
                        AV46Num_op3 = 0 ;
                        pr_default.dynParam(1, new Object[]{ new Object[]{
                                                             AV28Fechaeni ,
                                                             AV27Fechaenf ,
                                                             A5567Lb_FechaEn ,
                                                             A396EmprCod ,
                                                             Integer.valueOf(A5532Lb_numero) } ,
                                                             new int[]{
                                                             TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                                             }
                        });
                        /* Using cursor P09PL3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV28Fechaeni, AV27Fechaenf});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A5567Lb_FechaEn = P09PL3_A5567Lb_FechaEn[0] ;
                           A5566Lb_Estado = P09PL3_A5566Lb_Estado[0] ;
                           A5555Lb_opcion = P09PL3_A5555Lb_opcion[0] ;
                           if ( A5566Lb_Estado == 3 )
                           {
                              AV46Num_op3 = (int)(AV46Num_op3+1) ;
                           }
                           AV45Num_op = (int)(AV45Num_op+1) ;
                           pr_default.readNext(1);
                        }
                        pr_default.close(1);
                        if ( ( AV45Num_op > 0 ) && ( AV46Num_op3 == AV45Num_op ) )
                        {
                        }
                        else
                        {
                           AV35Lb_fechaen = GXutil.nullDate() ;
                           pr_default.dynParam(2, new Object[]{ new Object[]{
                                                                AV28Fechaeni ,
                                                                AV27Fechaenf ,
                                                                A5567Lb_FechaEn ,
                                                                A396EmprCod ,
                                                                Integer.valueOf(A5532Lb_numero) } ,
                                                                new int[]{
                                                                TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                                                }
                           });
                           /* Using cursor P09PL4 */
                           pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV28Fechaeni, AV27Fechaenf});
                           while ( (pr_default.getStatus(2) != 101) )
                           {
                              A5567Lb_FechaEn = P09PL4_A5567Lb_FechaEn[0] ;
                              A5555Lb_opcion = P09PL4_A5555Lb_opcion[0] ;
                              AV35Lb_fechaen = A5567Lb_FechaEn ;
                              pr_default.readNext(2);
                           }
                           pr_default.close(2);
                           AV23Dias_e = (short)(0) ;
                           if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_fechaen)) )
                           {
                              GXv_char1[0] = A396EmprCod ;
                              GXv_date2[0] = A5541Lb_FechaE ;
                              GXv_date3[0] = AV35Lb_fechaen ;
                              GXv_int4[0] = AV23Dias_e ;
                              new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date2, GXv_date3, GXv_int4) ;
                              tiempomedioentrega_lab_export.this.A396EmprCod = GXv_char1[0] ;
                              tiempomedioentrega_lab_export.this.A5541Lb_FechaE = GXv_date2[0] ;
                              tiempomedioentrega_lab_export.this.AV35Lb_fechaen = GXv_date3[0] ;
                              tiempomedioentrega_lab_export.this.AV23Dias_e = GXv_int4[0] ;
                              if ( AV23Dias_e <= 0 )
                              {
                                 AV23Dias_e = (short)(GXutil.ddiff(AV35Lb_fechaen,A5541Lb_FechaE)) ;
                              }
                           }
                           AV33Lb_ColNomC = A5538Lb_ColNomC ;
                           if ( (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
                           {
                              AV33Lb_ColNomC = A5536Lb_ColNom ;
                           }
                           if ( AV19Carvema == 1 )
                           {
                              AV33Lb_ColNomC = A5536Lb_ColNom ;
                           }
                           AV32Imp_l = (byte)(1) ;
                           if ( AV23Dias_e <= 0 )
                           {
                              AV23Dias_e = (short)(1) ;
                           }
                           if ( AV54WEns017 == 1 )
                           {
                              AV23Dias_e = (short)(0) ;
                              AV22Dias_cal = (short)(0) ;
                              AV35Lb_fechaen = GXutil.nullDate() ;
                              pr_default.dynParam(3, new Object[]{ new Object[]{
                                                                   AV28Fechaeni ,
                                                                   AV27Fechaenf ,
                                                                   A5567Lb_FechaEn ,
                                                                   Integer.valueOf(A5532Lb_numero) ,
                                                                   A396EmprCod } ,
                                                                   new int[]{
                                                                   TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                                                   }
                              });
                              /* Using cursor P09PL5 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV28Fechaeni, AV27Fechaenf});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 brk9PL6 = false ;
                                 A5567Lb_FechaEn = P09PL5_A5567Lb_FechaEn[0] ;
                                 A6460Lb_FecEnt1 = P09PL5_A6460Lb_FecEnt1[0] ;
                                 A5555Lb_opcion = P09PL5_A5555Lb_opcion[0] ;
                                 AV34LB_FECENT1 = GXutil.nullDate() ;
                                 if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                 {
                                    AV34LB_FECENT1 = A6460Lb_FecEnt1 ;
                                 }
                                 AV35Lb_fechaen = GXutil.nullDate() ;
                                 while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09PL5_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P09PL5_A6460Lb_FecEnt1[0]), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                 {
                                    brk9PL6 = false ;
                                    A5567Lb_FechaEn = P09PL5_A5567Lb_FechaEn[0] ;
                                    A5555Lb_opcion = P09PL5_A5555Lb_opcion[0] ;
                                    if ( P09PL5_A5532Lb_numero[0] == A5532Lb_numero )
                                    {
                                       AV35Lb_fechaen = A5567Lb_FechaEn ;
                                    }
                                    brk9PL6 = true ;
                                    pr_default.readNext(3);
                                 }
                                 if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34LB_FECENT1)) )
                                 {
                                    GXv_char1[0] = A396EmprCod ;
                                    GXv_date3[0] = AV34LB_FECENT1 ;
                                    GXv_date2[0] = AV35Lb_fechaen ;
                                    GXv_int4[0] = AV22Dias_cal ;
                                    new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                                    tiempomedioentrega_lab_export.this.A396EmprCod = GXv_char1[0] ;
                                    tiempomedioentrega_lab_export.this.AV34LB_FECENT1 = GXv_date3[0] ;
                                    tiempomedioentrega_lab_export.this.AV35Lb_fechaen = GXv_date2[0] ;
                                    tiempomedioentrega_lab_export.this.AV22Dias_cal = GXv_int4[0] ;
                                    if ( AV22Dias_cal == 0 )
                                    {
                                       AV23Dias_e = (short)(AV23Dias_e+((GXutil.ddiff(AV35Lb_fechaen,AV34LB_FECENT1)))) ;
                                    }
                                    else
                                    {
                                       AV23Dias_e = (short)(AV23Dias_e+AV22Dias_cal) ;
                                    }
                                 }
                                 if ( ! brk9PL6 )
                                 {
                                    brk9PL6 = true ;
                                    pr_default.readNext(3);
                                 }
                              }
                              pr_default.close(3);
                              if ( AV23Dias_e <= 0 )
                              {
                                 AV23Dias_e = (short)(1) ;
                              }
                           }
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_fechaen)) )
                           {
                              AV23Dias_e = (short)(0) ;
                           }
                           AV11ExcelDocument.Cells(AV9CellRow, 1, 1, 1).setNumber( A252CliCod );
                           AV11ExcelDocument.Cells(AV9CellRow, 2, 1, 1).setText( A279CliNom );
                           AV11ExcelDocument.Cells(AV9CellRow, 3, 1, 1).setNumber( A5532Lb_numero );
                           AV11ExcelDocument.Cells(AV9CellRow, 4, 1, 1).setText( A5533Lb_ArtCod );
                           AV11ExcelDocument.Cells(AV9CellRow, 5, 1, 1).setText( AV33Lb_ColNomC );
                           AV11ExcelDocument.Cells(AV9CellRow, 6, 1, 1).setText( A5540Lb_Cartaz );
                           GXt_dtime5 = GXutil.resetTime( A5541Lb_FechaE );
                           AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV11ExcelDocument.Cells(AV9CellRow, 7, 1, 1).setDate( GXt_dtime5 );
                           GXt_dtime5 = GXutil.resetTime( AV35Lb_fechaen );
                           AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV11ExcelDocument.Cells(AV9CellRow, 8, 1, 1).setDate( GXt_dtime5 );
                           AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setNumber( AV23Dias_e );
                           if ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV34LB_FECENT1)) )
                           {
                              Gx_msg = " " ;
                              AV11ExcelDocument.Cells(AV9CellRow, 10, 1, 1).setText( Gx_msg );
                           }
                           else
                           {
                              GXt_dtime5 = GXutil.resetTime( AV34LB_FECENT1 );
                              AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                              AV11ExcelDocument.Cells(AV9CellRow, 11, 1, 1).setDate( GXt_dtime5 );
                           }
                           AV9CellRow = (int)(AV9CellRow+1) ;
                           AV43Num_de = (int)(AV43Num_de+AV23Dias_e) ;
                           AV44Num_det = (int)(AV44Num_det+AV23Dias_e) ;
                           if ( AV23Dias_e > 0 )
                           {
                              AV49Num_re = (int)(AV49Num_re+1) ;
                              AV50Num_ret = (int)(AV50Num_ret+1) ;
                           }
                        }
                     }
                  }
               }
            }
            brk9PL2 = true ;
            pr_default.readNext(0);
         }
         AV40Med_e = DecimalUtil.doubleToDec(0) ;
         if ( AV49Num_re > 0 )
         {
            AV40Med_e = DecimalUtil.doubleToDec(AV43Num_de/ (double) (AV49Num_re)) ;
         }
         if ( ( AV32Imp_l > 0 ) && (0==AV55nototal) )
         {
            AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40Med_e)) );
            AV9CellRow = (int)(AV9CellRow+1) ;
         }
         if ( ! brk9PL2 )
         {
            brk9PL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV39Med_a = DecimalUtil.doubleToDec(0) ;
      if ( AV48Num_rat > 0 )
      {
         AV39Med_a = DecimalUtil.doubleToDec(AV42Num_dat/ (double) (AV48Num_rat)) ;
      }
      AV40Med_e = DecimalUtil.doubleToDec(0) ;
      if ( AV50Num_ret > 0 )
      {
         AV40Med_e = DecimalUtil.doubleToDec(AV44Num_det/ (double) (AV50Num_ret)) ;
      }
      if ( (0==AV55nototal) )
      {
         AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40Med_e)) );
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV10ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Close();
   }

   protected void cleanup( )
   {
      this.aP0[0] = tiempomedioentrega_lab_export.this.A396EmprCod;
      this.aP1[0] = tiempomedioentrega_lab_export.this.AV51PCliCod;
      this.aP2[0] = tiempomedioentrega_lab_export.this.AV53UCliCod;
      this.aP3[0] = tiempomedioentrega_lab_export.this.AV18Cartazi;
      this.aP4[0] = tiempomedioentrega_lab_export.this.AV17Cartazf;
      this.aP5[0] = tiempomedioentrega_lab_export.this.AV16ArtCodi;
      this.aP6[0] = tiempomedioentrega_lab_export.this.AV15ArtCodf;
      this.aP7[0] = tiempomedioentrega_lab_export.this.AV26Fechaei;
      this.aP8[0] = tiempomedioentrega_lab_export.this.AV25Fechaef;
      this.aP9[0] = tiempomedioentrega_lab_export.this.AV28Fechaeni;
      this.aP10[0] = tiempomedioentrega_lab_export.this.AV27Fechaenf;
      this.aP11[0] = tiempomedioentrega_lab_export.this.AV12Filename;
      this.aP12[0] = tiempomedioentrega_lab_export.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV10ErrorMessage = "" ;
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      A5533Lb_ArtCod = "" ;
      P09PL2_A396EmprCod = new String[] {""} ;
      P09PL2_A5533Lb_ArtCod = new String[] {""} ;
      P09PL2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PL2_A5540Lb_Cartaz = new String[] {""} ;
      P09PL2_A5538Lb_ColNomC = new String[] {""} ;
      P09PL2_A5536Lb_ColNom = new String[] {""} ;
      P09PL2_A252CliCod = new int[1] ;
      P09PL2_A279CliNom = new String[] {""} ;
      P09PL2_A5532Lb_numero = new int[1] ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      P09PL3_A396EmprCod = new String[] {""} ;
      P09PL3_A5532Lb_numero = new int[1] ;
      P09PL3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PL3_A5566Lb_Estado = new byte[1] ;
      P09PL3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV35Lb_fechaen = GXutil.nullDate() ;
      P09PL4_A396EmprCod = new String[] {""} ;
      P09PL4_A5532Lb_numero = new int[1] ;
      P09PL4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PL4_A5555Lb_opcion = new String[] {""} ;
      AV33Lb_ColNomC = "" ;
      P09PL5_A396EmprCod = new String[] {""} ;
      P09PL5_A5532Lb_numero = new int[1] ;
      P09PL5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PL5_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PL5_A5555Lb_opcion = new String[] {""} ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      AV34LB_FECENT1 = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date2 = new java.util.Date[1] ;
      GXv_int4 = new short[1] ;
      Gx_msg = "" ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      AV40Med_e = DecimalUtil.ZERO ;
      AV39Med_a = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tiempomedioentrega_lab_export__default(),
         new Object[] {
             new Object[] {
            P09PL2_A396EmprCod, P09PL2_A5533Lb_ArtCod, P09PL2_A5541Lb_FechaE, P09PL2_A5540Lb_Cartaz, P09PL2_A5538Lb_ColNomC, P09PL2_A5536Lb_ColNom, P09PL2_A252CliCod, P09PL2_A279CliNom, P09PL2_A5532Lb_numero
            }
            , new Object[] {
            P09PL3_A396EmprCod, P09PL3_A5532Lb_numero, P09PL3_A5567Lb_FechaEn, P09PL3_A5566Lb_Estado, P09PL3_A5555Lb_opcion
            }
            , new Object[] {
            P09PL4_A396EmprCod, P09PL4_A5532Lb_numero, P09PL4_A5567Lb_FechaEn, P09PL4_A5555Lb_opcion
            }
            , new Object[] {
            P09PL5_A396EmprCod, P09PL5_A5532Lb_numero, P09PL5_A5567Lb_FechaEn, P09PL5_A6460Lb_FecEnt1, P09PL5_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32Imp_l ;
   private byte A5566Lb_Estado ;
   private byte AV19Carvema ;
   private byte AV54WEns017 ;
   private short AV23Dias_e ;
   private short AV22Dias_cal ;
   private short GXv_int4[] ;
   private short AV55nototal ;
   private short Gx_err ;
   private int AV51PCliCod ;
   private int AV53UCliCod ;
   private int AV9CellRow ;
   private int AV8CellCol ;
   private int AV13Random ;
   private int AV48Num_rat ;
   private int AV50Num_ret ;
   private int AV42Num_dat ;
   private int AV44Num_det ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private int AV47Num_ra ;
   private int AV49Num_re ;
   private int AV41Num_da ;
   private int AV43Num_de ;
   private int AV45Num_op ;
   private int AV46Num_op3 ;
   private java.math.BigDecimal AV40Med_e ;
   private java.math.BigDecimal AV39Med_a ;
   private String A396EmprCod ;
   private String AV18Cartazi ;
   private String AV17Cartazf ;
   private String AV16ArtCodi ;
   private String AV15ArtCodf ;
   private String scmdbuf ;
   private String A5533Lb_ArtCod ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String AV33Lb_ColNomC ;
   private String GXv_char1[] ;
   private String Gx_msg ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date AV26Fechaei ;
   private java.util.Date AV25Fechaef ;
   private java.util.Date AV28Fechaeni ;
   private java.util.Date AV27Fechaenf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV35Lb_fechaen ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date AV34LB_FECENT1 ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date2[] ;
   private boolean returnInSub ;
   private boolean brk9PL2 ;
   private boolean brk9PL6 ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private java.util.Date[] aP8 ;
   private java.util.Date[] aP9 ;
   private java.util.Date[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PL2_A396EmprCod ;
   private String[] P09PL2_A5533Lb_ArtCod ;
   private java.util.Date[] P09PL2_A5541Lb_FechaE ;
   private String[] P09PL2_A5540Lb_Cartaz ;
   private String[] P09PL2_A5538Lb_ColNomC ;
   private String[] P09PL2_A5536Lb_ColNom ;
   private int[] P09PL2_A252CliCod ;
   private String[] P09PL2_A279CliNom ;
   private int[] P09PL2_A5532Lb_numero ;
   private String[] P09PL3_A396EmprCod ;
   private int[] P09PL3_A5532Lb_numero ;
   private java.util.Date[] P09PL3_A5567Lb_FechaEn ;
   private byte[] P09PL3_A5566Lb_Estado ;
   private String[] P09PL3_A5555Lb_opcion ;
   private String[] P09PL4_A396EmprCod ;
   private int[] P09PL4_A5532Lb_numero ;
   private java.util.Date[] P09PL4_A5567Lb_FechaEn ;
   private String[] P09PL4_A5555Lb_opcion ;
   private String[] P09PL5_A396EmprCod ;
   private int[] P09PL5_A5532Lb_numero ;
   private java.util.Date[] P09PL5_A5567Lb_FechaEn ;
   private java.util.Date[] P09PL5_A6460Lb_FecEnt1 ;
   private String[] P09PL5_A5555Lb_opcion ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class tiempomedioentrega_lab_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51PCliCod ,
                                          int AV53UCliCod ,
                                          String AV16ArtCodi ,
                                          String AV15ArtCodf ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[5];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_Cartaz, T1.Lb_ColNomC, T1.Lb_ColNom, T1.CliCod, T2.CliNom, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV51PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV53UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16ArtCodi)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15ArtCodf)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.Lb_Cartaz" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09PL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV28Fechaeni ,
                                          java.util.Date AV27Fechaenf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[4];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_Estado, Lb_opcion FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Fechaeni)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Fechaenf)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09PL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV28Fechaeni ,
                                          java.util.Date AV27Fechaenf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[4];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Fechaeni)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Fechaenf)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09PL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV28Fechaeni ,
                                          java.util.Date AV27Fechaenf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          int A5532Lb_numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[4];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_FecEnt1, Lb_opcion FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Lb_numero = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Fechaeni)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Fechaenf)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_FecEnt1" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09PL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P09PL3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() );
            case 2 :
                  return conditional_P09PL4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() );
            case 3 :
                  return conditional_P09PL5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
      }
   }

}

