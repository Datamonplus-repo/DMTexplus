package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cfaven_datos_hash_actual extends GXProcedure
{
   public cfaven_datos_hash_actual( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cfaven_datos_hash_actual.class ), "" );
   }

   public cfaven_datos_hash_actual( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      cfaven_datos_hash_actual.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      cfaven_datos_hash_actual.this.A430FacCod = aP0;
      cfaven_datos_hash_actual.this.AV11TipoFactura = aP1;
      cfaven_datos_hash_actual.this.aP2 = aP2;
      cfaven_datos_hash_actual.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV13FechaISO8601 ;
      new app.aeat.getfechaiso8601(remoteHandle, context).execute( GXv_char1) ;
      cfaven_datos_hash_actual.this.AV13FechaISO8601 = GXv_char1[0] ;
      AV10Separador = "|" ;
      GXt_char2 = AV12EmprCod ;
      GXv_char1[0] = GXt_char2 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char1) ;
      cfaven_datos_hash_actual.this.GXt_char2 = GXv_char1[0] ;
      AV12EmprCod = GXt_char2 ;
      /* Using cursor P0AIN3 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AIN3_A396EmprCod[0] ;
         A395EmprCif = P0AIN3_A395EmprCif[0] ;
         n395EmprCif = P0AIN3_n395EmprCif[0] ;
         A436FacFch = P0AIN3_A436FacFch[0] ;
         A11513FacRecIca = P0AIN3_A11513FacRecIca[0] ;
         A8346FacRecI = P0AIN3_A8346FacRecI[0] ;
         n8346FacRecI = P0AIN3_n8346FacRecI[0] ;
         A7212FacRect = P0AIN3_A7212FacRect[0] ;
         A453FacRECPor = P0AIN3_A453FacRECPor[0] ;
         A14224FacCostFac = P0AIN3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P0AIN3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P0AIN3_A14222FacCostMts[0] ;
         A434FacDtoPP = P0AIN3_A434FacDtoPP[0] ;
         A433FacDtoGen = P0AIN3_A433FacDtoGen[0] ;
         A14219FacEnergia = P0AIN3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P0AIN3_A3918FacImpTot1[0] ;
         A443FacIVAPor = P0AIN3_A443FacIVAPor[0] ;
         A7209Colombia = P0AIN3_A7209Colombia[0] ;
         n7209Colombia = P0AIN3_n7209Colombia[0] ;
         A395EmprCif = P0AIN3_A395EmprCif[0] ;
         n395EmprCif = P0AIN3_n395EmprCif[0] ;
         A7209Colombia = P0AIN3_A7209Colombia[0] ;
         n7209Colombia = P0AIN3_n7209Colombia[0] ;
         A3918FacImpTot1 = P0AIN3_A3918FacImpTot1[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         if ( GXutil.strcmp(AV11TipoFactura, "F1") == 0 )
         {
            AV9OutText = GXutil.trim( A395EmprCif) ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.format( "%1-%2-%3", GXutil.ltrimstr( GXutil.year( A436FacFch), 9, 0), GXutil.padl( GXutil.str( GXutil.month( A436FacFch), 10, 0), (short)(2), "0"), GXutil.padl( GXutil.str( GXutil.day( A436FacFch), 10, 0), (short)(2), "0"), "", "", "", "", "", "") ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.trim( AV11TipoFactura) ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.strReplace( GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)), ",", ".") ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.strReplace( GXutil.trim( GXutil.str( A455FacTot, 13, 2)), ",", ".") ;
            AV9OutText += GXutil.trim( AV10Separador) + GXutil.trim( AV13FechaISO8601) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = cfaven_datos_hash_actual.this.AV13FechaISO8601;
      this.aP3[0] = cfaven_datos_hash_actual.this.AV9OutText;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13FechaISO8601 = "" ;
      AV9OutText = "" ;
      AV10Separador = "" ;
      AV12EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P0AIN3_A430FacCod = new int[1] ;
      P0AIN3_A396EmprCod = new String[] {""} ;
      P0AIN3_A395EmprCif = new String[] {""} ;
      P0AIN3_n395EmprCif = new boolean[] {false} ;
      P0AIN3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AIN3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_n8346FacRecI = new boolean[] {false} ;
      P0AIN3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIN3_A443FacIVAPor = new byte[1] ;
      P0AIN3_A7209Colombia = new byte[1] ;
      P0AIN3_n7209Colombia = new boolean[] {false} ;
      A396EmprCod = "" ;
      A395EmprCif = "" ;
      A436FacFch = GXutil.nullDate() ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.cfaven_datos_hash_actual__default(),
         new Object[] {
             new Object[] {
            P0AIN3_A430FacCod, P0AIN3_A396EmprCod, P0AIN3_A395EmprCif, P0AIN3_n395EmprCif, P0AIN3_A436FacFch, P0AIN3_A11513FacRecIca, P0AIN3_A8346FacRecI, P0AIN3_n8346FacRecI, P0AIN3_A7212FacRect, P0AIN3_A453FacRECPor,
            P0AIN3_A14224FacCostFac, P0AIN3_A14223FacCostKgs, P0AIN3_A14222FacCostMts, P0AIN3_A434FacDtoPP, P0AIN3_A433FacDtoGen, P0AIN3_A14219FacEnergia, P0AIN3_A3918FacImpTot1, P0AIN3_A443FacIVAPor, P0AIN3_A7209Colombia, P0AIN3_n7209Colombia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short Gx_err ;
   private int A430FacCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private String AV10Separador ;
   private String AV12EmprCod ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A395EmprCif ;
   private java.util.Date A436FacFch ;
   private boolean n395EmprCif ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private String AV11TipoFactura ;
   private String AV13FechaISO8601 ;
   private String AV9OutText ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AIN3_A430FacCod ;
   private String[] P0AIN3_A396EmprCod ;
   private String[] P0AIN3_A395EmprCif ;
   private boolean[] P0AIN3_n395EmprCif ;
   private java.util.Date[] P0AIN3_A436FacFch ;
   private java.math.BigDecimal[] P0AIN3_A11513FacRecIca ;
   private java.math.BigDecimal[] P0AIN3_A8346FacRecI ;
   private boolean[] P0AIN3_n8346FacRecI ;
   private java.math.BigDecimal[] P0AIN3_A7212FacRect ;
   private java.math.BigDecimal[] P0AIN3_A453FacRECPor ;
   private java.math.BigDecimal[] P0AIN3_A14224FacCostFac ;
   private java.math.BigDecimal[] P0AIN3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0AIN3_A14222FacCostMts ;
   private java.math.BigDecimal[] P0AIN3_A434FacDtoPP ;
   private java.math.BigDecimal[] P0AIN3_A433FacDtoGen ;
   private java.math.BigDecimal[] P0AIN3_A14219FacEnergia ;
   private java.math.BigDecimal[] P0AIN3_A3918FacImpTot1 ;
   private byte[] P0AIN3_A443FacIVAPor ;
   private byte[] P0AIN3_A7209Colombia ;
   private boolean[] P0AIN3_n7209Colombia ;
}

final  class cfaven_datos_hash_actual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIN3", "SELECT T1.FacCod, T1.EmprCod, T2.EmprCif, T1.FacFch, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1, T1.FacIVAPor, T2.Colombia FROM ((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               return;
      }
   }

}

