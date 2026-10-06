package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengoprdnumlalpro extends GXProcedure
{
   public obtengoprdnumlalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengoprdnumlalpro.class ), "" );
   }

   public obtengoprdnumlalpro( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 )
   {
      obtengoprdnumlalpro.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      obtengoprdnumlalpro.this.A396EmprCod = aP0;
      obtengoprdnumlalpro.this.A13418AlbProID = aP1;
      obtengoprdnumlalpro.this.A13442AlbProLine = aP2;
      obtengoprdnumlalpro.this.aP3 = aP3;
      obtengoprdnumlalpro.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Prdnom = "" ;
      AV8Prdnum = "" ;
      /* Using cursor P0AIX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P0AIX2_A719PrdNum[0] ;
         A718PrdNom = P0AIX2_A718PrdNom[0] ;
         A718PrdNom = P0AIX2_A718PrdNom[0] ;
         AV8Prdnum = A719PrdNum ;
         AV9Prdnom = A718PrdNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtengoprdnumlalpro.this.AV8Prdnum;
      this.aP4[0] = obtengoprdnumlalpro.this.AV9Prdnom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Prdnum = "" ;
      AV9Prdnom = "" ;
      scmdbuf = "" ;
      P0AIX2_A396EmprCod = new String[] {""} ;
      P0AIX2_A13418AlbProID = new int[1] ;
      P0AIX2_A13442AlbProLine = new short[1] ;
      P0AIX2_A719PrdNum = new String[] {""} ;
      P0AIX2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengoprdnumlalpro__default(),
         new Object[] {
             new Object[] {
            P0AIX2_A396EmprCod, P0AIX2_A13418AlbProID, P0AIX2_A13442AlbProLine, P0AIX2_A719PrdNum, P0AIX2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13442AlbProLine ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV8Prdnum ;
   private String AV9Prdnom ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String[] aP4 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIX2_A396EmprCod ;
   private int[] P0AIX2_A13418AlbProID ;
   private short[] P0AIX2_A13442AlbProLine ;
   private String[] P0AIX2_A719PrdNum ;
   private String[] P0AIX2_A718PrdNom ;
}

final  class obtengoprdnumlalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIX2", "SELECT T1.EmprCod, T1.AlbProID, T1.AlbProLine, T1.PrdNum, T2.PrdNom FROM (TXPLALPRO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.AlbProID = ? and T1.AlbProLine = ? ORDER BY T1.EmprCod, T1.AlbProID, T1.AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

