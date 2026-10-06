package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class operario_mormo extends GXProcedure
{
   public operario_mormo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( operario_mormo.class ), "" );
   }

   public operario_mormo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            int[] aP2 )
   {
      operario_mormo.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      operario_mormo.this.A396EmprCod = aP0;
      operario_mormo.this.A9425OMCod = aP1;
      operario_mormo.this.aP2 = aP2;
      operario_mormo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OMOpecod = 0 ;
      AV9MORMO = (short)(0) ;
      /* Using cursor P0ARO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9455OMOpeCod = P0ARO2_A9455OMOpeCod[0] ;
         A9458OMMTpo = P0ARO2_A9458OMMTpo[0] ;
         AV8OMOpecod = A9455OMOpeCod ;
         AV9MORMO = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = operario_mormo.this.AV8OMOpecod;
      this.aP3[0] = operario_mormo.this.AV9MORMO;
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
      P0ARO2_A396EmprCod = new String[] {""} ;
      P0ARO2_A9425OMCod = new int[1] ;
      P0ARO2_A9455OMOpeCod = new int[1] ;
      P0ARO2_A9458OMMTpo = new String[] {""} ;
      A9458OMMTpo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.operario_mormo__default(),
         new Object[] {
             new Object[] {
            P0ARO2_A396EmprCod, P0ARO2_A9425OMCod, P0ARO2_A9455OMOpeCod, P0ARO2_A9458OMMTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9MORMO ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int AV8OMOpecod ;
   private int A9455OMOpeCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9458OMMTpo ;
   private short[] aP3 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ARO2_A396EmprCod ;
   private int[] P0ARO2_A9425OMCod ;
   private int[] P0ARO2_A9455OMOpeCod ;
   private String[] P0ARO2_A9458OMMTpo ;
}

final  class operario_mormo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARO2", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMOpeCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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

