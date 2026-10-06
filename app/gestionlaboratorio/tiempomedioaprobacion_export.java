package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiempomedioaprobacion_export extends GXProcedure
{
   public tiempomedioaprobacion_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiempomedioaprobacion_export.class ), "" );
   }

   public tiempomedioaprobacion_export( int remoteHandle ,
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
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      tiempomedioaprobacion_export.this.aP16 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
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
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
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
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 )
   {
      tiempomedioaprobacion_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      tiempomedioaprobacion_export.this.AV51PCliCod = aP1[0];
      this.aP1 = aP1;
      tiempomedioaprobacion_export.this.AV53UCliCod = aP2[0];
      this.aP2 = aP2;
      tiempomedioaprobacion_export.this.AV18Cartazi = aP3[0];
      this.aP3 = aP3;
      tiempomedioaprobacion_export.this.AV17Cartazf = aP4[0];
      this.aP4 = aP4;
      tiempomedioaprobacion_export.this.AV16ArtCodi = aP5[0];
      this.aP5 = aP5;
      tiempomedioaprobacion_export.this.AV15ArtCodf = aP6[0];
      this.aP6 = aP6;
      tiempomedioaprobacion_export.this.AV26Fechaei = aP7[0];
      this.aP7 = aP7;
      tiempomedioaprobacion_export.this.AV25Fechaef = aP8[0];
      this.aP8 = aP8;
      tiempomedioaprobacion_export.this.AV28Fechaeni = aP9[0];
      this.aP9 = aP9;
      tiempomedioaprobacion_export.this.AV27Fechaenf = aP10[0];
      this.aP10 = aP10;
      tiempomedioaprobacion_export.this.AV65Fechari = aP11[0];
      this.aP11 = aP11;
      tiempomedioaprobacion_export.this.AV66Fecharf = aP12[0];
      this.aP12 = aP12;
      tiempomedioaprobacion_export.this.AV63PTipo = aP13[0];
      this.aP13 = aP13;
      tiempomedioaprobacion_export.this.AV64UTipo = aP14[0];
      this.aP14 = aP14;
      tiempomedioaprobacion_export.this.aP15 = aP15;
      tiempomedioaprobacion_export.this.aP16 = aP16;
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
      AV12Filename = "TiempoMedioAprobacion_Export-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".xlsx" ;
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
      AV11ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Fecha Lab.(A)", "") );
      AV11ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Fecha Envio(B)", "") );
      AV11ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Dias(A-B)", "") );
      AV11ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Fecha Aprobacion(C)", "") );
      AV11ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Dias(C-B)", "") );
      AV11ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Dias(C-A)", "") );
      AV11ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "N.E.", "") );
      AV11ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Tipo", "") );
      AV11ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Fecha Rechazo", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV9CellRow = 2 ;
      AV48Num_rat = 0 ;
      AV50Num_ret = 0 ;
      AV67Num_rtt = 0 ;
      AV42Num_dat = 0 ;
      AV44Num_det = 0 ;
      AV62Num_dtt = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51PCliCod) ,
                                           Integer.valueOf(AV53UCliCod) ,
                                           AV18Cartazi ,
                                           AV17Cartazf ,
                                           AV26Fechaei ,
                                           AV25Fechaef ,
                                           AV16ArtCodi ,
                                           AV15ArtCodf ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5533Lb_ArtCod ,
                                           A5570Lb_Tipo ,
                                           AV63PTipo ,
                                           AV64UTipo ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09PP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV63PTipo, AV64UTipo, Integer.valueOf(AV51PCliCod), Integer.valueOf(AV53UCliCod), AV18Cartazi, AV17Cartazf, AV26Fechaei, AV25Fechaef, AV16ArtCodi, AV15ArtCodf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PP2 = false ;
         A5533Lb_ArtCod = P09PP2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09PP2_A252CliCod[0] ;
         A5570Lb_Tipo = P09PP2_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PP2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09PP2_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P09PP2_A5538Lb_ColNomC[0] ;
         A5536Lb_ColNom = P09PP2_A5536Lb_ColNom[0] ;
         A279CliNom = P09PP2_A279CliNom[0] ;
         A5532Lb_numero = P09PP2_A5532Lb_numero[0] ;
         A279CliNom = P09PP2_A279CliNom[0] ;
         AV47Num_ra = 0 ;
         AV49Num_re = 0 ;
         AV68Num_rt = 0 ;
         AV41Num_da = 0 ;
         AV43Num_de = 0 ;
         AV61Num_dt = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PP2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09PP2_A252CliCod[0] == A252CliCod ) )
         {
            brk9PP2 = false ;
            A5533Lb_ArtCod = P09PP2_A5533Lb_ArtCod[0] ;
            A5570Lb_Tipo = P09PP2_A5570Lb_Tipo[0] ;
            A5541Lb_FechaE = P09PP2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = P09PP2_A5540Lb_Cartaz[0] ;
            A5538Lb_ColNomC = P09PP2_A5538Lb_ColNomC[0] ;
            A5536Lb_ColNom = P09PP2_A5536Lb_ColNom[0] ;
            A279CliNom = P09PP2_A279CliNom[0] ;
            A5532Lb_numero = P09PP2_A5532Lb_numero[0] ;
            A279CliNom = P09PP2_A279CliNom[0] ;
            if ( GXutil.strcmp(A5570Lb_Tipo, AV63PTipo) >= 0 )
            {
               if ( GXutil.strcmp(A5570Lb_Tipo, AV64UTipo) <= 0 )
               {
                  AV35Lb_fechaen = GXutil.nullDate() ;
                  AV58Lb_fechar = GXutil.nullDate() ;
                  AV59NEntradas = (short)(0) ;
                  pr_default.dynParam(1, new Object[]{ new Object[]{
                                                       AV28Fechaeni ,
                                                       AV27Fechaenf ,
                                                       AV65Fechari ,
                                                       AV66Fecharf ,
                                                       A5567Lb_FechaEn ,
                                                       A5563Lb_FechaR ,
                                                       A396EmprCod ,
                                                       Integer.valueOf(A5532Lb_numero) } ,
                                                       new int[]{
                                                       TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                                       }
                  });
                  /* Using cursor P09PP3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV28Fechaeni, AV27Fechaenf, AV65Fechari, AV66Fecharf});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A5563Lb_FechaR = P09PP3_A5563Lb_FechaR[0] ;
                     A5567Lb_FechaEn = P09PP3_A5567Lb_FechaEn[0] ;
                     A6461Lb_FecNoa1 = P09PP3_A6461Lb_FecNoa1[0] ;
                     A5555Lb_opcion = P09PP3_A5555Lb_opcion[0] ;
                     if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
                     {
                        AV35Lb_fechaen = A5567Lb_FechaEn ;
                     }
                     if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
                     {
                        AV58Lb_fechar = A5563Lb_FechaR ;
                     }
                     AV59NEntradas = (short)(AV59NEntradas+1) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV23Dias_e = (short)(0) ;
                  if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_fechaen)) )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_date2[0] = A5541Lb_FechaE ;
                     GXv_date3[0] = AV35Lb_fechaen ;
                     GXv_int4[0] = AV23Dias_e ;
                     new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date2, GXv_date3, GXv_int4) ;
                     tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                     tiempomedioaprobacion_export.this.A5541Lb_FechaE = GXv_date2[0] ;
                     tiempomedioaprobacion_export.this.AV35Lb_fechaen = GXv_date3[0] ;
                     tiempomedioaprobacion_export.this.AV23Dias_e = GXv_int4[0] ;
                     if ( AV23Dias_e == 0 )
                     {
                        AV23Dias_e = (short)(GXutil.ddiff(AV35Lb_fechaen,A5541Lb_FechaE)) ;
                     }
                  }
                  AV21Dias_a = 0 ;
                  if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_fechaen)) )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_date3[0] = AV35Lb_fechaen ;
                     GXv_date2[0] = AV58Lb_fechar ;
                     GXv_int4[0] = (short)(AV21Dias_a) ;
                     new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                     tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                     tiempomedioaprobacion_export.this.AV35Lb_fechaen = GXv_date3[0] ;
                     tiempomedioaprobacion_export.this.AV58Lb_fechar = GXv_date2[0] ;
                     tiempomedioaprobacion_export.this.AV21Dias_a = GXv_int4[0] ;
                     if ( AV21Dias_a == 0 )
                     {
                        AV21Dias_a = (int)(GXutil.ddiff(AV58Lb_fechar,AV35Lb_fechaen)) ;
                     }
                  }
                  AV60Dias_t = (short)(0) ;
                  if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5541Lb_FechaE)) )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_date3[0] = A5541Lb_FechaE ;
                     GXv_date2[0] = AV58Lb_fechar ;
                     GXv_int4[0] = AV60Dias_t ;
                     new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                     tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                     tiempomedioaprobacion_export.this.A5541Lb_FechaE = GXv_date3[0] ;
                     tiempomedioaprobacion_export.this.AV58Lb_fechar = GXv_date2[0] ;
                     tiempomedioaprobacion_export.this.AV60Dias_t = GXv_int4[0] ;
                     if ( AV60Dias_t == 0 )
                     {
                        AV60Dias_t = (short)(GXutil.ddiff(AV58Lb_fechar,A5541Lb_FechaE)) ;
                     }
                  }
                  if ( AV54WEns017 == 1 )
                  {
                     AV21Dias_a = 0 ;
                     AV23Dias_e = (short)(0) ;
                     AV60Dias_t = (short)(0) ;
                     AV22Dias_cal = (short)(0) ;
                     pr_default.dynParam(2, new Object[]{ new Object[]{
                                                          AV28Fechaeni ,
                                                          AV27Fechaenf ,
                                                          AV65Fechari ,
                                                          AV66Fecharf ,
                                                          A5567Lb_FechaEn ,
                                                          A5563Lb_FechaR ,
                                                          Integer.valueOf(A5532Lb_numero) ,
                                                          A396EmprCod } ,
                                                          new int[]{
                                                          TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                                          }
                     });
                     /* Using cursor P09PP4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV28Fechaeni, AV27Fechaenf, AV65Fechari, AV66Fecharf});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        brk9PP5 = false ;
                        A5567Lb_FechaEn = P09PP4_A5567Lb_FechaEn[0] ;
                        A5563Lb_FechaR = P09PP4_A5563Lb_FechaR[0] ;
                        A6461Lb_FecNoa1 = P09PP4_A6461Lb_FecNoa1[0] ;
                        A6460Lb_FecEnt1 = P09PP4_A6460Lb_FecEnt1[0] ;
                        A5555Lb_opcion = P09PP4_A5555Lb_opcion[0] ;
                        AV34LB_FECENT1 = GXutil.nullDate() ;
                        if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6460Lb_FecEnt1)) )
                        {
                           AV34LB_FECENT1 = A6460Lb_FecEnt1 ;
                        }
                        while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09PP4_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P09PP4_A6460Lb_FecEnt1[0]), GXutil.resetTime(A6460Lb_FecEnt1)) )
                        {
                           brk9PP5 = false ;
                           A5567Lb_FechaEn = P09PP4_A5567Lb_FechaEn[0] ;
                           A5563Lb_FechaR = P09PP4_A5563Lb_FechaR[0] ;
                           A6461Lb_FecNoa1 = P09PP4_A6461Lb_FecNoa1[0] ;
                           A5555Lb_opcion = P09PP4_A5555Lb_opcion[0] ;
                           if ( P09PP4_A5532Lb_numero[0] == A5532Lb_numero )
                           {
                              if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
                              {
                                 AV35Lb_fechaen = A5567Lb_FechaEn ;
                              }
                              if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
                              {
                                 AV58Lb_fechar = A5563Lb_FechaR ;
                              }
                           }
                           brk9PP5 = true ;
                           pr_default.readNext(2);
                        }
                        if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34LB_FECENT1)) )
                        {
                           GXv_char1[0] = A396EmprCod ;
                           GXv_date3[0] = AV34LB_FECENT1 ;
                           GXv_date2[0] = AV35Lb_fechaen ;
                           GXv_int4[0] = AV22Dias_cal ;
                           new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                           tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                           tiempomedioaprobacion_export.this.AV34LB_FECENT1 = GXv_date3[0] ;
                           tiempomedioaprobacion_export.this.AV35Lb_fechaen = GXv_date2[0] ;
                           tiempomedioaprobacion_export.this.AV22Dias_cal = GXv_int4[0] ;
                           if ( AV22Dias_cal == 0 )
                           {
                              AV23Dias_e = (short)(AV23Dias_e+((GXutil.ddiff(AV35Lb_fechaen,AV34LB_FECENT1)))) ;
                           }
                           else
                           {
                              AV23Dias_e = (short)(AV23Dias_e+AV22Dias_cal) ;
                           }
                        }
                        if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_fechaen)) )
                        {
                           GXv_char1[0] = A396EmprCod ;
                           GXv_date3[0] = AV35Lb_fechaen ;
                           GXv_date2[0] = AV58Lb_fechar ;
                           GXv_int4[0] = AV22Dias_cal ;
                           new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                           tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                           tiempomedioaprobacion_export.this.AV35Lb_fechaen = GXv_date3[0] ;
                           tiempomedioaprobacion_export.this.AV58Lb_fechar = GXv_date2[0] ;
                           tiempomedioaprobacion_export.this.AV22Dias_cal = GXv_int4[0] ;
                           if ( AV22Dias_cal == 0 )
                           {
                              AV21Dias_a = (int)(AV21Dias_a+(GXutil.ddiff(AV58Lb_fechar,AV35Lb_fechaen))) ;
                           }
                           else
                           {
                              AV21Dias_a = (int)(AV21Dias_a+AV22Dias_cal) ;
                           }
                        }
                        if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34LB_FECENT1)) )
                        {
                           GXv_char1[0] = A396EmprCod ;
                           GXv_date3[0] = AV34LB_FECENT1 ;
                           GXv_date2[0] = AV58Lb_fechar ;
                           GXv_int4[0] = AV22Dias_cal ;
                           new app.pdiaslab(remoteHandle, context).execute( GXv_char1, GXv_date3, GXv_date2, GXv_int4) ;
                           tiempomedioaprobacion_export.this.A396EmprCod = GXv_char1[0] ;
                           tiempomedioaprobacion_export.this.AV34LB_FECENT1 = GXv_date3[0] ;
                           tiempomedioaprobacion_export.this.AV58Lb_fechar = GXv_date2[0] ;
                           tiempomedioaprobacion_export.this.AV22Dias_cal = GXv_int4[0] ;
                           if ( AV22Dias_cal == 0 )
                           {
                              AV60Dias_t = (short)(AV60Dias_t+(GXutil.ddiff(AV58Lb_fechar,A5541Lb_FechaE))) ;
                           }
                           else
                           {
                              AV60Dias_t = (short)(AV60Dias_t+AV22Dias_cal) ;
                           }
                        }
                        if ( ! brk9PP5 )
                        {
                           brk9PP5 = true ;
                           pr_default.readNext(2);
                        }
                     }
                     pr_default.close(2);
                  }
                  AV33Lb_ColNomC = A5538Lb_ColNomC ;
                  if ( (GXutil.strcmp("", AV33Lb_ColNomC)==0) )
                  {
                     AV33Lb_ColNomC = A5536Lb_ColNom ;
                  }
                  if ( AV19Carvema == 1 )
                  {
                     AV33Lb_ColNomC = A5536Lb_ColNom ;
                  }
                  if ( AV59NEntradas > 0 )
                  {
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
                     GXt_dtime5 = GXutil.resetTime( AV58Lb_fechar );
                     AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV11ExcelDocument.Cells(AV9CellRow, 10, 1, 1).setDate( GXt_dtime5 );
                     AV11ExcelDocument.Cells(AV9CellRow, 11, 1, 1).setNumber( AV21Dias_a );
                     AV11ExcelDocument.Cells(AV9CellRow, 12, 1, 1).setNumber( AV60Dias_t );
                     AV11ExcelDocument.Cells(AV9CellRow, 13, 1, 1).setNumber( AV59NEntradas );
                     AV11ExcelDocument.Cells(AV9CellRow, 14, 1, 1).setText( A5570Lb_Tipo );
                     if ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV34LB_FECENT1)) )
                     {
                        Gx_msg = " " ;
                        AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setText( Gx_msg );
                     }
                     else
                     {
                        GXt_dtime5 = GXutil.resetTime( AV34LB_FECENT1 );
                        AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setDate( GXt_dtime5 );
                     }
                     AV9CellRow = (int)(AV9CellRow+1) ;
                     AV41Num_da = (int)(AV41Num_da+AV21Dias_a) ;
                     AV43Num_de = (int)(AV43Num_de+AV23Dias_e) ;
                     AV61Num_dt = (int)(AV61Num_dt+AV60Dias_t) ;
                     AV42Num_dat = (int)(AV42Num_dat+AV21Dias_a) ;
                     AV44Num_det = (int)(AV44Num_det+AV23Dias_e) ;
                     AV62Num_dtt = (int)(AV62Num_dtt+AV60Dias_t) ;
                     if ( AV21Dias_a > 0 )
                     {
                        AV47Num_ra = (int)(AV47Num_ra+1) ;
                        AV48Num_rat = (int)(AV48Num_rat+1) ;
                     }
                     if ( AV23Dias_e > 0 )
                     {
                        AV49Num_re = (int)(AV49Num_re+1) ;
                        AV50Num_ret = (int)(AV50Num_ret+1) ;
                     }
                     if ( AV60Dias_t > 0 )
                     {
                        AV68Num_rt = (int)(AV68Num_rt+1) ;
                        AV67Num_rtt = (int)(AV67Num_rtt+1) ;
                     }
                  }
               }
            }
            brk9PP2 = true ;
            pr_default.readNext(0);
         }
         AV39Med_a = DecimalUtil.doubleToDec(0) ;
         if ( AV47Num_ra > 0 )
         {
            AV39Med_a = DecimalUtil.doubleToDec(AV41Num_da/ (double) (AV47Num_ra)) ;
         }
         AV40Med_e = DecimalUtil.doubleToDec(0) ;
         if ( AV49Num_re > 0 )
         {
            AV40Med_e = DecimalUtil.doubleToDec(AV43Num_de/ (double) (AV49Num_re)) ;
         }
         AV69Med_t = DecimalUtil.doubleToDec(0) ;
         if ( AV68Num_rt > 0 )
         {
            AV69Med_t = DecimalUtil.doubleToDec(AV61Num_dt/ (double) (AV68Num_rt)) ;
         }
         if ( ( AV39Med_a.doubleValue() != 0 ) || ( AV40Med_e.doubleValue() != 0 ) || ( AV69Med_t.doubleValue() != 0 ) )
         {
            AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40Med_e)) );
            AV11ExcelDocument.Cells(AV9CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39Med_a)) );
            AV11ExcelDocument.Cells(AV9CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69Med_t)) );
         }
         if ( ! brk9PP2 )
         {
            brk9PP2 = true ;
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
      AV69Med_t = DecimalUtil.doubleToDec(0) ;
      if ( AV67Num_rtt > 0 )
      {
         AV69Med_t = DecimalUtil.doubleToDec(AV62Num_dtt/ (double) (AV67Num_rtt)) ;
      }
      if ( ( AV39Med_a.doubleValue() != 0 ) || ( AV40Med_e.doubleValue() != 0 ) || ( AV69Med_t.doubleValue() != 0 ) )
      {
         AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40Med_e)) );
         AV11ExcelDocument.Cells(AV9CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39Med_a)) );
         AV11ExcelDocument.Cells(AV9CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69Med_t)) );
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
      this.aP0[0] = tiempomedioaprobacion_export.this.A396EmprCod;
      this.aP1[0] = tiempomedioaprobacion_export.this.AV51PCliCod;
      this.aP2[0] = tiempomedioaprobacion_export.this.AV53UCliCod;
      this.aP3[0] = tiempomedioaprobacion_export.this.AV18Cartazi;
      this.aP4[0] = tiempomedioaprobacion_export.this.AV17Cartazf;
      this.aP5[0] = tiempomedioaprobacion_export.this.AV16ArtCodi;
      this.aP6[0] = tiempomedioaprobacion_export.this.AV15ArtCodf;
      this.aP7[0] = tiempomedioaprobacion_export.this.AV26Fechaei;
      this.aP8[0] = tiempomedioaprobacion_export.this.AV25Fechaef;
      this.aP9[0] = tiempomedioaprobacion_export.this.AV28Fechaeni;
      this.aP10[0] = tiempomedioaprobacion_export.this.AV27Fechaenf;
      this.aP11[0] = tiempomedioaprobacion_export.this.AV65Fechari;
      this.aP12[0] = tiempomedioaprobacion_export.this.AV66Fecharf;
      this.aP13[0] = tiempomedioaprobacion_export.this.AV63PTipo;
      this.aP14[0] = tiempomedioaprobacion_export.this.AV64UTipo;
      this.aP15[0] = tiempomedioaprobacion_export.this.AV12Filename;
      this.aP16[0] = tiempomedioaprobacion_export.this.AV10ErrorMessage;
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
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5570Lb_Tipo = "" ;
      P09PP2_A396EmprCod = new String[] {""} ;
      P09PP2_A5533Lb_ArtCod = new String[] {""} ;
      P09PP2_A252CliCod = new int[1] ;
      P09PP2_A5570Lb_Tipo = new String[] {""} ;
      P09PP2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP2_A5540Lb_Cartaz = new String[] {""} ;
      P09PP2_A5538Lb_ColNomC = new String[] {""} ;
      P09PP2_A5536Lb_ColNom = new String[] {""} ;
      P09PP2_A279CliNom = new String[] {""} ;
      P09PP2_A5532Lb_numero = new int[1] ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      AV35Lb_fechaen = GXutil.nullDate() ;
      AV58Lb_fechar = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      P09PP3_A396EmprCod = new String[] {""} ;
      P09PP3_A5532Lb_numero = new int[1] ;
      P09PP3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP3_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      P09PP4_A396EmprCod = new String[] {""} ;
      P09PP4_A5532Lb_numero = new int[1] ;
      P09PP4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP4_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PP4_A5555Lb_opcion = new String[] {""} ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      AV34LB_FECENT1 = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date2 = new java.util.Date[1] ;
      GXv_int4 = new short[1] ;
      AV33Lb_ColNomC = "" ;
      Gx_msg = "" ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      AV39Med_a = DecimalUtil.ZERO ;
      AV40Med_e = DecimalUtil.ZERO ;
      AV69Med_t = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tiempomedioaprobacion_export__default(),
         new Object[] {
             new Object[] {
            P09PP2_A396EmprCod, P09PP2_A5533Lb_ArtCod, P09PP2_A252CliCod, P09PP2_A5570Lb_Tipo, P09PP2_A5541Lb_FechaE, P09PP2_A5540Lb_Cartaz, P09PP2_A5538Lb_ColNomC, P09PP2_A5536Lb_ColNom, P09PP2_A279CliNom, P09PP2_A5532Lb_numero
            }
            , new Object[] {
            P09PP3_A396EmprCod, P09PP3_A5532Lb_numero, P09PP3_A5563Lb_FechaR, P09PP3_A5567Lb_FechaEn, P09PP3_A6461Lb_FecNoa1, P09PP3_A5555Lb_opcion
            }
            , new Object[] {
            P09PP4_A396EmprCod, P09PP4_A5532Lb_numero, P09PP4_A5567Lb_FechaEn, P09PP4_A5563Lb_FechaR, P09PP4_A6461Lb_FecNoa1, P09PP4_A6460Lb_FecEnt1, P09PP4_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54WEns017 ;
   private byte AV19Carvema ;
   private short AV59NEntradas ;
   private short AV23Dias_e ;
   private short AV60Dias_t ;
   private short AV22Dias_cal ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV51PCliCod ;
   private int AV53UCliCod ;
   private int AV9CellRow ;
   private int AV8CellCol ;
   private int AV13Random ;
   private int AV48Num_rat ;
   private int AV50Num_ret ;
   private int AV67Num_rtt ;
   private int AV42Num_dat ;
   private int AV44Num_det ;
   private int AV62Num_dtt ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private int AV47Num_ra ;
   private int AV49Num_re ;
   private int AV68Num_rt ;
   private int AV41Num_da ;
   private int AV43Num_de ;
   private int AV61Num_dt ;
   private int AV21Dias_a ;
   private java.math.BigDecimal AV39Med_a ;
   private java.math.BigDecimal AV40Med_e ;
   private java.math.BigDecimal AV69Med_t ;
   private String A396EmprCod ;
   private String AV18Cartazi ;
   private String AV17Cartazf ;
   private String AV16ArtCodi ;
   private String AV15ArtCodf ;
   private String AV63PTipo ;
   private String AV64UTipo ;
   private String scmdbuf ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5570Lb_Tipo ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String GXv_char1[] ;
   private String AV33Lb_ColNomC ;
   private String Gx_msg ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date AV26Fechaei ;
   private java.util.Date AV25Fechaef ;
   private java.util.Date AV28Fechaeni ;
   private java.util.Date AV27Fechaenf ;
   private java.util.Date AV65Fechari ;
   private java.util.Date AV66Fecharf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV35Lb_fechaen ;
   private java.util.Date AV58Lb_fechar ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date AV34LB_FECENT1 ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date2[] ;
   private boolean returnInSub ;
   private boolean brk9PP2 ;
   private boolean brk9PP5 ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String[] aP16 ;
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
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PP2_A396EmprCod ;
   private String[] P09PP2_A5533Lb_ArtCod ;
   private int[] P09PP2_A252CliCod ;
   private String[] P09PP2_A5570Lb_Tipo ;
   private java.util.Date[] P09PP2_A5541Lb_FechaE ;
   private String[] P09PP2_A5540Lb_Cartaz ;
   private String[] P09PP2_A5538Lb_ColNomC ;
   private String[] P09PP2_A5536Lb_ColNom ;
   private String[] P09PP2_A279CliNom ;
   private int[] P09PP2_A5532Lb_numero ;
   private String[] P09PP3_A396EmprCod ;
   private int[] P09PP3_A5532Lb_numero ;
   private java.util.Date[] P09PP3_A5563Lb_FechaR ;
   private java.util.Date[] P09PP3_A5567Lb_FechaEn ;
   private java.util.Date[] P09PP3_A6461Lb_FecNoa1 ;
   private String[] P09PP3_A5555Lb_opcion ;
   private String[] P09PP4_A396EmprCod ;
   private int[] P09PP4_A5532Lb_numero ;
   private java.util.Date[] P09PP4_A5567Lb_FechaEn ;
   private java.util.Date[] P09PP4_A5563Lb_FechaR ;
   private java.util.Date[] P09PP4_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09PP4_A6460Lb_FecEnt1 ;
   private String[] P09PP4_A5555Lb_opcion ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class tiempomedioaprobacion_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51PCliCod ,
                                          int AV53UCliCod ,
                                          String AV18Cartazi ,
                                          String AV17Cartazf ,
                                          java.util.Date AV26Fechaei ,
                                          java.util.Date AV25Fechaef ,
                                          String AV16ArtCodi ,
                                          String AV15ArtCodf ,
                                          int A252CliCod ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A5533Lb_ArtCod ,
                                          String A5570Lb_Tipo ,
                                          String AV63PTipo ,
                                          String AV64UTipo ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ArtCod, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_Cartaz, T1.Lb_ColNomC, T1.Lb_ColNom, T2.CliNom, T1.Lb_numero FROM (TXPENS001 T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Tipo >= ?)");
      addWhere(sWhereString, "(T1.Lb_Tipo <= ?)");
      if ( ! (0==AV51PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV53UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Cartazi)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Cartazf)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26Fechaei)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25Fechaef)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16ArtCodi)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15ArtCodf)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.Lb_Cartaz" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09PP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV28Fechaeni ,
                                          java.util.Date AV27Fechaenf ,
                                          java.util.Date AV65Fechari ,
                                          java.util.Date AV66Fecharf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_FechaEn, Lb_FecNoa1, Lb_opcion FROM TXPENS002" ;
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
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Fechari)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Fecharf)) )
      {
         addWhere(sWhereString, "(Lb_FechaR <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09PP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV28Fechaeni ,
                                          java.util.Date AV27Fechaenf ,
                                          java.util.Date AV65Fechari ,
                                          java.util.Date AV66Fecharf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          int A5532Lb_numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[6];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_FechaR, Lb_FecNoa1, Lb_FecEnt1, Lb_opcion FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Lb_numero = ?)");
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
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Fechari)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Fecharf)) )
      {
         addWhere(sWhereString, "(Lb_FechaR <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_FecEnt1" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09PP2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P09PP3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() );
            case 2 :
                  return conditional_P09PP4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               return;
      }
   }

}

