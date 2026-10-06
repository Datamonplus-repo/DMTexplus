package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdiber0 extends GXProcedure
{
   public pdiber0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdiber0.class ), "" );
   }

   public pdiber0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 )
   {
      pdiber0.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pdiber0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdiber0.this.AV8Er_dibcli = aP1[0];
      this.aP1 = aP1;
      pdiber0.this.AV9Clicod = aP2[0];
      this.aP2 = aP2;
      pdiber0.this.AV10Er_dibint = aP3[0];
      this.aP3 = aP3;
      pdiber0.this.AV11Msg_e = aP4[0];
      this.aP4 = aP4;
      pdiber0.this.AV13Cdibuj = aP5[0];
      this.aP5 = aP5;
      pdiber0.this.AV12Diber = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Msg_e = " " ;
      AV12Diber = (byte)(0) ;
      /* Using cursor P043U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Er_dibcli});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10802ER_DibCli = P043U2_A10802ER_DibCli[0] ;
         A252CliCod = P043U2_A252CliCod[0] ;
         A10803ER_DibInt = P043U2_A10803ER_DibInt[0] ;
         AV12Diber = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12Diber == 0 )
      {
         AV11Msg_e = httpContext.getMessage( "El DIBUJO que esta intentando", "") + GXutil.chr( (short)(13)) ;
         AV11Msg_e += httpContext.getMessage( "disponer no existe en el Sistema Comercial.", "") + GXutil.chr( (short)(13)) ;
         AV11Msg_e += httpContext.getMessage( "Dar de ALTA y volver a Disponer", "") + GXutil.chr( (short)(13)) ;
      }
      AV13Cdibuj = (byte)(0) ;
      /* Using cursor P043U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8Er_dibcli, Integer.valueOf(AV9Clicod), Integer.valueOf(AV10Er_dibint)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1014DibInt = P043U3_A1014DibInt[0] ;
         A252CliCod = P043U3_A252CliCod[0] ;
         A1013DibCli = P043U3_A1013DibCli[0] ;
         AV13Cdibuj = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdiber0.this.A396EmprCod;
      this.aP1[0] = pdiber0.this.AV8Er_dibcli;
      this.aP2[0] = pdiber0.this.AV9Clicod;
      this.aP3[0] = pdiber0.this.AV10Er_dibint;
      this.aP4[0] = pdiber0.this.AV11Msg_e;
      this.aP5[0] = pdiber0.this.AV13Cdibuj;
      this.aP6[0] = pdiber0.this.AV12Diber;
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
      P043U2_A396EmprCod = new String[] {""} ;
      P043U2_A10802ER_DibCli = new String[] {""} ;
      P043U2_A252CliCod = new int[1] ;
      P043U2_A10803ER_DibInt = new int[1] ;
      A10802ER_DibCli = "" ;
      P043U3_A396EmprCod = new String[] {""} ;
      P043U3_A1014DibInt = new int[1] ;
      P043U3_A252CliCod = new int[1] ;
      P043U3_A1013DibCli = new String[] {""} ;
      A1013DibCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdiber0__default(),
         new Object[] {
             new Object[] {
            P043U2_A396EmprCod, P043U2_A10802ER_DibCli, P043U2_A252CliCod, P043U2_A10803ER_DibInt
            }
            , new Object[] {
            P043U3_A396EmprCod, P043U3_A1014DibInt, P043U3_A252CliCod, P043U3_A1013DibCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Cdibuj ;
   private byte AV12Diber ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int AV10Er_dibint ;
   private int A252CliCod ;
   private int A10803ER_DibInt ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String AV8Er_dibcli ;
   private String AV11Msg_e ;
   private String scmdbuf ;
   private String A10802ER_DibCli ;
   private String A1013DibCli ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P043U2_A396EmprCod ;
   private String[] P043U2_A10802ER_DibCli ;
   private int[] P043U2_A252CliCod ;
   private int[] P043U2_A10803ER_DibInt ;
   private String[] P043U3_A396EmprCod ;
   private int[] P043U3_A1014DibInt ;
   private int[] P043U3_A252CliCod ;
   private String[] P043U3_A1013DibCli ;
}

final  class pdiber0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043U2", "SELECT EmprCod, ER_DibCli, CliCod, ER_DibInt FROM TXPDIBER WHERE EmprCod = ? and ER_DibCli = ? ORDER BY EmprCod, ER_DibCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P043U3", "SELECT EmprCod, DibInt, CliCod, DibCli FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

