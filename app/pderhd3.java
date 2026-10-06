package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pderhd3 extends GXProcedure
{
   public pderhd3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pderhd3.class ), "" );
   }

   public pderhd3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      pderhd3.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
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
      pderhd3.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pderhd3.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pderhd3.this.AV17RpExHdFe = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      /* Using cursor P00FH2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExHdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2711RpExHdFe = P00FH2_A2711RpExHdFe[0] ;
         A2248ManCod = P00FH2_A2248ManCod[0] ;
         A396EmprCod = P00FH2_A396EmprCod[0] ;
         /* Using cursor P00FH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2713RpExHdLi = P00FH3_A2713RpExHdLi[0] ;
            AV18Flag = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV18Flag == 0 )
         {
            /* Using cursor P00FH4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pderhd3.this.AV15EmprCod;
      this.aP1[0] = pderhd3.this.AV16ManCod;
      this.aP2[0] = pderhd3.this.AV17RpExHdFe;
      Application.commitDataStores(context, remoteHandle, pr_default, "pderhd3");
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
      P00FH2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00FH2_A2248ManCod = new short[1] ;
      P00FH2_A396EmprCod = new String[] {""} ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P00FH3_A396EmprCod = new String[] {""} ;
      P00FH3_A2248ManCod = new short[1] ;
      P00FH3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00FH3_A2713RpExHdLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pderhd3__default(),
         new Object[] {
             new Object[] {
            P00FH2_A2711RpExHdFe, P00FH2_A2248ManCod, P00FH2_A396EmprCod
            }
            , new Object[] {
            P00FH3_A396EmprCod, P00FH3_A2248ManCod, P00FH3_A2711RpExHdFe, P00FH3_A2713RpExHdLi
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
   private short A2713RpExHdLi ;
   private short Gx_err ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV17RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00FH2_A2711RpExHdFe ;
   private short[] P00FH2_A2248ManCod ;
   private String[] P00FH2_A396EmprCod ;
   private String[] P00FH3_A396EmprCod ;
   private short[] P00FH3_A2248ManCod ;
   private java.util.Date[] P00FH3_A2711RpExHdFe ;
   private short[] P00FH3_A2713RpExHdLi ;
}

final  class pderhd3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FH2", "SELECT RpExHdFe, ManCod, EmprCod FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FH3", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FH4", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
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

