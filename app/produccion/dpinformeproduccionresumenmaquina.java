package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformeproduccionresumenmaquina extends GXProcedure
{
   public dpinformeproduccionresumenmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformeproduccionresumenmaquina.class ), "" );
   }

   public dpinformeproduccionresumenmaquina( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.produccion.SdtSDTInformeProduccionResumenMaquina executeUdp( String aP0 ,
                                                                           byte aP1 ,
                                                                           String aP2 ,
                                                                           String aP3 ,
                                                                           java.util.Date aP4 ,
                                                                           java.util.Date aP5 ,
                                                                           short aP6 ,
                                                                           short aP7 )
   {
      dpinformeproduccionresumenmaquina.this.aP8 = new app.produccion.SdtSDTInformeProduccionResumenMaquina[] {new app.produccion.SdtSDTInformeProduccionResumenMaquina()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        short aP6 ,
                        short aP7 ,
                        app.produccion.SdtSDTInformeProduccionResumenMaquina[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             short aP6 ,
                             short aP7 ,
                             app.produccion.SdtSDTInformeProduccionResumenMaquina[] aP8 )
   {
      dpinformeproduccionresumenmaquina.this.AV12Emprcod = aP0;
      dpinformeproduccionresumenmaquina.this.AV7HisEstReo = aP1;
      dpinformeproduccionresumenmaquina.this.AV10MaqCod_From = aP2;
      dpinformeproduccionresumenmaquina.this.AV11MaqCod_To = aP3;
      dpinformeproduccionresumenmaquina.this.AV5DateTime_From = aP4;
      dpinformeproduccionresumenmaquina.this.AV6DateTime_To = aP5;
      dpinformeproduccionresumenmaquina.this.AV35OperarioFrom = aP6;
      dpinformeproduccionresumenmaquina.this.AV36OperarioTo = aP7;
      dpinformeproduccionresumenmaquina.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV7HisEstReo) ,
                                           AV11MaqCod_To ,
                                           AV10MaqCod_From ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A602MaqCod ,
                                           A4441HisProDTF ,
                                           AV6DateTime_To ,
                                           AV5DateTime_From ,
                                           Short.valueOf(A656ParCod) ,
                                           AV12Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003B2 */
      pr_default.execute(0, new Object[] {AV12Emprcod, AV6DateTime_To, AV5DateTime_From, Byte.valueOf(AV7HisEstReo), AV11MaqCod_To, AV10MaqCod_From});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk3B2 = false ;
         A602MaqCod = P003B2_A602MaqCod[0] ;
         A130BarCodPar = P003B2_A130BarCodPar[0] ;
         A132BarCodReo = P003B2_A132BarCodReo[0] ;
         A129BarCod = P003B2_A129BarCod[0] ;
         A3610HisProLot = P003B2_A3610HisProLot[0] ;
         A396EmprCod = P003B2_A396EmprCod[0] ;
         A461Fase = P003B2_A461Fase[0] ;
         A1525HisProKgr = P003B2_A1525HisProKgr[0] ;
         A1526HisProMtr = P003B2_A1526HisProMtr[0] ;
         A656ParCod = P003B2_A656ParCod[0] ;
         n656ParCod = P003B2_n656ParCod[0] ;
         A3612HisProReo = P003B2_A3612HisProReo[0] ;
         A606MaqDsc = P003B2_A606MaqDsc[0] ;
         n606MaqDsc = P003B2_n606MaqDsc[0] ;
         A4440HisProDTI = P003B2_A4440HisProDTI[0] ;
         n4440HisProDTI = P003B2_n4440HisProDTI[0] ;
         A4441HisProDTF = P003B2_A4441HisProDTF[0] ;
         n4441HisProDTF = P003B2_n4441HisProDTF[0] ;
         A558HisProFec = P003B2_A558HisProFec[0] ;
         A561HisProLin = P003B2_A561HisProLin[0] ;
         A606MaqDsc = P003B2_A606MaqDsc[0] ;
         n606MaqDsc = P003B2_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdtinformeproduccionresumenmaquina_maquina = (app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)new app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem(remoteHandle, context);
         Gxm2sdtinformeproduccionresumenmaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().add(Gxm1sdtinformeproduccionresumenmaquina_maquina, 0);
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod( A396EmprCod );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod( A602MaqCod );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc( A606MaqDsc );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf( A4441HisProDTF );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod( A656ParCod );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo( A3612HisProReo );
         AV13HisProKgr = DecimalUtil.ZERO ;
         AV14HisProMtr = DecimalUtil.ZERO ;
         AV20Minutos = 0 ;
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar( GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
         GXt_int1 = AV15GruLec ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( AV12Emprcod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
         dpinformeproduccionresumenmaquina.this.GXt_int1 = GXv_int2[0] ;
         AV15GruLec = GXt_int1 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P003B2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P003B2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk3B2 = false ;
            A130BarCodPar = P003B2_A130BarCodPar[0] ;
            A132BarCodReo = P003B2_A132BarCodReo[0] ;
            A129BarCod = P003B2_A129BarCod[0] ;
            A3610HisProLot = P003B2_A3610HisProLot[0] ;
            A461Fase = P003B2_A461Fase[0] ;
            A1525HisProKgr = P003B2_A1525HisProKgr[0] ;
            A1526HisProMtr = P003B2_A1526HisProMtr[0] ;
            A4440HisProDTI = P003B2_A4440HisProDTI[0] ;
            n4440HisProDTI = P003B2_n4440HisProDTI[0] ;
            A4441HisProDTF = P003B2_A4441HisProDTF[0] ;
            n4441HisProDTF = P003B2_n4441HisProDTF[0] ;
            A558HisProFec = P003B2_A558HisProFec[0] ;
            A561HisProLin = P003B2_A561HisProLin[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV19FlagMarca = (byte)(0) ;
            AV21HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV19FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV21HisProLot)==0) ? 1 : AV19FlagMarca)) ;
            GXt_char3 = AV37FasActTin ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char5[0] = A461Fase ;
            GXv_char6[0] = GXt_char3 ;
            new app.pfasest(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
            dpinformeproduccionresumenmaquina.this.A396EmprCod = GXv_char4[0] ;
            dpinformeproduccionresumenmaquina.this.A461Fase = GXv_char5[0] ;
            dpinformeproduccionresumenmaquina.this.GXt_char3 = GXv_char6[0] ;
            AV37FasActTin = GXt_char3 ;
            AV19FlagMarca = (byte)(((AV15GruLec==0)&&(GXutil.strcmp(AV37FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV19FlagMarca)) ;
            AV19FlagMarca = (byte)(((AV15GruLec==1)&&(GXutil.strcmp(A3610HisProLot, AV21HisProLot)==0)&&(GXutil.strcmp(AV37FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV19FlagMarca)) ;
            AV13HisProKgr = AV13HisProKgr.add(A1525HisProKgr) ;
            AV14HisProMtr = AV14HisProMtr.add(A1526HisProMtr) ;
            AV31HisProTr2 = (short)(((AV19FlagMarca==1) ? A5605HisProTr2 : 0)) ;
            AV20Minutos = (int)(AV20Minutos+AV31HisProTr2) ;
            brk3B2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr( AV13HisProKgr );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr( AV14HisProMtr );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos( AV20Minutos );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo( DecimalUtil.doubleToDec(0) );
         Gxm1sdtinformeproduccionresumenmaquina_maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro( DecimalUtil.doubleToDec(0) );
         if ( ! brk3B2 )
         {
            brk3B2 = true ;
            pr_default.readNext(0);
         }
      }
      Gxm2sdtinformeproduccionresumenmaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg( AV13HisProKgr.add(AV13HisProKgr) );
      Gxm2sdtinformeproduccionresumenmaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt( AV14HisProMtr.add(AV14HisProMtr) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpinformeproduccionresumenmaquina.this.Gxm2sdtinformeproduccionresumenmaquina;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2sdtinformeproduccionresumenmaquina = new app.produccion.SdtSDTInformeProduccionResumenMaquina(remoteHandle, context);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P003B2_A602MaqCod = new String[] {""} ;
      P003B2_A130BarCodPar = new String[] {""} ;
      P003B2_A132BarCodReo = new byte[1] ;
      P003B2_A129BarCod = new int[1] ;
      P003B2_A3610HisProLot = new String[] {""} ;
      P003B2_A396EmprCod = new String[] {""} ;
      P003B2_A461Fase = new String[] {""} ;
      P003B2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003B2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003B2_A656ParCod = new short[1] ;
      P003B2_n656ParCod = new boolean[] {false} ;
      P003B2_A3612HisProReo = new byte[1] ;
      P003B2_A606MaqDsc = new String[] {""} ;
      P003B2_n606MaqDsc = new boolean[] {false} ;
      P003B2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P003B2_n4440HisProDTI = new boolean[] {false} ;
      P003B2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P003B2_n4441HisProDTF = new boolean[] {false} ;
      P003B2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003B2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A461Fase = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtinformeproduccionresumenmaquina_maquina = new app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem(remoteHandle, context);
      AV13HisProKgr = DecimalUtil.ZERO ;
      AV14HisProMtr = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      AV21HisProLot = "" ;
      AV37FasActTin = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.dpinformeproduccionresumenmaquina__default(),
         new Object[] {
             new Object[] {
            P003B2_A602MaqCod, P003B2_A130BarCodPar, P003B2_A132BarCodReo, P003B2_A129BarCod, P003B2_A3610HisProLot, P003B2_A396EmprCod, P003B2_A461Fase, P003B2_A1525HisProKgr, P003B2_A1526HisProMtr, P003B2_A656ParCod,
            P003B2_n656ParCod, P003B2_A3612HisProReo, P003B2_A606MaqDsc, P003B2_n606MaqDsc, P003B2_A4440HisProDTI, P003B2_n4440HisProDTI, P003B2_A4441HisProDTF, P003B2_n4441HisProDTF, P003B2_A558HisProFec, P003B2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV7HisEstReo ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private byte AV15GruLec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV19FlagMarca ;
   private short AV35OperarioFrom ;
   private short AV36OperarioTo ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV31HisProTr2 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV20Minutos ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV13HisProKgr ;
   private java.math.BigDecimal AV14HisProMtr ;
   private String AV12Emprcod ;
   private String AV10MaqCod_From ;
   private String AV11MaqCod_To ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A461Fase ;
   private String A606MaqDsc ;
   private String AV21HisProLot ;
   private String AV37FasActTin ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private java.util.Date AV5DateTime_From ;
   private java.util.Date AV6DateTime_To ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean brk3B2 ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P003B2_A602MaqCod ;
   private String[] P003B2_A130BarCodPar ;
   private byte[] P003B2_A132BarCodReo ;
   private int[] P003B2_A129BarCod ;
   private String[] P003B2_A3610HisProLot ;
   private String[] P003B2_A396EmprCod ;
   private String[] P003B2_A461Fase ;
   private java.math.BigDecimal[] P003B2_A1525HisProKgr ;
   private java.math.BigDecimal[] P003B2_A1526HisProMtr ;
   private short[] P003B2_A656ParCod ;
   private boolean[] P003B2_n656ParCod ;
   private byte[] P003B2_A3612HisProReo ;
   private String[] P003B2_A606MaqDsc ;
   private boolean[] P003B2_n606MaqDsc ;
   private java.util.Date[] P003B2_A4440HisProDTI ;
   private boolean[] P003B2_n4440HisProDTI ;
   private java.util.Date[] P003B2_A4441HisProDTF ;
   private boolean[] P003B2_n4441HisProDTF ;
   private java.util.Date[] P003B2_A558HisProFec ;
   private int[] P003B2_A561HisProLin ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina Gxm2sdtinformeproduccionresumenmaquina ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem Gxm1sdtinformeproduccionresumenmaquina_maquina ;
}

final  class dpinformeproduccionresumenmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV7HisEstReo ,
                                          String AV11MaqCod_To ,
                                          String AV10MaqCod_From ,
                                          byte A3612HisProReo ,
                                          String A602MaqCod ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV6DateTime_To ,
                                          java.util.Date AV5DateTime_From ,
                                          short A656ParCod ,
                                          String AV12Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[6];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.EmprCod, T1.Fase, T1.HisProKgr, T1.HisProMtr, T1.ParCod, T1.HisProReo, T2.MaqDsc, T1.HisProDTI," ;
      scmdbuf += " T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.ParCod = 0)");
      if ( ! ( AV7HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11MaqCod_To)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10MaqCod_From)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P003B2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               return;
      }
   }

}

