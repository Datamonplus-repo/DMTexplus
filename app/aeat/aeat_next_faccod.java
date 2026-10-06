package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class aeat_next_faccod extends GXProcedure
{
   public aeat_next_faccod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aeat_next_faccod.class ), "" );
   }

   public aeat_next_faccod( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( )
   {
      aeat_next_faccod.this.aP0 = new int[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( int[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( int[] aP0 )
   {
      aeat_next_faccod.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV11EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      aeat_next_faccod.this.GXt_char1 = GXv_char2[0] ;
      AV11EmprCod = GXt_char1 ;
      /* Using cursor P0AIU3 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = P0AIU3_A1153FacTipFac[0] ;
         A396EmprCod = P0AIU3_A396EmprCod[0] ;
         A11513FacRecIca = P0AIU3_A11513FacRecIca[0] ;
         A8346FacRecI = P0AIU3_A8346FacRecI[0] ;
         n8346FacRecI = P0AIU3_n8346FacRecI[0] ;
         A7212FacRect = P0AIU3_A7212FacRect[0] ;
         A453FacRECPor = P0AIU3_A453FacRECPor[0] ;
         A443FacIVAPor = P0AIU3_A443FacIVAPor[0] ;
         A14224FacCostFac = P0AIU3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P0AIU3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P0AIU3_A14222FacCostMts[0] ;
         A434FacDtoPP = P0AIU3_A434FacDtoPP[0] ;
         A433FacDtoGen = P0AIU3_A433FacDtoGen[0] ;
         A7209Colombia = P0AIU3_A7209Colombia[0] ;
         n7209Colombia = P0AIU3_n7209Colombia[0] ;
         A14219FacEnergia = P0AIU3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P0AIU3_A3918FacImpTot1[0] ;
         A430FacCod = P0AIU3_A430FacCod[0] ;
         A7209Colombia = P0AIU3_A7209Colombia[0] ;
         n7209Colombia = P0AIU3_n7209Colombia[0] ;
         A3918FacImpTot1 = P0AIU3_A3918FacImpTot1[0] ;
         A14390FacNroCadA = GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
         A14391FacAEATId = getFacAEATId0( A14390FacNroCadA) ;
         A14392FacRegAEAT = (boolean)(((A14391FacAEATId>0))) ;
         if ( ! A14392FacRegAEAT )
         {
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
            if ( A455FacTot.doubleValue() > 0 )
            {
               AV12FacCod = A430FacCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aeat_next_faccod.this.AV12FacCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public long getFacAEATId0( String E14390FacNroCadA )
   {
      X14378AEATId = 0 ;
      Gx_first = true ;
      /* Using cursor P0AIU4 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( ( GXutil.strcmp(P0AIU4_A14381AEATNumero[0], E14390FacNroCadA) == 0 ) && ( GXutil.strcmp(P0AIU4_A14379AEATEstado[0], httpContext.getMessage( httpContext.getMessage( "Correcto", ""), "")) == 0 ) )
         {
            X14378AEATId = P0AIU4_A14378AEATId[0] ;
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return X14378AEATId ;
   }

   public void initialize( )
   {
      AV11EmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P0AIU3_A1153FacTipFac = new byte[1] ;
      P0AIU3_A396EmprCod = new String[] {""} ;
      P0AIU3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_n8346FacRecI = new boolean[] {false} ;
      P0AIU3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A443FacIVAPor = new byte[1] ;
      P0AIU3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A7209Colombia = new byte[1] ;
      P0AIU3_n7209Colombia = new boolean[] {false} ;
      P0AIU3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIU3_A430FacCod = new int[1] ;
      A396EmprCod = "" ;
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
      A14390FacNroCadA = "" ;
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
      P0AIU4_A14378AEATId = new long[1] ;
      P0AIU4_A14381AEATNumero = new String[] {""} ;
      P0AIU4_A14379AEATEstado = new String[] {""} ;
      P0AIU4_n14379AEATEstado = new boolean[] {false} ;
      E14390FacNroCadA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.aeat_next_faccod__default(),
         new Object[] {
             new Object[] {
            P0AIU3_A1153FacTipFac, P0AIU3_A396EmprCod, P0AIU3_A11513FacRecIca, P0AIU3_A8346FacRecI, P0AIU3_n8346FacRecI, P0AIU3_A7212FacRect, P0AIU3_A453FacRECPor, P0AIU3_A443FacIVAPor, P0AIU3_A14224FacCostFac, P0AIU3_A14223FacCostKgs,
            P0AIU3_A14222FacCostMts, P0AIU3_A434FacDtoPP, P0AIU3_A433FacDtoGen, P0AIU3_A7209Colombia, P0AIU3_n7209Colombia, P0AIU3_A14219FacEnergia, P0AIU3_A3918FacImpTot1, P0AIU3_A430FacCod
            }
            , new Object[] {
            P0AIU4_A14378AEATId, P0AIU4_A14381AEATNumero, P0AIU4_A14379AEATEstado, P0AIU4_n14379AEATEstado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short Gx_err ;
   private int AV12FacCod ;
   private int A430FacCod ;
   private long A14391FacAEATId ;
   private long X14378AEATId ;
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
   private String AV11EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean A14392FacRegAEAT ;
   private boolean Gx_first ;
   private String A14390FacNroCadA ;
   private String E14390FacNroCadA ;
   private int[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AIU3_A1153FacTipFac ;
   private String[] P0AIU3_A396EmprCod ;
   private java.math.BigDecimal[] P0AIU3_A11513FacRecIca ;
   private java.math.BigDecimal[] P0AIU3_A8346FacRecI ;
   private boolean[] P0AIU3_n8346FacRecI ;
   private java.math.BigDecimal[] P0AIU3_A7212FacRect ;
   private java.math.BigDecimal[] P0AIU3_A453FacRECPor ;
   private byte[] P0AIU3_A443FacIVAPor ;
   private java.math.BigDecimal[] P0AIU3_A14224FacCostFac ;
   private java.math.BigDecimal[] P0AIU3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0AIU3_A14222FacCostMts ;
   private java.math.BigDecimal[] P0AIU3_A434FacDtoPP ;
   private java.math.BigDecimal[] P0AIU3_A433FacDtoGen ;
   private byte[] P0AIU3_A7209Colombia ;
   private boolean[] P0AIU3_n7209Colombia ;
   private java.math.BigDecimal[] P0AIU3_A14219FacEnergia ;
   private java.math.BigDecimal[] P0AIU3_A3918FacImpTot1 ;
   private int[] P0AIU3_A430FacCod ;
   private long[] P0AIU4_A14378AEATId ;
   private String[] P0AIU4_A14381AEATNumero ;
   private String[] P0AIU4_A14379AEATEstado ;
   private boolean[] P0AIU4_n14379AEATEstado ;
}

final  class aeat_next_faccod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIU3", "SELECT T1.FacTipFac, T1.EmprCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1, T1.FacCod FROM ((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) WHERE (T1.EmprCod = ? and T1.FacCod > 0) AND (Not (T1.FacCod = 0)) AND ((T1.FacTipFac = 0)) ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AIU4", "SELECT AEATId, AEATNumero, AEATEstado FROM TXPAEATHi ORDER BY AEATId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
      }
   }

}

