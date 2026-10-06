package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlaud extends GXProcedure
{
   public pctrlaud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlaud.class ), "" );
   }

   public pctrlaud( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pctrlaud.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pctrlaud.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlaud.this.AV9Discod = aP1[0];
      this.aP1 = aP1;
      pctrlaud.this.AV10Msg_err = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Msg_err = " " ;
      AV13GXLvl3 = (byte)(0) ;
      /* Using cursor P04IW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P04IW2_A361DisCod[0] ;
         A673Piezas = P04IW2_A673Piezas[0] ;
         A317AlbStLot = P04IW2_A317AlbStLot[0] ;
         A8029AlbNumM = P04IW2_A8029AlbNumM[0] ;
         A44AlbRecCod = P04IW2_A44AlbRecCod[0] ;
         A317AlbStLot = P04IW2_A317AlbStLot[0] ;
         A8029AlbNumM = P04IW2_A8029AlbNumM[0] ;
         AV13GXLvl3 = (byte)(1) ;
         if ( A317AlbStLot != 1 )
         {
            AV10Msg_err = httpContext.getMessage( "Error. Este Pedido ", "") + GXutil.str( AV9Discod, 8, 0) + GXutil.chr( (short)(13)) ;
            AV10Msg_err += httpContext.getMessage( "tiene asignado este N Entrada ", "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.chr( (short)(13)) ;
            if ( GXutil.strcmp(A8029AlbNumM, httpContext.getMessage( "NOOK", "")) == 0 )
            {
               AV10Msg_err += httpContext.getMessage( "y su estado es RECHAZADO", "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.chr( (short)(13)) ;
            }
            if ( GXutil.strcmp(A8029AlbNumM, " ") == 0 )
            {
               AV10Msg_err += httpContext.getMessage( "y su estado es PENDIENTE Auditar", "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.chr( (short)(13)) ;
            }
            AV10Msg_err += httpContext.getMessage( "NO se genera OP", "") + GXutil.chr( (short)(13)) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl3 == 0 )
      {
         AV10Msg_err = httpContext.getMessage( "Error. Este Pedido ", "") + GXutil.str( AV9Discod, 8, 0) + GXutil.chr( (short)(13)) ;
         AV10Msg_err += httpContext.getMessage( "NO tiene asignada N Entrada", "") + GXutil.chr( (short)(13)) ;
         AV10Msg_err += httpContext.getMessage( "NO se genera OP", "") + GXutil.chr( (short)(13)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlaud.this.A396EmprCod;
      this.aP1[0] = pctrlaud.this.AV9Discod;
      this.aP2[0] = pctrlaud.this.AV10Msg_err;
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
      P04IW2_A396EmprCod = new String[] {""} ;
      P04IW2_A361DisCod = new int[1] ;
      P04IW2_A673Piezas = new int[1] ;
      P04IW2_A317AlbStLot = new byte[1] ;
      P04IW2_A8029AlbNumM = new String[] {""} ;
      P04IW2_A44AlbRecCod = new int[1] ;
      A8029AlbNumM = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlaud__default(),
         new Object[] {
             new Object[] {
            P04IW2_A396EmprCod, P04IW2_A361DisCod, P04IW2_A673Piezas, P04IW2_A317AlbStLot, P04IW2_A8029AlbNumM, P04IW2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl3 ;
   private byte A317AlbStLot ;
   private short Gx_err ;
   private int AV9Discod ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV10Msg_err ;
   private String scmdbuf ;
   private String A8029AlbNumM ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04IW2_A396EmprCod ;
   private int[] P04IW2_A361DisCod ;
   private int[] P04IW2_A673Piezas ;
   private byte[] P04IW2_A317AlbStLot ;
   private String[] P04IW2_A8029AlbNumM ;
   private int[] P04IW2_A44AlbRecCod ;
}

final  class pctrlaud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04IW2", "SELECT T1.EmprCod, T1.DisCod, T1.Piezas, T2.AlbStLot, T2.AlbNumM, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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

