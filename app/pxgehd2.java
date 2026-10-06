package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxgehd2 extends GXProcedure
{
   public pxgehd2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxgehd2.class ), "" );
   }

   public pxgehd2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pxgehd2.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pxgehd2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxgehd2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pxgehd2.this.AV8Discolnom = aP2[0];
      this.aP2 = aP2;
      pxgehd2.this.AV9Discolnum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03U02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A362DisColNom = P03U02_A362DisColNom[0] ;
         n362DisColNom = P03U02_n362DisColNom[0] ;
         A363DisColNum = P03U02_A363DisColNum[0] ;
         n363DisColNum = P03U02_n363DisColNum[0] ;
         AV8Discolnom = A362DisColNom ;
         AV9Discolnum = A363DisColNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxgehd2.this.A396EmprCod;
      this.aP1[0] = pxgehd2.this.A361DisCod;
      this.aP2[0] = pxgehd2.this.AV8Discolnom;
      this.aP3[0] = pxgehd2.this.AV9Discolnum;
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
      P03U02_A396EmprCod = new String[] {""} ;
      P03U02_A361DisCod = new int[1] ;
      P03U02_A362DisColNom = new String[] {""} ;
      P03U02_n362DisColNom = new boolean[] {false} ;
      P03U02_A363DisColNum = new int[1] ;
      P03U02_n363DisColNum = new boolean[] {false} ;
      A362DisColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxgehd2__default(),
         new Object[] {
             new Object[] {
            P03U02_A396EmprCod, P03U02_A361DisCod, P03U02_A362DisColNom, P03U02_n362DisColNom, P03U02_A363DisColNum, P03U02_n363DisColNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int AV9Discolnum ;
   private int A363DisColNum ;
   private String A396EmprCod ;
   private String AV8Discolnom ;
   private String scmdbuf ;
   private String A362DisColNom ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03U02_A396EmprCod ;
   private int[] P03U02_A361DisCod ;
   private String[] P03U02_A362DisColNom ;
   private boolean[] P03U02_n362DisColNom ;
   private int[] P03U02_A363DisColNum ;
   private boolean[] P03U02_n363DisColNum ;
}

final  class pxgehd2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03U02", "SELECT EmprCod, DisCod, DisColNom, DisColNum FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
      }
   }

}

