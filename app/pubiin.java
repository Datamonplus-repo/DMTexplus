package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiin extends GXProcedure
{
   public pubiin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiin.class ), "" );
   }

   public pubiin( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pubiin.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pubiin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiin.this.AV19ALbreccod = aP1[0];
      this.aP1 = aP1;
      pubiin.this.AV29Var1 = aP2[0];
      this.aP2 = aP2;
      pubiin.this.AV31Usurcod = aP3[0];
      this.aP3 = aP3;
      pubiin.this.AV30Station = aP4[0];
      this.aP4 = aP4;
      pubiin.this.AV32Msg_err = aP5[0];
      this.aP5 = aP5;
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
      if ( ( AV21Emp_SPzE - AV27Emp_SPzU ) != ( AV23AlbRPieEnt - AV25AlbRPieUti ) )
      {
         AV20Ok = httpContext.getMessage( "N", "") ;
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
         if ( ( AV21Emp_SPzE - AV27Emp_SPzU ) != ( AV23AlbRPieEnt - AV25AlbRPieUti ) )
         {
            AV20Ok = httpContext.getMessage( "N", "") ;
         }
         if ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            if (true) break;
         }
         else
         {
            httpContext.wjLoc = formatLink("app.tubiin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19ALbreccod,8,0))}, new String[] {"EmprCod","AlbRecCod"})  ;
         }
      }
      if ( GXutil.strcmp(AV20Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      /* Using cursor P03SP3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P03SP3_A44AlbRecCod[0] ;
         A52AlbRPieEnt = P03SP3_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P03SP3_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = P03SP3_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P03SP3_A60AlbRUniUti[0] ;
         A9747Emp_SPzE = P03SP3_A9747Emp_SPzE[0] ;
         A9748Emp_SUnE = P03SP3_A9748Emp_SUnE[0] ;
         A9752Emp_SPzU = P03SP3_A9752Emp_SPzU[0] ;
         A9753Emp_SUnU = P03SP3_A9753Emp_SUnU[0] ;
         A9747Emp_SPzE = P03SP3_A9747Emp_SPzE[0] ;
         A9748Emp_SUnE = P03SP3_A9748Emp_SUnE[0] ;
         A9752Emp_SPzU = P03SP3_A9752Emp_SPzU[0] ;
         A9753Emp_SUnU = P03SP3_A9753Emp_SUnU[0] ;
         AV23AlbRPieEnt = A52AlbRPieEnt ;
         AV24AlbRUniEnt = A58AlbRUniEnt ;
         AV25AlbRPieUti = A54AlbRPieUti ;
         AV26AlbRUniUti = A60AlbRUniUti ;
         AV21Emp_SPzE = A9747Emp_SPzE ;
         AV22Emp_SUnE = A9748Emp_SUnE ;
         AV27Emp_SPzU = A9752Emp_SPzU ;
         AV28Emp_SUnU = A9753Emp_SUnU ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiin.this.A396EmprCod;
      this.aP1[0] = pubiin.this.AV19ALbreccod;
      this.aP2[0] = pubiin.this.AV29Var1;
      this.aP3[0] = pubiin.this.AV31Usurcod;
      this.aP4[0] = pubiin.this.AV30Station;
      this.aP5[0] = pubiin.this.AV32Msg_err;
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
      P03SP3_A396EmprCod = new String[] {""} ;
      P03SP3_A44AlbRecCod = new int[1] ;
      P03SP3_A52AlbRPieEnt = new int[1] ;
      P03SP3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SP3_A54AlbRPieUti = new int[1] ;
      P03SP3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SP3_A9747Emp_SPzE = new int[1] ;
      P03SP3_A9748Emp_SUnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SP3_A9752Emp_SPzU = new int[1] ;
      P03SP3_A9753Emp_SUnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A9748Emp_SUnE = DecimalUtil.ZERO ;
      A9753Emp_SUnU = DecimalUtil.ZERO ;
      AV24AlbRUniEnt = DecimalUtil.ZERO ;
      AV26AlbRUniUti = DecimalUtil.ZERO ;
      AV22Emp_SUnE = DecimalUtil.ZERO ;
      AV28Emp_SUnU = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiin__default(),
         new Object[] {
             new Object[] {
            P03SP3_A396EmprCod, P03SP3_A44AlbRecCod, P03SP3_A52AlbRPieEnt, P03SP3_A58AlbRUniEnt, P03SP3_A54AlbRPieUti, P03SP3_A60AlbRUniUti, P03SP3_A9747Emp_SPzE, P03SP3_A9748Emp_SUnE, P03SP3_A9752Emp_SPzU, P03SP3_A9753Emp_SUnU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29Var1 ;
   private short Gx_err ;
   private int AV19ALbreccod ;
   private int AV21Emp_SPzE ;
   private int AV27Emp_SPzU ;
   private int AV23AlbRPieEnt ;
   private int AV25AlbRPieUti ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A9747Emp_SPzE ;
   private int A9752Emp_SPzU ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A9748Emp_SUnE ;
   private java.math.BigDecimal A9753Emp_SUnU ;
   private java.math.BigDecimal AV24AlbRUniEnt ;
   private java.math.BigDecimal AV26AlbRUniUti ;
   private java.math.BigDecimal AV22Emp_SUnE ;
   private java.math.BigDecimal AV28Emp_SUnU ;
   private String A396EmprCod ;
   private String AV31Usurcod ;
   private String AV30Station ;
   private String AV32Msg_err ;
   private String AV20Ok ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SP3_A396EmprCod ;
   private int[] P03SP3_A44AlbRecCod ;
   private int[] P03SP3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P03SP3_A58AlbRUniEnt ;
   private int[] P03SP3_A54AlbRPieUti ;
   private java.math.BigDecimal[] P03SP3_A60AlbRUniUti ;
   private int[] P03SP3_A9747Emp_SPzE ;
   private java.math.BigDecimal[] P03SP3_A9748Emp_SUnE ;
   private int[] P03SP3_A9752Emp_SPzU ;
   private java.math.BigDecimal[] P03SP3_A9753Emp_SUnU ;
}

final  class pubiin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SP3", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRPieUti, T1.AlbRUniUti, COALESCE( T2.Emp_SPzE, 0) AS Emp_SPzE, COALESCE( T2.Emp_SUnE, 0) AS Emp_SUnE, COALESCE( T2.Emp_SPzU, 0) AS Emp_SPzU, COALESCE( T2.Emp_SUnU, 0) AS Emp_SUnU FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(Emp_PzE) AS Emp_SPzE, EmprCod, AlbRecCod, SUM(Emp_UnE) AS Emp_SUnE, SUM(Emp_PzU) AS Emp_SPzU, SUM(Emp_UnU) AS Emp_SUnU FROM TXPUBIIN GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
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

