package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens005e extends GXProcedure
{
   public pens005e( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens005e.class ), "" );
   }

   public pens005e( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pens005e.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pens005e.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens005e.this.A6310Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02PK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6311Lb_TaAuxD = P02PK2_A6311Lb_TaAuxD[0] ;
         /* Using cursor P02PK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6313lb_TaAuxL = P02PK3_A6313lb_TaAuxL[0] ;
            /* Optimized DELETE. */
            /* Using cursor P02PK4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS007");
            /* End optimized DELETE. */
            /* Using cursor P02PK5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02PK6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS005");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens005e.this.A396EmprCod;
      this.aP1[0] = pens005e.this.A6310Lb_TaAuxC;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens005e");
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
      P02PK2_A396EmprCod = new String[] {""} ;
      P02PK2_A6310Lb_TaAuxC = new String[] {""} ;
      P02PK2_A6311Lb_TaAuxD = new String[] {""} ;
      A6311Lb_TaAuxD = "" ;
      P02PK3_A396EmprCod = new String[] {""} ;
      P02PK3_A6310Lb_TaAuxC = new String[] {""} ;
      P02PK3_A6313lb_TaAuxL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens005e__default(),
         new Object[] {
             new Object[] {
            P02PK2_A396EmprCod, P02PK2_A6310Lb_TaAuxC, P02PK2_A6311Lb_TaAuxD
            }
            , new Object[] {
            P02PK3_A396EmprCod, P02PK3_A6310Lb_TaAuxC, P02PK3_A6313lb_TaAuxL
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

   private short A6313lb_TaAuxL ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String scmdbuf ;
   private String A6311Lb_TaAuxD ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02PK2_A396EmprCod ;
   private String[] P02PK2_A6310Lb_TaAuxC ;
   private String[] P02PK2_A6311Lb_TaAuxD ;
   private String[] P02PK3_A396EmprCod ;
   private String[] P02PK3_A6310Lb_TaAuxC ;
   private short[] P02PK3_A6313lb_TaAuxL ;
}

final  class pens005e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PK2", "SELECT EmprCod, Lb_TaAuxC, Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02PK3", "SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PK4", "DELETE FROM TXPENS007  WHERE EmprCod = ? and Lb_TaAuxC = ? and lb_TaAuxL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS007")
         ,new UpdateCursor("P02PK5", "DELETE FROM TXPENS008  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS008")
         ,new UpdateCursor("P02PK6", "DELETE FROM TXPENS005  WHERE EmprCod = ? AND Lb_TaAuxC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS005")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

