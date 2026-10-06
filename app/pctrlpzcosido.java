package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlpzcosido extends GXProcedure
{
   public pctrlpzcosido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlpzcosido.class ), "" );
   }

   public pctrlpzcosido( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pctrlpzcosido.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pctrlpzcosido.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlpzcosido.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrlpzcosido.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrlpzcosido.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrlpzcosido.this.AV13Barpiecod = aP4[0];
      this.aP4 = aP4;
      pctrlpzcosido.this.AV11BarPieKil = aP5[0];
      this.aP5 = aP5;
      pctrlpzcosido.this.AV12BarPieMet = aP6[0];
      this.aP6 = aP6;
      pctrlpzcosido.this.AV17Barunimed = aP7[0];
      this.aP7 = aP7;
      pctrlpzcosido.this.AV18AlbRUni = aP8[0];
      this.aP8 = aP8;
      pctrlpzcosido.this.Gx_msg = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P04ND2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV13Barpiecod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2813MetPieCod = P04ND2_A2813MetPieCod[0] ;
         A2814MetPieKil = P04ND2_A2814MetPieKil[0] ;
         A2815MetPieMet = P04ND2_A2815MetPieMet[0] ;
         A2809MetTerCod = P04ND2_A2809MetTerCod[0] ;
         if ( GXutil.strcmp(AV17Barunimed, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( ( DecimalUtil.compareTo(A2814MetPieKil, AV11BarPieKil) != 0 ) && ( A2814MetPieKil.doubleValue() > 0 ) && ( AV11BarPieKil.doubleValue() > 0 ) )
            {
               if ( GXutil.strcmp(Gx_msg, " ") == 0 )
               {
                  Gx_msg = GXutil.str( A2814MetPieKil, 9, 2) + "/" ;
               }
               else
               {
                  Gx_msg += GXutil.str( A2814MetPieKil, 9, 2) + "/" ;
               }
            }
         }
         if ( GXutil.strcmp(AV17Barunimed, httpContext.getMessage( "M", "")) == 0 )
         {
            if ( ( DecimalUtil.compareTo(A2815MetPieMet, AV12BarPieMet) != 0 ) && ( A2815MetPieMet.doubleValue() > 0 ) && ( AV12BarPieMet.doubleValue() > 0 ) )
            {
               if ( GXutil.strcmp(Gx_msg, " ") == 0 )
               {
                  Gx_msg = GXutil.str( A2815MetPieMet, 9, 2) + "/" ;
               }
               else
               {
                  Gx_msg += GXutil.str( A2815MetPieMet, 9, 2) + "/" ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlpzcosido.this.A396EmprCod;
      this.aP1[0] = pctrlpzcosido.this.A129BarCod;
      this.aP2[0] = pctrlpzcosido.this.A132BarCodReo;
      this.aP3[0] = pctrlpzcosido.this.A130BarCodPar;
      this.aP4[0] = pctrlpzcosido.this.AV13Barpiecod;
      this.aP5[0] = pctrlpzcosido.this.AV11BarPieKil;
      this.aP6[0] = pctrlpzcosido.this.AV12BarPieMet;
      this.aP7[0] = pctrlpzcosido.this.AV17Barunimed;
      this.aP8[0] = pctrlpzcosido.this.AV18AlbRUni;
      this.aP9[0] = pctrlpzcosido.this.Gx_msg;
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
      P04ND2_A396EmprCod = new String[] {""} ;
      P04ND2_A129BarCod = new int[1] ;
      P04ND2_A132BarCodReo = new byte[1] ;
      P04ND2_A130BarCodPar = new String[] {""} ;
      P04ND2_A2813MetPieCod = new String[] {""} ;
      P04ND2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ND2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ND2_A2809MetTerCod = new String[] {""} ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2809MetTerCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlpzcosido__default(),
         new Object[] {
             new Object[] {
            P04ND2_A396EmprCod, P04ND2_A129BarCod, P04ND2_A132BarCodReo, P04ND2_A130BarCodPar, P04ND2_A2813MetPieCod, P04ND2_A2814MetPieKil, P04ND2_A2815MetPieMet, P04ND2_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV11BarPieKil ;
   private java.math.BigDecimal AV12BarPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV13Barpiecod ;
   private String AV17Barunimed ;
   private String AV18AlbRUni ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ND2_A396EmprCod ;
   private int[] P04ND2_A129BarCod ;
   private byte[] P04ND2_A132BarCodReo ;
   private String[] P04ND2_A130BarCodPar ;
   private String[] P04ND2_A2813MetPieCod ;
   private java.math.BigDecimal[] P04ND2_A2814MetPieKil ;
   private java.math.BigDecimal[] P04ND2_A2815MetPieMet ;
   private String[] P04ND2_A2809MetTerCod ;
}

final  class pctrlpzcosido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ND2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

