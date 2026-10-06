package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumser extends GXProcedure
{
   public pnumser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumser.class ), "" );
   }

   public pnumser( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnumser.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pnumser.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumser.this.AV15Ser1 = aP1[0];
      this.aP1 = aP1;
      pnumser.this.AV16Ser2 = aP2[0];
      this.aP2 = aP2;
      pnumser.this.AV17Ser3 = aP3[0];
      this.aP3 = aP3;
      pnumser.this.AV18Ser0 = aP4[0];
      this.aP4 = aP4;
      pnumser.this.AV19Ser20 = aP5[0];
      this.aP5 = aP5;
      pnumser.this.AV20Ser30 = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00G02 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A963Ser1 = P00G02_A963Ser1[0] ;
         n963Ser1 = P00G02_n963Ser1[0] ;
         A2387Ser2 = P00G02_A2387Ser2[0] ;
         n2387Ser2 = P00G02_n2387Ser2[0] ;
         A2389Ser3 = P00G02_A2389Ser3[0] ;
         n2389Ser3 = P00G02_n2389Ser3[0] ;
         A964Ser0 = P00G02_A964Ser0[0] ;
         n964Ser0 = P00G02_n964Ser0[0] ;
         A2388Ser20 = P00G02_A2388Ser20[0] ;
         n2388Ser20 = P00G02_n2388Ser20[0] ;
         A2390Ser30 = P00G02_A2390Ser30[0] ;
         n2390Ser30 = P00G02_n2390Ser30[0] ;
         AV15Ser1 = A963Ser1 ;
         AV16Ser2 = A2387Ser2 ;
         AV17Ser3 = A2389Ser3 ;
         AV18Ser0 = A964Ser0 ;
         AV19Ser20 = A2388Ser20 ;
         AV20Ser30 = A2390Ser30 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumser.this.A396EmprCod;
      this.aP1[0] = pnumser.this.AV15Ser1;
      this.aP2[0] = pnumser.this.AV16Ser2;
      this.aP3[0] = pnumser.this.AV17Ser3;
      this.aP4[0] = pnumser.this.AV18Ser0;
      this.aP5[0] = pnumser.this.AV19Ser20;
      this.aP6[0] = pnumser.this.AV20Ser30;
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
      P00G02_A396EmprCod = new String[] {""} ;
      P00G02_A963Ser1 = new String[] {""} ;
      P00G02_n963Ser1 = new boolean[] {false} ;
      P00G02_A2387Ser2 = new String[] {""} ;
      P00G02_n2387Ser2 = new boolean[] {false} ;
      P00G02_A2389Ser3 = new String[] {""} ;
      P00G02_n2389Ser3 = new boolean[] {false} ;
      P00G02_A964Ser0 = new String[] {""} ;
      P00G02_n964Ser0 = new boolean[] {false} ;
      P00G02_A2388Ser20 = new String[] {""} ;
      P00G02_n2388Ser20 = new boolean[] {false} ;
      P00G02_A2390Ser30 = new String[] {""} ;
      P00G02_n2390Ser30 = new boolean[] {false} ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A964Ser0 = "" ;
      A2388Ser20 = "" ;
      A2390Ser30 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumser__default(),
         new Object[] {
             new Object[] {
            P00G02_A396EmprCod, P00G02_A963Ser1, P00G02_n963Ser1, P00G02_A2387Ser2, P00G02_n2387Ser2, P00G02_A2389Ser3, P00G02_n2389Ser3, P00G02_A964Ser0, P00G02_n964Ser0, P00G02_A2388Ser20,
            P00G02_n2388Ser20, P00G02_A2390Ser30, P00G02_n2390Ser30
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15Ser1 ;
   private String AV16Ser2 ;
   private String AV17Ser3 ;
   private String AV18Ser0 ;
   private String AV19Ser20 ;
   private String AV20Ser30 ;
   private String scmdbuf ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A964Ser0 ;
   private String A2388Ser20 ;
   private String A2390Ser30 ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n964Ser0 ;
   private boolean n2388Ser20 ;
   private boolean n2390Ser30 ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00G02_A396EmprCod ;
   private String[] P00G02_A963Ser1 ;
   private boolean[] P00G02_n963Ser1 ;
   private String[] P00G02_A2387Ser2 ;
   private boolean[] P00G02_n2387Ser2 ;
   private String[] P00G02_A2389Ser3 ;
   private boolean[] P00G02_n2389Ser3 ;
   private String[] P00G02_A964Ser0 ;
   private boolean[] P00G02_n964Ser0 ;
   private String[] P00G02_A2388Ser20 ;
   private boolean[] P00G02_n2388Ser20 ;
   private String[] P00G02_A2390Ser30 ;
   private boolean[] P00G02_n2390Ser30 ;
}

final  class pnumser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G02", "SELECT EmprCod, Ser1, Ser2, Ser3, Ser0, Ser20, Ser30 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               return;
      }
   }

}

