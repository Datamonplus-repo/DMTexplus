package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubidpg extends GXProcedure
{
   public pubidpg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubidpg.class ), "" );
   }

   public pubidpg( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pubidpg.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pubidpg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubidpg.this.AV36Barcod = aP1[0];
      this.aP1 = aP1;
      pubidpg.this.AV37Barcodreo = aP2[0];
      this.aP2 = aP2;
      pubidpg.this.AV38Barcodpar = aP3[0];
      this.aP3 = aP3;
      pubidpg.this.AV19ALbreccod = aP4[0];
      this.aP4 = aP4;
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
      if ( AV30Piezas != AV34Dis_SPz )
      {
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
         if ( AV30Piezas != AV34Dis_SPz )
         {
            AV20Ok = httpContext.getMessage( "N", "") ;
         }
         if ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            if (true) break;
         }
         else
         {
            httpContext.wjLoc = formatLink("app.tubidpg", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV19ALbreccod,8,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Dp_Nrecep"})  ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      /* Using cursor P03YR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar, Integer.valueOf(AV19ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5322Dp_Nrecep = P03YR2_A5322Dp_Nrecep[0] ;
         A130BarCodPar = P03YR2_A130BarCodPar[0] ;
         A132BarCodReo = P03YR2_A132BarCodReo[0] ;
         A129BarCod = P03YR2_A129BarCod[0] ;
         A5891Dp_pzs = P03YR2_A5891Dp_pzs[0] ;
         n5891Dp_pzs = P03YR2_n5891Dp_pzs[0] ;
         A6008Dp_Kgs = P03YR2_A6008Dp_Kgs[0] ;
         n6008Dp_Kgs = P03YR2_n6008Dp_Kgs[0] ;
         A5323Dp_Mts = P03YR2_A5323Dp_Mts[0] ;
         n5323Dp_Mts = P03YR2_n5323Dp_Mts[0] ;
         A228BarUniMed = P03YR2_A228BarUniMed[0] ;
         A228BarUniMed = P03YR2_A228BarUniMed[0] ;
         AV30Piezas = A5891Dp_pzs ;
         AV31Kilos = A6008Dp_Kgs ;
         AV32Metros = A5323Dp_Mts ;
         AV33AlbRuni = A228BarUniMed ;
         AV34Dis_SPz = 0 ;
         AV35Dis_SUn = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P03YR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
         c4344Dp_PzU = P03YR3_A4344Dp_PzU[0] ;
         n4344Dp_PzU = P03YR3_n4344Dp_PzU[0] ;
         c4982Dp_UnU = P03YR3_A4982Dp_UnU[0] ;
         n4982Dp_UnU = P03YR3_n4982Dp_UnU[0] ;
         pr_default.close(1);
         AV34Dis_SPz = (int)(AV34Dis_SPz+c4344Dp_PzU) ;
         AV35Dis_SUn = AV35Dis_SUn.add(c4982Dp_UnU) ;
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubidpg.this.A396EmprCod;
      this.aP1[0] = pubidpg.this.AV36Barcod;
      this.aP2[0] = pubidpg.this.AV37Barcodreo;
      this.aP3[0] = pubidpg.this.AV38Barcodpar;
      this.aP4[0] = pubidpg.this.AV19ALbreccod;
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
      scmdbuf = "" ;
      P03YR2_A396EmprCod = new String[] {""} ;
      P03YR2_A5322Dp_Nrecep = new int[1] ;
      P03YR2_A130BarCodPar = new String[] {""} ;
      P03YR2_A132BarCodReo = new byte[1] ;
      P03YR2_A129BarCod = new int[1] ;
      P03YR2_A5891Dp_pzs = new int[1] ;
      P03YR2_n5891Dp_pzs = new boolean[] {false} ;
      P03YR2_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YR2_n6008Dp_Kgs = new boolean[] {false} ;
      P03YR2_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YR2_n5323Dp_Mts = new boolean[] {false} ;
      P03YR2_A228BarUniMed = new String[] {""} ;
      A130BarCodPar = "" ;
      A6008Dp_Kgs = DecimalUtil.ZERO ;
      A5323Dp_Mts = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      AV31Kilos = DecimalUtil.ZERO ;
      AV32Metros = DecimalUtil.ZERO ;
      AV33AlbRuni = "" ;
      AV35Dis_SUn = DecimalUtil.ZERO ;
      c4982Dp_UnU = DecimalUtil.ZERO ;
      P03YR3_A4344Dp_PzU = new int[1] ;
      P03YR3_n4344Dp_PzU = new boolean[] {false} ;
      P03YR3_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YR3_n4982Dp_UnU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubidpg__default(),
         new Object[] {
             new Object[] {
            P03YR2_A396EmprCod, P03YR2_A5322Dp_Nrecep, P03YR2_A130BarCodPar, P03YR2_A132BarCodReo, P03YR2_A129BarCod, P03YR2_A5891Dp_pzs, P03YR2_n5891Dp_pzs, P03YR2_A6008Dp_Kgs, P03YR2_n6008Dp_Kgs, P03YR2_A5323Dp_Mts,
            P03YR2_n5323Dp_Mts, P03YR2_A228BarUniMed
            }
            , new Object[] {
            P03YR3_A4344Dp_PzU, P03YR3_n4344Dp_PzU, P03YR3_A4982Dp_UnU, P03YR3_n4982Dp_UnU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37Barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV36Barcod ;
   private int AV19ALbreccod ;
   private int AV30Piezas ;
   private int AV34Dis_SPz ;
   private int A5322Dp_Nrecep ;
   private int A129BarCod ;
   private int A5891Dp_pzs ;
   private int c4344Dp_PzU ;
   private java.math.BigDecimal A6008Dp_Kgs ;
   private java.math.BigDecimal A5323Dp_Mts ;
   private java.math.BigDecimal AV31Kilos ;
   private java.math.BigDecimal AV32Metros ;
   private java.math.BigDecimal AV35Dis_SUn ;
   private java.math.BigDecimal c4982Dp_UnU ;
   private String A396EmprCod ;
   private String AV38Barcodpar ;
   private String AV20Ok ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String AV33AlbRuni ;
   private boolean returnInSub ;
   private boolean n5891Dp_pzs ;
   private boolean n6008Dp_Kgs ;
   private boolean n5323Dp_Mts ;
   private boolean n4344Dp_PzU ;
   private boolean n4982Dp_UnU ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03YR2_A396EmprCod ;
   private int[] P03YR2_A5322Dp_Nrecep ;
   private String[] P03YR2_A130BarCodPar ;
   private byte[] P03YR2_A132BarCodReo ;
   private int[] P03YR2_A129BarCod ;
   private int[] P03YR2_A5891Dp_pzs ;
   private boolean[] P03YR2_n5891Dp_pzs ;
   private java.math.BigDecimal[] P03YR2_A6008Dp_Kgs ;
   private boolean[] P03YR2_n6008Dp_Kgs ;
   private java.math.BigDecimal[] P03YR2_A5323Dp_Mts ;
   private boolean[] P03YR2_n5323Dp_Mts ;
   private String[] P03YR2_A228BarUniMed ;
   private int[] P03YR3_A4344Dp_PzU ;
   private boolean[] P03YR3_n4344Dp_PzU ;
   private java.math.BigDecimal[] P03YR3_A4982Dp_UnU ;
   private boolean[] P03YR3_n4982Dp_UnU ;
}

final  class pubidpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03YR2", "SELECT T1.EmprCod, T1.Dp_Nrecep, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Dp_pzs, T1.Dp_Kgs, T1.Dp_Mts, T2.BarUniMed FROM (TXPUBIDEP T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.Dp_Nrecep = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Dp_Nrecep ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03YR3", "SELECT SUM(Dp_PzU), SUM(Dp_UnU) FROM TXPUBIDPG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

