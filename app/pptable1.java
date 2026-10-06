package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptable1 extends GXProcedure
{
   public pptable1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptable1.class ), "" );
   }

   public pptable1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pptable1.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pptable1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptable1.this.A9713Tb1_Cod = aP1[0];
      this.aP1 = aP1;
      pptable1.this.AV8Tb1_dsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tb1_dsc = " " ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P03RQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9715Tb1_Dsc = P03RQ2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P03RQ2_n9715Tb1_Dsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8Tb1_dsc = A9715Tb1_Dsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8Tb1_dsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptable1.this.A396EmprCod;
      this.aP1[0] = pptable1.this.A9713Tb1_Cod;
      this.aP2[0] = pptable1.this.AV8Tb1_dsc;
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
      P03RQ2_A396EmprCod = new String[] {""} ;
      P03RQ2_A9713Tb1_Cod = new short[1] ;
      P03RQ2_A9715Tb1_Dsc = new String[] {""} ;
      P03RQ2_n9715Tb1_Dsc = new boolean[] {false} ;
      A9715Tb1_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptable1__default(),
         new Object[] {
             new Object[] {
            P03RQ2_A396EmprCod, P03RQ2_A9713Tb1_Cod, P03RQ2_A9715Tb1_Dsc, P03RQ2_n9715Tb1_Dsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Tb1_dsc ;
   private String scmdbuf ;
   private String A9715Tb1_Dsc ;
   private boolean n9715Tb1_Dsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03RQ2_A396EmprCod ;
   private short[] P03RQ2_A9713Tb1_Cod ;
   private String[] P03RQ2_A9715Tb1_Dsc ;
   private boolean[] P03RQ2_n9715Tb1_Dsc ;
}

final  class pptable1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03RQ2", "SELECT EmprCod, Tb1_Cod, Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? and Tb1_Cod = ? ORDER BY EmprCod, Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

