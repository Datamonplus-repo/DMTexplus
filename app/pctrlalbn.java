package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlalbn extends GXProcedure
{
   public pctrlalbn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlalbn.class ), "" );
   }

   public pctrlalbn( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pctrlalbn.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pctrlalbn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlalbn.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrlalbn.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrlalbn.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrlalbn.this.AV9Msg_final = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Msg_ctrl = " " ;
      AV9Msg_final = " " ;
      /* Using cursor P04O72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P04O72_A1261BarAlbKgmE[0] ;
         A30AlbProCod = P04O72_A30AlbProCod[0] ;
         if ( GXutil.strcmp(AV8Msg_ctrl, " ") == 0 )
         {
            AV8Msg_ctrl = httpContext.getMessage( "N Guia(s)= ", "") + GXutil.str( A30AlbProCod, 10, 0) ;
         }
         else
         {
            AV8Msg_ctrl += " - " + GXutil.str( A30AlbProCod, 10, 0) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV8Msg_ctrl, " ") != 0 )
      {
         AV9Msg_final = httpContext.getMessage( "Atencion. Esta OS ", "") + GXutil.newLine( ) ;
         AV9Msg_final += httpContext.getMessage( "Esta en estos N Guias:", "") + GXutil.newLine( ) ;
         AV9Msg_final += GXutil.trim( AV8Msg_ctrl) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlalbn.this.A396EmprCod;
      this.aP1[0] = pctrlalbn.this.A129BarCod;
      this.aP2[0] = pctrlalbn.this.A132BarCodReo;
      this.aP3[0] = pctrlalbn.this.A130BarCodPar;
      this.aP4[0] = pctrlalbn.this.AV9Msg_final;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Msg_ctrl = "" ;
      scmdbuf = "" ;
      P04O72_A396EmprCod = new String[] {""} ;
      P04O72_A129BarCod = new int[1] ;
      P04O72_A132BarCodReo = new byte[1] ;
      P04O72_A130BarCodPar = new String[] {""} ;
      P04O72_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04O72_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlalbn__default(),
         new Object[] {
             new Object[] {
            P04O72_A396EmprCod, P04O72_A129BarCod, P04O72_A132BarCodReo, P04O72_A130BarCodPar, P04O72_A1261BarAlbKgmE, P04O72_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Msg_final ;
   private String AV8Msg_ctrl ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04O72_A396EmprCod ;
   private int[] P04O72_A129BarCod ;
   private byte[] P04O72_A132BarCodReo ;
   private String[] P04O72_A130BarCodPar ;
   private java.math.BigDecimal[] P04O72_A1261BarAlbKgmE ;
   private long[] P04O72_A30AlbProCod ;
}

final  class pctrlalbn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04O72", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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

