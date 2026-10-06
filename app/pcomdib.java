package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcomdib extends GXProcedure
{
   public pcomdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcomdib.class ), "" );
   }

   public pcomdib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 )
   {
      pcomdib.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 )
   {
      pcomdib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcomdib.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcomdib.this.A1013DibCli = aP2[0];
      this.aP2 = aP2;
      pcomdib.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pcomdib.this.AV16DibMolCil = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00YJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1019DibMolCil = P00YJ2_A1019DibMolCil[0] ;
         n1019DibMolCil = P00YJ2_n1019DibMolCil[0] ;
         A1823DibTipMaq = P00YJ2_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P00YJ2_n1823DibTipMaq[0] ;
         A2090DibMolCi2 = P00YJ2_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P00YJ2_n2090DibMolCi2[0] ;
         AV15Flag = (byte)(1) ;
         AV16DibMolCil = A1019DibMolCil ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
         {
            AV16DibMolCil = A2090DibMolCi2 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15Flag == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Dibujo Cliente/Interno", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcomdib.this.A396EmprCod;
      this.aP1[0] = pcomdib.this.A252CliCod;
      this.aP2[0] = pcomdib.this.A1013DibCli;
      this.aP3[0] = pcomdib.this.A1014DibInt;
      this.aP4[0] = pcomdib.this.AV16DibMolCil;
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
      P00YJ2_A396EmprCod = new String[] {""} ;
      P00YJ2_A1013DibCli = new String[] {""} ;
      P00YJ2_A252CliCod = new int[1] ;
      P00YJ2_A1014DibInt = new int[1] ;
      P00YJ2_A1019DibMolCil = new short[1] ;
      P00YJ2_n1019DibMolCil = new boolean[] {false} ;
      P00YJ2_A1823DibTipMaq = new String[] {""} ;
      P00YJ2_n1823DibTipMaq = new boolean[] {false} ;
      P00YJ2_A2090DibMolCi2 = new short[1] ;
      P00YJ2_n2090DibMolCi2 = new boolean[] {false} ;
      A1823DibTipMaq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcomdib__default(),
         new Object[] {
             new Object[] {
            P00YJ2_A396EmprCod, P00YJ2_A1013DibCli, P00YJ2_A252CliCod, P00YJ2_A1014DibInt, P00YJ2_A1019DibMolCil, P00YJ2_n1019DibMolCil, P00YJ2_A1823DibTipMaq, P00YJ2_n1823DibTipMaq, P00YJ2_A2090DibMolCi2, P00YJ2_n2090DibMolCi2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short AV16DibMolCil ;
   private short A1019DibMolCil ;
   private short A2090DibMolCi2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private String A1823DibTipMaq ;
   private boolean n1019DibMolCil ;
   private boolean n1823DibTipMaq ;
   private boolean n2090DibMolCi2 ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YJ2_A396EmprCod ;
   private String[] P00YJ2_A1013DibCli ;
   private int[] P00YJ2_A252CliCod ;
   private int[] P00YJ2_A1014DibInt ;
   private short[] P00YJ2_A1019DibMolCil ;
   private boolean[] P00YJ2_n1019DibMolCil ;
   private String[] P00YJ2_A1823DibTipMaq ;
   private boolean[] P00YJ2_n1823DibTipMaq ;
   private short[] P00YJ2_A2090DibMolCi2 ;
   private boolean[] P00YJ2_n2090DibMolCi2 ;
}

final  class pcomdib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YJ2", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibMolCil, DibTipMaq, DibMolCi2 FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

