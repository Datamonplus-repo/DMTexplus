package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rvxospedobs extends GXProcedure
{
   public rvxospedobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rvxospedobs.class ), "" );
   }

   public rvxospedobs( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      rvxospedobs.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      rvxospedobs.this.AV10VxOFabTip = aP0;
      rvxospedobs.this.AV16BarCod = aP1;
      rvxospedobs.this.AV11Modo = aP2;
      rvxospedobs.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09QZ2 */
      pr_vertex.execute(0, new Object[] {Integer.valueOf(AV14VxOSCod)});
      while ( (pr_vertex.getStatus(0) != 101) )
      {
         A14133VxNecPedCo = P09QZ2_A14133VxNecPedCo[0] ;
         n14133VxNecPedCo = P09QZ2_n14133VxNecPedCo[0] ;
         A14116VxNecCod = P09QZ2_A14116VxNecCod[0] ;
         A14144VxNecMAnu = P09QZ2_A14144VxNecMAnu[0] ;
         n14144VxNecMAnu = P09QZ2_n14144VxNecMAnu[0] ;
         A14142VxNecMTip = P09QZ2_A14142VxNecMTip[0] ;
         n14142VxNecMTip = P09QZ2_n14142VxNecMTip[0] ;
         A14140VxNecMDoc = P09QZ2_A14140VxNecMDoc[0] ;
         n14140VxNecMDoc = P09QZ2_n14140VxNecMDoc[0] ;
         A14141VxNecMOFab = P09QZ2_A14141VxNecMOFab[0] ;
         n14141VxNecMOFab = P09QZ2_n14141VxNecMOFab[0] ;
         A14132VXNecPedTi = P09QZ2_A14132VXNecPedTi[0] ;
         n14132VXNecPedTi = P09QZ2_n14132VXNecPedTi[0] ;
         A14117VxNecMov = P09QZ2_A14117VxNecMov[0] ;
         A14133VxNecPedCo = P09QZ2_A14133VxNecPedCo[0] ;
         n14133VxNecPedCo = P09QZ2_n14133VxNecPedCo[0] ;
         A14132VXNecPedTi = P09QZ2_A14132VXNecPedTi[0] ;
         n14132VXNecPedTi = P09QZ2_n14132VXNecPedTi[0] ;
         if ( GXutil.strcmp(A14141VxNecMOFab, httpContext.getMessage( "AC", "")) == 0 )
         {
            if ( GXutil.strcmp(A14142VxNecMTip, httpContext.getMessage( "PR", "")) == 0 )
            {
               AV9VXNecPedTip = A14132VXNecPedTi ;
               AV13VxNecPedCod = A14133VxNecPedCo ;
            }
         }
         pr_vertex.readNext(0);
      }
      pr_vertex.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCA DATOS PEDIDO' Routine */
      returnInSub = false ;
      /* Using cursor P09QZ3 */
      pr_vertex.execute(1, new Object[] {AV9VXNecPedTip, Integer.valueOf(AV13VxNecPedCod)});
      while ( (pr_vertex.getStatus(1) != 101) )
      {
         A14119VxPedCod = P09QZ3_A14119VxPedCod[0] ;
         A14118VxPedTip = P09QZ3_A14118VxPedTip[0] ;
         A14134VxPedObs = P09QZ3_A14134VxPedObs[0] ;
         n14134VxPedObs = P09QZ3_n14134VxPedObs[0] ;
         AV15VxPedObs = A14134VxPedObs ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_vertex.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = rvxospedobs.this.AV15VxPedObs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15VxPedObs = "" ;
      scmdbuf = "" ;
      P09QZ2_A14133VxNecPedCo = new int[1] ;
      P09QZ2_n14133VxNecPedCo = new boolean[] {false} ;
      P09QZ2_A14116VxNecCod = new long[1] ;
      P09QZ2_A14144VxNecMAnu = new String[] {""} ;
      P09QZ2_n14144VxNecMAnu = new boolean[] {false} ;
      P09QZ2_A14142VxNecMTip = new String[] {""} ;
      P09QZ2_n14142VxNecMTip = new boolean[] {false} ;
      P09QZ2_A14140VxNecMDoc = new long[1] ;
      P09QZ2_n14140VxNecMDoc = new boolean[] {false} ;
      P09QZ2_A14141VxNecMOFab = new String[] {""} ;
      P09QZ2_n14141VxNecMOFab = new boolean[] {false} ;
      P09QZ2_A14132VXNecPedTi = new String[] {""} ;
      P09QZ2_n14132VXNecPedTi = new boolean[] {false} ;
      P09QZ2_A14117VxNecMov = new int[1] ;
      A14144VxNecMAnu = "" ;
      A14142VxNecMTip = "" ;
      A14141VxNecMOFab = "" ;
      A14132VXNecPedTi = "" ;
      AV9VXNecPedTip = "" ;
      P09QZ3_A14119VxPedCod = new int[1] ;
      P09QZ3_A14118VxPedTip = new String[] {""} ;
      P09QZ3_A14134VxPedObs = new String[] {""} ;
      P09QZ3_n14134VxPedObs = new boolean[] {false} ;
      A14118VxPedTip = "" ;
      A14134VxPedObs = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.rvxospedobs__vertex(),
         new Object[] {
             new Object[] {
            P09QZ2_A14133VxNecPedCo, P09QZ2_n14133VxNecPedCo, P09QZ2_A14116VxNecCod, P09QZ2_A14144VxNecMAnu, P09QZ2_n14144VxNecMAnu, P09QZ2_A14142VxNecMTip, P09QZ2_n14142VxNecMTip, P09QZ2_A14140VxNecMDoc, P09QZ2_n14140VxNecMDoc, P09QZ2_A14141VxNecMOFab,
            P09QZ2_n14141VxNecMOFab, P09QZ2_A14132VXNecPedTi, P09QZ2_n14132VXNecPedTi, P09QZ2_A14117VxNecMov
            }
            , new Object[] {
            P09QZ3_A14119VxPedCod, P09QZ3_A14118VxPedTip, P09QZ3_A14134VxPedObs, P09QZ3_n14134VxPedObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16BarCod ;
   private int AV14VxOSCod ;
   private int A14133VxNecPedCo ;
   private int A14117VxNecMov ;
   private int AV13VxNecPedCod ;
   private int A14119VxPedCod ;
   private long A14116VxNecCod ;
   private long A14140VxNecMDoc ;
   private String AV10VxOFabTip ;
   private String AV11Modo ;
   private String scmdbuf ;
   private String A14144VxNecMAnu ;
   private String A14142VxNecMTip ;
   private String A14141VxNecMOFab ;
   private String A14132VXNecPedTi ;
   private String AV9VXNecPedTip ;
   private String A14118VxPedTip ;
   private boolean n14133VxNecPedCo ;
   private boolean n14144VxNecMAnu ;
   private boolean n14142VxNecMTip ;
   private boolean n14140VxNecMDoc ;
   private boolean n14141VxNecMOFab ;
   private boolean n14132VXNecPedTi ;
   private boolean returnInSub ;
   private boolean n14134VxPedObs ;
   private String AV15VxPedObs ;
   private String A14134VxPedObs ;
   private String[] aP3 ;
   private IDataStoreProvider pr_vertex ;
   private int[] P09QZ2_A14133VxNecPedCo ;
   private boolean[] P09QZ2_n14133VxNecPedCo ;
   private long[] P09QZ2_A14116VxNecCod ;
   private String[] P09QZ2_A14144VxNecMAnu ;
   private boolean[] P09QZ2_n14144VxNecMAnu ;
   private String[] P09QZ2_A14142VxNecMTip ;
   private boolean[] P09QZ2_n14142VxNecMTip ;
   private long[] P09QZ2_A14140VxNecMDoc ;
   private boolean[] P09QZ2_n14140VxNecMDoc ;
   private String[] P09QZ2_A14141VxNecMOFab ;
   private boolean[] P09QZ2_n14141VxNecMOFab ;
   private String[] P09QZ2_A14132VXNecPedTi ;
   private boolean[] P09QZ2_n14132VXNecPedTi ;
   private int[] P09QZ2_A14117VxNecMov ;
   private int[] P09QZ3_A14119VxPedCod ;
   private String[] P09QZ3_A14118VxPedTip ;
   private String[] P09QZ3_A14134VxPedObs ;
   private boolean[] P09QZ3_n14134VxPedObs ;
}

final  class rvxospedobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QZ2", "SELECT T2.NecPedCod, T1.NecCod AS VxNecCod, T1.NecMAnu, T1.NecMTip, T1.NecMDoc, T1.NecMOFabT, T2.NecPedTip, T1.NecMov FROM (NECMOV T1 INNER JOIN NECES T2 ON T2.NecCod = T1.NecCod) WHERE ((rtrim(T1.NecMAnu) IS NULL AND NOT(T1.NecMAnu IS NULL))) AND (Not (T1.NecCod = 0)) AND (Not (T2.NecPedCod = 0)) AND (T1.NecMDoc = ?) ORDER BY T1.NecCod, T1.NecMov ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QZ3", "SELECT * FROM (SELECT PedCod, PedTip, PedObs FROM PEDID WHERE PedTip = ? and PedCod = ? ORDER BY PedTip, PedCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

