package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedidocliente_pr extends GXProcedure
{
   public pedidocliente_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedidocliente_pr.class ), "" );
   }

   public pedidocliente_pr( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      pedidocliente_pr.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      pedidocliente_pr.this.A396EmprCod = aP0;
      pedidocliente_pr.this.A129BarCod = aP1;
      pedidocliente_pr.this.A132BarCodReo = aP2;
      pedidocliente_pr.this.A130BarCodPar = aP3;
      pedidocliente_pr.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9Enc20c ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int2) ;
      pedidocliente_pr.this.GXt_int1 = GXv_int2[0] ;
      AV9Enc20c = GXt_int1 ;
      /* Using cursor P0A9Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4812BarEncCli = P0A9Y2_A4812BarEncCli[0] ;
         A143BarDisNum = P0A9Y2_A143BarDisNum[0] ;
         AV8PedidoCliente = ((AV9Enc20c==0) ? A143BarDisNum : A4812BarEncCli) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pedidocliente_pr.this.AV8PedidoCliente;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PedidoCliente = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0A9Y2_A396EmprCod = new String[] {""} ;
      P0A9Y2_A129BarCod = new int[1] ;
      P0A9Y2_A132BarCodReo = new byte[1] ;
      P0A9Y2_A130BarCodPar = new String[] {""} ;
      P0A9Y2_A4812BarEncCli = new String[] {""} ;
      P0A9Y2_A143BarDisNum = new String[] {""} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.pedidocliente_pr__default(),
         new Object[] {
             new Object[] {
            P0A9Y2_A396EmprCod, P0A9Y2_A129BarCod, P0A9Y2_A132BarCodReo, P0A9Y2_A130BarCodPar, P0A9Y2_A4812BarEncCli, P0A9Y2_A143BarDisNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Enc20c ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8PedidoCliente ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9Y2_A396EmprCod ;
   private int[] P0A9Y2_A129BarCod ;
   private byte[] P0A9Y2_A132BarCodReo ;
   private String[] P0A9Y2_A130BarCodPar ;
   private String[] P0A9Y2_A4812BarEncCli ;
   private String[] P0A9Y2_A143BarDisNum ;
}

final  class pedidocliente_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9Y2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEncCli, BarDisNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

