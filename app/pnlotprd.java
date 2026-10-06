package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnlotprd extends GXProcedure
{
   public pnlotprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnlotprd.class ), "" );
   }

   public pnlotprd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 )
   {
      pnlotprd.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      pnlotprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnlotprd.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pnlotprd.this.A11665LoteFec = aP2[0];
      this.aP2 = aP2;
      pnlotprd.this.A11666LotePed = aP3[0];
      this.aP3 = aP3;
      pnlotprd.this.AV8EntLoteN = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EntLoteN = " " ;
      /* Using cursor P04PW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11665LoteFec, Integer.valueOf(A11666LotePed)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11664LoteID = P04PW2_A11664LoteID[0] ;
         if ( GXutil.strcmp(AV8EntLoteN, " ") == 0 )
         {
            AV8EntLoteN = GXutil.trim( A11664LoteID) ;
         }
         else
         {
            AV8EntLoteN += "-" + GXutil.trim( A11664LoteID) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnlotprd.this.A396EmprCod;
      this.aP1[0] = pnlotprd.this.A719PrdNum;
      this.aP2[0] = pnlotprd.this.A11665LoteFec;
      this.aP3[0] = pnlotprd.this.A11666LotePed;
      this.aP4[0] = pnlotprd.this.AV8EntLoteN;
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
      P04PW2_A396EmprCod = new String[] {""} ;
      P04PW2_A719PrdNum = new String[] {""} ;
      P04PW2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04PW2_A11666LotePed = new int[1] ;
      P04PW2_A11664LoteID = new String[] {""} ;
      A11664LoteID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnlotprd__default(),
         new Object[] {
             new Object[] {
            P04PW2_A396EmprCod, P04PW2_A719PrdNum, P04PW2_A11665LoteFec, P04PW2_A11666LotePed, P04PW2_A11664LoteID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11666LotePed ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8EntLoteN ;
   private String scmdbuf ;
   private String A11664LoteID ;
   private java.util.Date A11665LoteFec ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04PW2_A396EmprCod ;
   private String[] P04PW2_A719PrdNum ;
   private java.util.Date[] P04PW2_A11665LoteFec ;
   private int[] P04PW2_A11666LotePed ;
   private String[] P04PW2_A11664LoteID ;
}

final  class pnlotprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PW2", "SELECT EmprCod, PrdNum, LoteFec, LotePed, LoteID FROM TXPLOTPRD WHERE (EmprCod = ? and PrdNum = ?) AND (LoteFec = ?) AND (LotePed = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

