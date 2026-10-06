package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paldifo extends GXProcedure
{
   public paldifo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paldifo.class ), "" );
   }

   public paldifo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      paldifo.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      paldifo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paldifo.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      paldifo.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      paldifo.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCDIBUJ

      */
      A1017DibFecEnt = Gx_date ;
      n1017DibFecEnt = false ;
      A1018DibMetRea = DecimalUtil.doubleToDec(0) ;
      n1018DibMetRea = false ;
      A1015DibFecUlt = GXutil.nullDate() ;
      n1015DibFecUlt = false ;
      /* Using cursor P036I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1015DibFecUlt), A1015DibFecUlt, Boolean.valueOf(n1017DibFecEnt), A1017DibFecEnt, Boolean.valueOf(n1018DibMetRea), A1018DibMetRea});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paldifo.this.A396EmprCod;
      this.aP1[0] = paldifo.this.A1013DibCli;
      this.aP2[0] = paldifo.this.A252CliCod;
      this.aP3[0] = paldifo.this.A1014DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "paldifo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1017DibFecEnt = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      A1015DibFecUlt = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paldifo__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GX_INS545 ;
   private java.math.BigDecimal A1018DibMetRea ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String Gx_emsg ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date Gx_date ;
   private java.util.Date A1015DibFecUlt ;
   private boolean n1017DibFecEnt ;
   private boolean n1018DibMetRea ;
   private boolean n1015DibFecUlt ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class paldifo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P036I2", "INSERT INTO TXPCDIBUJ(EmprCod, DibCli, CliCod, DibInt, DibFecUlt, DibFecEnt, DibMetRea, GrabCod, DibFecPed, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibObsUL, DibMolCil, DibMed, DibPosVor, DibLevMaq, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil, DibMolCi2, DibTipRas, DibPosRas, DibRap, DibUltLin, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibCob, DibDsc, DibBmp, DibFecBor, DibGra, DibSep, DibUltUti, DibAct, DibSentido) VALUES(?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               return;
      }
   }

}

