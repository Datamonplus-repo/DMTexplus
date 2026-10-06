package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdefdsc extends GXProcedure
{
   public pdefdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdefdsc.class ), "" );
   }

   public pdefdsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 )
   {
      pdefdsc.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pdefdsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdefdsc.this.A4661HisLavCod = aP1[0];
      this.aP1 = aP1;
      pdefdsc.this.A4662HisLavReo = aP2[0];
      this.aP2 = aP2;
      pdefdsc.this.A4663HisLavPar = aP3[0];
      this.aP3 = aP3;
      pdefdsc.this.A4664HisLavNpd = aP4[0];
      this.aP4 = aP4;
      pdefdsc.this.A4665HisLavOrd = aP5[0];
      this.aP5 = aP5;
      pdefdsc.this.AV17TipDefDsc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01AV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4661HisLavCod), Byte.valueOf(A4662HisLavReo), A4663HisLavPar, Integer.valueOf(A4664HisLavNpd), Short.valueOf(A4665HisLavOrd)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = P01AV2_A833TipDefCod[0] ;
         n833TipDefCod = P01AV2_n833TipDefCod[0] ;
         A4667HisLavCon = P01AV2_A4667HisLavCon[0] ;
         A834TipDefDsc = P01AV2_A834TipDefDsc[0] ;
         n834TipDefDsc = P01AV2_n834TipDefDsc[0] ;
         A834TipDefDsc = P01AV2_A834TipDefDsc[0] ;
         n834TipDefDsc = P01AV2_n834TipDefDsc[0] ;
         AV17TipDefDsc = A834TipDefDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdefdsc.this.A396EmprCod;
      this.aP1[0] = pdefdsc.this.A4661HisLavCod;
      this.aP2[0] = pdefdsc.this.A4662HisLavReo;
      this.aP3[0] = pdefdsc.this.A4663HisLavPar;
      this.aP4[0] = pdefdsc.this.A4664HisLavNpd;
      this.aP5[0] = pdefdsc.this.A4665HisLavOrd;
      this.aP6[0] = pdefdsc.this.AV17TipDefDsc;
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
      P01AV2_A833TipDefCod = new short[1] ;
      P01AV2_n833TipDefCod = new boolean[] {false} ;
      P01AV2_A396EmprCod = new String[] {""} ;
      P01AV2_A4661HisLavCod = new int[1] ;
      P01AV2_A4662HisLavReo = new byte[1] ;
      P01AV2_A4663HisLavPar = new String[] {""} ;
      P01AV2_A4664HisLavNpd = new int[1] ;
      P01AV2_A4665HisLavOrd = new short[1] ;
      P01AV2_A4667HisLavCon = new int[1] ;
      P01AV2_A834TipDefDsc = new String[] {""} ;
      P01AV2_n834TipDefDsc = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdefdsc__default(),
         new Object[] {
             new Object[] {
            P01AV2_A833TipDefCod, P01AV2_n833TipDefCod, P01AV2_A396EmprCod, P01AV2_A4661HisLavCod, P01AV2_A4662HisLavReo, P01AV2_A4663HisLavPar, P01AV2_A4664HisLavNpd, P01AV2_A4665HisLavOrd, P01AV2_A4667HisLavCon, P01AV2_A834TipDefDsc,
            P01AV2_n834TipDefDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4662HisLavReo ;
   private short A4665HisLavOrd ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int A4661HisLavCod ;
   private int A4664HisLavNpd ;
   private int A4667HisLavCon ;
   private String A396EmprCod ;
   private String A4663HisLavPar ;
   private String AV17TipDefDsc ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P01AV2_A833TipDefCod ;
   private boolean[] P01AV2_n833TipDefCod ;
   private String[] P01AV2_A396EmprCod ;
   private int[] P01AV2_A4661HisLavCod ;
   private byte[] P01AV2_A4662HisLavReo ;
   private String[] P01AV2_A4663HisLavPar ;
   private int[] P01AV2_A4664HisLavNpd ;
   private short[] P01AV2_A4665HisLavOrd ;
   private int[] P01AV2_A4667HisLavCon ;
   private String[] P01AV2_A834TipDefDsc ;
   private boolean[] P01AV2_n834TipDefDsc ;
}

final  class pdefdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AV2", "SELECT T1.TipDefCod, T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd, T1.HisLavCon, T2.TipDefDsc FROM (TXPHISRE1 T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.HisLavCod = ? and T1.HisLavReo = ? and T1.HisLavPar = ? and T1.HisLavNpd = ? and T1.HisLavOrd = ? ORDER BY T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

