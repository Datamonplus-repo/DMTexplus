package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart4 extends GXProcedure
{
   public ppedart4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart4.class ), "" );
   }

   public ppedart4( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      ppedart4.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      ppedart4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart4.this.A1798BarDibCli = aP1[0];
      this.aP1 = aP1;
      ppedart4.this.AV9OSSCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P037H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1798BarDibCli});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P037H2_A132BarCodReo[0] ;
         n132BarCodReo = P037H2_n132BarCodReo[0] ;
         A130BarCodPar = P037H2_A130BarCodPar[0] ;
         n130BarCodPar = P037H2_n130BarCodPar[0] ;
         A7146OSSEst = P037H2_A7146OSSEst[0] ;
         n7146OSSEst = P037H2_n7146OSSEst[0] ;
         A129BarCod = P037H2_A129BarCod[0] ;
         n129BarCod = P037H2_n129BarCod[0] ;
         A7145OSSCod = P037H2_A7145OSSCod[0] ;
         if ( GXutil.strcmp(A7146OSSEst, httpContext.getMessage( "N", "")) == 0 )
         {
            AV9OSSCod = A7145OSSCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart4.this.A396EmprCod;
      this.aP1[0] = ppedart4.this.A1798BarDibCli;
      this.aP2[0] = ppedart4.this.AV9OSSCod;
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
      P037H2_A132BarCodReo = new byte[1] ;
      P037H2_n132BarCodReo = new boolean[] {false} ;
      P037H2_A130BarCodPar = new String[] {""} ;
      P037H2_n130BarCodPar = new boolean[] {false} ;
      P037H2_A396EmprCod = new String[] {""} ;
      P037H2_A1798BarDibCli = new String[] {""} ;
      P037H2_A7146OSSEst = new String[] {""} ;
      P037H2_n7146OSSEst = new boolean[] {false} ;
      P037H2_A129BarCod = new int[1] ;
      P037H2_n129BarCod = new boolean[] {false} ;
      P037H2_A7145OSSCod = new int[1] ;
      A130BarCodPar = "" ;
      A7146OSSEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart4__default(),
         new Object[] {
             new Object[] {
            P037H2_A132BarCodReo, P037H2_n132BarCodReo, P037H2_A130BarCodPar, P037H2_n130BarCodPar, P037H2_A396EmprCod, P037H2_A1798BarDibCli, P037H2_A7146OSSEst, P037H2_n7146OSSEst, P037H2_A129BarCod, P037H2_n129BarCod,
            P037H2_A7145OSSCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9OSSCod ;
   private int A129BarCod ;
   private int A7145OSSCod ;
   private String A396EmprCod ;
   private String A1798BarDibCli ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A7146OSSEst ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n7146OSSEst ;
   private boolean n129BarCod ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private byte[] P037H2_A132BarCodReo ;
   private boolean[] P037H2_n132BarCodReo ;
   private String[] P037H2_A130BarCodPar ;
   private boolean[] P037H2_n130BarCodPar ;
   private String[] P037H2_A396EmprCod ;
   private String[] P037H2_A1798BarDibCli ;
   private String[] P037H2_A7146OSSEst ;
   private boolean[] P037H2_n7146OSSEst ;
   private int[] P037H2_A129BarCod ;
   private boolean[] P037H2_n129BarCod ;
   private int[] P037H2_A7145OSSCod ;
}

final  class ppedart4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037H2", "SELECT T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarDibCli, T1.OSSEst, T1.BarCod, T1.OSSCod FROM (TXPShaSep T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T2.BarDibCli = ?) ORDER BY T1.EmprCod, T1.OSSEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 16);
               return;
      }
   }

}

