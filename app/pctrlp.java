package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlp extends GXProcedure
{
   public pctrlp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlp.class ), "" );
   }

   public pctrlp( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pctrlp.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pctrlp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlp.this.AV33Clicod = aP1[0];
      this.aP1 = aP1;
      pctrlp.this.AV34Forser = aP2[0];
      this.aP2 = aP2;
      pctrlp.this.AV35Forcolnom = aP3[0];
      this.aP3 = aP3;
      pctrlp.this.AV36Forcolnum = aP4[0];
      this.aP4 = aP4;
      pctrlp.this.AV37Tipcolcod = aP5[0];
      this.aP5 = aP5;
      pctrlp.this.AV38ForProc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'CONTROL' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20Ok = httpContext.getMessage( "S", "") ;
      if ( ( DecimalUtil.compareTo(AV29ForProPK, AV32Spk) != 0 ) && ( ( AV29ForProPK.doubleValue() > 0 ) || ( AV32Spk.doubleValue() > 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "El precio Kilo FINAL ", "") + GXutil.str( AV29ForProPK, 12, 5) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "No coincide con el sumatorio de todas las FASES ", "") + GXutil.str( AV32Spk, 12, 5) + GXutil.chr( (short)(13)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         AV20Ok = httpContext.getMessage( "N", "") ;
      }
      if ( ( DecimalUtil.compareTo(AV30ForProPM, AV31Spm) != 0 ) && ( ( AV30ForProPM.doubleValue() > 0 ) || ( AV31Spm.doubleValue() > 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "El precio Metro FINAL ", "") + GXutil.str( AV30ForProPM, 12, 5) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "No coincide con el sumatorio de todas las FASES ", "") + GXutil.str( AV31Spm, 12, 5) + GXutil.chr( (short)(13)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         AV20Ok = httpContext.getMessage( "N", "") ;
      }
      if ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      while ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         /* Execute user subroutine: 'CONTROL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV20Ok = httpContext.getMessage( "S", "") ;
         if ( ( DecimalUtil.compareTo(AV29ForProPK, AV32Spk) != 0 ) && ( ( AV29ForProPK.doubleValue() > 0 ) || ( AV32Spk.doubleValue() > 0 ) ) )
         {
            Gx_msg = httpContext.getMessage( "El precio Kilo FINAL ", "") + GXutil.str( AV29ForProPK, 12, 5) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "No coincide con el sumatorio de todas las FASES ", "") + GXutil.str( AV32Spk, 12, 5) + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
            AV20Ok = httpContext.getMessage( "N", "") ;
         }
         if ( ( DecimalUtil.compareTo(AV30ForProPM, AV31Spm) != 0 ) && ( ( AV30ForProPM.doubleValue() > 0 ) || ( AV31Spm.doubleValue() > 0 ) ) )
         {
            Gx_msg = httpContext.getMessage( "El precio Metro FINAL ", "") + GXutil.str( AV30ForProPM, 12, 5) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "No coincide con el sumatorio de todas las FASES ", "") + GXutil.str( AV31Spm, 12, 5) + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
            AV20Ok = httpContext.getMessage( "N", "") ;
         }
         if ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            if (true) break;
         }
         else
         {
            httpContext.wjLoc = formatLink("app.tfpcc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34Forser)),GXutil.URLEncode(GXutil.rtrim(AV35Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV36Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37Tipcolcod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV38ForProc))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"})  ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      AV29ForProPK = DecimalUtil.doubleToDec(0) ;
      AV30ForProPM = DecimalUtil.doubleToDec(0) ;
      AV32Spk = DecimalUtil.doubleToDec(0) ;
      AV31Spm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03UP3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV33Clicod), AV34Forser, AV35Forcolnom, Integer.valueOf(AV36Forcolnum), Byte.valueOf(AV37Tipcolcod), AV38ForProc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9766ForProC = P03UP3_A9766ForProC[0] ;
         A831TipColCod = P03UP3_A831TipColCod[0] ;
         A483ForColNum = P03UP3_A483ForColNum[0] ;
         A482ForColNom = P03UP3_A482ForColNom[0] ;
         A494ForSer = P03UP3_A494ForSer[0] ;
         A252CliCod = P03UP3_A252CliCod[0] ;
         A9768ForProPK = P03UP3_A9768ForProPK[0] ;
         n9768ForProPK = P03UP3_n9768ForProPK[0] ;
         A9769ForProPM = P03UP3_A9769ForProPM[0] ;
         n9769ForProPM = P03UP3_n9769ForProPM[0] ;
         A9851SPM = P03UP3_A9851SPM[0] ;
         A9850SPK = P03UP3_A9850SPK[0] ;
         A9851SPM = P03UP3_A9851SPM[0] ;
         A9850SPK = P03UP3_A9850SPK[0] ;
         AV29ForProPK = A9768ForProPK ;
         AV30ForProPM = A9769ForProPM ;
         AV31Spm = A9851SPM ;
         AV32Spk = A9850SPK ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlp.this.A396EmprCod;
      this.aP1[0] = pctrlp.this.AV33Clicod;
      this.aP2[0] = pctrlp.this.AV34Forser;
      this.aP3[0] = pctrlp.this.AV35Forcolnom;
      this.aP4[0] = pctrlp.this.AV36Forcolnum;
      this.aP5[0] = pctrlp.this.AV37Tipcolcod;
      this.aP6[0] = pctrlp.this.AV38ForProc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Ok = "" ;
      AV29ForProPK = DecimalUtil.ZERO ;
      AV32Spk = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV30ForProPM = DecimalUtil.ZERO ;
      AV31Spm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03UP3_A396EmprCod = new String[] {""} ;
      P03UP3_A9766ForProC = new String[] {""} ;
      P03UP3_A831TipColCod = new byte[1] ;
      P03UP3_A483ForColNum = new int[1] ;
      P03UP3_A482ForColNom = new String[] {""} ;
      P03UP3_A494ForSer = new String[] {""} ;
      P03UP3_A252CliCod = new int[1] ;
      P03UP3_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03UP3_n9768ForProPK = new boolean[] {false} ;
      P03UP3_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03UP3_n9769ForProPM = new boolean[] {false} ;
      P03UP3_A9851SPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03UP3_A9850SPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9766ForProC = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      A9769ForProPM = DecimalUtil.ZERO ;
      A9851SPM = DecimalUtil.ZERO ;
      A9850SPK = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlp__default(),
         new Object[] {
             new Object[] {
            P03UP3_A396EmprCod, P03UP3_A9766ForProC, P03UP3_A831TipColCod, P03UP3_A483ForColNum, P03UP3_A482ForColNom, P03UP3_A494ForSer, P03UP3_A252CliCod, P03UP3_A9768ForProPK, P03UP3_n9768ForProPK, P03UP3_A9769ForProPM,
            P03UP3_n9769ForProPM, P03UP3_A9851SPM, P03UP3_A9850SPK
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37Tipcolcod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV33Clicod ;
   private int AV36Forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal AV29ForProPK ;
   private java.math.BigDecimal AV32Spk ;
   private java.math.BigDecimal AV30ForProPM ;
   private java.math.BigDecimal AV31Spm ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private java.math.BigDecimal A9851SPM ;
   private java.math.BigDecimal A9850SPK ;
   private String A396EmprCod ;
   private String AV34Forser ;
   private String AV35Forcolnom ;
   private String AV38ForProc ;
   private String AV20Ok ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A9766ForProC ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean returnInSub ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03UP3_A396EmprCod ;
   private String[] P03UP3_A9766ForProC ;
   private byte[] P03UP3_A831TipColCod ;
   private int[] P03UP3_A483ForColNum ;
   private String[] P03UP3_A482ForColNom ;
   private String[] P03UP3_A494ForSer ;
   private int[] P03UP3_A252CliCod ;
   private java.math.BigDecimal[] P03UP3_A9768ForProPK ;
   private boolean[] P03UP3_n9768ForProPK ;
   private java.math.BigDecimal[] P03UP3_A9769ForProPM ;
   private boolean[] P03UP3_n9769ForProPM ;
   private java.math.BigDecimal[] P03UP3_A9851SPM ;
   private java.math.BigDecimal[] P03UP3_A9850SPK ;
}

final  class pctrlp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03UP3", "SELECT T1.EmprCod, T1.ForProC, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForProPK, T1.ForProPM, COALESCE( T2.SPM, 0) AS SPM, COALESCE( T2.SPK, 0) AS SPK FROM (TXPCLARPD T1 LEFT JOIN (SELECT SUM(ForProFM) AS SPM, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, SUM(ForProFK) AS SPK FROM TXPFPCC GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod AND T2.ForProC = T1.ForProC) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.ForProC = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForProC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

