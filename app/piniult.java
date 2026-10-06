package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class piniult extends GXProcedure
{
   public piniult( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( piniult.class ), "" );
   }

   public piniult( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      piniult.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      piniult.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      piniult.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P047G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5550Lb_UltlPq = P047G2_A5550Lb_UltlPq[0] ;
         AV8Lb_lineaPq = (short)(0) ;
         /* Using cursor P047G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5551Lb_lineaPq = P047G3_A5551Lb_lineaPq[0] ;
            AV8Lb_lineaPq = A5551Lb_lineaPq ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A5550Lb_UltlPq = AV8Lb_lineaPq ;
         /* Using cursor P047G4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A5550Lb_UltlPq), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = piniult.this.A396EmprCod;
      this.aP1[0] = piniult.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "piniult");
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
      P047G2_A396EmprCod = new String[] {""} ;
      P047G2_A5532Lb_numero = new int[1] ;
      P047G2_A5550Lb_UltlPq = new short[1] ;
      P047G3_A396EmprCod = new String[] {""} ;
      P047G3_A5532Lb_numero = new int[1] ;
      P047G3_A5551Lb_lineaPq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.piniult__default(),
         new Object[] {
             new Object[] {
            P047G2_A396EmprCod, P047G2_A5532Lb_numero, P047G2_A5550Lb_UltlPq
            }
            , new Object[] {
            P047G3_A396EmprCod, P047G3_A5532Lb_numero, P047G3_A5551Lb_lineaPq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5550Lb_UltlPq ;
   private short AV8Lb_lineaPq ;
   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P047G2_A396EmprCod ;
   private int[] P047G2_A5532Lb_numero ;
   private short[] P047G2_A5550Lb_UltlPq ;
   private String[] P047G3_A396EmprCod ;
   private int[] P047G3_A5532Lb_numero ;
   private short[] P047G3_A5551Lb_lineaPq ;
}

final  class piniult__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P047G2", "SELECT EmprCod, Lb_numero, Lb_UltlPq FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P047G3", "SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P047G4", "UPDATE TXPENS001 SET Lb_UltlPq=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

