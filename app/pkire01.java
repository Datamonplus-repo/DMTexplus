package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkire01 extends GXProcedure
{
   public pkire01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkire01.class ), "" );
   }

   public pkire01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      pkire01.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pkire01.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pkire01.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pkire01.this.AV17RpExPdFe = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      /* Using cursor P00DW2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExPdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2364RpExPdFe = P00DW2_A2364RpExPdFe[0] ;
         A2248ManCod = P00DW2_A2248ManCod[0] ;
         A396EmprCod = P00DW2_A396EmprCod[0] ;
         /* Using cursor P00DW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2364RpExPdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2368RpExPdCli = P00DW3_A2368RpExPdCli[0] ;
            n2368RpExPdCli = P00DW3_n2368RpExPdCli[0] ;
            A2366RpExPdLi = P00DW3_A2366RpExPdLi[0] ;
            AV18Flag = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV18Flag == 0 )
         {
            /* Using cursor P00DW4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2364RpExPdFe});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRPEXP");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkire01.this.AV15EmprCod;
      this.aP1[0] = pkire01.this.AV16ManCod;
      this.aP2[0] = pkire01.this.AV17RpExPdFe;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkire01");
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
      P00DW2_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00DW2_A2248ManCod = new short[1] ;
      P00DW2_A396EmprCod = new String[] {""} ;
      A2364RpExPdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P00DW3_A396EmprCod = new String[] {""} ;
      P00DW3_A2248ManCod = new short[1] ;
      P00DW3_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00DW3_A2368RpExPdCli = new int[1] ;
      P00DW3_n2368RpExPdCli = new boolean[] {false} ;
      P00DW3_A2366RpExPdLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkire01__default(),
         new Object[] {
             new Object[] {
            P00DW2_A2364RpExPdFe, P00DW2_A2248ManCod, P00DW2_A396EmprCod
            }
            , new Object[] {
            P00DW3_A396EmprCod, P00DW3_A2248ManCod, P00DW3_A2364RpExPdFe, P00DW3_A2368RpExPdCli, P00DW3_n2368RpExPdCli, P00DW3_A2366RpExPdLi
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Flag ;
   private short AV16ManCod ;
   private short A2248ManCod ;
   private short A2366RpExPdLi ;
   private short Gx_err ;
   private int A2368RpExPdCli ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV17RpExPdFe ;
   private java.util.Date A2364RpExPdFe ;
   private boolean n2368RpExPdCli ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00DW2_A2364RpExPdFe ;
   private short[] P00DW2_A2248ManCod ;
   private String[] P00DW2_A396EmprCod ;
   private String[] P00DW3_A396EmprCod ;
   private short[] P00DW3_A2248ManCod ;
   private java.util.Date[] P00DW3_A2364RpExPdFe ;
   private int[] P00DW3_A2368RpExPdCli ;
   private boolean[] P00DW3_n2368RpExPdCli ;
   private short[] P00DW3_A2366RpExPdLi ;
}

final  class pkire01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DW2", "SELECT RpExPdFe, ManCod, EmprCod FROM TXPCRPEXP WHERE EmprCod = ? and ManCod = ? and RpExPdFe = ? ORDER BY EmprCod, ManCod, RpExPdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DW3", "SELECT EmprCod, ManCod, RpExPdFe, RpExPdCli, RpExPdLi FROM TXPLRPEXP WHERE EmprCod = ? and ManCod = ? and RpExPdFe = ? ORDER BY EmprCod, ManCod, RpExPdFe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DW4", "DELETE FROM TXPCRPEXP  WHERE EmprCod = ? AND ManCod = ? AND RpExPdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRPEXP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

