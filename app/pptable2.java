package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptable2 extends GXProcedure
{
   public pptable2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptable2.class ), "" );
   }

   public pptable2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pptable2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pptable2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptable2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pptable2.this.AV9Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pptable2.this.AV8Tb1_dsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tb1_dsc = " " ;
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P04TS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV9Tb1_Cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9713Tb1_Cod = P04TS2_A9713Tb1_Cod[0] ;
         A9715Tb1_Dsc = P04TS2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P04TS2_n9715Tb1_Dsc[0] ;
         A9715Tb1_Dsc = P04TS2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P04TS2_n9715Tb1_Dsc[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV8Tb1_dsc = A9715Tb1_Dsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         AV8Tb1_dsc = ((AV9Tb1_Cod==0) ? " " : httpContext.getMessage( "Error", "")) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptable2.this.A396EmprCod;
      this.aP1[0] = pptable2.this.A252CliCod;
      this.aP2[0] = pptable2.this.AV9Tb1_Cod;
      this.aP3[0] = pptable2.this.AV8Tb1_dsc;
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
      P04TS2_A396EmprCod = new String[] {""} ;
      P04TS2_A252CliCod = new int[1] ;
      P04TS2_A9713Tb1_Cod = new short[1] ;
      P04TS2_A9715Tb1_Dsc = new String[] {""} ;
      P04TS2_n9715Tb1_Dsc = new boolean[] {false} ;
      A9715Tb1_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptable2__default(),
         new Object[] {
             new Object[] {
            P04TS2_A396EmprCod, P04TS2_A252CliCod, P04TS2_A9713Tb1_Cod, P04TS2_A9715Tb1_Dsc, P04TS2_n9715Tb1_Dsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short AV9Tb1_Cod ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8Tb1_dsc ;
   private String scmdbuf ;
   private String A9715Tb1_Dsc ;
   private boolean n9715Tb1_Dsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TS2_A396EmprCod ;
   private int[] P04TS2_A252CliCod ;
   private short[] P04TS2_A9713Tb1_Cod ;
   private String[] P04TS2_A9715Tb1_Dsc ;
   private boolean[] P04TS2_n9715Tb1_Dsc ;
}

final  class pptable2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TS2", "SELECT T1.EmprCod, T1.CliCod, T1.Tb1_Cod, T2.Tb1_Dsc FROM (TXPTABLA4 T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.Tb1_Cod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

