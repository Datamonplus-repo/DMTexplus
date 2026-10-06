package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrf000 extends GXProcedure
{
   public ptrf000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrf000.class ), "" );
   }

   public ptrf000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      ptrf000.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      ptrf000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptrf000.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ptrf000.this.AV8TxtLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TxtLin = " " ;
      AV9i = (short)(1) ;
      /* Using cursor P04O12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8918CC_ExisCC = P04O12_A8918CC_ExisCC[0] ;
         n8918CC_ExisCC = P04O12_n8918CC_ExisCC[0] ;
         A8909CC_AlmDsc = P04O12_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = P04O12_n8909CC_AlmDsc[0] ;
         A8908CC_AlmCod = P04O12_A8908CC_AlmCod[0] ;
         A8909CC_AlmDsc = P04O12_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = P04O12_n8909CC_AlmDsc[0] ;
         Gx_msg = GXutil.str( A8908CC_AlmCod, 2, 0) + " " + A8909CC_AlmDsc + " " + GXutil.str( A8918CC_ExisCC, 12, 4) ;
         if ( GXutil.strcmp(AV8TxtLin, " ") == 0 )
         {
            AV8TxtLin = GXutil.str( A8908CC_AlmCod, 2, 0) + " " + A8909CC_AlmDsc + " " + GXutil.str( A8918CC_ExisCC, 12, 4) + GXutil.chr( (short)(13)) ;
         }
         else
         {
            AV8TxtLin += GXutil.str( A8908CC_AlmCod, 2, 0) + " " + A8909CC_AlmDsc + " " + GXutil.str( A8918CC_ExisCC, 12, 4) + GXutil.chr( (short)(13)) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptrf000.this.A396EmprCod;
      this.aP1[0] = ptrf000.this.A719PrdNum;
      this.aP2[0] = ptrf000.this.AV8TxtLin;
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
      P04O12_A396EmprCod = new String[] {""} ;
      P04O12_A719PrdNum = new String[] {""} ;
      P04O12_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04O12_n8918CC_ExisCC = new boolean[] {false} ;
      P04O12_A8909CC_AlmDsc = new String[] {""} ;
      P04O12_n8909CC_AlmDsc = new boolean[] {false} ;
      P04O12_A8908CC_AlmCod = new byte[1] ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      A8909CC_AlmDsc = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrf000__default(),
         new Object[] {
             new Object[] {
            P04O12_A396EmprCod, P04O12_A719PrdNum, P04O12_A8918CC_ExisCC, P04O12_n8918CC_ExisCC, P04O12_A8909CC_AlmDsc, P04O12_n8909CC_AlmDsc, P04O12_A8908CC_AlmCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8908CC_AlmCod ;
   private short AV9i ;
   private short Gx_err ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A8909CC_AlmDsc ;
   private String Gx_msg ;
   private boolean n8918CC_ExisCC ;
   private boolean n8909CC_AlmDsc ;
   private String AV8TxtLin ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04O12_A396EmprCod ;
   private String[] P04O12_A719PrdNum ;
   private java.math.BigDecimal[] P04O12_A8918CC_ExisCC ;
   private boolean[] P04O12_n8918CC_ExisCC ;
   private String[] P04O12_A8909CC_AlmDsc ;
   private boolean[] P04O12_n8909CC_AlmDsc ;
   private byte[] P04O12_A8908CC_AlmCod ;
}

final  class ptrf000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04O12", "SELECT T1.EmprCod, T1.PrdNum, T1.CC_ExisCC, T2.CC_AlmDsc, T1.CC_AlmCod FROM (TXPPRDALM T1 INNER JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
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
               return;
      }
   }

}

