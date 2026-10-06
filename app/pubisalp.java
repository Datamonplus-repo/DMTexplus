package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubisalp extends GXProcedure
{
   public pubisalp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubisalp.class ), "" );
   }

   public pubisalp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           short[] aP3 )
   {
      pubisalp.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 )
   {
      pubisalp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubisalp.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pubisalp.this.A9743Emp_CUb = aP2[0];
      this.aP2 = aP2;
      pubisalp.this.A5860Emp_Anp = aP3[0];
      this.aP3 = aP3;
      pubisalp.this.AV8Emp_pzd = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03SU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9751Emp_PzU = P03SU2_A9751Emp_PzU[0] ;
         n9751Emp_PzU = P03SU2_n9751Emp_PzU[0] ;
         A9745Emp_PzE = P03SU2_A9745Emp_PzE[0] ;
         n9745Emp_PzE = P03SU2_n9745Emp_PzE[0] ;
         AV8Emp_pzd = (byte)(A9745Emp_PzE-A9751Emp_PzU) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubisalp.this.A396EmprCod;
      this.aP1[0] = pubisalp.this.A44AlbRecCod;
      this.aP2[0] = pubisalp.this.A9743Emp_CUb;
      this.aP3[0] = pubisalp.this.A5860Emp_Anp;
      this.aP4[0] = pubisalp.this.AV8Emp_pzd;
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
      P03SU2_A396EmprCod = new String[] {""} ;
      P03SU2_A44AlbRecCod = new int[1] ;
      P03SU2_A9743Emp_CUb = new String[] {""} ;
      P03SU2_A5860Emp_Anp = new short[1] ;
      P03SU2_A9751Emp_PzU = new int[1] ;
      P03SU2_n9751Emp_PzU = new boolean[] {false} ;
      P03SU2_A9745Emp_PzE = new int[1] ;
      P03SU2_n9745Emp_PzE = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubisalp__default(),
         new Object[] {
             new Object[] {
            P03SU2_A396EmprCod, P03SU2_A44AlbRecCod, P03SU2_A9743Emp_CUb, P03SU2_A5860Emp_Anp, P03SU2_A9751Emp_PzU, P03SU2_n9751Emp_PzU, P03SU2_A9745Emp_PzE, P03SU2_n9745Emp_PzE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Emp_pzd ;
   private short A5860Emp_Anp ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A9751Emp_PzU ;
   private int A9745Emp_PzE ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private String scmdbuf ;
   private boolean n9751Emp_PzU ;
   private boolean n9745Emp_PzE ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SU2_A396EmprCod ;
   private int[] P03SU2_A44AlbRecCod ;
   private String[] P03SU2_A9743Emp_CUb ;
   private short[] P03SU2_A5860Emp_Anp ;
   private int[] P03SU2_A9751Emp_PzU ;
   private boolean[] P03SU2_n9751Emp_PzU ;
   private int[] P03SU2_A9745Emp_PzE ;
   private boolean[] P03SU2_n9745Emp_PzE ;
}

final  class pubisalp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SU2", "SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp, Emp_PzU, Emp_PzE FROM TXPUBIIN WHERE EmprCod = ? and AlbRecCod = ? and Emp_CUb = ? and Emp_Anp = ? ORDER BY EmprCod, AlbRecCod, Emp_CUb, Emp_Anp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

