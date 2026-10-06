package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class in_alertasanalisis_pr extends GXProcedure
{
   public in_alertasanalisis_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( in_alertasanalisis_pr.class ), "" );
   }

   public in_alertasanalisis_pr( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> executeUdp( java.util.Date aP0 ,
                                                                                                            java.util.Date aP1 ,
                                                                                                            GXSimpleCollection<String> aP2 ,
                                                                                                            int aP3 ,
                                                                                                            GXSimpleCollection<String> aP4 ,
                                                                                                            GXSimpleCollection<String> aP5 ,
                                                                                                            GXSimpleCollection<Short> aP6 )
   {
      in_alertasanalisis_pr.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( java.util.Date aP0 ,
                        java.util.Date aP1 ,
                        GXSimpleCollection<String> aP2 ,
                        int aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        GXSimpleCollection<Short> aP6 ,
                        GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( java.util.Date aP0 ,
                             java.util.Date aP1 ,
                             GXSimpleCollection<String> aP2 ,
                             int aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             GXSimpleCollection<Short> aP6 ,
                             GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>[] aP7 )
   {
      in_alertasanalisis_pr.this.AV13Desde_Fecha = aP0;
      in_alertasanalisis_pr.this.AV15Hasta_Fecha = aP1;
      in_alertasanalisis_pr.this.AV16MaqCod = aP2;
      in_alertasanalisis_pr.this.AV12CliCod = aP3;
      in_alertasanalisis_pr.this.AV11ArtCod = aP4;
      in_alertasanalisis_pr.this.AV14FasCod = aP5;
      in_alertasanalisis_pr.this.AV17ParFasCod = aP6;
      in_alertasanalisis_pr.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A461Fase ,
                                           AV14FasCod ,
                                           Integer.valueOf(AV14FasCod.size()) ,
                                           Integer.valueOf(AV12CliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           A212BarSer ,
                                           A4441HisProDTF ,
                                           AV13Desde_Fecha ,
                                           AV15Hasta_Fecha } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P09NI2 */
      pr_default.execute(0, new Object[] {AV13Desde_Fecha, AV15Hasta_Fecha, Integer.valueOf(AV12CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09NI2_A252CliCod[0] ;
         n252CliCod = P09NI2_n252CliCod[0] ;
         A212BarSer = P09NI2_A212BarSer[0] ;
         A129BarCod = P09NI2_A129BarCod[0] ;
         A602MaqCod = P09NI2_A602MaqCod[0] ;
         A561HisProLin = P09NI2_A561HisProLin[0] ;
         A132BarCodReo = P09NI2_A132BarCodReo[0] ;
         A130BarCodPar = P09NI2_A130BarCodPar[0] ;
         A194BarOrdLin = P09NI2_A194BarOrdLin[0] ;
         A568HisProUni = P09NI2_A568HisProUni[0] ;
         A566HisProTur = P09NI2_A566HisProTur[0] ;
         A557HisProF = P09NI2_A557HisProF[0] ;
         A656ParCod = P09NI2_A656ParCod[0] ;
         n656ParCod = P09NI2_n656ParCod[0] ;
         A565HisProTte = P09NI2_A565HisProTte[0] ;
         A543HisBarTip = P09NI2_A543HisBarTip[0] ;
         A556HisProEst = P09NI2_A556HisProEst[0] ;
         A1525HisProKgr = P09NI2_A1525HisProKgr[0] ;
         A1526HisProMtr = P09NI2_A1526HisProMtr[0] ;
         A2247HisProTip = P09NI2_A2247HisProTip[0] ;
         A2504HisProCod = P09NI2_A2504HisProCod[0] ;
         A3610HisProLot = P09NI2_A3610HisProLot[0] ;
         A3611HisProTc = P09NI2_A3611HisProTc[0] ;
         A3612HisProReo = P09NI2_A3612HisProReo[0] ;
         A4439HisProBot = P09NI2_A4439HisProBot[0] ;
         A4704HisProNPar = P09NI2_A4704HisProNPar[0] ;
         A4714HisProNpzs = P09NI2_A4714HisProNpzs[0] ;
         A5339HisProBan = P09NI2_A5339HisProBan[0] ;
         A5606HisProDi = P09NI2_A5606HisProDi[0] ;
         A5607HisProHi = P09NI2_A5607HisProHi[0] ;
         A5608HisProDf = P09NI2_A5608HisProDf[0] ;
         A5609HisProHf = P09NI2_A5609HisProHf[0] ;
         A6680HisproTdab = P09NI2_A6680HisproTdab[0] ;
         A6819HisproNPd = P09NI2_A6819HisproNPd[0] ;
         A7394HisProCtr = P09NI2_A7394HisProCtr[0] ;
         A8566HisproGf = P09NI2_A8566HisproGf[0] ;
         A4003HisHhMaq = P09NI2_A4003HisHhMaq[0] ;
         A1060HisHhIni = P09NI2_A1060HisHhIni[0] ;
         A10359HisProMq = P09NI2_A10359HisProMq[0] ;
         A10360HisProFd = P09NI2_A10360HisProFd[0] ;
         A13124HisProDibC = P09NI2_A13124HisProDibC[0] ;
         A13125HisProDibI = P09NI2_A13125HisProDibI[0] ;
         A13126HisProCom = P09NI2_A13126HisProCom[0] ;
         A13127HisProFon = P09NI2_A13127HisProFon[0] ;
         A13128HisProMtHd = P09NI2_A13128HisProMtHd[0] ;
         A13129HisProKgHd = P09NI2_A13129HisProKgHd[0] ;
         A13130HisProPzHd = P09NI2_A13130HisProPzHd[0] ;
         A279CliNom = P09NI2_A279CliNom[0] ;
         A1652BarSerDsc = P09NI2_A1652BarSerDsc[0] ;
         A4440HisProDTI = P09NI2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09NI2_n4440HisProDTI[0] ;
         A4441HisProDTF = P09NI2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09NI2_n4441HisProDTF[0] ;
         A563HisProMin = P09NI2_A563HisProMin[0] ;
         A560HisProHin = P09NI2_A560HisProHin[0] ;
         A562HisProMfi = P09NI2_A562HisProMfi[0] ;
         A559HisProHfi = P09NI2_A559HisProHfi[0] ;
         A461Fase = P09NI2_A461Fase[0] ;
         A396EmprCod = P09NI2_A396EmprCod[0] ;
         A558HisProFec = P09NI2_A558HisProFec[0] ;
         A252CliCod = P09NI2_A252CliCod[0] ;
         n252CliCod = P09NI2_n252CliCod[0] ;
         A212BarSer = P09NI2_A212BarSer[0] ;
         A1652BarSerDsc = P09NI2_A1652BarSerDsc[0] ;
         A279CliNom = P09NI2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "SERM01", "")) == 0 ) || ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "SERM01", "")) == 0 ) || ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "SERM01", "")) == 0 ) )
         {
            if ( ( GXutil.strcmp(A212BarSer, httpContext.getMessage( "K498-2D25-HT", "")) == 0 ) || ( GXutil.strcmp(A212BarSer, httpContext.getMessage( "K498-SI25-HT", "")) == 0 ) )
            {
               GXt_char1 = A7258FaseDsc ;
               GXv_char2[0] = GXt_char1 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
               in_alertasanalisis_pr.this.GXt_char1 = GXv_char2[0] ;
               A7258FaseDsc = GXt_char1 ;
               if ( A560HisProHin <= A559HisProHfi )
               {
                  A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
               }
               else
               {
                  A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
               }
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
               {
                  A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               }
               else
               {
                  A5605HisProTr2 = (short)(0) ;
               }
               AV8Alerta = (app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)new app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem(remoteHandle, context);
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod( A396EmprCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod( A602MaqCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin( A561HisProLin );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod( A129BarCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo( A132BarCodReo );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar( A130BarCodPar );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin( A194BarOrdLin );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase( A461Fase );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc( A7258FaseDsc );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni( A568HisProUni );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur( A566HisProTur );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin( A560HisProHin );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin( A563HisProMin );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi( A559HisProHfi );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi( A562HisProMfi );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof( A557HisProF );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod( A656ParCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre( A564HisProTre );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte( A565HisProTte );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip( A543HisBarTip );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest( A556HisProEst );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr( A1525HisProKgr );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr( A1526HisProMtr );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip( A2247HisProTip );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod( A2504HisProCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot( A3610HisProLot );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc( A3611HisProTc );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo( A3612HisProReo );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot( A4439HisProBot );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart( A4704HisProNPar );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs( A4714HisProNpzs );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban( A5339HisProBan );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi( A5606HisProDi );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi( A5607HisProHi );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf( A5608HisProDf );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf( A5609HisProHf );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti( A4440HisProDTI );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf( A4441HisProDTF );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2( A5605HisProTr2 );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab( A6680HisproTdab );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd( A6819HisproNPd );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr( A7394HisProCtr );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf( A8566HisproGf );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq( A4003HisHhMaq );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini( A1060HisHhIni );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq( A10359HisProMq );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd( A10360HisProFd );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc( A13124HisProDibC );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi( A13125HisProDibI );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom( A13126HisProCom );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon( A13127HisProFon );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd( A13128HisProMtHd );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd( A13129HisProKgHd );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd( A13130HisProPzHd );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod( A252CliCod );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom( A279CliNom );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser( A212BarSer );
               AV8Alerta.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc( A1652BarSerDsc );
               pr_default.dynParam(1, new Object[]{ new Object[]{
                                                    Short.valueOf(A1664ParFasCod) ,
                                                    AV17ParFasCod ,
                                                    Integer.valueOf(AV17ParFasCod.size()) ,
                                                    Short.valueOf(A194BarOrdLin) ,
                                                    Short.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin()) ,
                                                    AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod() ,
                                                    Integer.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod()) ,
                                                    Byte.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo()) ,
                                                    AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar() ,
                                                    A396EmprCod ,
                                                    Integer.valueOf(A129BarCod) ,
                                                    Byte.valueOf(A132BarCodReo) ,
                                                    A130BarCodPar } ,
                                                    new int[]{
                                                    TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                                    TypeConstants.BYTE, TypeConstants.STRING
                                                    }
               });
               /* Using cursor P09NI3 */
               pr_default.execute(1, new Object[] {AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod(), Integer.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod()), Byte.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo()), AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar(), Short.valueOf(AV8Alerta.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin())});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A1664ParFasCod = P09NI3_A1664ParFasCod[0] ;
                  A130BarCodPar = P09NI3_A130BarCodPar[0] ;
                  A194BarOrdLin = P09NI3_A194BarOrdLin[0] ;
                  A132BarCodReo = P09NI3_A132BarCodReo[0] ;
                  A129BarCod = P09NI3_A129BarCod[0] ;
                  A396EmprCod = P09NI3_A396EmprCod[0] ;
                  A1665ParFasDsc = P09NI3_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P09NI3_n1665ParFasDsc[0] ;
                  A12671BarParVl2 = P09NI3_A12671BarParVl2[0] ;
                  A13991BarParVMn = P09NI3_A13991BarParVMn[0] ;
                  A13992BarParVMx = P09NI3_A13992BarParVMx[0] ;
                  A9737BarValPar = P09NI3_A9737BarValPar[0] ;
                  A758ProCod = P09NI3_A758ProCod[0] ;
                  A1665ParFasDsc = P09NI3_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P09NI3_n1665ParFasDsc[0] ;
                  AV9Alerta1 = (app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)new app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem(remoteHandle, context);
                  AV9Alerta1 = AV8Alerta.Clone();
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod( A1664ParFasCod );
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc( A1665ParFasDsc );
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2( A12671BarParVl2 );
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn( A13991BarParVMn );
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx( A13992BarParVMx );
                  AV9Alerta1.setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar( A9737BarValPar );
                  AV10Alertas.add(AV9Alerta1, 0);
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = in_alertasanalisis_pr.this.AV10Alertas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Alertas = new GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>(app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem.class, "In_AlertasAnalisis_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A461Fase = "" ;
      A602MaqCod = "" ;
      A212BarSer = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      P09NI2_A252CliCod = new int[1] ;
      P09NI2_n252CliCod = new boolean[] {false} ;
      P09NI2_A212BarSer = new String[] {""} ;
      P09NI2_A129BarCod = new int[1] ;
      P09NI2_A602MaqCod = new String[] {""} ;
      P09NI2_A561HisProLin = new int[1] ;
      P09NI2_A132BarCodReo = new byte[1] ;
      P09NI2_A130BarCodPar = new String[] {""} ;
      P09NI2_A194BarOrdLin = new short[1] ;
      P09NI2_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A566HisProTur = new byte[1] ;
      P09NI2_A557HisProF = new String[] {""} ;
      P09NI2_A656ParCod = new short[1] ;
      P09NI2_n656ParCod = new boolean[] {false} ;
      P09NI2_A565HisProTte = new short[1] ;
      P09NI2_A543HisBarTip = new byte[1] ;
      P09NI2_A556HisProEst = new byte[1] ;
      P09NI2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A2247HisProTip = new short[1] ;
      P09NI2_A2504HisProCod = new String[] {""} ;
      P09NI2_A3610HisProLot = new String[] {""} ;
      P09NI2_A3611HisProTc = new byte[1] ;
      P09NI2_A3612HisProReo = new byte[1] ;
      P09NI2_A4439HisProBot = new int[1] ;
      P09NI2_A4704HisProNPar = new int[1] ;
      P09NI2_A4714HisProNpzs = new short[1] ;
      P09NI2_A5339HisProBan = new String[] {""} ;
      P09NI2_A5606HisProDi = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_A5607HisProHi = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_A6680HisproTdab = new short[1] ;
      P09NI2_A6819HisproNPd = new byte[1] ;
      P09NI2_A7394HisProCtr = new String[] {""} ;
      P09NI2_A8566HisproGf = new short[1] ;
      P09NI2_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A10359HisProMq = new String[] {""} ;
      P09NI2_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_A13124HisProDibC = new String[] {""} ;
      P09NI2_A13125HisProDibI = new int[1] ;
      P09NI2_A13126HisProCom = new String[] {""} ;
      P09NI2_A13127HisProFon = new String[] {""} ;
      P09NI2_A13128HisProMtHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A13129HisProKgHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NI2_A13130HisProPzHd = new int[1] ;
      P09NI2_A279CliNom = new String[] {""} ;
      P09NI2_A1652BarSerDsc = new String[] {""} ;
      P09NI2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_n4440HisProDTI = new boolean[] {false} ;
      P09NI2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09NI2_n4441HisProDTF = new boolean[] {false} ;
      P09NI2_A563HisProMin = new byte[1] ;
      P09NI2_A560HisProHin = new byte[1] ;
      P09NI2_A562HisProMfi = new byte[1] ;
      P09NI2_A559HisProHfi = new byte[1] ;
      P09NI2_A461Fase = new String[] {""} ;
      P09NI2_A396EmprCod = new String[] {""} ;
      P09NI2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A2504HisProCod = "" ;
      A3610HisProLot = "" ;
      A5339HisProBan = "" ;
      A5606HisProDi = GXutil.nullDate() ;
      A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      A5608HisProDf = GXutil.nullDate() ;
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A7394HisProCtr = "" ;
      A4003HisHhMaq = DecimalUtil.ZERO ;
      A1060HisHhIni = DecimalUtil.ZERO ;
      A10359HisProMq = "" ;
      A10360HisProFd = GXutil.nullDate() ;
      A13124HisProDibC = "" ;
      A13126HisProCom = "" ;
      A13127HisProFon = "" ;
      A13128HisProMtHd = DecimalUtil.ZERO ;
      A13129HisProKgHd = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A7258FaseDsc = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8Alerta = new app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem(remoteHandle, context);
      P09NI3_A1664ParFasCod = new short[1] ;
      P09NI3_A130BarCodPar = new String[] {""} ;
      P09NI3_A194BarOrdLin = new short[1] ;
      P09NI3_A132BarCodReo = new byte[1] ;
      P09NI3_A129BarCod = new int[1] ;
      P09NI3_A396EmprCod = new String[] {""} ;
      P09NI3_A1665ParFasDsc = new String[] {""} ;
      P09NI3_n1665ParFasDsc = new boolean[] {false} ;
      P09NI3_A12671BarParVl2 = new String[] {""} ;
      P09NI3_A13991BarParVMn = new String[] {""} ;
      P09NI3_A13992BarParVMx = new String[] {""} ;
      P09NI3_A9737BarValPar = new String[] {""} ;
      P09NI3_A758ProCod = new String[] {""} ;
      A1665ParFasDsc = "" ;
      A12671BarParVl2 = "" ;
      A13991BarParVMn = "" ;
      A13992BarParVMx = "" ;
      A9737BarValPar = "" ;
      A758ProCod = "" ;
      AV9Alerta1 = new app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.in_alertasanalisis_pr__default(),
         new Object[] {
             new Object[] {
            P09NI2_A252CliCod, P09NI2_n252CliCod, P09NI2_A212BarSer, P09NI2_A129BarCod, P09NI2_A602MaqCod, P09NI2_A561HisProLin, P09NI2_A132BarCodReo, P09NI2_A130BarCodPar, P09NI2_A194BarOrdLin, P09NI2_A568HisProUni,
            P09NI2_A566HisProTur, P09NI2_A557HisProF, P09NI2_A656ParCod, P09NI2_n656ParCod, P09NI2_A565HisProTte, P09NI2_A543HisBarTip, P09NI2_A556HisProEst, P09NI2_A1525HisProKgr, P09NI2_A1526HisProMtr, P09NI2_A2247HisProTip,
            P09NI2_A2504HisProCod, P09NI2_A3610HisProLot, P09NI2_A3611HisProTc, P09NI2_A3612HisProReo, P09NI2_A4439HisProBot, P09NI2_A4704HisProNPar, P09NI2_A4714HisProNpzs, P09NI2_A5339HisProBan, P09NI2_A5606HisProDi, P09NI2_A5607HisProHi,
            P09NI2_A5608HisProDf, P09NI2_A5609HisProHf, P09NI2_A6680HisproTdab, P09NI2_A6819HisproNPd, P09NI2_A7394HisProCtr, P09NI2_A8566HisproGf, P09NI2_A4003HisHhMaq, P09NI2_A1060HisHhIni, P09NI2_A10359HisProMq, P09NI2_A10360HisProFd,
            P09NI2_A13124HisProDibC, P09NI2_A13125HisProDibI, P09NI2_A13126HisProCom, P09NI2_A13127HisProFon, P09NI2_A13128HisProMtHd, P09NI2_A13129HisProKgHd, P09NI2_A13130HisProPzHd, P09NI2_A279CliNom, P09NI2_A1652BarSerDsc, P09NI2_A4440HisProDTI,
            P09NI2_n4440HisProDTI, P09NI2_A4441HisProDTF, P09NI2_n4441HisProDTF, P09NI2_A563HisProMin, P09NI2_A560HisProHin, P09NI2_A562HisProMfi, P09NI2_A559HisProHfi, P09NI2_A461Fase, P09NI2_A396EmprCod, P09NI2_A558HisProFec
            }
            , new Object[] {
            P09NI3_A1664ParFasCod, P09NI3_A130BarCodPar, P09NI3_A194BarOrdLin, P09NI3_A132BarCodReo, P09NI3_A129BarCod, P09NI3_A396EmprCod, P09NI3_A1665ParFasDsc, P09NI3_n1665ParFasDsc, P09NI3_A12671BarParVl2, P09NI3_A13991BarParVMn,
            P09NI3_A13992BarParVMx, P09NI3_A9737BarValPar, P09NI3_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A543HisBarTip ;
   private byte A556HisProEst ;
   private byte A3611HisProTc ;
   private byte A3612HisProReo ;
   private byte A6819HisproNPd ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short A565HisProTte ;
   private short A2247HisProTip ;
   private short A4714HisProNpzs ;
   private short A6680HisproTdab ;
   private short A8566HisproGf ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int AV12CliCod ;
   private int AV14FasCod_size ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int A4439HisProBot ;
   private int A4704HisProNPar ;
   private int A13125HisProDibI ;
   private int A13130HisProPzHd ;
   private int AV17ParFasCod_size ;
   private int AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A4003HisHhMaq ;
   private java.math.BigDecimal A1060HisHhIni ;
   private java.math.BigDecimal A13128HisProMtHd ;
   private java.math.BigDecimal A13129HisProKgHd ;
   private String scmdbuf ;
   private String A461Fase ;
   private String A602MaqCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A557HisProF ;
   private String A2504HisProCod ;
   private String A3610HisProLot ;
   private String A5339HisProBan ;
   private String A7394HisProCtr ;
   private String A10359HisProMq ;
   private String A13124HisProDibC ;
   private String A13126HisProCom ;
   private String A13127HisProFon ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String A7258FaseDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ;
   private String AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ;
   private String A1665ParFasDsc ;
   private String A12671BarParVl2 ;
   private String A13991BarParVMn ;
   private String A13992BarParVMx ;
   private String A9737BarValPar ;
   private String A758ProCod ;
   private java.util.Date AV13Desde_Fecha ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A5607HisProHi ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV15Hasta_Fecha ;
   private java.util.Date A5606HisProDi ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private boolean n252CliCod ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n1665ParFasDsc ;
   private GXSimpleCollection<Short> AV17ParFasCod ;
   private GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P09NI2_A252CliCod ;
   private boolean[] P09NI2_n252CliCod ;
   private String[] P09NI2_A212BarSer ;
   private int[] P09NI2_A129BarCod ;
   private String[] P09NI2_A602MaqCod ;
   private int[] P09NI2_A561HisProLin ;
   private byte[] P09NI2_A132BarCodReo ;
   private String[] P09NI2_A130BarCodPar ;
   private short[] P09NI2_A194BarOrdLin ;
   private java.math.BigDecimal[] P09NI2_A568HisProUni ;
   private byte[] P09NI2_A566HisProTur ;
   private String[] P09NI2_A557HisProF ;
   private short[] P09NI2_A656ParCod ;
   private boolean[] P09NI2_n656ParCod ;
   private short[] P09NI2_A565HisProTte ;
   private byte[] P09NI2_A543HisBarTip ;
   private byte[] P09NI2_A556HisProEst ;
   private java.math.BigDecimal[] P09NI2_A1525HisProKgr ;
   private java.math.BigDecimal[] P09NI2_A1526HisProMtr ;
   private short[] P09NI2_A2247HisProTip ;
   private String[] P09NI2_A2504HisProCod ;
   private String[] P09NI2_A3610HisProLot ;
   private byte[] P09NI2_A3611HisProTc ;
   private byte[] P09NI2_A3612HisProReo ;
   private int[] P09NI2_A4439HisProBot ;
   private int[] P09NI2_A4704HisProNPar ;
   private short[] P09NI2_A4714HisProNpzs ;
   private String[] P09NI2_A5339HisProBan ;
   private java.util.Date[] P09NI2_A5606HisProDi ;
   private java.util.Date[] P09NI2_A5607HisProHi ;
   private java.util.Date[] P09NI2_A5608HisProDf ;
   private java.util.Date[] P09NI2_A5609HisProHf ;
   private short[] P09NI2_A6680HisproTdab ;
   private byte[] P09NI2_A6819HisproNPd ;
   private String[] P09NI2_A7394HisProCtr ;
   private short[] P09NI2_A8566HisproGf ;
   private java.math.BigDecimal[] P09NI2_A4003HisHhMaq ;
   private java.math.BigDecimal[] P09NI2_A1060HisHhIni ;
   private String[] P09NI2_A10359HisProMq ;
   private java.util.Date[] P09NI2_A10360HisProFd ;
   private String[] P09NI2_A13124HisProDibC ;
   private int[] P09NI2_A13125HisProDibI ;
   private String[] P09NI2_A13126HisProCom ;
   private String[] P09NI2_A13127HisProFon ;
   private java.math.BigDecimal[] P09NI2_A13128HisProMtHd ;
   private java.math.BigDecimal[] P09NI2_A13129HisProKgHd ;
   private int[] P09NI2_A13130HisProPzHd ;
   private String[] P09NI2_A279CliNom ;
   private String[] P09NI2_A1652BarSerDsc ;
   private java.util.Date[] P09NI2_A4440HisProDTI ;
   private boolean[] P09NI2_n4440HisProDTI ;
   private java.util.Date[] P09NI2_A4441HisProDTF ;
   private boolean[] P09NI2_n4441HisProDTF ;
   private byte[] P09NI2_A563HisProMin ;
   private byte[] P09NI2_A560HisProHin ;
   private byte[] P09NI2_A562HisProMfi ;
   private byte[] P09NI2_A559HisProHfi ;
   private String[] P09NI2_A461Fase ;
   private String[] P09NI2_A396EmprCod ;
   private java.util.Date[] P09NI2_A558HisProFec ;
   private short[] P09NI3_A1664ParFasCod ;
   private String[] P09NI3_A130BarCodPar ;
   private short[] P09NI3_A194BarOrdLin ;
   private byte[] P09NI3_A132BarCodReo ;
   private int[] P09NI3_A129BarCod ;
   private String[] P09NI3_A396EmprCod ;
   private String[] P09NI3_A1665ParFasDsc ;
   private boolean[] P09NI3_n1665ParFasDsc ;
   private String[] P09NI3_A12671BarParVl2 ;
   private String[] P09NI3_A13991BarParVMn ;
   private String[] P09NI3_A13992BarParVMx ;
   private String[] P09NI3_A9737BarValPar ;
   private String[] P09NI3_A758ProCod ;
   private GXSimpleCollection<String> AV16MaqCod ;
   private GXSimpleCollection<String> AV11ArtCod ;
   private GXSimpleCollection<String> AV14FasCod ;
   private GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> AV10Alertas ;
   private app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem AV8Alerta ;
   private app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem AV9Alerta1 ;
}

final  class in_alertasanalisis_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A461Fase ,
                                          GXSimpleCollection<String> AV14FasCod ,
                                          int AV14FasCod_size ,
                                          int AV12CliCod ,
                                          int A252CliCod ,
                                          String A602MaqCod ,
                                          int A129BarCod ,
                                          String A212BarSer ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV13Desde_Fecha ,
                                          java.util.Date AV15Hasta_Fecha )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T2.BarSer, T1.BarCod, T1.MaqCod, T1.HisProLin, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.HisProUni, T1.HisProTur, T1.HisProF, T1.ParCod, T1.HisProTte," ;
      scmdbuf += " T1.HisBarTip, T1.HisProEst, T1.HisProKgr, T1.HisProMtr, T1.HisProTip, T1.HisProCod, T1.HisProLot, T1.HisProTc, T1.HisProReo, T1.HisProBot, T1.HisProNPar, T1.HisProNpzs," ;
      scmdbuf += " T1.HisProBan, T1.HisProDi, T1.HisProHi, T1.HisProDf, T1.HisProHf, T1.HisproTdab, T1.HisproNPd, T1.HisProCtr, T1.HisproGf, T1.HisHhMaq, T1.HisHhIni, T1.HisProMq," ;
      scmdbuf += " T1.HisProFd, T1.HisProDibC, T1.HisProDibI, T1.HisProCom, T1.HisProFon, T1.HisProMtHd, T1.HisProKgHd, T1.HisProPzHd, T3.CliNom, T2.BarSerDsc, T1.HisProDTI, T1.HisProDTF," ;
      scmdbuf += " T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.Fase, T1.EmprCod, T1.HisProFec FROM ((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.BarCod = 147506 or T1.BarCod = 148062)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      if ( AV14FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV14FasCod, "T1.Fase IN (", ")")+")");
      }
      if ( ! (0==AV12CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P09NI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A1664ParFasCod ,
                                          GXSimpleCollection<Short> AV17ParFasCod ,
                                          int AV17ParFasCod_size ,
                                          short A194BarOrdLin ,
                                          short AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ,
                                          String AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ,
                                          int AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ,
                                          byte AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ,
                                          String AV8Alerta_getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[5];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ParFasCod, T1.BarCodPar, T1.BarOrdLin, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.ParFasDsc, T1.BarParVl2, T1.BarParVMn, T1.BarParVMx, T1.BarValPar, T1.ProCod" ;
      scmdbuf += " FROM (TXPBarPar T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      if ( AV17ParFasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV17ParFasCod, "T1.ParFasCod IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.ParFasCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09NI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] );
            case 1 :
                  return conditional_P09NI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 15);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(27);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(28));
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(29);
               ((java.util.Date[]) buf[31])[0] = GXutil.resetDate(rslt.getGXDateTime(30));
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 100);
               ((short[]) buf[35])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(36,2);
               ((String[]) buf[38])[0] = rslt.getString(37, 6);
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(38);
               ((String[]) buf[40])[0] = rslt.getString(39, 16);
               ((int[]) buf[41])[0] = rslt.getInt(40);
               ((String[]) buf[42])[0] = rslt.getString(41, 12);
               ((String[]) buf[43])[0] = rslt.getString(42, 12);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((int[]) buf[46])[0] = rslt.getInt(45);
               ((String[]) buf[47])[0] = rslt.getString(46, 30);
               ((String[]) buf[48])[0] = rslt.getString(47, 26);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(48);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDateTime(49);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(50);
               ((byte[]) buf[54])[0] = rslt.getByte(51);
               ((byte[]) buf[55])[0] = rslt.getByte(52);
               ((byte[]) buf[56])[0] = rslt.getByte(53);
               ((String[]) buf[57])[0] = rslt.getString(54, 8);
               ((String[]) buf[58])[0] = rslt.getString(55, 3);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(56);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((String[]) buf[9])[0] = rslt.getString(9, 12);
               ((String[]) buf[10])[0] = rslt.getString(10, 12);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[3], false);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               return;
      }
   }

}

