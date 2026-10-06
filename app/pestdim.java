package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestdim extends GXProcedure
{
   public pestdim( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestdim.class ), "" );
   }

   public pestdim( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pestdim.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pestdim.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestdim.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pestdim.this.AV31Msg_err = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Msg_err = " " ;
      AV30PieUti = 0 ;
      AV28UniUti = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P008U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A54AlbRPieUti = P008U2_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P008U2_A60AlbRUniUti[0] ;
         AV30PieUti = A54AlbRPieUti ;
         AV28UniUti = A60AlbRUniUti ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV29AlbrPieUti = 0 ;
      AV36BarPiePda = DecimalUtil.doubleToDec(0) ;
      AV27AlbrUniUti = DecimalUtil.doubleToDec(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV32Tab_kp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33Tab_pp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV34Tab_pzp[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35i = (short)(1) ;
      /* Using cursor P008U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A129BarCod = P008U3_A129BarCod[0] ;
         A132BarCodReo = P008U3_A132BarCodReo[0] ;
         A130BarCodPar = P008U3_A130BarCodPar[0] ;
         A228BarUniMed = P008U3_A228BarUniMed[0] ;
         A203BarPieKil = P008U3_A203BarPieKil[0] ;
         A205BarPieMet = P008U3_A205BarPieMet[0] ;
         A9984BarPiePda = P008U3_A9984BarPiePda[0] ;
         n9984BarPiePda = P008U3_n9984BarPiePda[0] ;
         A200BarPieCod = P008U3_A200BarPieCod[0] ;
         A228BarUniMed = P008U3_A228BarUniMed[0] ;
         if ( ( DecimalUtil.compareTo(AV36BarPiePda, A9984BarPiePda) == 0 ) && ( AV35i > 1 ) )
         {
            AV33Tab_pp[AV35i-1] = AV36BarPiePda ;
            AV32Tab_kp[AV35i-1] = AV27AlbrUniUti ;
            AV34Tab_pzp[AV35i-1] = (short)(AV29AlbrPieUti) ;
            AV29AlbrPieUti = 0 ;
            AV27AlbrUniUti = DecimalUtil.doubleToDec(0) ;
            AV35i = (short)(AV35i+1) ;
         }
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            AV27AlbrUniUti = AV27AlbrUniUti.add(A203BarPieKil) ;
         }
         else
         {
            AV27AlbrUniUti = AV27AlbrUniUti.add(A205BarPieMet) ;
         }
         AV29AlbrPieUti = (int)(AV29AlbrPieUti+1) ;
         AV36BarPiePda = A9984BarPiePda ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV36BarPiePda.doubleValue() > 0 )
      {
         AV33Tab_pp[AV35i-1] = AV36BarPiePda ;
         AV32Tab_kp[AV35i-1] = AV27AlbrUniUti ;
         AV34Tab_pzp[AV35i-1] = (short)(AV29AlbrPieUti) ;
      }
      if ( AV30PieUti != AV29AlbrPieUti )
      {
         /* Optimized UPDATE. */
         /* Using cursor P008U4 */
         pr_default.execute(2, new Object[] {AV27AlbrUniUti, Integer.valueOf(AV29AlbrPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* End optimized UPDATE. */
         AV31Msg_err = httpContext.getMessage( "Problemas", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestdim.this.A396EmprCod;
      this.aP1[0] = pestdim.this.A44AlbRecCod;
      this.aP2[0] = pestdim.this.AV31Msg_err;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestdim");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28UniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P008U2_A396EmprCod = new String[] {""} ;
      P008U2_A44AlbRecCod = new int[1] ;
      P008U2_A54AlbRPieUti = new int[1] ;
      P008U2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV36BarPiePda = DecimalUtil.ZERO ;
      AV27AlbrUniUti = DecimalUtil.ZERO ;
      AV32Tab_kp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV32Tab_kp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33Tab_pp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33Tab_pp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV34Tab_pzp = new short[100] ;
      P008U3_A129BarCod = new int[1] ;
      P008U3_A132BarCodReo = new byte[1] ;
      P008U3_A130BarCodPar = new String[] {""} ;
      P008U3_A396EmprCod = new String[] {""} ;
      P008U3_A44AlbRecCod = new int[1] ;
      P008U3_A228BarUniMed = new String[] {""} ;
      P008U3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008U3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008U3_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008U3_n9984BarPiePda = new boolean[] {false} ;
      P008U3_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestdim__default(),
         new Object[] {
             new Object[] {
            P008U2_A396EmprCod, P008U2_A44AlbRecCod, P008U2_A54AlbRPieUti, P008U2_A60AlbRUniUti
            }
            , new Object[] {
            P008U3_A129BarCod, P008U3_A132BarCodReo, P008U3_A130BarCodPar, P008U3_A396EmprCod, P008U3_A44AlbRecCod, P008U3_A228BarUniMed, P008U3_A203BarPieKil, P008U3_A205BarPieMet, P008U3_A9984BarPiePda, P008U3_n9984BarPiePda,
            P008U3_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV34Tab_pzp[] ;
   private short AV35i ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV30PieUti ;
   private int A54AlbRPieUti ;
   private int AV29AlbrPieUti ;
   private int GX_I ;
   private int A129BarCod ;
   private java.math.BigDecimal AV28UniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV36BarPiePda ;
   private java.math.BigDecimal AV27AlbrUniUti ;
   private java.math.BigDecimal AV32Tab_kp[] ;
   private java.math.BigDecimal AV33Tab_pp[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A9984BarPiePda ;
   private String A396EmprCod ;
   private String AV31Msg_err ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A200BarPieCod ;
   private boolean n9984BarPiePda ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P008U2_A396EmprCod ;
   private int[] P008U2_A44AlbRecCod ;
   private int[] P008U2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P008U2_A60AlbRUniUti ;
   private int[] P008U3_A129BarCod ;
   private byte[] P008U3_A132BarCodReo ;
   private String[] P008U3_A130BarCodPar ;
   private String[] P008U3_A396EmprCod ;
   private int[] P008U3_A44AlbRecCod ;
   private String[] P008U3_A228BarUniMed ;
   private java.math.BigDecimal[] P008U3_A203BarPieKil ;
   private java.math.BigDecimal[] P008U3_A205BarPieMet ;
   private java.math.BigDecimal[] P008U3_A9984BarPiePda ;
   private boolean[] P008U3_n9984BarPiePda ;
   private String[] P008U3_A200BarPieCod ;
}

final  class pestdim__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008U2", "SELECT EmprCod, AlbRecCod, AlbRPieUti, AlbRUniUti FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008U3", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.AlbRecCod, T2.BarUniMed, T1.BarPieKil, T1.BarPieMet, T1.BarPiePda, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.BarPiePda ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008U4", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 9);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

