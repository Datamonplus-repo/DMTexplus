package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdltorden extends GXProcedure
{
   public pdltorden( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdltorden.class ), "" );
   }

   public pdltorden( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pdltorden.this.aP2 = new int[] {0};
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
      pdltorden.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdltorden.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      pdltorden.this.AV8PMCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A662 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Optimized DELETE. */
         /* Using cursor P0A663 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde1");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P0A664 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P0A665 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
         /* End optimized DELETE. */
         /* Using cursor P0A666 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9458OMMTpo = P0A666_A9458OMMTpo[0] ;
            A9455OMOpeCod = P0A666_A9455OMOpeCod[0] ;
            /* Using cursor P0A667 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A9466OMMCLin = P0A667_A9466OMMCLin[0] ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Using cursor P0A668 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P0A669 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n9488PMOrd = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0A6610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV8PMCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdltorden.this.A396EmprCod;
      this.aP1[0] = pdltorden.this.A9425OMCod;
      this.aP2[0] = pdltorden.this.AV8PMCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pdltorden");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P0A662_A396EmprCod = new String[] {""} ;
      P0A662_A9425OMCod = new int[1] ;
      P0A666_A396EmprCod = new String[] {""} ;
      P0A666_A9425OMCod = new int[1] ;
      P0A666_A9458OMMTpo = new String[] {""} ;
      P0A666_A9455OMOpeCod = new int[1] ;
      A9458OMMTpo = "" ;
      P0A667_A396EmprCod = new String[] {""} ;
      P0A667_A9425OMCod = new int[1] ;
      P0A667_A9455OMOpeCod = new int[1] ;
      P0A667_A9458OMMTpo = new String[] {""} ;
      P0A667_A9466OMMCLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pdltorden__default(),
         new Object[] {
             new Object[] {
            P0A662_A396EmprCod, P0A662_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A666_A396EmprCod, P0A666_A9425OMCod, P0A666_A9458OMMTpo, P0A666_A9455OMOpeCod
            }
            , new Object[] {
            P0A667_A396EmprCod, P0A667_A9425OMCod, P0A667_A9455OMOpeCod, P0A667_A9458OMMTpo, P0A667_A9466OMMCLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A9466OMMCLin ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int AV8PMCod ;
   private int A9455OMOpeCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9458OMMTpo ;
   private boolean n9488PMOrd ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A662_A396EmprCod ;
   private int[] P0A662_A9425OMCod ;
   private String[] P0A666_A396EmprCod ;
   private int[] P0A666_A9425OMCod ;
   private String[] P0A666_A9458OMMTpo ;
   private int[] P0A666_A9455OMOpeCod ;
   private String[] P0A667_A396EmprCod ;
   private int[] P0A667_A9425OMCod ;
   private int[] P0A667_A9455OMOpeCod ;
   private String[] P0A667_A9458OMMTpo ;
   private short[] P0A667_A9466OMMCLin ;
}

final  class pdltorden__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A662", "SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A663", "DELETE FROM TXPMOrde1  WHERE EmprCod = ? and OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrde1")
         ,new UpdateCursor("P0A664", "DELETE FROM TXPMOrde2  WHERE EmprCod = ? and OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrde2")
         ,new UpdateCursor("P0A665", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? and OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P0A666", "SELECT EmprCod, OMCod, OMMTpo, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A667", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? and OMMTpo = ? ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A668", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new UpdateCursor("P0A669", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
         ,new UpdateCursor("P0A6610", "UPDATE TXPMPREVE SET PMOrd=0  WHERE EmprCod = ? and PMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
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
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

