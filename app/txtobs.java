package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txtobs extends GXProcedure
{
   public txtobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txtobs.class ), "" );
   }

   public txtobs( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             long[] aP2 )
   {
      txtobs.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        long[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             long[] aP2 ,
                             String[] aP3 )
   {
      txtobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txtobs.this.A4929Inc_Dia = aP1[0];
      this.aP1 = aP1;
      txtobs.this.A4931Inc_Linea = aP2[0];
      this.aP2 = aP2;
      txtobs.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P089E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4936Inc_Obs = P089E2_A4936Inc_Obs[0] ;
         AV8Nlin = (short)(GXutil.gxmlines( A4936Inc_Obs, (short)(60))) ;
         AV9i = (short)(1) ;
         AV10Obs = " " ;
         while ( AV9i <= AV8Nlin )
         {
            AV10Obs += GXutil.gxgetmli( A4936Inc_Obs, AV9i, (short)(60)) + GXutil.newLine( ) ;
            AV9i = (short)(AV9i+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txtobs.this.A396EmprCod;
      this.aP1[0] = txtobs.this.A4929Inc_Dia;
      this.aP2[0] = txtobs.this.A4931Inc_Linea;
      this.aP3[0] = txtobs.this.AV10Obs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Obs = "" ;
      scmdbuf = "" ;
      P089E2_A396EmprCod = new String[] {""} ;
      P089E2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089E2_A4931Inc_Linea = new long[1] ;
      P089E2_A4936Inc_Obs = new String[] {""} ;
      A4936Inc_Obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txtobs__default(),
         new Object[] {
             new Object[] {
            P089E2_A396EmprCod, P089E2_A4929Inc_Dia, P089E2_A4931Inc_Linea, P089E2_A4936Inc_Obs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Nlin ;
   private short AV9i ;
   private short Gx_err ;
   private long A4931Inc_Linea ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date A4929Inc_Dia ;
   private String AV10Obs ;
   private String A4936Inc_Obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P089E2_A396EmprCod ;
   private java.util.Date[] P089E2_A4929Inc_Dia ;
   private long[] P089E2_A4931Inc_Linea ;
   private String[] P089E2_A4936Inc_Obs ;
}

final  class txtobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089E2", "SELECT EmprCod, Inc_Dia, Inc_Linea, Inc_Obs FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Dia = ? and Inc_Linea = ? ORDER BY EmprCod, Inc_Dia, Inc_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

