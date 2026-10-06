package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiout extends GXProcedure
{
   public pubiout( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiout.class ), "" );
   }

   public pubiout( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pubiout.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pubiout.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiout.this.AV29Discod = aP1[0];
      this.aP1 = aP1;
      pubiout.this.AV19ALbreccod = aP2[0];
      this.aP2 = aP2;
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
            httpContext.wjLoc = formatLink("app.tubiout", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19ALbreccod,8,0))}, new String[] {"EmprCod","DisCod","AlbRecCod"})  ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      /* Using cursor P03SR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV29Discod), Integer.valueOf(AV19ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P03SR2_A44AlbRecCod[0] ;
         A361DisCod = P03SR2_A361DisCod[0] ;
         A673Piezas = P03SR2_A673Piezas[0] ;
         A595Kilos = P03SR2_A595Kilos[0] ;
         A631Metros = P03SR2_A631Metros[0] ;
         A56AlbRUni = P03SR2_A56AlbRUni[0] ;
         A56AlbRUni = P03SR2_A56AlbRUni[0] ;
         AV30Piezas = A673Piezas ;
         AV31Kilos = A595Kilos ;
         AV32Metros = A631Metros ;
         AV33AlbRuni = A56AlbRUni ;
         AV34Dis_SPz = 0 ;
         AV35Dis_SUn = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P03SR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         c9759Dis_PzU = P03SR3_A9759Dis_PzU[0] ;
         n9759Dis_PzU = P03SR3_n9759Dis_PzU[0] ;
         c9758Dis_UnU = P03SR3_A9758Dis_UnU[0] ;
         n9758Dis_UnU = P03SR3_n9758Dis_UnU[0] ;
         pr_default.close(1);
         AV34Dis_SPz = (int)(AV34Dis_SPz+c9759Dis_PzU) ;
         AV35Dis_SUn = AV35Dis_SUn.add(c9758Dis_UnU) ;
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiout.this.A396EmprCod;
      this.aP1[0] = pubiout.this.AV29Discod;
      this.aP2[0] = pubiout.this.AV19ALbreccod;
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
      P03SR2_A396EmprCod = new String[] {""} ;
      P03SR2_A44AlbRecCod = new int[1] ;
      P03SR2_A361DisCod = new int[1] ;
      P03SR2_A673Piezas = new int[1] ;
      P03SR2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SR2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SR2_A56AlbRUni = new String[] {""} ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      AV31Kilos = DecimalUtil.ZERO ;
      AV32Metros = DecimalUtil.ZERO ;
      AV33AlbRuni = "" ;
      AV35Dis_SUn = DecimalUtil.ZERO ;
      c9758Dis_UnU = DecimalUtil.ZERO ;
      P03SR3_A9759Dis_PzU = new int[1] ;
      P03SR3_n9759Dis_PzU = new boolean[] {false} ;
      P03SR3_A9758Dis_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SR3_n9758Dis_UnU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiout__default(),
         new Object[] {
             new Object[] {
            P03SR2_A396EmprCod, P03SR2_A44AlbRecCod, P03SR2_A361DisCod, P03SR2_A673Piezas, P03SR2_A595Kilos, P03SR2_A631Metros, P03SR2_A56AlbRUni
            }
            , new Object[] {
            P03SR3_A9759Dis_PzU, P03SR3_n9759Dis_PzU, P03SR3_A9758Dis_UnU, P03SR3_n9758Dis_UnU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV29Discod ;
   private int AV19ALbreccod ;
   private int AV30Piezas ;
   private int AV34Dis_SPz ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int c9759Dis_PzU ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal AV31Kilos ;
   private java.math.BigDecimal AV32Metros ;
   private java.math.BigDecimal AV35Dis_SUn ;
   private java.math.BigDecimal c9758Dis_UnU ;
   private String A396EmprCod ;
   private String AV20Ok ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV33AlbRuni ;
   private boolean returnInSub ;
   private boolean n9759Dis_PzU ;
   private boolean n9758Dis_UnU ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SR2_A396EmprCod ;
   private int[] P03SR2_A44AlbRecCod ;
   private int[] P03SR2_A361DisCod ;
   private int[] P03SR2_A673Piezas ;
   private java.math.BigDecimal[] P03SR2_A595Kilos ;
   private java.math.BigDecimal[] P03SR2_A631Metros ;
   private String[] P03SR2_A56AlbRUni ;
   private int[] P03SR3_A9759Dis_PzU ;
   private boolean[] P03SR3_n9759Dis_PzU ;
   private java.math.BigDecimal[] P03SR3_A9758Dis_UnU ;
   private boolean[] P03SR3_n9758Dis_UnU ;
}

final  class pubiout__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SR2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.DisCod, T1.Piezas, T1.Kilos, T1.Metros, T2.AlbRUni FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03SR3", "SELECT SUM(Dis_PzU), SUM(Dis_UnU) FROM TXPUBIOUT WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

