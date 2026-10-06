package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcfores extends GXProcedure
{
   public pcfores( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcfores.class ), "" );
   }

   public pcfores( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pcfores.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pcfores.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pcfores.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      pcfores.this.AV10ArtCod = aP2[0];
      this.aP2 = aP2;
      pcfores.this.AV11Dibujo = aP3[0];
      this.aP3 = aP3;
      pcfores.this.AV12DibIntCod = aP4[0];
      this.aP4 = aP4;
      pcfores.this.AV13CombCod = aP5[0];
      this.aP5 = aP5;
      pcfores.this.AV15ColFon = aP6[0];
      this.aP6 = aP6;
      pcfores.this.AV14Flag = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Flag = (byte)(0) ;
      /* Using cursor P03342 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10ArtCod, AV11Dibujo, Integer.valueOf(AV12DibIntCod), AV13CombCod, AV15ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2078ColFon = P03342_A2078ColFon[0] ;
         A2074ColCom = P03342_A2074ColCom[0] ;
         A1014DibInt = P03342_A1014DibInt[0] ;
         A1013DibCli = P03342_A1013DibCli[0] ;
         A2141SerEst = P03342_A2141SerEst[0] ;
         A252CliCod = P03342_A252CliCod[0] ;
         A396EmprCod = P03342_A396EmprCod[0] ;
         AV14Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcfores.this.AV8EmprCod;
      this.aP1[0] = pcfores.this.AV9CliCod;
      this.aP2[0] = pcfores.this.AV10ArtCod;
      this.aP3[0] = pcfores.this.AV11Dibujo;
      this.aP4[0] = pcfores.this.AV12DibIntCod;
      this.aP5[0] = pcfores.this.AV13CombCod;
      this.aP6[0] = pcfores.this.AV15ColFon;
      this.aP7[0] = pcfores.this.AV14Flag;
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
      P03342_A2078ColFon = new String[] {""} ;
      P03342_A2074ColCom = new String[] {""} ;
      P03342_A1014DibInt = new int[1] ;
      P03342_A1013DibCli = new String[] {""} ;
      P03342_A2141SerEst = new String[] {""} ;
      P03342_A252CliCod = new int[1] ;
      P03342_A396EmprCod = new String[] {""} ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcfores__default(),
         new Object[] {
             new Object[] {
            P03342_A2078ColFon, P03342_A2074ColCom, P03342_A1014DibInt, P03342_A1013DibCli, P03342_A2141SerEst, P03342_A252CliCod, P03342_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Flag ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12DibIntCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String AV10ArtCod ;
   private String AV11Dibujo ;
   private String AV13CombCod ;
   private String AV15ColFon ;
   private String scmdbuf ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A396EmprCod ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P03342_A2078ColFon ;
   private String[] P03342_A2074ColCom ;
   private int[] P03342_A1014DibInt ;
   private String[] P03342_A1013DibCli ;
   private String[] P03342_A2141SerEst ;
   private int[] P03342_A252CliCod ;
   private String[] P03342_A396EmprCod ;
}

final  class pcfores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03342", "SELECT ColFon, ColCom, DibInt, DibCli, SerEst, CliCod, EmprCod FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
      }
   }

}

