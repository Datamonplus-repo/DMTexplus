package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdefaudc extends GXProcedure
{
   public pdefaudc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdefaudc.class ), "" );
   }

   public pdefaudc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 )
   {
      pdefaudc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      pdefaudc.this.A396EmprCod = aP0;
      pdefaudc.this.A7182Auc_CodDef = aP1;
      pdefaudc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Auc_DscDef = "" ;
      AV17GXLvl3 = (byte)(0) ;
      /* Using cursor P04IV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A7182Auc_CodDef)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7183Auc_DscDef = P04IV2_A7183Auc_DscDef[0] ;
         n7183Auc_DscDef = P04IV2_n7183Auc_DscDef[0] ;
         AV17GXLvl3 = (byte)(1) ;
         AV14Auc_DscDef = A7183Auc_DscDef ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl3 == 0 )
      {
         if ( A7182Auc_CodDef > 0 )
         {
            AV14Auc_DscDef = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pdefaudc.this.AV14Auc_DscDef;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Auc_DscDef = "" ;
      scmdbuf = "" ;
      P04IV2_A396EmprCod = new String[] {""} ;
      P04IV2_A7182Auc_CodDef = new short[1] ;
      P04IV2_A7183Auc_DscDef = new String[] {""} ;
      P04IV2_n7183Auc_DscDef = new boolean[] {false} ;
      A7183Auc_DscDef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdefaudc__default(),
         new Object[] {
             new Object[] {
            P04IV2_A396EmprCod, P04IV2_A7182Auc_CodDef, P04IV2_A7183Auc_DscDef, P04IV2_n7183Auc_DscDef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl3 ;
   private short A7182Auc_CodDef ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV14Auc_DscDef ;
   private String scmdbuf ;
   private String A7183Auc_DscDef ;
   private boolean n7183Auc_DscDef ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04IV2_A396EmprCod ;
   private short[] P04IV2_A7182Auc_CodDef ;
   private String[] P04IV2_A7183Auc_DscDef ;
   private boolean[] P04IV2_n7183Auc_DscDef ;
}

final  class pdefaudc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04IV2", "SELECT EmprCod, Auc_CodDef, Auc_DscDef FROM TXPDEFACR WHERE EmprCod = ? and Auc_CodDef = ? ORDER BY EmprCod, Auc_CodDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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

